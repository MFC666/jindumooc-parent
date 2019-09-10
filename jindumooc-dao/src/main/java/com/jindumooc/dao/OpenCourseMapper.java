package com.jindumooc.dao;

import com.jindumooc.pojo.OpenCourse;
import com.jindumooc.pojo.OpenCourseExample;
import com.jindumooc.pojo.OpenCourseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenCourseMapper {
    int countByExample(OpenCourseExample example);

    int deleteByExample(OpenCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenCourseWithBLOBs record);

    int insertSelective(OpenCourseWithBLOBs record);

    List<OpenCourseWithBLOBs> selectByExampleWithBLOBs(OpenCourseExample example);

    List<OpenCourse> selectByExample(OpenCourseExample example);

    OpenCourseWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenCourseWithBLOBs record, @Param("example") OpenCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") OpenCourseWithBLOBs record, @Param("example") OpenCourseExample example);

    int updateByExample(@Param("record") OpenCourse record, @Param("example") OpenCourseExample example);

    int updateByPrimaryKeySelective(OpenCourseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OpenCourseWithBLOBs record);

    int updateByPrimaryKey(OpenCourse record);
}