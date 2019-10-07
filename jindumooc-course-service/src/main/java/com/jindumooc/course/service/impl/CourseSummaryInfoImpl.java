package com.jindumooc.course.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.course.service.CourseSummaryInfo;
import com.jindumooc.dao.*;
import com.jindumooc.dto.course.*;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.course.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CourseSummaryInfoImpl implements CourseSummaryInfo {
    @Autowired
    private CourseV8Mapper courseV8Mapper;// 教学计划表

    @Autowired
    private CourseTaskMapper courseTaskMapper;// 教学任务表，目录中存储的是教学任务

    @Autowired
    private CourseSetV8Mapper courseSetV8Mapper;// 该教学计划所属课程关系表

    @Autowired
    private CourseMaterialV8Mapper courseMaterialV8Mapper;// 教学资料关系表

    @Autowired
    private CourseThreadMapper threadMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private CourseNoteMapper courseNoteMapper;

    @Autowired
    private CourseReviewMapper courseReviewMapper;

    @Autowired
    private AnnouncementMapper announcementMapper;

    /**
     * @param courseID 查询的课程Id
     * @return 返回对应课程的介绍
     * @author 冯莫涵 2019/09/29
     */
    @Override
    public CourseSummaryIntroduce getSpecificSummaryIntroduce(Integer courseID) {
        try {
            CourseSetV8WithBLOBs courseSetV8WithBLOBs = courseSetV8Mapper.selectByPrimaryKey(courseID);

            if(courseSetV8WithBLOBs != null){
                CourseSummaryIntroduce courseSummaryIntroduce = new CourseSummaryIntroduce();
                courseSummaryIntroduce.setId(courseSetV8WithBLOBs.getId());
                courseSummaryIntroduce.setSubtitle(courseSetV8WithBLOBs.getSubtitle());
                courseSummaryIntroduce.setSummary(courseSetV8WithBLOBs.getSummary());
                courseSummaryIntroduce.setAudiences(courseSetV8WithBLOBs.getAudiences());
                return courseSummaryIntroduce;
            }

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param courseID 查询的课程Id
     * @return 返回对应课程的目录
     * @author 冯莫涵 2019/09/29
     */
    @Override
    public List<CourseSummaryCatalog> getSpecificSummaryCatalog(Integer courseID) {
        try {
            List<CourseSummaryCatalog> courseSummaryCatalogs = new ArrayList<>();

            CourseTaskExample courseTaskExample = new CourseTaskExample();
            CourseTaskExample.Criteria criteria = courseTaskExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);

            List<CourseTask> courseTasks = courseTaskMapper.selectByExample(courseTaskExample);

            for (CourseTask c : courseTasks) {
                CourseSummaryCatalog courseSummaryCatalog = new CourseSummaryCatalog();

                courseSummaryCatalog.setId(c.getId());
                courseSummaryCatalog.setSeq(c.getSeq());
                courseSummaryCatalog.setTitle(c.getTitle());
                courseSummaryCatalog.setType(c.getType());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);

                courseSummaryCatalog.setTime(dateTime);
                courseSummaryCatalogs.add(courseSummaryCatalog);
            }
            return courseSummaryCatalogs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param courseSummaryNoteDTO 查询的课程Id，排序方式（=like表示按点赞数=latest表示按时间），任务Id（=0时表示无限制）
     * @return 返回对应课程的笔记
     * @author 冯莫涵 2019/09/29
     */
    @Override
    public List<CourseSummaryNote> getSpecificSummaryNote(CourseSummaryNoteDTO courseSummaryNoteDTO) {
        try {
            int courseId = courseSummaryNoteDTO.getCourseId();
            String sort = courseSummaryNoteDTO.getSort();
            int taskId = courseSummaryNoteDTO.getTaskId();

            List<CourseSummaryNote> courseSummaryNotes = new ArrayList<>();

            CourseNoteExample courseNoteExample = new CourseNoteExample();
            CourseNoteExample.Criteria criteria = courseNoteExample.createCriteria();
            criteria.andCourseidEqualTo(courseId);

            if(taskId != 0){
                criteria.andTaskidEqualTo(taskId);
            }

            if(sort.equals("like")){
                courseNoteExample.setOrderByClause("`likeNum` DESC");
            }else if(sort.equals("latest")){
                courseNoteExample.setOrderByClause("`updatedTime` DESC");
            }

            List<CourseNote> courseNotes = courseNoteMapper.selectByExampleWithBLOBs(courseNoteExample);

            for (CourseNote c : courseNotes) {
                CourseSummaryNote courseSummaryNote = new CourseSummaryNote();

                courseSummaryNote.setId(c.getId());
                courseSummaryNote.setUserId(c.getUserid());
                courseSummaryNote.setContent(c.getContent());
                courseSummaryNote.setLikeNum(c.getLikenum());

                CourseTaskExample courseTaskExample = new CourseTaskExample();
                CourseTaskExample.Criteria criteria1 = courseTaskExample.createCriteria();
                CourseTask courseTask = courseTaskMapper.selectByPrimaryKey(c.getTaskid());
                courseSummaryNote.setTaskName(courseTask.getTitle());

                User user = userMapper.selectByPrimaryKey(c.getUserid());
                courseSummaryNote.setUserName(user.getNickname());
                courseSummaryNote.setUserSmallAvatar(user.getSmallavatar());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);

                courseSummaryNote.setTime(dateTime);
                courseSummaryNotes.add(courseSummaryNote);
            }
            return courseSummaryNotes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param courseID 查询的课程Id
     * @return 返回对应课程的评价
     * @author 冯莫涵 2019/09/29
     */
    @Override
    public List<CourseSummaryReview> getSpecificSummaryEvaluate(Integer courseID) {
        try {
            List<CourseSummaryReview> courseSummaryReviews = new ArrayList<>();

            CourseReviewExample courseReviewExample = new CourseReviewExample();
            CourseReviewExample.Criteria criteria = courseReviewExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);
            criteria.andHideEqualTo(false);

            List<CourseReviewWithBLOBs> courseReviewWithBLOBs = courseReviewMapper.selectByExampleWithBLOBs(courseReviewExample);

            for (CourseReviewWithBLOBs c : courseReviewWithBLOBs) {
                CourseSummaryReview courseSummaryReview = new CourseSummaryReview();

                courseSummaryReview.setId(c.getId());
                courseSummaryReview.setUserId(c.getUserid());
                courseSummaryReview.setParentId(c.getParentid());
                courseSummaryReview.setRating(c.getRating());
                courseSummaryReview.setContent(c.getContent());
                courseSummaryReview.setMeta(c.getMeta());

                CourseV8Example courseV8Example = new CourseV8Example();
                CourseV8Example.Criteria criteria1 = courseV8Example.createCriteria();
                criteria1.andCoursesetidEqualTo(c.getCoursesetid());
                List<CourseV8> courseV8s = courseV8Mapper.selectByExample(courseV8Example);
                String title = courseV8s.get(0).getTitle();
                courseSummaryReview.setCourseSet(title);

                User user = userMapper.selectByPrimaryKey(c.getUserid());
                courseSummaryReview.setUserName(user.getNickname());
                courseSummaryReview.setUserSmallAvatar(user.getSmallavatar());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);

                courseSummaryReview.setTime(dateTime);
                courseSummaryReviews.add(courseSummaryReview);
            }
            return courseSummaryReviews;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param courseSummaryNoticeDTO 新建公告的信息
     * @return 返回新建公告的Id
     * @author 冯莫涵 2019/09/29
     */
    @Override
    public int addSpecificSummaryNotice(CourseSummaryNoticeDTO courseSummaryNoticeDTO) {
        try {
            Announcement announcement = new Announcement();

            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date).getTime();
            int currentTime = (int) (time / 1000);

            String startTime_0 = courseSummaryNoticeDTO.getStartTime();
            String endTime_0 = courseSummaryNoticeDTO.getEndTime();
            long startTime_1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(startTime_0).getTime();
            long endTime_1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(endTime_0).getTime();
            int startTime = (int) (startTime_1 / 1000);
            int endTime = (int) (endTime_1 / 1000);

            announcement.setContent(courseSummaryNoticeDTO.getContent());
            announcement.setTargetid(courseSummaryNoticeDTO.getTargetId());
            announcement.setUserid(courseSummaryNoticeDTO.getUserId());
            announcement.setUrl(courseSummaryNoticeDTO.getUrl());
            announcement.setStarttime(startTime);
            announcement.setEndtime(endTime);
            announcement.setCreatedtime(currentTime);
            announcement.setUpdatedtime(currentTime);

            int result = announcementMapper.insertSelective(announcement);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * @param courseListShowDTO 展示课程列表 分类Id（=0时表示无限制），是否为免费课程（=1时表示有限制=0表示无限制），排序方式（=hit表示最热=latest表示最新=recommend表示推荐）
     * @return 返回对应的课程
     * @author 冯莫涵 2019/10/07
     */
    @Override
    public List<CourseListShow> showCourseList(CourseListShowDTO courseListShowDTO) {
        try {
            int categoryId = courseListShowDTO.getCategoryId();
            int isFree = courseListShowDTO.getIsFree();
            String sort = courseListShowDTO.getSort();

            List<CourseListShow> courseListShows = new ArrayList<>();

            CourseSetV8Example courseSetV8Example = new CourseSetV8Example();
            CourseSetV8Example.Criteria criteria = courseSetV8Example.createCriteria();

            if(categoryId != 0){
                criteria.andCategoryidEqualTo(categoryId);
            }

            if(isFree != 0){
                criteria.andMaxcoursepriceEqualTo((float)0);
            }

            if(sort.equals("hit")){
                courseSetV8Example.setOrderByClause("`hitNum` DESC");
            }else if(sort.equals("latest")){
                courseSetV8Example.setOrderByClause("`updatedTime` DESC");
            }else if(sort.equals("recommend")){
                criteria.andRecommendedEqualTo((byte)1);
                courseSetV8Example.setOrderByClause("`recommendedSeq` ASC");
            }

            List<CourseSetV8WithBLOBs> courseSetV8WithBLOBs = courseSetV8Mapper.selectByExampleWithBLOBs(courseSetV8Example);

            for (CourseSetV8WithBLOBs c : courseSetV8WithBLOBs) {
                CourseListShow courseListShow = new CourseListShow();

                courseListShow.setId(c.getId());
                String over = c.getCover();
                if(over.length() > 0){
                    String[] str1 = over.split(",");
                    String[] str2 = str1[1].split("\"");
                    courseListShow.setPicture(str2[3]);
                }
                if(c.getMaxcourseprice() == (float)0){
                    courseListShow.setIsFree(1);
                }
                courseListShow.setCategoryId(c.getCategoryid());
                courseListShow.setRatingNum(c.getRatingnum());
                courseListShow.setSerializeMode(c.getSerializemode());
                courseListShow.setStudentNum(c.getStudentnum());
                courseListShow.setTitle(c.getTitle());
                courseListShow.setHitNum(c.getHitnum());
                courseListShow.setIsRecommend(c.getRecommended());
                courseListShow.setUpdatedTime(String.valueOf(c.getUpdatedtime()));

                courseListShows.add(courseListShow);
            }
            return courseListShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
