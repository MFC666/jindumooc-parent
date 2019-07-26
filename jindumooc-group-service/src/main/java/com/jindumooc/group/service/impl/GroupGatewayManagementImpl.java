package com.jindumooc.group.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.GroupsMapper;
import com.jindumooc.dto.group.GroupIdDTO;
import com.jindumooc.group.service.GroupGatewayManagement;
import com.jindumooc.pojo.Groups;
import com.jindumooc.pojo.GroupsExample;
import com.jindumooc.vojo.group.GroupIntroduction;
import com.jindumooc.vojo.group.GroupShow;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 根据小组ID返回Json格式小组组名与介绍
     *
     * @param groupIdDTO
     * @return
     */
    @Override
    public GroupIntroduction showGroupIntroduction(GroupIdDTO groupIdDTO) {
        try {
            Groups groups = groupsMapper.selectByPrimaryKey(groupIdDTO.getGroupID());
            GroupIntroduction groupIntroduction = new GroupIntroduction();
            groupIntroduction.setGroupTitle(groups.getTitle());
            groupIntroduction.setGroupIntroduction(groups.getAbout());
            return groupIntroduction;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 展示所有热门小组的小组名与小组logo
     *
     * @return
     */
    @Override
    public List<GroupShow> showAllGroup() {
        try {
            int avgThreadNum = groupsMapper.avgThreadNum();
            GroupsExample groupsExample = new GroupsExample();
            GroupsExample.Criteria criteria = groupsExample.createCriteria();
            criteria.andStatusEqualTo("open");
            //展示小组话题数大于平均数的组
            criteria.andMembernumGreaterThan(avgThreadNum);
            List<Groups> groups = groupsMapper.selectByExample(groupsExample);
            List<GroupShow> groupShows = new ArrayList<>();
            for (Groups group :
                    groups) {
                GroupShow groupShow = new GroupShow();
                groupShow.setGroupTitle(group.getTitle());
                groupShow.setGroupLogo(group.getLogo());
                groupShows.add(groupShow);
            }
            return groupShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}