package com.jindumooc.dao;

import com.jindumooc.dto.group.SearchGroup;
import com.jindumooc.pojo.Groups;
import com.jindumooc.pojo.GroupsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GroupsMapper {
    int countByExample(GroupsExample example);

    int deleteByExample(GroupsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Groups record);

    int insertSelective(Groups record);

    List<Groups> selectByExampleWithBLOBs(GroupsExample example);

    List<Groups> selectByExample(GroupsExample example);

    Groups selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExampleWithBLOBs(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKeyWithBLOBs(Groups record);

    int updateByPrimaryKey(Groups record);

    List<Groups> getIndexGroup(SearchGroup sg);

    int openGroupStatusByPrimaryKey(Integer id);

    int closeGroupStatusByPrimaryKey(Integer id);
}