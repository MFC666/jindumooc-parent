package com.jindumooc.course.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.course.service.CourseManagement;
import com.jindumooc.dto.course.CourseQuestionDTO;
import com.jindumooc.vojo.course.CourseHomeworkResult;
import com.jindumooc.vojo.course.CourseSummaryIntroduce;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 马洪升 2019年10月4日14:00:53
 */
@RestController
public class CourseManagementController {
    @Reference
    private CourseManagement courseManagement;

    /**
     * 创建问题
     *
     * @param courseQuestionDTO
     * @return
     */
    @PostMapping(value = "/background/course/createQuestion")
    public boolean createQuestion(CourseQuestionDTO courseQuestionDTO) {
        return courseManagement.createQuestion(courseQuestionDTO);
    }

    /**
     * 得到该课程作业的批阅统计信息
     *
     * @param courseID
     * @return
     */
    @GetMapping(value = "/background/course/getAllHomeworkResult")
    public List<CourseHomeworkResult> getAllHomeworkResult(@RequestParam(value = "courseID") Integer courseID) {
        return courseManagement.getAllHomeworkResult(courseID);
    }

}
