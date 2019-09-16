package com.jindumooc.group.service;

import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.group.GroupIntroduction;
import com.jindumooc.vojo.group.GroupShow;
import com.jindumooc.dto.group.*;
import com.jindumooc.vojo.group.*;
import com.jindumooc.vojo.user.UserNew;
import com.jindumooc.vojo.user.UserShow;

import java.util.List;

/**
 * 小组前台门口控制功能接口
 *
 * @author 马洪升
 * @date 2019年7月20日10:02:05
 */
public interface GroupGatewayManagement {

    /**
     * 添加新的小组接口
     *
     * @param newGroup
     * @return
     */
    boolean addNewGroup(Groups newGroup);

    /**
     * 根据小组唯一ID删除小组
     *
     * @param groupID
     * @return
     */
    boolean deleteGroup(Integer groupID);

    /**
     * 根据小组ID返回Json格式小组组名与介绍
     *
     * @param groupID
     * @return
     */
    GroupIntroduction showGroupIntroduction(Integer groupID);

    /**
     * 展示所有热门小组的小组名与小组logo
     *
     * @return
     */
    List<GroupShow> showAllHotGroup();

    /**
     * 按照时间顺序展示新晋的n个小组
     *
     * @return
     */
    List<GroupNew> showNewGroup(Integer groupNumber);

    /**
     * 展示最后更新的话题
     *
     * @return
     */
    List<GroupThreadShow> showRecentGroupThread(Integer groupThreadNum);

    /**
     * 查看我加入的小组
     *
     * @return
     */
    List<GroupShow> showMyGroup(Integer userID);

    /**
     * 查看我回复的话题
     *
     * @param userID
     * @return
     */
    List<GroupThreadShow> showMyGroupThreadPost(Integer userID);

    /**
     * 查看我收藏的话题
     *
     * @param userID
     * @return
     */
    List<GroupThreadShow> showMyGroupThreadCollect(Integer userID);

    /**
     * 发起一个小组话题
     *
     * @return
     */
    boolean createGroupThread(GroupThreadDTO groupThreadDTO);

    /**
     * 根据小组ID展示小组成员信息
     *
     * @param groupId
     * @return
     */
    List<UserShow> showGroupMembers(Integer groupId);

    /**
     * 展示小组新进成员
     *
     * @param
     * @return
     */
    List<UserNew> showNewMembers(Integer groupId, Integer memberNumber);

    /**
     * 编辑小组名称和介绍
     *
     * @param setGroupInfoDTO
     * @return
     */
    boolean setGroupInfo(SetGroupInfoDTO setGroupInfoDTO);

    /**
     * 设置小组图标
     *
     * @param setGroupLogoDTO
     * @return
     */
    boolean setGroupLogo(SetGroupLogoDTO setGroupLogoDTO);

    /**
     * 设置小组背景
     *
     * @param setGroupBackgroundDTO
     * @return
     */
    boolean setGroupBackground(SetGroupBackgroundDTO setGroupBackgroundDTO);


    /**
     * 编辑话题信息
     *
     * @param updateThreadInfoDTO
     * @return
     */
    boolean updateThreadInfo(UpdateThreadInfoDTO updateThreadInfoDTO);

    /**
     * 搜索组内话题
     *
     * @param searchThreadDTO
     * @return
     */
    List<GroupThreadSearch> searchThread(SearchThreadDTO searchThreadDTO);

    /**
     * 发表新的回复，如果执行过程中有任何异常抛出，则返回false
     *
     * @param newPost
     * @return
     */
    boolean newPost(PostNew newPost);
}
