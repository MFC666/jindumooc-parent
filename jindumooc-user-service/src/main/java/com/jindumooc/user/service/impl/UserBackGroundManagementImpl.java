package com.jindumooc.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.pojo.User;
import com.jindumooc.vojo.BackGroundIndexUser;
import com.jindumooc.vojo.SearchMessage;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserBackGroundManagementImpl implements UserBackGroundManagement {

    @Autowired
    private UserMapper userMapper;

    //获取用户管理界面用户列表
    @Override
    public List<BackGroundIndexUser> getIndexUser(int pageNum, int pageSize, String searchType, String searchParameter) {
        //分页查询
        SearchMessage sm = new SearchMessage();
        //与前端交互后修改
        sm.setSearchParameter(null);
        sm.setSearchType(null);
        PageHelper.startPage(1,17);
        List<User> userList = userMapper.getIndexUser(sm);
        List<BackGroundIndexUser> bUserList = new ArrayList<>();

        for (int i=0;i<userList.size();i++){
            //转换时间
            User user = new User();
            user = userList.get(i);
            BackGroundIndexUser bUser = new BackGroundIndexUser();

            bUser.setNickName(user.getNickname());
            bUser.setCreatIp(user.getCreatedip());
            bUser.setCreatIpArea(user.getCreatedarea());
            bUser.setLoginIp(user.getLoginip());
            bUser.setLoginIpArea(user.getLoginarea());
            bUser.setBirthDay(user.getBirthday());

            Date d = new Date(user.getLogintime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = sdf.format(d);
            bUser.setLoginTime(s);

            d = new Date(user.getCreatedtime());
            sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            s = sdf.format(d);
            bUser.setCreatTime(s);

            bUserList.add(bUser);
        }

        return bUserList;
    }

}
