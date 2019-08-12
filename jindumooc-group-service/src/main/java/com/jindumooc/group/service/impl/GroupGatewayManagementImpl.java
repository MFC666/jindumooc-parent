package com.jindumooc.group.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.*;
import com.jindumooc.dto.group.GroupIdDTO;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.group.GroupIntroduction;
import com.jindumooc.vojo.group.GroupNew;
import com.jindumooc.vojo.group.GroupShow;
import com.jindumooc.vojo.group.GroupThreadShow;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class GroupGatewayManagementImpl implements GroupGatewayManagement {

    @Autowired
    private GroupsMapper groupsMapper;

    @Autowired
    private GroupsThreadMapper groupsThreadMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private GroupsMemberMapper groupsMemberMapper;

    @Autowired
    private GroupsThreadPostMapper groupsThreadPostMapper;

    @Autowired
    private GroupsThreadCollectMapper groupsThreadCollectMapper;

    /**
     * 添加新的小组，如果执行过程中有任何异常抛出，则返回false
     *
     * @param newGroup
     * @return
     */
    @Override
    public boolean addNewGroup(Groups newGroup) {
        try {
            groupsMapper.insert(newGroup);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据小组唯一ID删除小组，如果执行过程中有任何异常抛出，则返回false
     *
     * @param groupID
     * @return
     */
    @Override
    public boolean deleteGroup(Integer groupID) {
        try {
            groupsMapper.deleteByPrimaryKey(groupID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据小组ID返回Json格式小组组名与介绍
     *
     * @param groupIdDTO
     * @return
     */
    @Override
    public GroupIntroduction showGroupIntroduction(GroupIdDTO groupIdDTO) {
        try {
            Groups groups = groupsMapper.selectByPrimaryKey(groupIdDTO.getGroupID());
            GroupIntroduction groupIntroduction = new GroupIntroduction();
            groupIntroduction.setGroupTitle(groups.getTitle());
            groupIntroduction.setGroupIntroduction(groups.getAbout());
            return groupIntroduction;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 展示所有热门小组的小组名与小组logo
     *
     * @return
     */
    @Override
    public List<GroupShow> showAllHotGroup() {
        try {
            int avgThreadNum = groupsMapper.avgThreadNum();
            GroupsExample groupsExample = new GroupsExample();
            GroupsExample.Criteria criteria = groupsExample.createCriteria();
            criteria.andStatusEqualTo("open");
            //展示小组话题数大于平均数的组
            criteria.andMembernumGreaterThan(avgThreadNum);
            List<Groups> groups = groupsMapper.selectByExample(groupsExample);
            List<GroupShow> groupShows = new ArrayList<>();
            for (Groups group :
                    groups) {
                GroupShow groupShow = new GroupShow();
                groupShow.setGroupTitle(group.getTitle());
                groupShow.setGroupLogo(group.getLogo());
                groupShows.add(groupShow);
            }
            return groupShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 展示新晋的groupNumber个小组
     *
     * @param groupNumber
     * @return
     */
    @Override
    public List<GroupNew> showNewGroup(Integer groupNumber) {
        try {
            List<Groups> groups = groupsMapper.showNewNGroups(groupNumber);
            List<GroupNew> groupNews = new ArrayList<>();
            for (Groups g :
                    groups) {
                GroupNew groupNew = new GroupNew();
                Calendar c = Calendar.getInstance();
                int seconds = g.getCreatedtime();//数据库中提取的数据
                long millions = new Long(seconds).longValue() * 1000;
                c.setTimeInMillis(millions);
                Date createdDate = c.getTime();

                groupNew.setGroupLogo(g.getLogo());
                groupNew.setGroupCreatedDate(createdDate);
                groupNew.setGroupTitle(g.getTitle());
                groupNews.add(groupNew);
            }
            return groupNews;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 展示最后更新的话题
     *
     * @return
     */
    @Override
    public List<GroupThreadShow> showRecentGroupThread(Integer groupThreadNum) {
        try {
            List<GroupsThread> groupsThreads = groupsThreadMapper.showRecentGroupThread(groupThreadNum);
            List<GroupThreadShow> groupThreadShows = new ArrayList<>();

            for (GroupsThread thread :
                    groupsThreads) {
                GroupThreadShow groupThreadShow = new GroupThreadShow();
                int groupId = thread.getGroupid();
                int userID = thread.getUserid();

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long createdTimeLong = new Long(thread.getCreatedtime()).longValue() * 1000;
                String createdTimeStr = dateFormat.format(createdTimeLong);

                long updatedTimeLong = new Long(thread.getCreatedtime()).longValue() * 1000;
                String updatedTimeStr = dateFormat.format(updatedTimeLong);

                groupThreadShow.setCreatedTime(createdTimeStr);
                groupThreadShow.setUpdatedTime(updatedTimeStr);
                groupThreadShow.setStatus(thread.getStatus());
                groupThreadShow.setThreadContent(thread.getContent());
                groupThreadShow.setThreadID(thread.getId());
                groupThreadShow.setThreadTitle(thread.getTitle());
                groupThreadShow.setIsElite(thread.getIselite());

                Groups groups = groupsMapper.selectByPrimaryKey(groupId);
                User user = userMapper.selectByPrimaryKey(userID);

                groupThreadShow.setGroupName(groups.getTitle());
                groupThreadShow.setUserName(user.getNickname());
                groupThreadShows.add(groupThreadShow);
            }
            return groupThreadShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查看我加入的小组
     *
     * @param userID
     * @return
     */
    @Override
    public List<GroupShow> showMyGroup(Integer userID) {
        try {
            //创建小组成员示例
            GroupsMemberExample groupsMemberExample = new GroupsMemberExample();
            GroupsMemberExample.Criteria criteria = groupsMemberExample.createCriteria();
            //设置条件为userID相等
            criteria.andUseridEqualTo(userID);

            List<GroupsMember> groupsMembers = groupsMemberMapper.selectByExample(groupsMemberExample);
            List<Groups> groups = new ArrayList<>();
            List<GroupShow> groupShows = new ArrayList<>();
            //遍历
            for (GroupsMember g :
                    groupsMembers) {
                Groups group = groupsMapper.selectByPrimaryKey(g.getGroupid());
                groups.add(group);
            }
            //遍历
            for (Groups g :
                    groups) {
                GroupShow groupShow = new GroupShow();
                groupShow.setGroupLogo(g.getLogo());
                groupShow.setGroupTitle(g.getTitle());
                groupShows.add(groupShow);
            }
            return groupShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查看我回复的小组话题
     *
     * @param userID
     * @return
     */
    @Override
    public List<GroupThreadShow> showMyGroupThreadPost(Integer userID) {
        try {
            GroupsThreadPostExample groupsThreadPostExample = new GroupsThreadPostExample();
            GroupsThreadPostExample.Criteria criteria = groupsThreadPostExample.createCriteria();
            criteria.andUseridEqualTo(userID);

            List<GroupsThreadPost> groupsThreadPosts = groupsThreadPostMapper.selectByExample(groupsThreadPostExample);
            List<GroupsThread> groupsThreads = new ArrayList<>();
            List<GroupThreadShow> groupThreadShows = new ArrayList<>();

            for (GroupsThreadPost g : groupsThreadPosts) {
                GroupsThread groupsThread = groupsThreadMapper.selectByPrimaryKey(g.getThreadid());
                groupsThreads.add(groupsThread);
            }

            for (GroupsThread thread : groupsThreads) {
                GroupThreadShow groupThreadShow = new GroupThreadShow();
                int groupId = thread.getGroupid();
                userID = thread.getUserid();

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long createdTimeLong = new Long(thread.getCreatedtime()).longValue() * 1000;
                String createdTimeStr = dateFormat.format(createdTimeLong);

                long updatedTimeLong = new Long(thread.getCreatedtime()).longValue() * 1000;
                String updatedTimeStr = dateFormat.format(updatedTimeLong);

                groupThreadShow.setCreatedTime(createdTimeStr);
                groupThreadShow.setUpdatedTime(updatedTimeStr);
                groupThreadShow.setStatus(thread.getStatus());
                groupThreadShow.setThreadContent(thread.getContent());
                groupThreadShow.setThreadID(thread.getId());
                groupThreadShow.setThreadTitle(thread.getTitle());
                groupThreadShow.setIsElite(thread.getIselite());

                Groups groups = groupsMapper.selectByPrimaryKey(groupId);
                User user = userMapper.selectByPrimaryKey(userID);

                groupThreadShow.setGroupName(groups.getTitle());
                groupThreadShow.setUserName(user.getNickname());
                groupThreadShows.add(groupThreadShow);
            }
            return groupThreadShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查看我收藏的小组话题
     *
     * @param userID
     * @return
     */
    @Override
    public List<GroupThreadShow> showMyGroupThreadCollect(Integer userID) {
        try {
            GroupsThreadCollectExample groupsThreadCollectExample = new GroupsThreadCollectExample();
            GroupsThreadCollectExample.Criteria criteria = groupsThreadCollectExample.createCriteria();
            criteria.andUseridEqualTo(userID);

            List<GroupsThreadCollect> groupsThreadCollects = groupsThreadCollectMapper.selectByExample(groupsThreadCollectExample);
            List<GroupsThread> groupsThreads = new ArrayList<>();
            List<GroupThreadShow> groupThreadShows = new ArrayList<>();

            for (GroupsThreadCollect g : groupsThreadCollects) {
                GroupsThread groupsThread = groupsThreadMapper.selectByPrimaryKey(g.getThreadid());
                groupsThreads.add(groupsThread);
            }

            for (GroupsThread thread : groupsThreads) {
                GroupThreadShow groupThreadShow = new GroupThreadShow();
                int groupId = thread.getGroupid();
                userID = thread.getUserid();

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long createdTimeLong = new Long(thread.getCreatedtime()).longValue() * 1000;
                String createdTimeStr = dateFormat.format(createdTimeLong);

                long updatedTimeLong = new Long(thread.getCreatedtime()).longValue() * 1000;
                String updatedTimeStr = dateFormat.format(updatedTimeLong);

                groupThreadShow.setCreatedTime(createdTimeStr);
                groupThreadShow.setUpdatedTime(updatedTimeStr);
                groupThreadShow.setStatus(thread.getStatus());
                groupThreadShow.setThreadContent(thread.getContent());
                groupThreadShow.setThreadID(thread.getId());
                groupThreadShow.setThreadTitle(thread.getTitle());
                groupThreadShow.setIsElite(thread.getIselite());

                Groups groups = groupsMapper.selectByPrimaryKey(groupId);
                User user = userMapper.selectByPrimaryKey(userID);

                groupThreadShow.setGroupName(groups.getTitle());
                groupThreadShow.setUserName(user.getNickname());
                groupThreadShows.add(groupThreadShow);
            }
            return groupThreadShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}