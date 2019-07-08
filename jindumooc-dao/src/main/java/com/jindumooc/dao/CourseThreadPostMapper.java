package com.jindumooc.dao;

import com.jindumooc.pojo.CourseThreadPost;
import com.jindumooc.pojo.CourseThreadPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseThreadPostMapper {
    int countByExample(CourseThreadPostExample example);

    int deleteByExample(CourseThreadPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseThreadPost record);

    int insertSelective(CourseThreadPost record);

    List<CourseThreadPost> selectByExampleWithBLOBs(CourseThreadPostExample example);

    List<CourseThreadPost> selectByExample(CourseThreadPostExample example);

    CourseThreadPost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseThreadPost record, @Param("example") CourseThreadPostExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseThreadPost record, @Param("example") CourseThreadPostExample example);

    int updateByExample(@Param("record") CourseThreadPost record, @Param("example") CourseThreadPostExample example);

    int updateByPrimaryKeySelective(CourseThreadPost record);

    int updateByPrimaryKeyWithBLOBs(CourseThreadPost record);

    int updateByPrimaryKey(CourseThreadPost record);
}