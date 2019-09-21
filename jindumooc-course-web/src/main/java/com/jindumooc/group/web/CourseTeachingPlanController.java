package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.group.service.CourseTeachingPlan;
import com.jindumooc.vojo.course.CourseTeachingCatalog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseTeachingPlanController {

    @Reference
    private CourseTeachingPlan courseTeachingPlan;

    @GetMapping(value = "/background/course/plan/{courseID}")
    public List<CourseTeachingCatalog> getSpecificTeachingPlan(@PathVariable(value = "courseID") Integer courseID) {
        return courseTeachingPlan.getSpecificTeachingPlan(courseID);
    }

}
