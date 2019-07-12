package com.jindumooc.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.RoleMapper;
import com.jindumooc.dao.UserLearnStatisticsTotalMapper;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.pojo.Role;
import com.jindumooc.pojo.UserLearnStatisticsTotal;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.pojo.User;
import com.jindumooc.vojo.AllRoles;
import com.jindumooc.vojo.BackGroundIndexUser;
import com.jindumooc.dto.SearchMessage;
import com.jindumooc.vojo.UserDataStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class UserBackGroundManagementImpl implements UserBackGroundManagement {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserLearnStatisticsTotalMapper userLearnStatisticsTotalMapper;
    @Autowired
    private RoleMapper roleMapper;

    //获取用户管理界面用户列表
    @Override
    public List<BackGroundIndexUser> getIndexUser(SearchMessage sm) {
        //与前端交互后修改
        List<User> userList = new ArrayList<>();
        PageHelper.startPage(sm.getPageNum(),sm.getPageSize());
        userList = userMapper.getIndexUser(sm);

       //整理userList填充BackgroundIndexUser
        return getBackGroundIndexUser(userList);
    }

    //封禁用户
    @Override
    public boolean lokedUser(SearchMessage searchMessage) {
        userMapper.lockedUser(searchMessage);
        return true;
    }

    //获取所有用户组
    @Override
    public List<AllRoles> getAllRoles() {
        List<Role> roleList = new ArrayList<>();
        roleList = roleMapper.getAllRoles();
        List<AllRoles> allRolesList = new ArrayList<>();
        if(roleList.get(0).getId()!=null) {
            for (Role role : roleList) {
                AllRoles allRoles = new AllRoles();
                allRoles.setCode(role.getCode());
                allRoles.setId(role.getId());
                allRoles.setName(role.getName());
                allRolesList.add(allRoles);
            }
        }
        return allRolesList;
    }

    //更新用户的用户组
    @Override
    public boolean updateUserRole(SearchMessage searchMessage) {

        userMapper.updateUserRole(searchMessage);
        return true;
    }

    //获取用户数据统计
    @Override
    public List<UserDataStatistics> getUserDataStatistics(SearchMessage sm) {
        List<UserLearnStatisticsTotal> statisticsList = new ArrayList<UserLearnStatisticsTotal>();
        PageHelper.startPage(sm.getPageNum(),sm.getPageSize());
        statisticsList = userLearnStatisticsTotalMapper.getUserDataStatistrics(sm);
        List<UserDataStatistics> userDataStatisticsList = new ArrayList<>();

        if(statisticsList.get(0).getId()!=null) {
            for (UserLearnStatisticsTotal userL : statisticsList) {

                UserDataStatistics userDataStatistics = new UserDataStatistics();

                userDataStatistics.setUserId(userL.getId());
                userDataStatistics.setNickName(userMapper.getUserNickName(userL.getId()));
                userDataStatistics.setFinishedTaskNum(userL.getFinishedtasknum());
                userDataStatistics.setLearnedSeconds(userL.getLearnedseconds());
                userDataStatistics.setJoinedCourseNum(userL.getJoinedcoursenum());
                userDataStatistics.setExitCourseNum(userL.getExitcoursenum());
                userDataStatistics.setJoinedClassroomNum(userL.getJoinedclassroomnum());
                userDataStatistics.setExitClassroomNum(userL.getExitclassroomnum());

                userDataStatisticsList.add(userDataStatistics);
            }
        }
        return userDataStatisticsList;
    }

    //根据获取的userList构造BackGroundindexUserList
    public List<BackGroundIndexUser> getBackGroundIndexUser(List<User> userList){
        List<BackGroundIndexUser> bUserList = new ArrayList<>();
        if(userList.get(0).getId()!=null) {
            for (int i = 0; i < userList.size(); i++) {
                User user = new User();
                user = userList.get(i);
                BackGroundIndexUser bUser = new BackGroundIndexUser();
                //获取用户组
                String[] strArr = user.getRoles().split("\\|");
                List<String> roleNames = new ArrayList<>();
                for (int m = 1; m < strArr.length; m++) {
                    if (strArr[m] != null) {
                        Role role = roleMapper.getRoles(strArr[m]);
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
        }
        return bUserList;
    }
}
