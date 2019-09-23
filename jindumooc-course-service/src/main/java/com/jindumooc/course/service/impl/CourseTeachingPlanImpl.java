package com.jindumooc.course.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.course.service.CourseTeachingPlan;
import com.jindumooc.dao.*;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.course.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseTeachingPlanImpl implements CourseTeachingPlan {
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

    /**
     * 得到某一课程教学计划中的目录，目录中包含教学任务
     *
     * @return
     */
    @Override
    public List<CourseTeachingCatalog> getSpecificTeachingPlan(Integer courseID) {
        try {
            List<CourseTeachingCatalog> courseTeachingCatalogs = new ArrayList<>();

            CourseTaskExample courseTaskExample = new CourseTaskExample();
            courseTaskExample.setOrderByClause("`seq` ASC");
            CourseTaskExample.Criteria criteria = courseTaskExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);

            List<CourseTask> courseTasks = courseTaskMapper.selectByExample(courseTaskExample);

            int lessonID = 0;
            for (CourseTask c : courseTasks) {
                String taskName = "任务";
                String seq = c.getSeq().toString();
                String title = c.getTitle();
                taskName += seq + title;

                String type = c.getType();

                lessonID = c.getActivityid();

                CourseMaterialV8Example courseMaterialV8Example = new CourseMaterialV8Example();
                CourseMaterialV8Example.Criteria criteria1 = courseMaterialV8Example.createCriteria();
                criteria1.andLessonidEqualTo(lessonID);

                List<CourseMaterialV8> courseMaterialV8 = courseMaterialV8Mapper.selectByExample(courseMaterialV8Example);

                String link = courseMaterialV8.get(0).getLink();

                CourseTeachingCatalog courseTeachingCatalog = new CourseTeachingCatalog();
                courseTeachingCatalog.setTaskName(taskName);
                courseTeachingCatalog.setLink(link);
                courseTeachingCatalog.setType(type);
                courseTeachingCatalogs.add(courseTeachingCatalog);
            }
            return courseTeachingCatalogs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 得到某一课程教学计划中的话题。
     *
     * @param courseID
     * @return
     */
    @Override
    public List<CourseTeachingThread> getSpecificTeachingThread(Integer courseID) {
        try {
            List<CourseTeachingThread> courseTeachingThreads = new ArrayList<>();

            CourseThreadExample threadExample = new CourseThreadExample();
            CourseThreadExample.Criteria criteria = threadExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);
            List<CourseThread> courseThreads = threadMapper.selectByExample(threadExample);

            for (CourseThread c : courseThreads) {

                CourseTeachingThread courseTeachingThread = new CourseTeachingThread();
                courseTeachingThread.setCourseId(c.getCourseid());
                courseTeachingThread.setFollowNum(c.getFollownum());
                courseTeachingThread.setHitNum(c.getHitnum());
                courseTeachingThread.setId(c.getId());
                courseTeachingThread.setIsStick(c.getIsstick());
                courseTeachingThread.setPostNum(c.getPostnum());
                courseTeachingThread.setIsElite(c.getIselite());
                courseTeachingThread.setTitle(c.getTitle());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);

                courseTeachingThread.setTime(dateTime);

                User user = userMapper.selectByPrimaryKey(c.getUserid());

                courseTeachingThread.setLogo(user.getSmallavatar());
                courseTeachingThread.setUserNickName(user.getNickname());
                courseTeachingThreads.add(courseTeachingThread);
            }
            return courseTeachingThreads;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 得到某一课程教学计划中的笔记
     *
     * @param courseID
     * @return
     */
    @Override
    public List<CourseTeachingNote> getSpecificTeachingNote(Integer courseID) {
        try {
            List<CourseTeachingNote> courseTeachingNotes = new ArrayList<>();
            CourseNoteExample courseNoteExample = new CourseNoteExample();
            CourseNoteExample.Criteria criteria = courseNoteExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);
            criteria.andStatusEqualTo(true);


            List<CourseNote> courseNotes = courseNoteMapper.selectByExample(courseNoteExample);

            for (CourseNote c : courseNotes) {
                CourseTeachingNote courseTeachingNote = new CourseTeachingNote();
                courseTeachingNote.setContent(c.getContent());
                courseTeachingNote.setId(c.getId());
                courseTeachingNote.setLikeNum(c.getLikenum());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);
                courseTeachingNote.setTime(dateTime);

                User user = userMapper.selectByPrimaryKey(c.getUserid());

                courseTeachingNote.setAuthorName(user.getNickname());
                courseTeachingNotes.add(courseTeachingNote);
            }
            return courseTeachingNotes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 得到某一课程的资料
     *
     * @param courseID
     * @return
     */
    @Override
    public List<CourseTeachingMaterial> getSpecificTeachingMaterial(Integer courseID) {
        try {
            List<CourseTeachingMaterial> courseTeachingMaterials = new ArrayList<>();

            CourseMaterialV8Example courseMaterialV8Example = new CourseMaterialV8Example();
            CourseMaterialV8Example.Criteria criteria = courseMaterialV8Example.createCriteria();
            criteria.andCourseidEqualTo(courseID);

            List<CourseMaterialV8> courseMaterialV8s = courseMaterialV8Mapper.selectByExample(courseMaterialV8Example);

            for (CourseMaterialV8 c : courseMaterialV8s) {
                CourseTeachingMaterial courseTeachingMaterial = new CourseTeachingMaterial();

                courseTeachingMaterial.setId(c.getId());
                courseTeachingMaterial.setDescription(c.getDescription());
                courseTeachingMaterial.setTitle(c.getTitle());
                courseTeachingMaterial.setLink(c.getLink());

                User user = userMapper.selectByPrimaryKey(c.getUserid());

                courseTeachingMaterial.setUserName(user.getNickname());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dataTime = simpleDateFormat.format(time);

                courseTeachingMaterial.setTime(dataTime);

                courseTeachingMaterials.add(courseTeachingMaterial);
            }
            return courseTeachingMaterials;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 得到某一课程的评价
     *
     * @param courseID
     * @return
     */
    @Override
    public List<CourseTeachingReview> getSpecificTeachingReview(Integer courseID) {
        try {
            List<CourseTeachingReview> courseTeachingReviews = new ArrayList<>();

            CourseReviewExample courseReviewExample = new CourseReviewExample();
            CourseReviewExample.Criteria criteria = courseReviewExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);
            criteria.andHideEqualTo(false);

            List<CourseReview> courseReviews = courseReviewMapper.selectByExample(courseReviewExample);

            for (CourseReview c : courseReviews) {
                CourseTeachingReview courseTeachingReview = new CourseTeachingReview();

                courseTeachingReview.setId(c.getId());
//                courseTeachingReview.setContent(c);
                courseTeachingReview.setRating(c.getRating());
                courseTeachingReview.setTitle(c.getTitle());

                CourseV8Example courseV8Example = new CourseV8Example();
                CourseV8Example.Criteria criteria1 = courseV8Example.createCriteria();
                criteria1.andCoursesetidEqualTo(c.getCoursesetid());
                List<CourseV8> courseV8s = courseV8Mapper.selectByExample(courseV8Example);
                String title = courseV8s.get(0).getTitle();
                courseTeachingReview.setCourseSet(title);

                User user = userMapper.selectByPrimaryKey(c.getCreatedtime());
                courseTeachingReview.setUserName(user.getNickname());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(c.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);

                courseTeachingReview.setTime(dateTime);
                courseTeachingReviews.add(courseTeachingReview);
            }
            return courseTeachingReviews;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
