package com.jindumooc.group.service;

import com.jindumooc.dto.SearchGroup;
import com.jindumooc.vojo.BackGroundIndexGroup;

import java.util.List;

public interface GroupBackGroundManagement {

    /**
     * 查找组接口
     */
    List<BackGroundIndexGroup> getIndexGroup(SearchGroup searchGroup);

}
