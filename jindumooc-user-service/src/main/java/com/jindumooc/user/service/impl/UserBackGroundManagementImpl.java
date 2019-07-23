package com.jindumooc.user.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.*;
import com.jindumooc.dto.user.*;
import com.jindumooc.pojo.*;
import com.jindumooc.pojo.UserApproval;
import com.jindumooc.user.service.UserBackGroundManagement;
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
    public boolean lokedUser(LockUser lockUser) {
        try{
            userMapper.lockedUser(lockUser);
        }catch (Exception e){
            return false;
        }
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
    public boolean updateUserRole(UserRole userRole) {

        userMapper.updateUserRole(userRole);
        return true;
    }

    /**
     * 获取用户统计信息
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public List<UserDataStatistics> getUserDataStatisticsList(int pageNum,int pageSize) {
        List<UserDataStatistics> statisticsList = new ArrayList<UserDataStatistics>();
        if(pageNum == 0){
            statisticsList = userLearnStatisticsTotalMapper.getUserDataStatistricsList();
        }else{
            PageHelper.startPage(pageNum, pageSize);
            statisticsList = userLearnStatisticsTotalMapper.getUserDataStatistricsList();
        }
        return statisticsList;
    }
    @Override
    public List<UserDataStatistics> searchUserDataStatisticsByNickName(int pageNum, int pageSize, String nickName) {
        List<UserDataStatistics> statisticsList = new ArrayList<UserDataStatistics>();
        if(pageNum == 0){
            statisticsList = userLearnStatisticsTotalMapper.getUserDataStatistricsByNickName(nickName);
        }else{
            PageHelper.startPage(pageNum, pageSize);
            statisticsList = userLearnStatisticsTotalMapper.getUserDataStatistricsByNickName(nickName);
        }

        return statisticsList;
    }

    /**
     *获取搜索教师
     * @param nickName
     * @return
     */
    @Override
    public List<Teacher> getAllTeachers(int pageNum,int pageSize,String nickName) {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList = userMapper.getAllTeachers(nickName);
        return teacherList;
    }

    /**
     * 设置教师推荐相关信息
     * @param
     * @return
     */
    @Override
    public boolean updatePromoted(TeacherPromoted teacherPromoted) {
        userMapper.updatePromoted(teacherPromoted);
        return true;
    }

    @Override
    public boolean updatePromotedSeq(TeacherPromoted teacherPromoted) {

        userMapper.updatePromotedSeq(teacherPromoted);
        return true;
    }

    /**
     * 获取用户实名制
     * @param sm
     * @return
     */
    @Override
    public List<UserApprovals> getUserApproval(SearchMessage sm) {

        PageHelper.startPage(sm.getPageNum(), sm.getPageSize());
        List<UserApproval> approvalList = userApprovalMapper.getUserApproval(sm);
        List<UserApprovals> approvals = new ArrayList<>();
        for (UserApproval approval : approvalList) {
            UserApprovals userApprovals = new UserApprovals();
            userApprovals.setId(approval.getId());
            userApprovals.setUserId(approval.getUserid());
            userApprovals.setIdCard(approval.getIdcard());
            userApprovals.setFaceImg(approval.getFaceimg());
            userApprovals.setBackImg(approval.getBackimg());
            userApprovals.setTrueName(approval.getTruename());
            userApprovals.setNote(approval.getNote());
            userApprovals.setStatus(approval.getStatus());
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            userApprovals.setNickName(userMapper.getUserNickName(approval.getUserid()));
            userApprovals.setTotalApproval(userApprovalMapper.getTotalApproval(sm));


            approvals.add(userApprovals);
        }
        return approvals;
    }

    @Override
    public boolean updateApproval(ApprovalUser approvalUser) {

        //获取修改时间
        Date date = new Date();

        UserApprovalExample userApprovalExample = new UserApprovalExample();
        UserApprovalExample.Criteria criteria = userApprovalExample.createCriteria();
        criteria.andUseridEqualTo(approvalUser.getUserId());
        com.jindumooc.pojo.UserApproval userApproval = new com.jindumooc.pojo.UserApproval();
        userApproval.setStatus(approvalUser.getApprovalStatus());
        userApproval.setCreatedtime(new Integer(new Long(date.getTime()).intValue()));
        userApprovalMapper.updateByExampleSelective(userApproval, userApprovalExample);

        return true;
    }

    /**
     * 获取私信
     * @param sm
     * @return
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

    /**
     * 获取用户详情
     * @param userId 用户编号
     * @return
     */
    @Override
    public UserDetail getUserDetail(int userId) {

        UserDetail userDetail = new UserDetail();

        userDetail = userProfileMapper.getUserDetail(userId);
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

    /**
     * 编辑用户详情信息
     * @param editUser
     * @return
     */
    @Override
    public boolean updateUserDetail(EditUser editUser) {

        userProfileMapper.updateUserDetail(editUser);
        return true;
    }

    /**
     * 根据获取的userList构造BackGroundindexUserList
     * @param userList
     * @param count
     * @return
     */
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

    /**
     *
    integer类型的时间转化为String
     */
    public String typeConversion(Integer OldTime) {
        Date d = new Date(OldTime.intValue() * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        return s;

    }
    /**
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
