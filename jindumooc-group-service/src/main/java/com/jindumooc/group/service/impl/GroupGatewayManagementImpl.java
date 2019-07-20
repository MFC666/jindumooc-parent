package com.jindumooc.group.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.GroupsMapper;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.Groups;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class GroupGatewayManagementImpl implements GroupGatewayManagement {

    @Autowired
    private GroupsMapper groupsMapper;

    /**
     * 添加新的小组，如果执行过程中有任何异常抛出，则返回false
     *
     * @param newGroup
     * @return
     */
    @Override
    public boolean addNewGroup(Groups newGroup) {
        try {
            groupsMapper.insert(newGroup);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据小组唯一ID删除小组，如果执行过程中有任何异常抛出，则返回false
     *
     * @param groupID
     * @return
     */
    @Override
    public boolean deleteGroup(Integer groupID) {
        try {
            groupsMapper.deleteByPrimaryKey(groupID);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
