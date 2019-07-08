package com.jindumooc.dao;

import com.jindumooc.pojo.CourseV8;
import com.jindumooc.pojo.CourseV8Example;
import com.jindumooc.pojo.CourseV8WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseV8Mapper {
    int countByExample(CourseV8Example example);

    int deleteByExample(CourseV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseV8WithBLOBs record);

    int insertSelective(CourseV8WithBLOBs record);

    List<CourseV8WithBLOBs> selectByExampleWithBLOBs(CourseV8Example example);

    List<CourseV8> selectByExample(CourseV8Example example);

    CourseV8WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseV8WithBLOBs record, @Param("example") CourseV8Example example);

    int updateByExampleWithBLOBs(@Param("record") CourseV8WithBLOBs record, @Param("example") CourseV8Example example);

    int updateByExample(@Param("record") CourseV8 record, @Param("example") CourseV8Example example);

    int updateByPrimaryKeySelective(CourseV8WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseV8WithBLOBs record);

    int updateByPrimaryKey(CourseV8 record);
}