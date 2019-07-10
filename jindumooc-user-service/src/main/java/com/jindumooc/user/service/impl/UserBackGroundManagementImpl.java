package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.pojo.UserExample;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.pojo.User;
import com.jindumooc.vojo.BackGroundIndexUser;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserBackGroundManagementImpl implements UserBackGroundManagement {

    @Autowired
    private UserMapper userMapper;

    //获取用户管理界面用户列表
    @Override
    public List<BackGroundIndexUser> getIndexUser(int pageNum, int pageSize) {
        //分页查询
        PageHelper.startPage(1,17);
        List<User> listUser = userMapper.getIndexUser();
        List<BackGroundIndexUser> backUserList = new ArrayList<>();


        for (int i=0;i<listUser.size();i++) {
            String areaName = null;
            User user = listUser.get(i);

            BackGroundIndexUser bUser = new BackGroundIndexUser();
            bUser.setBirthDay(user.getBirthday());
            bUser.setNickName(user.getNickname());
            bUser.setUserId(user.getId());
            //根据Ip获取地区信息
            try {
                if(user.getLoginip()!=null&user.getLoginip()!=""){
                    areaName = getAreaNameByIp("ip=" + user.getLoginip(), "utf-8");
                }else{
                    areaName="无";
                }
                bUser.setLoginIp(listUser.get(i).getLoginip());
                bUser.setLoginIpArea(areaName);

                if(user.getCreatedip()!=null&user.getCreatedip()!=""){
                    areaName = getAreaNameByIp("ip=" + user.getCreatedip(), "utf-8");
                }else{
                    areaName="无";
                }
                bUser.setCreatIp(listUser.get(i).getCreatedip());
                bUser.setCreatIpArea(areaName);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //转换时间

            Date d = new Date(user.getLogintime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = sdf.format(d);
            bUser.setLoginTime(s);

            d = new Date(user.getCreatedtime());
            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            s = sdf.format(d);
            bUser.setCreatTime(s);

            backUserList.add(bUser);
        }

        return backUserList;
    }

    //根据登录Ip获取登录地址省市

    private String getAreaNameByIp(String Ip,String encodingString)throws UnsupportedEncodingException {
        // 这里调用pconline的接口
        String urlStr = "http://ip.taobao.com/service/getIpInfo.php";
        // 从http://whois.pconline.com.cn取得IP所在的省市区信息
        String returnStr = getResult(urlStr, Ip, encodingString);

        if (returnStr != null) {
            // 处理返回的省市区信息
            String[] temp = returnStr.split(",");
            if (temp.length < 3) {
                return "局域网测试";                                        //无效IP，局域网测试
            }
            String region = (temp[5].split(":"))[1].replaceAll("\"", "");
            region = decodeUnicode(region);                        // 省

            String country = "";
            String area = "";
            String city = "";
            String county = "";
            String isp = "";
            for (int i = 0; i < temp.length; i++) {
                switch (i) {
                    //如果使用的是新浪的接口，那这里的需要修改，case:3 4 5分别对应国家，省，市区;
                    case 4:
                        region = (temp[i].split(":"))[1].replaceAll("\"", "");
                        region = decodeUnicode(region);            // 省份
                        break;
                    case 5:
                        city = (temp[i].split(":"))[1].replaceAll("\"", "");
                        city = decodeUnicode(city);                // 市区
                        break;
                }
            }
            return region+" "+city;
        }
        return null;

    }

    //根据地址访问端口获取信息
    private static String getResult(String urlStr, String content, String encoding) {
        URL url = null;
        HttpURLConnection connection = null;
        try {
            url = new URL(urlStr);
            connection = (HttpURLConnection) url.openConnection();    // 新建连接实例
            connection.setDoOutput(true);                           // 是否打开输出流 true|false
            connection.setConnectTimeout(2000);                     // 设置连接超时时间，单位毫秒
            connection.setReadTimeout(2000);                        // 设置读取数据超时时间，单位毫秒
            connection.setDoInput(true);                            // 是否打开输入流true|false
            connection.setRequestMethod("POST");                    // 提交方法POST|GET
            connection.setUseCaches(false);                         // 是否缓存true|false
            connection.connect();                                   // 打开连接端口
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());// 打开输出流往对端服务器写数据
            out.writeBytes(content);                                // 写数据,也就是提交你的表单
            out.flush();                                            // 刷新
            out.close();                                            // 关闭输出流
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据 ,以BufferedReader流来读取
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
            }
            reader.close();
            return buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();                            // 关闭连接
            }
        }
        return null;
    }

    //解析编码
    public static String decodeUnicode(String theString) {
        char aChar;
        int len = theString.length();
        StringBuffer outBuffer = new StringBuffer(len);
        for (int x = 0; x < len; ) {
            aChar = theString.charAt(x++);
            if (aChar == '\\') {
                aChar = theString.charAt(x++);
                if (aChar == 'u') {
                    int value = 0;
                    for (int i = 0; i < 4; i++) {
                        aChar = theString.charAt(x++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                value = (value << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                value = (value << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                value = (value << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed  encoding.");
                        }
                    }
                    outBuffer.append((char) value);
                } else {
                    if (aChar == 't') {
                        aChar = '\t';
                    } else if (aChar == 'r') {
                        aChar = '\r';
                    } else if (aChar == 'n') {
                        aChar = '\n';
                    } else if (aChar == 'f') {
                        aChar = '\f';
                    }
                    outBuffer.append(aChar);
                }
            } else {
                outBuffer.append(aChar);
            }
        }
        return outBuffer.toString();
    }

    //搜索用户

}
