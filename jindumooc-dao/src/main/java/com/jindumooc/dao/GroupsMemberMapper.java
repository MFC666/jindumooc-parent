package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsMember;
import com.jindumooc.pojo.GroupsMemberExample;

import java.util.List;

import com.jindumooc.vojo.user.UserNew;
import com.jindumooc.vojo.user.UserShow;

import org.apache.ibatis.annotations.Param;

public interface GroupsMemberMapper {
    int countByExample(GroupsMemberExample example);

    int deleteByExample(GroupsMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsMember record);

    int insertSelective(GroupsMember record);

    List<GroupsMember> selectByExample(GroupsMemberExample example);

    GroupsMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsMember record, @Param("example") GroupsMemberExample example);

    int updateByExample(@Param("record") GroupsMember record, @Param("example") GroupsMemberExample example);

    int updateByPrimaryKeySelective(GroupsMember record);

    int updateByPrimaryKey(GroupsMember record);

    /**
     * 根据小组ID搜索小组成员ID
     *
     * @param groupId
     * @return
     */
    List<UserShow> getGroupMembers(Integer groupId);

    /**
     * 根据小组成员ID展示小组成员信息
     *
     * @param userId
     * @return
     */
    UserShow showGroupMember(Integer userId);

    /**
     * 搜索小组新进成员
     *
     * @param groupId,memberNumber
     * @return
     */
    List<Integer> getNewMembers(@Param("groupId") Integer groupId, @Param("n") Integer memberNumber);

    /**
     * 展示小组新进成员
     *
     * @param userId
     * @return
     */
    UserNew showNewMember(Integer userId);

}