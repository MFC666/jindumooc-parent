package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThread;
import com.jindumooc.pojo.GroupsThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsThreadMapper {
    int countByExample(GroupsThreadExample example);

    int deleteByExample(GroupsThreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsThread record);

    int insertSelective(GroupsThread record);

    List<GroupsThread> selectByExampleWithBLOBs(GroupsThreadExample example);

    List<GroupsThread> selectByExample(GroupsThreadExample example);

    GroupsThread selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsThread record, @Param("example") GroupsThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") GroupsThread record, @Param("example") GroupsThreadExample example);

    int updateByExample(@Param("record") GroupsThread record, @Param("example") GroupsThreadExample example);

    int updateByPrimaryKeySelective(GroupsThread record);

    int updateByPrimaryKeyWithBLOBs(GroupsThread record);

    int updateByPrimaryKey(GroupsThread record);
}