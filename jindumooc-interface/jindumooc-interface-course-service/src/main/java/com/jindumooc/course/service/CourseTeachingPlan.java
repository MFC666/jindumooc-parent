package com.jindumooc.course.service;

import com.jindumooc.vojo.course.*;

import java.util.List;

public interface CourseTeachingPlan {

    /**
     * 得到某一课程教学计划中的目录，目录中包含教学任务
     *
     * @return
     */
    List<CourseTeachingCatalog> getSpecificTeachingPlan(Integer courseID);

    /**
     * 得到某一课程教学计划中的话题
     *
     * @param courseID
     * @return
     */
    List<CourseTeachingThread> getSpecificTeachingThread(Integer courseID);

    /**
     * 得到某一课程教学计划中的笔记
     *
     * @param courseID
     * @return
     */
    List<CourseTeachingNote> getSpecificTeachingNote(Integer courseID);

    /**
     * 得到某一课程的资料
     *
     * @param courseID
     * @return
     */
    List<CourseTeachingMaterial> getSpecificTeachingMaterial(Integer courseID);

    /**
     * 得到某一课程的评价
     *
     * @param courseID
     * @return
     */
    List<CourseTeachingReview> getSpecificTeachingReview(Integer courseID);

    /**
     * 得到某一课程的介绍、目标、适合人群
     *
     * @param courseID
     * @return
     */
    CourseTeachingIntroduction getSpecificTeachingIntro(Integer courseID);
}
