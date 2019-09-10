package com.jindumooc.dao;

import com.jindumooc.pojo.CourseThread;
import com.jindumooc.pojo.CourseThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

public interface CourseThreadMapper {
    int countByExample(CourseThreadExample example);

    int deleteByExample(CourseThreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseThread record);

    int insertSelective(CourseThread record);

    List<CourseThread> selectByExampleWithBLOBs(CourseThreadExample example);

    List<CourseThread> selectByExample(CourseThreadExample example);

    CourseThread selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseThread record, @Param("example") CourseThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseThread record, @Param("example") CourseThreadExample example);

    int updateByExample(@Param("record") CourseThread record, @Param("example") CourseThreadExample example);

    int updateByPrimaryKeySelective(CourseThread record);

    int updateByPrimaryKeyWithBLOBs(CourseThread record);

    int updateByPrimaryKey(CourseThread record);

    List<com.jindumooc.vojo.user.CourseThread> getCourseQuestion(@Param("teacherId") String teacherId);

    List<com.jindumooc.vojo.user.CourseThread> getCourseDiscussion(@Param("teacherId") String teacherId);


    List<com.jindumooc.vojo.user.CourseThread> getMyQuestion(@Param("userId") int userId);

    List<com.jindumooc.vojo.user.CourseThread> getMyDiscussion(@Param("userId") int userId);

}