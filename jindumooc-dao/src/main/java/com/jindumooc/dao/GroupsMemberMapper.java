package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsMember;
import com.jindumooc.pojo.GroupsMemberExample;
import java.util.List;
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
}