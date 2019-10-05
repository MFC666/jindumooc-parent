package com.jindumooc.course.service;

import com.jindumooc.dto.course.CourseQuestionDTO;
import com.jindumooc.vojo.course.CourseHomeworkResult;

import java.util.List;

/**
 * @author 马洪升 2019年10月4日13:07:41
 */
public interface CourseManagement {

    /**
     * 创建题目
     *
     * @param questionDTO
     * @return
     */
    boolean createQuestion(CourseQuestionDTO questionDTO);

    /**
     * 得到作业批阅结果
     *
     * @param courseSetID
     * @return
     */
    List<CourseHomeworkResult> getAllHomeworkResult(Integer courseSetID);
}
