package com.jindumooc.group.service;

import com.jindumooc.dto.group.SearchGroup;
import com.jindumooc.vojo.ground.BackGroundIndexGroup;

import java.util.List;

public interface GroupBackGroundManagement {

    /**
     * 查找组接口
     */
    List<BackGroundIndexGroup> getIndexGroup(SearchGroup searchGroup);

}
