package com.jindumooc.course.service;

import com.jindumooc.dto.group.GroupThreadAllDTO;
import com.jindumooc.dto.group.SearchGroupDTO;
import com.jindumooc.vojo.group.BackGroundIndexGroup;
import com.jindumooc.vojo.group.GroupThreadShow;

import java.util.List;

public interface GroupBackGroundManagement {

    /**
     * 查找组接口
     */
    List<BackGroundIndexGroup> getIndexGroup(SearchGroupDTO searchGroupDTO);

    /**
     * 根据小组ID打开小组
     */
    boolean openGroupStatusByPrimaryKey(Integer id);

    /**
     * 根据小组ID关闭小组
     */
    boolean closeGroupStatusByPrimaryKey(Integer id);

    /**
     * 展示所有小组话题
     *
     * @return
     */
    List<GroupThreadShow> showAllThread(GroupThreadAllDTO groupThreadAllDTO);

    /**
     * 设置话题为加精
     *
     * @param threadID
     * @return
     */
    boolean setEliteGroupThread(Integer threadID);

    /**
     * 取消话题加精
     *
     * @param threadID
     * @return
     */
    boolean setNotEliteGroupThread(Integer threadID);


    /**
     * 设置话题为置顶
     *
     * @param threadID
     * @return
     */
    boolean setStickGroupThread(Integer threadID);


    /**
     * 取消话题置顶
     *
     * @param threadID
     * @return
     */
    boolean setNotStickGroupThread(Integer threadID);

    /**
     * 关闭小组话题
     *
     * @param threadID
     * @return
     */
    boolean closeGroupThread(Integer threadID);

    /**
     * 打开小组话题
     *
     * @param threadID
     * @return
     */
    boolean openGroupThread(Integer threadID);

    /**
     * 删除小组话题
     *
     * @param threadID
     * @return
     */
    boolean deleteGroupThread(Integer threadID);

}
