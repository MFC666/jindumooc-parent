package com.jindumooc.group.service;

import com.jindumooc.dto.group.SearchGroup;
import com.jindumooc.vojo.ground.BackGroundIndexGroup;

import java.util.List;

public interface GroupBackGroundManagement {

    /**
     * 查找组接口
     */
    List<BackGroundIndexGroup> getIndexGroup(SearchGroup searchGroup);

    /**
     * 根据小组ID打开小组
     */
    boolean openGroupStatusByPrimaryKey(Integer id);

    /**
     * 根据小组ID关闭小组
     */
    boolean closeGroupStatusByPrimaryKey(Integer id);

}
