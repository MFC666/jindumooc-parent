package com.jindumooc.course.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.course.service.CourseTeachingPlan;
import com.jindumooc.vojo.course.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseTeachingPlanController {

    @Reference
    private CourseTeachingPlan courseTeachingPlan;

    /**
     * 得到某一课程教学计划中的目录，目录中包含教学任务
     *
     * @return
     */
    @GetMapping(value = "/background/course/plan/task")
    public List<CourseTeachingCatalog> getSpecificTeachingPlan(@RequestParam(value = "courseID") Integer courseID) {
        return courseTeachingPlan.getSpecificTeachingPlan(courseID);
    }

    /**
     * 得到某一课程教学计划中的话题
     *
     * @param courseID
     * @return
     */
    @GetMapping(value = "/background/course/plan/thread")
    public List<CourseTeachingThread> getSpecificTeachingThread(@RequestParam(value = "courseID") Integer courseID) {
        return courseTeachingPlan.getSpecificTeachingThread(courseID);
    }

    /**
     * 得到某一课程教学计划中的笔记
     *
     * @param courseID
     * @return
     */
    @GetMapping(value = "/background/course/plan/note")
    public List<CourseTeachingNote> getSpecificTeachingNote(@RequestParam(value = "courseID") Integer courseID) {
        return courseTeachingPlan.getSpecificTeachingNote(courseID);
    }

    /**
     * 得到某一课程的资料
     *
     * @param courseID
     * @return
     */
    @GetMapping(value = "/background/course/plan/material")
    public List<CourseTeachingMaterial> getSpecificTeachingMaterial(@RequestParam(value = "courseID") Integer courseID) {
        return courseTeachingPlan.getSpecificTeachingMaterial(courseID);
    }

    /**
     * 得到某一课程的评价
     *
     * @param courseID
     * @return
     */
    @GetMapping(value = "/background/course/plan/review")
    public List<CourseTeachingReview> getSpecificTeachingReview(@RequestParam(value = "courseID") Integer courseID) {
        return courseTeachingPlan.getSpecificTeachingReview(courseID);
    }
}