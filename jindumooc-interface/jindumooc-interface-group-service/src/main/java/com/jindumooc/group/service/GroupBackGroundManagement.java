package com.jindumooc.group.service;

import com.jindumooc.dto.group.GroupThreadAllDTO;
import com.jindumooc.dto.group.SearchGroupDTO;
import com.jindumooc.dto.group.GroupThreadIdDTO;
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
     * @param groupThreadIdDTO
     * @return
     */
    boolean setEliteGroupThread(GroupThreadIdDTO groupThreadIdDTO);

    /**
     * 取消话题加精
     *
     * @param groupThreadIdDTO
     * @return
     */
    boolean setNotEliteGroupThread(GroupThreadIdDTO groupThreadIdDTO);


    /**
     * 设置话题为置顶
     *
     * @param groupThreadIdDTO
     * @return
     */
    boolean setStickGroupThread(GroupThreadIdDTO groupThreadIdDTO);


    /**
     * 取消话题置顶
     *
     * @param groupThreadIdDTO
     * @return
     */
    boolean setNotStickGroupThread(GroupThreadIdDTO groupThreadIdDTO);

    /**
     * 关闭小组话题
     *
     * @param groupThreadIdDTO
     * @return
     */
    boolean closeGroupThread(GroupThreadIdDTO groupThreadIdDTO);

    /**
     * 打开小组话题
     *
     * @param groupThreadIdDTO
     * @return
     */
    boolean openGroupThread(GroupThreadIdDTO groupThreadIdDTO);

    /**
     * 删除小组话题
     *
     * @param groupThreadIdDTO
     * @return
     */
    boolean deleteGroupThread(GroupThreadIdDTO groupThreadIdDTO);

}
