package com.jindumooc.user.service;

import com.jindumooc.vojo.user.TeachingClassroom;
import com.jindumooc.vojo.user.TeachingCourse;
import com.jindumooc.vojo.user.CourseThread;
import com.jindumooc.vojo.user.TestPaperResult;

import java.util.List;

public interface MyTeaching {

    /**
     * 我的教学：在教课程
     * @param teacherId
     * @param courseType
     * @return
     */
    List<TeachingCourse> getTeachingCourse(String teacherId,String courseType,int pageNum,int pageSize);

    /**
     * 获取在教班级
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    List<TeachingClassroom> getTeachingClassroom(int pageNum, int pageSize, int teacherId);

    /**
     * 获取学生问题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    List<CourseThread> getCourseQuestion(int pageNum, int pageSize, int teacherId);

    /**
     * 获取学生话题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param threadType
     * @return
     */
    List<CourseThread> getCourseDiscussion(int pageNum, int pageSize, int teacherId, String threadType);

    /**
     * 获取考试结果
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param testPaperStatus
     * @return
     */
    List<TestPaperResult> getTestPaperResult(int pageNum, int pageSize, int teacherId, String testPaperStatus);
}
