package com.jindumooc.course.service;

import com.jindumooc.dto.course.*;
import com.jindumooc.vojo.course.*;

import java.util.List;

public interface CourseSummaryInfo {

    /**
     * @param  courseID 查询的课程Id
     * @return 返回对应课程的介绍
     * @author 冯莫涵 2019/09/29
     */
    CourseSummaryIntroduce getSpecificSummaryIntroduce(Integer courseID);

    /**
     * @param  courseID 查询的课程Id
     * @return 返回对应课程的目录
     * @author 冯莫涵 2019/09/29
     */
    List<CourseSummaryCatalog> getSpecificSummaryCatalog(Integer courseID);

    /**
     * @param  courseSummaryNoteDTO 查询的课程Id，排序方式（=like表示按点赞数=latest表示按时间），任务Id（=0时表示无限制）
     * @return 返回对应课程的笔记
     * @author 冯莫涵 2019/09/29
     */
    List<CourseSummaryNote> getSpecificSummaryNote(CourseSummaryNoteDTO courseSummaryNoteDTO);

    /**
     * @param  courseID 查询的课程Id
     * @return 返回对应课程的评价
     * @author 冯莫涵 2019/09/29
     */
    List<CourseSummaryReview> getSpecificSummaryEvaluate(Integer courseID);

    /**
     * @param  courseSummaryNoticeDTO 新建公告的信息
     * @return 返回新建公告的Id
     * @author 冯莫涵 2019/09/29
     */
    int addSpecificSummaryNotice(CourseSummaryNoticeDTO courseSummaryNoticeDTO);

    /**
     * @param  courseListShowDTO 展示课程列表 分类Id（=0时表示无限制），是否为免费课程（=1时表示有限制=0表示无限制），排序方式（=hit表示最热=latest表示最新=recommend表示推荐）
     * @return 返回对应的课程
     * @author 冯莫涵 2019/10/07
     */
    List<CourseListShow> showCourseList(CourseListShowDTO courseListShowDTO);


}
