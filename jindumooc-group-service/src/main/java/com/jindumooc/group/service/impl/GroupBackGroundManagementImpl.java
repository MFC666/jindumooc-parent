package com.jindumooc.group.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.GroupsMapper;
import com.jindumooc.group.service.GroupBackGroundManagement;
import com.jindumooc.pojo.Groups;
import com.jindumooc.vojo.ground.BackGroundIndexGroup;
import org.springframework.beans.factory.annotation.Autowired;
import com.jindumooc.dto.group.SearchGroup;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupBackGroundManagementImpl implements GroupBackGroundManagement {

    @Autowired
    private GroupsMapper groupsMapper;

    /**
     * 获取小组
     *
     * @param searchGroup
     * @return
     */
    @Override
    public List<BackGroundIndexGroup> getIndexGroup(SearchGroup searchGroup) {

        //与前端交互后修改
        PageHelper.startPage(searchGroup.getPageNum(), searchGroup.getPageSize());
        List<Groups> groupsList = groupsMapper.getIndexGroup(searchGroup);

        //整理groupList填充BackgroundIndexGroup
        return getBackGroundIndexGroup(groupsList);
    }

    /**
     * 根据小组ID打开小组
     *
     * @param id
     * @return
     */
    @Override
    public boolean openGroupStatusByPrimaryKey(Integer id) {
        try {
            groupsMapper.openGroupStatusByPrimaryKey(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据小组ID关闭小组
     *
     * @param id
     * @return
     */
    @Override
    public boolean closeGroupStatusByPrimaryKey(Integer id) {
        try {
            groupsMapper.closeGroupStatusByPrimaryKey(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 根据获取到的小组列表转换为我们需要展示的小组的列表
     *
     * @param groupsList
     * @return
     */
    private List<BackGroundIndexGroup> getBackGroundIndexGroup(List<Groups> groupsList) {
        List<BackGroundIndexGroup> backGroundIndexGroups = new ArrayList<>();
        for (int i = 0; i < groupsList.size(); i++) {
            BackGroundIndexGroup bgig = new BackGroundIndexGroup();
            Groups groups = groupsList.get(i);
            System.out.println(groups.getTitle());
            bgig.setGroupID(groups.getId());
            bgig.setGroupMemberNum(groups.getMembernum());
            bgig.setGroupOwnerID(groups.getOwnerid());
            bgig.setGroupPostNum(groups.getPostnum());
            bgig.setGroupStatus(groups.getStatus());
            bgig.setGroupThreadNum(groups.getThreadnum());
            bgig.setGroupTitle(groups.getTitle());

            backGroundIndexGroups.add(bgig);
        }
        return backGroundIndexGroups;
    }
}
