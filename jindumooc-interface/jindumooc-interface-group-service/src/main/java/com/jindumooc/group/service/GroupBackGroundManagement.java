package com.jindumooc.group.service;

<<<<<<< HEAD
import com.jindumooc.dto.group.SearchGroup;
=======
import com.jindumooc.dto.group.GroupThreadAllDTO;
import com.jindumooc.dto.group.SearchGroupDTO;
>>>>>>> a8811d28e2d840d53b0e239c6636d521f145be28
import com.jindumooc.dto.group.GroupThreadIdDTO;
import com.jindumooc.vojo.group.BackGroundIndexGroup;
import com.jindumooc.vojo.group.GroupThreadShow;

import java.util.List;

public interface GroupBackGroundManagement {

    /**
     * 查找组接口
     */
<<<<<<< HEAD
    List<BackGroundIndexGroup> getIndexGroup(SearchGroup searchGroup);
=======
    List<BackGroundIndexGroup> getIndexGroup(SearchGroupDTO searchGroupDTO);
>>>>>>> a8811d28e2d840d53b0e239c6636d521f145be28

    /**
     * 根据小组ID打开小组
     */
    boolean openGroupStatusByPrimaryKey(Integer id);

    /**
     * 根据小组ID关闭小组
     */
    boolean closeGroupStatusByPrimaryKey(Integer id);

    /**
<<<<<<< HEAD
     * 展示所有话题
     *
     * @return
     */
    List<GroupThreadShow> showAllThread();
=======
     * 展示所有小组话题
     *
     * @return
     */
    List<GroupThreadShow> showAllThread(GroupThreadAllDTO groupThreadAllDTO);
>>>>>>> a8811d28e2d840d53b0e239c6636d521f145be28

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
<<<<<<< HEAD
     * 取消话题置顶
=======
     * 关闭小组话题
>>>>>>> a8811d28e2d840d53b0e239c6636d521f145be28
     *
     * @param threadID
     * @return
     */
    boolean closeGroupThread(Integer threadID);

    /**
<<<<<<< HEAD
     * 取消话题置顶
=======
     * 打开小组话题
>>>>>>> a8811d28e2d840d53b0e239c6636d521f145be28
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
