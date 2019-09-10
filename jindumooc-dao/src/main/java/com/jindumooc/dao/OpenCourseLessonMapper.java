package com.jindumooc.dao;

import com.jindumooc.pojo.OpenCourseLesson;
import com.jindumooc.pojo.OpenCourseLessonExample;
import com.jindumooc.pojo.OpenCourseLessonWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenCourseLessonMapper {
    int countByExample(OpenCourseLessonExample example);

    int deleteByExample(OpenCourseLessonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenCourseLessonWithBLOBs record);

    int insertSelective(OpenCourseLessonWithBLOBs record);

    List<OpenCourseLessonWithBLOBs> selectByExampleWithBLOBs(OpenCourseLessonExample example);

    List<OpenCourseLesson> selectByExample(OpenCourseLessonExample example);

    OpenCourseLessonWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenCourseLessonWithBLOBs record, @Param("example") OpenCourseLessonExample example);

    int updateByExampleWithBLOBs(@Param("record") OpenCourseLessonWithBLOBs record, @Param("example") OpenCourseLessonExample example);

    int updateByExample(@Param("record") OpenCourseLesson record, @Param("example") OpenCourseLessonExample example);

    int updateByPrimaryKeySelective(OpenCourseLessonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OpenCourseLessonWithBLOBs record);

    int updateByPrimaryKey(OpenCourseLesson record);
}