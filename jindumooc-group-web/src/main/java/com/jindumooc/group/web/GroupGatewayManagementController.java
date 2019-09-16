package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.group.*;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.group.*;
import com.jindumooc.vojo.user.UserNew;
import com.jindumooc.vojo.user.UserShow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(value = "/groupGate/addNewGroup")
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
    @DeleteMapping(value = "/groupGate/deleteGroup")
    @ResponseBody
    public boolean deleteGroup(@RequestParam(value = "groupID") Integer groupID) {
        return groupGatewayManagement.deleteGroup(groupID);
    }

    /**
     * 根据小组ID返回Json格式小组组名与介绍
     *
     * @param groupID
     * @return
     */
    @GetMapping(value = "/groupGate/showGroupIntroduction")
    @ResponseBody
    public GroupIntroduction showGroupIntroduction(@RequestParam(value = "groupID") Integer groupID) {
        return groupGatewayManagement.showGroupIntroduction(groupID);
    }

    /**
     * 展示所有热门小组的小组名与小组logo
     *
     * @return
     */
    @GetMapping(value = "/groupGate/showAllHotGroup")
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
    @GetMapping(value = "/groupGate/showNewGroup")
    @ResponseBody
    public List<GroupNew> showNewGroup(@RequestParam(value = "groupNumber", defaultValue = "8") Integer groupNumber) {
        return groupGatewayManagement.showNewGroup(groupNumber);
    }

    /**
     * 展示最后更新的小组话题
     *
     * @param groupThreadNum
     * @return
     */
    @GetMapping(value = "/groupGate/showRecentGroupThread")
    @ResponseBody
    public List<GroupThreadShow> showRecentGroupThread(@RequestParam(value = "groupThreadNum", defaultValue = "8") Integer groupThreadNum) {
        return groupGatewayManagement.showRecentGroupThread(groupThreadNum);
    }

    /**
     * 查看我加入的小组
     *
     * @param userID
     * @return
     */
    @GetMapping(value = "/groupGate/showMyGroup")
    @ResponseBody
    public List<GroupShow> showMyGroup(@RequestParam(value = "userID") Integer userID) {
        return groupGatewayManagement.showMyGroup(userID);
    }

    /**
     * 查看我回复的话题
     *
     * @param userID
     * @return
     */
    @GetMapping(value = "/groupGate/showMyGroupThreadPost")
    @ResponseBody
    public List<GroupThreadShow> showMyGroupThreadPost(@RequestParam("userID") Integer userID) {
        return groupGatewayManagement.showMyGroupThreadPost(userID);
    }

    /**
     * 查看我收藏的话题
     *
     * @param userID
     * @return
     */
    @GetMapping(value = "/groupGate/showMyGroupThreadCollect")
    @ResponseBody
    public List<GroupThreadShow> showMyGroupThreadCollect(@RequestParam(value = "userID") Integer userID) {
        return groupGatewayManagement.showMyGroupThreadCollect(userID);
    }

    /**
     * 发起一个小组话题
     *
     * @param groupThreadDTO
     * @return
     */
    @PostMapping(value = "/groupGate/createGroupThread")
    @ResponseBody
    public boolean createGroupThread(@RequestBody GroupThreadDTO groupThreadDTO) {
        return groupGatewayManagement.createGroupThread(groupThreadDTO);
    }

    /**
     * 根据小组ID展示小组成员信息
     *
     * @param groupID
     * @return
     */
    @GetMapping(value = "/groupGate/showGroupMembers")
    @ResponseBody
    public List<UserShow> showGroupMembers(@RequestParam(value = "groupID") Integer groupID) {
        return groupGatewayManagement.showGroupMembers(groupID);
    }

    /**
     * 展示小组新进成员
     *
     * @param
     * @return
     */
    @GetMapping(value = "/groupGate/showNewMembers")
    @ResponseBody
    public List<UserNew> showNewMembers(@RequestParam(value = "groupId") Integer groupId, @RequestParam(value = "memberNumber") Integer memberNumber) {
        return groupGatewayManagement.showNewMembers(groupId, memberNumber);
    }

    /**
     * 编辑小组名称和介绍
     *
     * @param setGroupInfoDTO
     * @return
     */
    @PutMapping(value = "/groupGate/setGroupInfo")
    @ResponseBody
    public boolean setGroupInfo(@RequestBody SetGroupInfoDTO setGroupInfoDTO) {
        return groupGatewayManagement.setGroupInfo(setGroupInfoDTO);
    }

    /**
     * 设置小组图标
     *
     * @param setGroupLogoDTO
     * @return
     */
    @PutMapping(value = "/groupGate/setGroupLogo")
    @ResponseBody
    public boolean setGroupLogo(@RequestBody SetGroupLogoDTO setGroupLogoDTO) {
        return groupGatewayManagement.setGroupLogo(setGroupLogoDTO);
    }

    /**
     * 设置小组背景
     *
     * @param setGroupBackgroundDTO
     * @return
     */
    @RequestMapping(value = "/groupGate/setGroupBackground", method = RequestMethod.POST)
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
    @RequestMapping(value = "/groupGate/updateThreadInfo", method = RequestMethod.POST)
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
    @PostMapping(value = "/groupGate/searchThread")
    @ResponseBody
    public List<GroupThreadSearch> searchThread(@RequestBody SearchThreadDTO searchThreadDTO) {
        return groupGatewayManagement.searchThread(searchThreadDTO);
    }

    /**
     * 发表新的回复，如果执行过程中有任何异常抛出，则返回false
     *
     * @param newPost
     * @return
     */
    @PostMapping(value = "/groupGate/addNewPost ")
    @ResponseBody
    public boolean addNewPost(@RequestBody PostNew newPost) {
        return groupGatewayManagement.newPost(newPost);
    }

}