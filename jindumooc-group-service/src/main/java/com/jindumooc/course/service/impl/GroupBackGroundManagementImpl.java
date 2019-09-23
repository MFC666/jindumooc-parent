package com.jindumooc.course.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.course.service.GroupBackGroundManagement;
import com.jindumooc.dao.GroupsMapper;
import com.jindumooc.dao.GroupsThreadMapper;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.dto.group.GroupThreadAllDTO;
import com.jindumooc.dto.group.SearchGroupInDBDTO;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.group.BackGroundIndexGroup;
import com.jindumooc.vojo.group.GroupThreadShow;
import org.springframework.beans.factory.annotation.Autowired;
import com.jindumooc.dto.group.SearchGroupDTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupBackGroundManagementImpl implements GroupBackGroundManagement {

    @Autowired
    private GroupsMapper groupsMapper;

    @Autowired
    private GroupsThreadMapper groupsThreadMapper;

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取小组
     *
     * @param searchGroupDTO
     * @return
     */
    @Override
    public List<BackGroundIndexGroup> getIndexGroup(SearchGroupDTO searchGroupDTO) {

        SearchGroupInDBDTO searchGroupInDBDTO = new SearchGroupInDBDTO();
        searchGroupInDBDTO.setGroupStatus(searchGroupDTO.getGroupStatus());
        searchGroupInDBDTO.setGroupTitle(searchGroupDTO.getGroupTitle());

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNicknameEqualTo(searchGroupDTO.getGroupOwnerName());

        List<User> users = userMapper.selectByExample(userExample);

        searchGroupInDBDTO.setOwnerId(users.get(0).getId());

        //与前端交互后修改
        PageHelper.startPage(searchGroupDTO.getPageNum(), searchGroupDTO.getPageSize());
        List<Groups> groupsList = groupsMapper.getIndexGroup(searchGroupInDBDTO);

        //整理groupList填充BackgroundIndexGroup
        return getBackGroundIndexGroup(groupsList);
    }

    /**
     * 根据小组ID打开小组
     *
     * @param id
     * @return
     */
    @Override
    public boolean openGroupStatusByPrimaryKey(Integer id) {
        try {
            groupsMapper.openGroupStatusByPrimaryKey(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据小组ID关闭小组
     *
     * @param id
     * @return
     */
    @Override
    public boolean closeGroupStatusByPrimaryKey(Integer id) {
        try {
            groupsMapper.closeGroupStatusByPrimaryKey(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 展示所有小组话题
     *
     * @return
     */
    @Override
    public List<GroupThreadShow> showAllThread(GroupThreadAllDTO groupThreadAllDTO) {
        try {
            List<GroupThreadShow> groupThreadShows = new ArrayList<>();
            GroupsThreadExample groupsThreadExample = new GroupsThreadExample();
            List<GroupsThread> threads = new ArrayList<>();

            if (groupThreadAllDTO.getIsReward()) {
                switch (groupThreadAllDTO.getScreeningApproach()) {
                    case "最新发帖":
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.screeningByTimeAndElite();
                        break;
                    case "最后回复":
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.screeningByLastPostAndElite();
                        break;
                    case "回复数":
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.screeningByPostNumAndElite();
                        break;
                    default:
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.showAllEliteGroupThread();
                }
            } else {
                switch (groupThreadAllDTO.getScreeningApproach()) {
                    case "最新发帖":
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.screeningByTime();
                        break;
                    case "最后回复":
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.screeningByLastPost();
                        break;
                    case "回复数":
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.screeningByPostNum();
                        break;
                    default:
                        PageHelper.startPage(groupThreadAllDTO.getPageNum(), groupThreadAllDTO.getPageSize());
                        threads = groupsThreadMapper.selectByExample(groupsThreadExample);
                }
            }
            for (GroupsThread thread :
                    threads) {
                GroupThreadShow groupThreadShow = new GroupThreadShow();
                int groupId = thread.getGroupid();
                int userID = thread.getUserid();

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long createdTimeLong = new Long(thread.getCreatedtime()) * 1000;
                String createdTimeStr = dateFormat.format(createdTimeLong);

                long updatedTimeLong = new Long(thread.getCreatedtime()) * 1000;
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
     * 设置话题加精
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean setEliteGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.setEliteGroupThread(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 取消话题加精
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean setNotEliteGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.setNotEliteGroupThread(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 设置话题为置顶
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean setStickGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.setStickGroupThread(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 取消话题置顶
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean setNotStickGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.setNotStickGroupThread(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 关闭小组话题
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean closeGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.closeGroupThread(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 打开小组话题
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean openGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.openGroupThread(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除小组话题
     *
     * @param threadID
     * @return
     */
    @Override
    public boolean deleteGroupThread(Integer threadID) {
        try {
            groupsThreadMapper.deleteByPrimaryKey(threadID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 根据获取到的小组列表转换为我们需要展示的小组的列表
     *
     * @param groupsList
     * @return
     */
    private List<BackGroundIndexGroup> getBackGroundIndexGroup(List<Groups> groupsList) {
        List<BackGroundIndexGroup> backGroundIndexGroups = new ArrayList<>();
        for (int i = 0; i < groupsList.size(); i++) {
            BackGroundIndexGroup bgig = new BackGroundIndexGroup();
            Groups groups = groupsList.get(i);
//            System.out.println(groups.getTitle());
            bgig.setGroupID(groups.getId());
            bgig.setGroupMemberNum(groups.getMembernum());

            User user = userMapper.selectByPrimaryKey(groups.getOwnerid());
            bgig.setGroupOwnerName(user.getNickname());
            bgig.setGroupPostNum(groups.getPostnum());
            bgig.setGroupStatus(groups.getStatus());
            bgig.setGroupThreadNum(groups.getThreadnum());
            bgig.setGroupTitle(groups.getTitle());

            backGroundIndexGroups.add(bgig);
        }
        return backGroundIndexGroups;
    }
}
