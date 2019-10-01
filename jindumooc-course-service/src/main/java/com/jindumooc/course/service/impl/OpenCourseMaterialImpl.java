package com.jindumooc.course.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.course.service.OpenCourseMaterial;
import com.jindumooc.dao.*;
import com.jindumooc.dto.course.CourseSummaryNoticeDTO;
import com.jindumooc.dto.course.OpenCourseReviewDTO;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.course.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OpenCourseMaterialImpl implements OpenCourseMaterial {
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

    @Autowired
    private FileMapper fileMapper;

    /**
     * @param  materialID 查询的课程资料Id
     * @return 返回对应课程资料的Uri
     * @author 冯莫涵 2019/09/30
     */
    @Override
    public OpenCourseDown getSpecificMaterialUri(Integer materialID) {
        try {
            CourseMaterialV8 courseMaterialV8 = courseMaterialV8Mapper.selectByPrimaryKey(materialID);

            if(courseMaterialV8 != null){
                OpenCourseDown openCourseDown = new OpenCourseDown();
                int fileID = courseMaterialV8.getFileid();
                File file = fileMapper.selectByPrimaryKey(fileID);
                openCourseDown.setId(materialID);
                openCourseDown.setFileUri(file.getUri());
                return openCourseDown;
            }

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param openCourseReviewDTO 新建公开课评论的信息
     * @return 返回新建公开课评论的Id
     * @author 冯莫涵 2019/10/01
     */
    @Override
    public int addSpecificSummaryNotice(OpenCourseReviewDTO openCourseReviewDTO) {
        try {
            //找不到表！！！！！
//            Announcement announcement = new Announcement();
//
//            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date).getTime();
//            int currentTime = (int) (time / 1000);
//
//            String startTime_0 = courseSummaryNoticeDTO.getStartTime();
//            String endTime_0 = courseSummaryNoticeDTO.getEndTime();
//            long startTime_1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(startTime_0).getTime();
//            long endTime_1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(endTime_0).getTime();
//            int startTime = (int) (startTime_1 / 1000);
//            int endTime = (int) (endTime_1 / 1000);
//
//            announcement.setContent(courseSummaryNoticeDTO.getContent());
//            announcement.setTargetid(courseSummaryNoticeDTO.getTargetId());
//            announcement.setUserid(courseSummaryNoticeDTO.getUserId());
//            announcement.setUrl(courseSummaryNoticeDTO.getUrl());
//            announcement.setStarttime(startTime);
//            announcement.setEndtime(endTime);
//            announcement.setCreatedtime(currentTime);
//            announcement.setUpdatedtime(currentTime);
//
//            int result = announcementMapper.insertSelective(announcement);
//
//            return result;
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
