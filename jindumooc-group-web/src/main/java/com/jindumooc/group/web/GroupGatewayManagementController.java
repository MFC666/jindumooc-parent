package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.group.GroupIdDTO;
import com.jindumooc.dto.group.GroupThreadDTO;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.group.GroupIntroduction;
import com.jindumooc.vojo.group.GroupNew;
import com.jindumooc.vojo.group.GroupShow;
import com.jindumooc.vojo.group.GroupThreadShow;
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
    public boolean addNewGroup(Groups newGroup) {
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
    public boolean createGroupThread(GroupThreadDTO groupThreadDTO) {
        return groupGatewayManagement.createGroupThread(groupThreadDTO);
    }

}