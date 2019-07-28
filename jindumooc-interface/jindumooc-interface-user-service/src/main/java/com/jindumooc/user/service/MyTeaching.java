package com.jindumooc.user.service;

import com.jindumooc.vojo.user.TeachingClassroom;
import com.jindumooc.vojo.user.TeachingCourse;
import com.jindumooc.vojo.user.CourseThread;

import java.util.List;

public interface MyTeaching {

    /**
     * 我的教学：在教课程
     * @param teacherId
     * @param courseType
     * @return
     */
    List<TeachingCourse> getTeachingCourse(String teacherId,String courseType,int pageNum,int pageSize);

    List<TeachingClassroom> getTeachingClassroom(int pageNum, int pageSize, int teacherId);

    List<CourseThread> getCourseQuestion(int pageNum, int pageSize, int teacherId);

    List<CourseThread> getCourseDiscussion(int pageNum, int pageSize, int teacherId, String threadType);
}
