package com.jindumooc.dao;

import com.jindumooc.dto.classes.ClassroomThreadDTO;
import com.jindumooc.pojo.Thread;
import com.jindumooc.pojo.ThreadExample;
import com.jindumooc.pojo.ThreadWithBLOBs;
import java.util.List;
import com.jindumooc.vojo.classes.ClassroomThread;
import com.jindumooc.vojo.user.CourseThread;
import org.apache.ibatis.annotations.Param;

public interface ThreadMapper {
    int countByExample(ThreadExample example);

    int deleteByExample(ThreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreadWithBLOBs record);

    int insertSelective(ThreadWithBLOBs record);

    List<ThreadWithBLOBs> selectByExampleWithBLOBs(ThreadExample example);

    List<Thread> selectByExample(ThreadExample example);

    ThreadWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreadWithBLOBs record, @Param("example") ThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") ThreadWithBLOBs record, @Param("example") ThreadExample example);

    int updateByExample(@Param("record") Thread record, @Param("example") ThreadExample example);

    int updateByPrimaryKeySelective(ThreadWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ThreadWithBLOBs record);

    int updateByPrimaryKey(Thread record);

    List<CourseThread> getCourseDiscussion(@Param("teacherId") String teacherId);

    List<CourseThread> getMyDiscussion(@Param("userId") int userId);

    List<ClassroomThread> getClassroomThread(@Param("classroomId") int classroomId,@Param("type") String type,@Param("nice") int nice);

    void setClassroomThread(ClassroomThreadDTO classroomThreadDTO);

    void updateClassroomThread(ClassroomThreadDTO classroomThreadDTO);
}