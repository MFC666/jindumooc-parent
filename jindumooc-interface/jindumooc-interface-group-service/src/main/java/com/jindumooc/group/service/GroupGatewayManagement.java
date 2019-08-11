package com.jindumooc.group.service;

import com.jindumooc.dto.group.GroupIdDTO;
import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.group.GroupIntroduction;
import com.jindumooc.vojo.group.GroupNew;
import com.jindumooc.vojo.group.GroupShow;
import com.jindumooc.vojo.group.GroupThreadShow;

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
     * @param groupIdDTO
     * @return
     */
    GroupIntroduction showGroupIntroduction(GroupIdDTO groupIdDTO);

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
}
