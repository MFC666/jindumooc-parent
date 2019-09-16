package com.jindumooc.dao;

import com.jindumooc.pojo.ClassroomCourses;
import com.jindumooc.pojo.ClassroomCoursesExample;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface ClassroomCoursesMapper {
    int countByExample(ClassroomCoursesExample example);

    int deleteByExample(ClassroomCoursesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomCourses record);

    int insertSelective(ClassroomCourses record);

    List<ClassroomCourses> selectByExample(ClassroomCoursesExample example);

    ClassroomCourses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassroomCourses record, @Param("example") ClassroomCoursesExample example);

    int updateByExample(@Param("record") ClassroomCourses record, @Param("example") ClassroomCoursesExample example);

    int updateByPrimaryKeySelective(ClassroomCourses record);

    int updateByPrimaryKey(ClassroomCourses record);
}