package com.jindumooc.course.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.course.service.CourseSummaryInfo;
import com.jindumooc.dto.course.CourseListShowDTO;
import com.jindumooc.dto.course.CourseSummaryNoteDTO;
import com.jindumooc.dto.course.CourseSummaryNoticeDTO;
import com.jindumooc.vojo.course.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseSummaryInfoController {

    @Reference
    private CourseSummaryInfo courseSummaryInfo;

    /**
     * @param  courseID 查询的课程Id
     * @return 返回对应课程的介绍
     * @author 冯莫涵 2019/09/29
     */
    @GetMapping(value = "/background/course/summary/introduce")
    public CourseSummaryIntroduce getSpecificSummaryIntroduce(@RequestParam(value = "courseID") Integer courseID) {
        return courseSummaryInfo.getSpecificSummaryIntroduce(courseID);
    }

    /**
     * @param  courseID 查询的课程Id
     * @return 返回对应课程的目录
     * @author 冯莫涵 2019/09/29
     */
    @GetMapping(value = "/background/course/summary/catalog")
    public List<CourseSummaryCatalog> getSpecificSummaryCatalog(@RequestParam(value = "courseID") Integer courseID) {
        return courseSummaryInfo.getSpecificSummaryCatalog(courseID);
    }

    /**
     * @param  courseSummaryNoteDTO 查询的课程Id，排序方式（=like表示按点赞数=latest表示按时间），任务Id（=0时表示无限制）
     * @return 返回对应课程的笔记
     * @author 冯莫涵 2019/09/29
     */
    @PostMapping(value = "/background/course/summary/note")
    public List<CourseSummaryNote> getSpecificSummaryNote(@RequestBody CourseSummaryNoteDTO courseSummaryNoteDTO) {
        return courseSummaryInfo.getSpecificSummaryNote(courseSummaryNoteDTO);
    }

    /**
     * @param  courseID 查询的课程Id
     * @return 返回对应课程的评价
     * @author 冯莫涵 2019/09/29
     */
    @GetMapping(value = "/background/course/summary/review")
    public List<CourseSummaryReview> getSpecificSummaryEvaluate(@RequestParam(value = "courseID") Integer courseID) {
        return courseSummaryInfo.getSpecificSummaryEvaluate(courseID);
    }

    /**
     * @param courseSummaryNoticeDTO 新建公告的信息
     * @return 返回新建公告的Id
     * @author 冯莫涵 2019/09/29
     */
    @PostMapping(value = "/background/course/summary/notice")
    public int getSpecificSummaryNote(@RequestBody CourseSummaryNoticeDTO courseSummaryNoticeDTO) {
        return courseSummaryInfo.addSpecificSummaryNotice(courseSummaryNoticeDTO);
    }

    /**
     * @param courseListShowDTO 展示课程列表 分类Id（=0时表示无限制），是否为免费课程（=1时表示有限制=0表示无限制），排序方式（=hit表示最热=latest表示最新=recommend表示推荐）
     * @return 返回对应的课程
     * @author 冯莫涵 2019/10/07
     */
    @PostMapping(value = "/background/course/summary/list")
    public List<CourseListShow> showCourseList(CourseListShowDTO courseListShowDTO) {
        return courseSummaryInfo.showCourseList(courseListShowDTO);
    }
}