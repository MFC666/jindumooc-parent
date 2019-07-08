package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThreadCollect;
import com.jindumooc.pojo.GroupsThreadCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsThreadCollectMapper {
    int countByExample(GroupsThreadCollectExample example);

    int deleteByExample(GroupsThreadCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsThreadCollect record);

    int insertSelective(GroupsThreadCollect record);

    List<GroupsThreadCollect> selectByExample(GroupsThreadCollectExample example);

    GroupsThreadCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsThreadCollect record, @Param("example") GroupsThreadCollectExample example);

    int updateByExample(@Param("record") GroupsThreadCollect record, @Param("example") GroupsThreadCollectExample example);

    int updateByPrimaryKeySelective(GroupsThreadCollect record);

    int updateByPrimaryKey(GroupsThreadCollect record);
}