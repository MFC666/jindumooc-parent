package com.jindumooc.dao;

import com.jindumooc.pojo.OpenCourseMember;
import com.jindumooc.pojo.OpenCourseMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenCourseMemberMapper {
    int countByExample(OpenCourseMemberExample example);

    int deleteByExample(OpenCourseMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenCourseMember record);

    int insertSelective(OpenCourseMember record);

    List<OpenCourseMember> selectByExample(OpenCourseMemberExample example);

    OpenCourseMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenCourseMember record, @Param("example") OpenCourseMemberExample example);

    int updateByExample(@Param("record") OpenCourseMember record, @Param("example") OpenCourseMemberExample example);

    int updateByPrimaryKeySelective(OpenCourseMember record);

    int updateByPrimaryKey(OpenCourseMember record);
}