package com.jindumooc.dao;

import com.jindumooc.pojo.CourseLesson;
import com.jindumooc.pojo.CourseLessonExample;
import com.jindumooc.pojo.CourseLessonWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseLessonMapper {
    int countByExample(CourseLessonExample example);

    int deleteByExample(CourseLessonExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseLessonWithBLOBs record);

    int insertSelective(CourseLessonWithBLOBs record);

    List<CourseLessonWithBLOBs> selectByExampleWithBLOBs(CourseLessonExample example);

    List<CourseLesson> selectByExample(CourseLessonExample example);

    CourseLessonWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseLessonWithBLOBs record, @Param("example") CourseLessonExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseLessonWithBLOBs record, @Param("example") CourseLessonExample example);

    int updateByExample(@Param("record") CourseLesson record, @Param("example") CourseLessonExample example);

    int updateByPrimaryKeySelective(CourseLessonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseLessonWithBLOBs record);

    int updateByPrimaryKey(CourseLesson record);
}