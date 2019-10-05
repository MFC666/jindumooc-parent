package com.jindumooc.course.service;

import com.jindumooc.dto.course.CourseSummaryNoticeDTO;
import com.jindumooc.dto.course.OpenCourseReviewDTO;
import com.jindumooc.vojo.course.*;

public interface OpenCourseMaterial {

    /**
     * @param materialID 查询的课程资料Id
     * @return 返回对应课程资料的Uri
     * @author 冯莫涵 2019/09/30
     */
    OpenCourseDown getSpecificMaterialUri(Integer materialID);

    /**
     * @param openCourseReviewDTO 新建公开课评论的信息
     * @return 返回新建公开课评论的Id
     * @author 冯莫涵 2019/10/01
     */
    int addSpecificSummaryNotice(OpenCourseReviewDTO openCourseReviewDTO);
}
