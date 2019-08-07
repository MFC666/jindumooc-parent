package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.group.GroupThreadIdDTO;
import com.jindumooc.dto.group.SearchGroupDTO;
import com.jindumooc.group.service.GroupBackGroundManagement;
import com.jindumooc.vojo.group.BackGroundIndexGroup;
import com.jindumooc.vojo.group.GroupThreadShow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping(value = "/getIndexGroup", method = RequestMethod.POST)
    @ResponseBody
    public List<BackGroundIndexGroup> getIndexGroup(SearchGroupDTO searchGroupDTO) {
        return groupBackGroundManagement.getIndexGroup(searchGroupDTO);
    }

    /**
     * 打开小组
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/openGroup", method = RequestMethod.POST)
    @ResponseBody
    public boolean openGroupStatusByPrimaryKey(Integer id) {
        return groupBackGroundManagement.openGroupStatusByPrimaryKey(id);
    }

    /**
     * 关闭小组
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/closeGroup", method = RequestMethod.POST)
    @ResponseBody
    public boolean closeGroupStatusByPrimaryKey(Integer id) {
        return groupBackGroundManagement.closeGroupStatusByPrimaryKey(id);
    }

    /**
     * 展示所有小组话题
     *
     * @return
     */
    @RequestMapping(value = "/showAllThread", method = RequestMethod.POST)
    @ResponseBody
    public List<GroupThreadShow> showAllThread() {
        return groupBackGroundManagement.showAllThread();
    }

    /**
     * 设置小组话题为加精
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/setEliteThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean setEliteThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.setEliteGroupThread(groupThreadIdDTO);
    }

    /**
     * 取消小组话题加精
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/setNotEliteThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean setNotEliteGroupThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.setNotEliteGroupThread(groupThreadIdDTO);
    }

    /**
     * 设置小组话题置顶
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/setStickThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean setStickGroupThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.setStickGroupThread(groupThreadIdDTO);
    }

    /**
     * 取消小组话题置顶
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/setNotStickThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean setNotStickGroupThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.setNotStickGroupThread(groupThreadIdDTO);
    }

    /**
     * 打开小组话题
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/openGroupThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean openGroupThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.openGroupThread
                (groupThreadIdDTO);
    }

    /**
     * 关闭小组话题
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/closeGroupThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean closeGroupThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.closeGroupThread(groupThreadIdDTO);
    }

    /**
     * 删除小组话题
     *
     * @param groupThreadIdDTO
     * @return
     */
    @RequestMapping(value = "/deleteGroupThread", method = RequestMethod.POST)
    @ResponseBody
    public boolean deleteGroupThread(@RequestBody GroupThreadIdDTO groupThreadIdDTO) {
        return groupBackGroundManagement.deleteGroupThread(groupThreadIdDTO);
    }
}