package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.group.GroupThreadAllDTO;
import com.jindumooc.dto.group.SearchGroupDTO;
import com.jindumooc.group.service.GroupBackGroundManagement;
import com.jindumooc.vojo.group.BackGroundIndexGroup;
import com.jindumooc.vojo.group.GroupThreadShow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GroupBackGroundManagementController {

    @Reference
    private GroupBackGroundManagement groupBackGroundManagement;

    /**
     * 搜索小组并展示
     *
     * @param searchGroupDTO
     * @return
     */
    @PostMapping(value = "/groupBack/getIndexGroup")
    @ResponseBody
    public List<BackGroundIndexGroup> getIndexGroup(@RequestBody SearchGroupDTO searchGroupDTO) {
        return groupBackGroundManagement.getIndexGroup(searchGroupDTO);
    }

    /**
     * 打开小组
     *
     * @param id
     * @return
     */
    @PutMapping(value = "/groupBack/openGroup")
    @ResponseBody
    public boolean openGroupStatusByPrimaryKey(@RequestParam(value = "id") Integer id) {
        return groupBackGroundManagement.openGroupStatusByPrimaryKey(id);
    }

    /**
     * 关闭小组
     *
     * @param id
     * @return
     */
    @PutMapping(value = "/groupBack/closeGroup")
    @ResponseBody
    public boolean closeGroupStatusByPrimaryKey(@RequestParam(value = "id") Integer id) {
        return groupBackGroundManagement.closeGroupStatusByPrimaryKey(id);
    }

    /**
     * 展示所有小组话题
     *
     * @return
     */
    @PostMapping(value = "/groupBack/showAllThread")
    @ResponseBody
    public List<GroupThreadShow> showAllThread(@RequestBody GroupThreadAllDTO groupThreadAllDTO) {
        return groupBackGroundManagement.showAllThread(groupThreadAllDTO);
    }

    /**
     * 设置小组话题为加精
     *
     * @param threadID
     * @return
     */
    @PutMapping(value = "/groupBack/setEliteThread")
    @ResponseBody
    public boolean setEliteThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.setEliteGroupThread(threadID);
    }

    /**
     * 取消小组话题加精
     *
     * @param threadID
     * @return
     */
    @PutMapping(value = "/groupBack/setNotEliteThread")
    @ResponseBody
    public boolean setNotEliteGroupThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.setNotEliteGroupThread(threadID);
    }

    /**
     * 设置小组话题置顶
     *
     * @param threadID
     * @return
     */
    @PutMapping(value = "/groupBack/setStickThread")
    @ResponseBody
    public boolean setStickGroupThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.setStickGroupThread(threadID);
    }

    /**
     * 取消小组话题置顶
     *
     * @param threadID
     * @return
     */
    @PutMapping(value = "/groupBack/setNotStickThread")
    @ResponseBody
    public boolean setNotStickGroupThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.setNotStickGroupThread(threadID);
    }

    /**
     * 打开小组话题
     *
     * @param threadID
     * @return
     */
    @PutMapping(value = "/groupBack/openGroupThread")
    @ResponseBody
    public boolean openGroupThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.openGroupThread(threadID);
    }

    /**
     * 关闭小组话题
     *
     * @param threadID
     * @return
     */
    @PutMapping(value = "/groupBack/closeGroupThread")
    @ResponseBody
    public boolean closeGroupThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.closeGroupThread(threadID);
    }

    /**
     * 删除小组话题
     *
     * @param threadID
     * @return
     */
    @DeleteMapping(value = "/groupBack/deleteGroupThread")
    @ResponseBody
    public boolean deleteGroupThread(@RequestParam(value = "threadID") Integer threadID) {
        return groupBackGroundManagement.deleteGroupThread(threadID);
    }
}