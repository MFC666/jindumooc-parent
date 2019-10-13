package com.jindumooc.course.service;

import com.jindumooc.dto.course.CourseSummaryNoticeDTO;
import com.jindumooc.dto.course.OpenCourseReviewDTO;
import com.jindumooc.vojo.course.*;

import java.util.List;

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

    /**
     * @param
     * @return 返回全部的公开课
     * @author 冯莫涵 2019/10/07
     */
    List<OpenCourseShow> showOpenCourseList();

    /**
     * @param openCourseID 打开公开课Id
     * @return 对应公开课展示信息
     * @author 冯莫涵 2019/10/13
     */
    OpenCourseInfo showOpenCourseInfo(Integer openCourseID);


}
