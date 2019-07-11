package com.jindumooc.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.pojo.Role;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.pojo.User;
import com.jindumooc.vojo.AllRoles;
import com.jindumooc.vojo.BackGroundIndexUser;
import com.jindumooc.vojo.SearchMessage;
import org.springframework.beans.factory.annotation.Autowired;
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
        PageHelper.startPage(1,17);
        List<User> userList = userMapper.getIndexUser(sm);

        //整理userList填充BackgroundIndexUser
        return getBackGroundIndexUser(userList);
    }

    //根据时间搜索用户
    @Override
    public List<BackGroundIndexUser> searchIndexUserByTime(String searchType, java.sql.Date starTime, java.sql.Date endTime) {
        Long sTime = starTime.getTime();
        Long eTime = starTime.getTime();
        SearchMessage sm = new SearchMessage();
        sm.setSearchType(searchType);
        sm.setStarTime(sTime);
        sm.setEndTime(eTime);

        PageHelper.startPage(1,17);
        List<User> userList = userMapper.searchIndexUserByTime(sm);
        return getBackGroundIndexUser(userList);
    }

    @Override
    public boolean lokedUser(SearchMessage searchMessage) {
        userMapper.lockedUser(searchMessage);
        return true;
    }

    @Override
    public List<AllRoles> getAllRoles() {

        List<Role> roleList = userMapper.getAllRoles();
        List<AllRoles> allRolesList = new ArrayList<>();

        for (Role role:roleList) {
            AllRoles allRoles = new AllRoles();
            allRoles.setCode(role.getCode());
            allRoles.setId(role.getId());
            allRoles.setName(role.getName());
            allRolesList.add(allRoles);
        }
        return allRolesList;
    }

    @Override
    public boolean updateUserRole(SearchMessage searchMessage) {

        userMapper.updateUserRole(searchMessage);
        return true;
    }

    //根据获取的userList构造BackGroundindexUserList
    public List<BackGroundIndexUser> getBackGroundIndexUser(List<User> userList){
        List<BackGroundIndexUser> bUserList = new ArrayList<>();
        for (int i=0;i<userList.size();i++){
            User user = new User();
            user = userList.get(i);
            BackGroundIndexUser bUser = new BackGroundIndexUser();
            //获取用户组
            String[] strArr = user.getRoles().split("\\|");
            List<String> roleNames = new ArrayList<>();
            for (int m=1;m<strArr.length;m++) {
                if(strArr[m]!=null) {
                    Role role = userMapper.getRoles(strArr[m]);
                    roleNames.add(role.getName());
                }
            }
            bUser.setRoles(roleNames);
            //转换时间
            bUser.setLocked(user.getLocked());
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
