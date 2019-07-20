package com.jindumooc.group.service;

import com.jindumooc.pojo.Groups;

/**
 * 小组前台门口控制功能接口
 *
 * @author 马洪升
 * @date 2019年7月20日10:02:05
 */
public interface GroupGatewayManagement {

    /**
     * 添加新的小组接口
     *
     * @param newGroup
     * @return
     */
    boolean addNewGroup(Groups newGroup);

    /**
     * 根据小组唯一ID删除小组
     *
     * @param groupID
     * @return
     */
    boolean deleteGroup(Integer groupID);

}
