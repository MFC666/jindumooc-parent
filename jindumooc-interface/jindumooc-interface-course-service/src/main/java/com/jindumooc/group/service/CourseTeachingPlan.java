package com.jindumooc.group.service;

import com.jindumooc.vojo.course.CourseTeachingCatalog;

import java.util.List;

public interface CourseTeachingPlan {

    /**
     * 得到某一课程教学计划中的目录，目录中包含教学任务
     *
     * @return
     */
    List<CourseTeachingCatalog> getSpecificTeachingPlan(Integer courseID);
}
