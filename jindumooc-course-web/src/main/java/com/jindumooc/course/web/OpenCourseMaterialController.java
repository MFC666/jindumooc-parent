package com.jindumooc.course.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.course.service.CourseSummaryInfo;
import com.jindumooc.course.service.OpenCourseMaterial;
import com.jindumooc.dto.course.CourseSummaryNoteDTO;
import com.jindumooc.dto.course.CourseSummaryNoticeDTO;
import com.jindumooc.dto.course.OpenCourseReviewDTO;
import com.jindumooc.pojo.OpenCourse;
import com.jindumooc.vojo.course.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OpenCourseMaterialController {

    @Reference
    private OpenCourseMaterial openCourseMaterial;

    /**
     * @param  materialID 查询的课程资料Id
     * @return 返回对应课程资料的Uri
     * @author 冯莫涵 2019/09/30
     */
    @GetMapping(value = "/background/course/open/down")
    public OpenCourseDown getSpecificMaterialUri(@RequestParam(value = "materialID") Integer materialID) {
        return openCourseMaterial.getSpecificMaterialUri(materialID);
    }

    /**
     * @param openCourseReviewDTO 新建公开课评论的信息
     * @return 返回新建公开课评论的Id
     * @author 冯莫涵 2019/10/01
     */
    @PostMapping(value = "/background/course/open/review")
    public int getSpecificSummaryNote(@RequestBody OpenCourseReviewDTO openCourseReviewDTO) {
        return openCourseMaterial.addSpecificSummaryNotice(openCourseReviewDTO);
    }

    /**
     * @param
     * @return 返回全部的公开课
     * @author 冯莫涵 2019/10/07
     */
    @PostMapping(value = "/background/course/open/list")
    public List<OpenCourseShow> showOpenCourseList() {
        return openCourseMaterial.showOpenCourseList();
    }

}