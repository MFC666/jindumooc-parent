package com.jindumooc.group.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.*;
import com.jindumooc.dto.group.*;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.group.*;
import com.jindumooc.vojo.user.UserNew;
import com.jindumooc.vojo.user.UserShow;
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
     * @param groupID
     * @return
     */
    @Override
    public GroupIntroduction showGroupIntroduction(Integer groupID) {
        try {
            Groups groups = groupsMapper.selectByPrimaryKey(groupID);
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

    /**
     * 发起一个小组话题
     *
     * @param groupThreadDTO
     * @return
     */
    @Override
    public boolean createGroupThread(GroupThreadDTO groupThreadDTO) {
        try {
            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date).getTime();
            int currentTime = (int) (time / 1000);

            GroupsThread groupsThread = new GroupsThread();
            groupsThread.setContent(groupThreadDTO.getContent());
            groupsThread.setGroupid(groupThreadDTO.getGroupId());
            groupsThread.setTitle(groupThreadDTO.getTitle());
            groupsThread.setUserid(groupThreadDTO.getUserId());
            groupsThread.setType(groupThreadDTO.getType());

            groupsThread.setCreatedtime(currentTime);
            groupsThread.setUpdatedtime(currentTime);

            groupsThreadMapper.insertSelective(groupsThread);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据小组ID展示小组成员信息
     *
     * @param groupId
     * @return
     */
    @Override
    public List<UserShow> showGroupMembers(Integer groupId) {
        try {
            List<UserShow> userId_role = groupsMemberMapper.getGroupMembers(groupId);
            List<UserShow> users = new ArrayList<>();
            for (UserShow u :
                    userId_role) {
                UserShow user = groupsMemberMapper.showGroupMember(u.getUserId());
                user.setRole(u.getRole());
                users.add(user);
            }
            return users;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 展示小组新进成员
     *
     * @param
     * @return
     */
    @Override
    public List<UserNew> showNewMembers(Integer groupId, Integer memberNumber) {
        try {
            List<Integer> userIds = groupsMemberMapper.getNewMembers(groupId, memberNumber);
            List<UserNew> users = new ArrayList<>();
            for (Integer userId :
                    userIds) {
                UserNew user = groupsMemberMapper.showNewMember(userId);
                users.add(user);
            }
            return users;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 编辑小组名称和介绍
     *
     * @param
     * @return
     */
    @Override
    public boolean setGroupInfo(SetGroupInfoDTO setGroupInfoDTO) {
        try {
            Groups group = new Groups();
            group.setId(setGroupInfoDTO.getGroupId());
            group.setTitle(setGroupInfoDTO.getTitle());
            group.setAbout(setGroupInfoDTO.getAbout());
            groupsMapper.setGroupInfo(group);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 设置小组图标
     *
     * @param setGroupLogoDTO
     * @return
     */
    @Override
    public boolean setGroupLogo(SetGroupLogoDTO setGroupLogoDTO) {
        try {
            Groups group = new Groups();
            group.setId(setGroupLogoDTO.getGroupId());
            group.setLogo(setGroupLogoDTO.getLogo());
            groupsMapper.setGroupLogo(group);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 设置小组背景
     *
     * @param setGroupBackgroundDTO
     * @return
     */
    @Override
    public boolean setGroupBackground(SetGroupBackgroundDTO setGroupBackgroundDTO) {
        try {
            Groups group = new Groups();
            group.setId(setGroupBackgroundDTO.getGroupId());
            group.setBackgroundlogo(setGroupBackgroundDTO.getBackground());
            System.out.println(group);
            groupsMapper.setGroupBackground(group);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 编辑话题信息
     *
     * @param updateThreadInfoDTO
     * @return
     */
    @Override
    public boolean updateThreadInfo(UpdateThreadInfoDTO updateThreadInfoDTO) {
        try {
            GroupsThread gt = new GroupsThread();
            gt.setId(updateThreadInfoDTO.getThreadId());
            gt.setTitle(updateThreadInfoDTO.getTitle());
            gt.setContent(updateThreadInfoDTO.getContent());

            //获取当前时间
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
            gt.setStatus(dateFormat.format(date));

            groupsThreadMapper.updateThreadInfo(gt);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 搜索组内话题
     *
     * @param searchThreadDTO
     * @return
     */
    @Override
    public List<GroupThreadSearch> searchThread(SearchThreadDTO searchThreadDTO) {
        try {
            List<GroupThreadSearch> gts = new ArrayList<>();
            if (searchThreadDTO.getContent() != null) {
                gts = groupsThreadMapper.searchThread(searchThreadDTO.getGroupId(), searchThreadDTO.getContent());
            } else {
                gts = groupsThreadMapper.allThread(searchThreadDTO.getGroupId());
            }
            for (GroupThreadSearch temp :
                    gts) {
                temp.setUserName(userMapper.getUserNameById(temp.getUserId()));
                temp.setLastPostMemberName(userMapper.getUserNameById(temp.getLastPostMemberId()));
            }
            return gts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 发表新的回复，如果执行过程中有任何异常抛出，则返回false
     *
     * @param newPost
     * @return
     */
    @Override
    public boolean newPost(PostNew newPost) {
        try {
            GroupsThreadPost gtp = new GroupsThreadPost();
            gtp.setThreadid(newPost.getThreadId());
            gtp.setUserid(newPost.getUserId());
            gtp.setContent(newPost.getContent());
            gtp.setFromuserid(newPost.getFromUserId());
            gtp.setPostid(newPost.getPostId());

            //获取当前时间
            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date).getTime();
            int currentTime = (int) (time / 1000);
            gtp.setCreatedtime(currentTime);

            gtp.setAdopt(0);

            groupsThreadPostMapper.insert(gtp);
            groupsThreadPostMapper.updateThreadPost(gtp);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}