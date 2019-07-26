package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.group.GroupIdDTO;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.group.GroupIntroduction;
import com.jindumooc.vojo.group.GroupShow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @RequestMapping("/addNewGroup")
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
    @RequestMapping("/deleteGroup")
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
    @RequestMapping("/showGroupIntroduction")
    @ResponseBody
    public GroupIntroduction showGroupIntroduction(@RequestBody GroupIdDTO groupIdDTO) {
        return groupGatewayManagement.showGroupIntroduction(groupIdDTO);
    }

    /**
     * 展示所有热门小组的小组名与小组logo
     *
     * @return
     */
    @RequestMapping("/showAllGroup")
    @ResponseBody
    public List<GroupShow> showAllGroup() {
        return groupGatewayManagement.showAllGroup();
    }


}
