package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.group.*;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.group.*;
import com.jindumooc.vojo.user.UserNew;
import com.jindumooc.vojo.user.UserShow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 小组门户管理控制器
 *
 * @author 马洪升
 * @date 2019年7月20日10:42:22
 */
@Controller
public class GroupGatewayManagementController {

    @Reference
    private GroupGatewayManagement groupGatewayManagement;

    /**
     * 添加新的小组
     *
     * @param newGroup
     * @return
     */
    @RequestMapping(value = "/addNewGroup", method = RequestMethod.POST)
    @ResponseBody
    public boolean addNewGroup(@RequestBody Groups newGroup) {
        return groupGatewayManagement.addNewGroup(newGroup);
    }

    /**
     * 根据小组唯一ID删除小组
     *
     * @param groupID
     * @return
     */
    @RequestMapping(value = "/deleteGroup", method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteGroup(Integer groupID) {
        return groupGatewayManagement.deleteGroup(groupID);
    }

    /**
     * 自此方法开始，前后端一律采用Json数据格式通信
     * 根据小组ID返回Json格式小组组名与介绍
     *
     * @param groupIdDTO
     * @return
     */
    @RequestMapping(value = "/showGroupIntroduction", method = RequestMethod.POST)
    @ResponseBody
    public GroupIntroduction showGroupIntroduction(@RequestBody GroupIdDTO groupIdDTO) {
        return groupGatewayManagement.showGroupIntroduction(groupIdDTO);
    }

    /**
     * 展示所有热门小组的小组名与小组logo
     *
     * @return
     */
    @RequestMapping(value = "/showAllHotGroup", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupShow> showAllHotGroup() {
        return groupGatewayManagement.showAllHotGroup();
    }

    /**
     * 展示新晋小组
     *
     * @param groupNumber
     * @return
     */
    @RequestMapping(value = "/showNewGroup", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupNew> showNewGroup(Integer groupNumber) {
        return groupGatewayManagement.showNewGroup(groupNumber);
    }

    /**
     * 展示最后更新的小组话题
     *
     * @param groupThreadNum
     * @return
     */
    @RequestMapping(value = "/showRecentGroupThread", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupThreadShow> showRecentGroupThread(Integer groupThreadNum) {
        return groupGatewayManagement.showRecentGroupThread(groupThreadNum);
    }

    /**
     * 查看我加入的小组
     *
     * @param userID
     * @return
     */
    @RequestMapping(value = "/showMyGroup", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupShow> showMyGroup(Integer userID) {
        return groupGatewayManagement.showMyGroup(userID);
    }

    /**
     * 查看我回复的话题
     *
     * @param userID
     * @return
     */
    @RequestMapping(value = "/showMyGroupThreadPost", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupThreadShow> showMyGroupThreadPost(Integer userID) {
        return groupGatewayManagement.showMyGroupThreadPost(userID);
    }

    /**
     * 查看我收藏的话题
     *
     * @param userID
     * @return
     */
    @RequestMapping(value = "/showMyGroupThreadCollect", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupThreadShow> showMyGroupThreadCollect(Integer userID) {
        return groupGatewayManagement.showMyGroupThreadCollect(userID);
    }

    /**
     * 发起一个小组话题
     *
     * @param groupThreadDTO
     * @return
     */
    @RequestMapping(value = "/createGroupThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean createGroupThread(@RequestBody GroupThreadDTO groupThreadDTO) {
        return groupGatewayManagement.createGroupThread(groupThreadDTO);
    }

    /**
     * 根据小组ID展示小组成员信息
     *
     * @param groupId
     * @return
     */
    @RequestMapping(value = "/showGroupMembers", method = RequestMethod.POST)
    @ResponseBody
    public List<UserShow> showGroupMembers(Integer groupId) {
        return groupGatewayManagement.showGroupMembers(groupId);
    }

    /**
     * 展示小组新进成员
     *
     * @param showNewPostDTO
     * @return
     */
    @RequestMapping(value = "/showNewMembers", method = RequestMethod.POST)
    @ResponseBody
    public List<UserNew> showNewMembers(ShowNewPostDTO showNewPostDTO) {
        return groupGatewayManagement.showNewMembers(showNewPostDTO);
    }

    /**
     * 编辑小组名称和介绍
     *
     * @param setGroupInfoDTO
     * @return
     */
    @RequestMapping(value = "/setGroupInfo", method = RequestMethod.POST)
    @ResponseBody
    public boolean setGroupInfo(SetGroupInfoDTO setGroupInfoDTO) {
        return groupGatewayManagement.setGroupInfo(setGroupInfoDTO);
    }

    /**
     * 设置小组图标
     *
     * @param setGroupLogoDTO
     * @return
     */
    @RequestMapping(value = "/setGroupLogo", method = RequestMethod.POST)
    @ResponseBody
    public boolean setGroupLogo(SetGroupLogoDTO setGroupLogoDTO) {
        return groupGatewayManagement.setGroupLogo(setGroupLogoDTO);
    }

    /**
     * 设置小组背景
     *
     * @param setGroupBackgroundDTO
     * @return
     */
    @RequestMapping(value = "/setGroupBackground", method = RequestMethod.POST)
    @ResponseBody
    public boolean setGroupBackground(SetGroupBackgroundDTO setGroupBackgroundDTO) {
        return groupGatewayManagement.setGroupBackground(setGroupBackgroundDTO);
    }

    /**
     * 编辑话题信息
     *
     * @param updateThreadInfoDTO
     * @return
     */
    @RequestMapping(value = "/updateThreadInfo", method = RequestMethod.POST)
    @ResponseBody
    public boolean updateThreadInfo(UpdateThreadInfoDTO updateThreadInfoDTO) {
        return groupGatewayManagement.updateThreadInfo(updateThreadInfoDTO);
    }

    /**
     * 搜索组内话题
     *
     * @param searchThreadDTO
     * @return
     */
    @RequestMapping(value = "/searchThread ", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupThreadSearch> searchThread(SearchThreadDTO searchThreadDTO) {
        return groupGatewayManagement.searchThread(searchThreadDTO);
    }

    /**
     * 发表新的回复，如果执行过程中有任何异常抛出，则返回false
     *
     * @param newPost
     * @return
     */
    @RequestMapping(value = "/addNewPost ", method = RequestMethod.POST)
    @ResponseBody
    public boolean addNewPost(PostNew newPost) {
        return groupGatewayManagement.newPost(newPost);
    }

}