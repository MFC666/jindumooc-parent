package com.jindumooc.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.*;
import com.jindumooc.dto.user.EditUser;
import com.jindumooc.pojo.*;
import com.jindumooc.pojo.UserApproval;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.vojo.user.*;
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
    @Autowired
    private UserApprovalMapper userApprovalMapper;
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private UserProfileMapper userProfileMapper;

    //获取用户管理界面用户列表
    @Override
    public List<BackGroundIndexUser> getIndexUser(SearchMessage sm) {
        //与前端交互后修改
        PageHelper.startPage(sm.getPageNum(), sm.getPageSize());
        List<User> userList = userMapper.getIndexUser(sm);
        //获取共有多少用户符合条件
        int count = userMapper.getUserNum(sm);

        //整理userList填充BackgroundIndexUser
        return getBackGroundIndexUser(userList, count);
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
        if (roleList.get(0).getId() != null) {
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
        PageHelper.startPage(sm.getPageNum(), sm.getPageSize());
        statisticsList = userLearnStatisticsTotalMapper.getUserDataStatistrics(sm);
        List<UserDataStatistics> userDataStatisticsList = new ArrayList<>();

        int count = userLearnStatisticsTotalMapper.getUserNum(sm);

        if (statisticsList.get(0).getId() != 0) {
            for (UserLearnStatisticsTotal userL : statisticsList) {

                UserDataStatistics userDataStatistics = new UserDataStatistics();
                userDataStatistics.setTotalNum(count);
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

    @Override
    public List<Teacher> getAllTeachers(SearchMessage sm) {
        sm.setRole("ROLE_TEACHER");
        List<User> userList = new ArrayList<>();
        userList = userMapper.getAllTeachers(sm);
        int count = userMapper.getTeachersNum(sm);
        return getTeachersList(userList, count);
    }

    @Override
    public boolean updatePromoted(SearchMessage sm) {
        userMapper.updatePromoted(sm);
        return true;
    }

    @Override
    public boolean updatePromotedSeq(SearchMessage sm) {

        userMapper.updatePromotedSeq(sm);
        return true;
    }

    /*
    获取用户实名制申请
     */
    @Override
    public List<UserApproval> getUserApproval(SearchMessage sm) {

        PageHelper.startPage(sm.getPageNum(), sm.getPageSize());
        List<com.jindumooc.pojo.UserApproval> approvalList = userApprovalMapper.getUserApproval(sm);
        List<UserApproval> approvals = new ArrayList<>();
        for (com.jindumooc.pojo.UserApproval approval : approvalList) {
            UserApproval userApproval = new UserApproval();
            userApproval.setId(approval.getId());
            userApproval.setUserId(approval.getUserid());
            userApproval.setIdCard(approval.getIdcard());
            userApproval.setFaceImg(approval.getFaceimg());
            userApproval.setBackImg(approval.getBackimg());
            userApproval.setTrueName(approval.getTruename());
            userApproval.setNote(approval.getNote());
            userApproval.setStatus(approval.getStatus());
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            userApproval.setNickName(userMapper.getUserNickName(approval.getUserid()));
            userApproval.setTotalApproval(userApprovalMapper.getTotalApproval(sm));


            approvals.add(userApproval);
        }
        return approvals;
    }

    @Override
    public boolean updateApproval(SearchMessage sm) {

        //获取修改时间
        Date date = new Date();

        UserApprovalExample userApprovalExample = new UserApprovalExample();
        UserApprovalExample.Criteria criteria = userApprovalExample.createCriteria();
        criteria.andUseridEqualTo(sm.getUserId());
        com.jindumooc.pojo.UserApproval userApproval = new com.jindumooc.pojo.UserApproval();
        userApproval.setStatus(sm.getApprovalStatus());
        userApproval.setCreatedtime(new Integer(new Long(date.getTime()).intValue()));
        userApprovalMapper.updateByExampleSelective(userApproval, userApprovalExample);

        return true;
    }

    /*
    获取私信
     */
    @Override
    public List<Messages> getAllMessages(SearchMessage sm) {
        PageHelper.startPage(sm.getPageNum(), sm.getPageSize());
        List<Message> messageList = messageMapper.getAllMessages(sm);
        List<Messages> messagesList = new ArrayList<>();
        for (Message message : messageList) {

            Messages messages = new Messages();
            messages.setContent(message.getContent());
            messages.setFromId(message.getFromid());
            messages.setId(message.getId());
            messages.setToId(message.getToid());
            messages.setType(message.getType());
            messages.setTotalMessages(messageMapper.getAllMessagesNum(sm));
            Date d = new Date(message.getCreatedtime().intValue() * 1000L);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = sdf.format(d);
            messages.setCreatedTime(s);
            messagesList.add(messages);
        }
        return messagesList;
    }

    @Override
    public Boolean delMessages(List<Integer> idList) {

        for (Integer integer : idList) {
            Message message = new Message();
            message.setId(integer);
            message.setIsdelete(1);
            messageMapper.updateByPrimaryKeySelective(message);

        }

        return true;
    }

    @Override
    public UserDetail getUserDetail(SearchMessage sm) {

        UserDetail userDetail = new UserDetail();

        userDetail = userProfileMapper.getUserDetail(sm);
        if(userDetail!=null){
            if (userDetail.getIsqqpublic() == 0) {
                userDetail.setQq("秘密");
            }
            if (userDetail.getIsweibopublic() == 0) {
                userDetail.setWeibo("秘密");
            }
            if (userDetail.getIsweixinpublic() == 0) {
                userDetail.setWeixin("秘密");
            }
            userDetail.setLoginTime(typeConversion(userDetail.getLogintime()));
            userDetail.setCreatedTime(typeConversion(userDetail.getCreatedtime()));

            userDetail.setRolesName(divisionRoleCode(userDetail.getRoles()));
        }


        return userDetail;
    }

    @Override
    public boolean updateUserDetail(EditUser editUser) {

        userProfileMapper.updateUserDetail(editUser);
        return true;
    }

    /*
    删除私信
     */


    //根据获取的userList构造teacherlist
    private List<Teacher> getTeachersList(List<User> userList, int count) {
        List<Teacher> teacherList = new ArrayList<>();
        for (User user : userList) {
            Teacher teacher = new Teacher();
            teacher.setId(user.getId());
            teacher.setLoginArea(user.getLoginarea());
            teacher.setNickName(user.getNickname());
            teacher.setPromoted(user.getPromoted());
            teacher.setTotalNum(count);
            Date date = new Date(user.getLogintime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            teacher.setLoginTime(sdf.format(date));

            teacherList.add(teacher);
        }
        return teacherList;
    }

    //根据获取的userList构造BackGroundindexUserList
    public List<BackGroundIndexUser> getBackGroundIndexUser(List<User> userList, int count) {
        List<BackGroundIndexUser> bUserList = new ArrayList<>();
        if (userList.get(0).getId() != null) {
            for (int i = 0; i < userList.size(); i++) {
                User user = new User();
                user = userList.get(i);
                BackGroundIndexUser bUser = new BackGroundIndexUser();
                //获取用户组
                bUser.setUserId(user.getId());
                bUser.setTotalUser(count);
                bUser.setRoles(divisionRoleCode(user.getRoles()));
                //转换时间
                bUser.setLocked(user.getLocked());
                bUser.setNickName(user.getNickname());
                bUser.setCreatIp(user.getCreatedip());
                bUser.setCreatIpArea(user.getCreatedarea());
                bUser.setLoginIp(user.getLoginip());
                bUser.setLoginIpArea(user.getLoginarea());
                bUser.setBirthDay(user.getBirthday());


                bUser.setLoginTime(typeConversion(user.getLogintime()));

                bUser.setCreatTime(typeConversion(user.getCreatedtime()));
                bUserList.add(bUser);
            }
        }
        return bUserList;
    }

    /*
    integer类型的时间转化为String
     */
    public String typeConversion(Integer OldTime) {
        Date d = new Date(OldTime.intValue() * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        return s;

    }
    /*
    根据角色code获取rolename
     */
    public List<String> divisionRoleCode(String roleCode){

        String[] strArr =roleCode.split("\\|");
        List<String> roleNames = new ArrayList<>();
        for (int m = 1; m < strArr.length; m++) {
            if (strArr[m] != null) {
                Role role = roleMapper.getRoles(strArr[m]);
                roleNames.add(role.getName());
            }
        }
        return roleNames;
    }


}
