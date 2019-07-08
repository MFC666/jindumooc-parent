package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThreadPost;
import com.jindumooc.pojo.GroupsThreadPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsThreadPostMapper {
    int countByExample(GroupsThreadPostExample example);

    int deleteByExample(GroupsThreadPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsThreadPost record);

    int insertSelective(GroupsThreadPost record);

    List<GroupsThreadPost> selectByExampleWithBLOBs(GroupsThreadPostExample example);

    List<GroupsThreadPost> selectByExample(GroupsThreadPostExample example);

    GroupsThreadPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsThreadPost record, @Param("example") GroupsThreadPostExample example);

    int updateByExampleWithBLOBs(@Param("record") GroupsThreadPost record, @Param("example") GroupsThreadPostExample example);

    int updateByExample(@Param("record") GroupsThreadPost record, @Param("example") GroupsThreadPostExample example);

    int updateByPrimaryKeySelective(GroupsThreadPost record);

    int updateByPrimaryKeyWithBLOBs(GroupsThreadPost record);

    int updateByPrimaryKey(GroupsThreadPost record);
}