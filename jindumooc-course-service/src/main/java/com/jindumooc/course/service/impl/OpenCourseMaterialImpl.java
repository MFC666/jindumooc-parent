package com.jindumooc.course.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.course.service.OpenCourseMaterial;
import com.jindumooc.dao.*;
import com.jindumooc.dto.course.CourseSummaryNoticeDTO;
import com.jindumooc.dto.course.OpenCourseReviewDTO;
import com.jindumooc.pojo.*;
import com.jindumooc.pojo.OpenCourseRecommend;
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

    @Autowired
    private OpenCourseMapper openCourseMapper;

    @Autowired
    private OpenCourseRecommendMapper openCourseRecommendMapper;

    @Autowired
    private UserProfileMapper userProfileMapper;

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

    /**
     * @return 返回全部的公开课
     * @author 冯莫涵 2019/10/07
     */
    @Override
    public List<OpenCourseShow> showOpenCourseList() {
        try {
            OpenCourseExample openCourseExample = new OpenCourseExample();
            OpenCourseExample.Criteria criteria = openCourseExample.createCriteria();
            criteria.andStatusEqualTo("published");
            criteria.andTypeEqualTo("open");

            List<OpenCourseShow> openCourseShows = new ArrayList<>();

            List<OpenCourseWithBLOBs> openCourseWithBLOBs = openCourseMapper.selectByExampleWithBLOBs(openCourseExample);

            for (OpenCourseWithBLOBs o : openCourseWithBLOBs) {
                OpenCourseShow openCourseShow = new OpenCourseShow();

                openCourseShow.setHitNum(o.getHitnum());
                openCourseShow.setId(o.getId());
                openCourseShow.setPicture(o.getMiddlepicture());
                openCourseShow.setPostNum(o.getPostnum());
                openCourseShow.setTitle(o.getTitle());

                openCourseShows.add(openCourseShow);
            }

            return openCourseShows;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param openCourseID 打开公开课Id
     * @return 对应公开课展示信息
     * @author 冯莫涵 2019/10/13
     */
    @Override
    public OpenCourseInfo showOpenCourseInfo(Integer openCourseID) {
        try {
            OpenCourseInfo openCourseInfo = new OpenCourseInfo();

            OpenCourseWithBLOBs openCourseWithBLOBs = openCourseMapper.selectByPrimaryKey(openCourseID);

            openCourseInfo.setHitNum(openCourseWithBLOBs.getHitnum());
            openCourseInfo.setId(openCourseID);
            openCourseInfo.setLikeNum(openCourseWithBLOBs.getLikenum());
            openCourseInfo.setPostNum(openCourseWithBLOBs.getPostnum());
            openCourseInfo.setSmallPicture(openCourseWithBLOBs.getSmallpicture());
            openCourseInfo.setSubtitle(openCourseWithBLOBs.getSubtitle());
            openCourseInfo.setTitle(openCourseWithBLOBs.getTitle());

            OpenCourseRecommendExample openCourseRecommendExample = new OpenCourseRecommendExample();
            OpenCourseRecommendExample.Criteria criteria = openCourseRecommendExample.createCriteria();
            criteria.andOpencourseidEqualTo(openCourseID);
            openCourseRecommendExample.setOrderByClause("`seq` ASC");

            List<OpenCourseRecommend> openCourseRecommends = openCourseRecommendMapper.selectByExample(openCourseRecommendExample);

            List<OpenCourseRecom> openCourseRecoms = new ArrayList<>();

            for (OpenCourseRecommend o : openCourseRecommends) {
                OpenCourseRecom openCourseRecom = new OpenCourseRecom();

                openCourseRecom.setId(o.getRecommendcourseid());
                openCourseRecom.setSeq(o.getSeq());

                OpenCourseWithBLOBs temp = openCourseMapper.selectByPrimaryKey(o.getRecommendcourseid());

                openCourseRecom.setTitle(temp.getTitle());

                openCourseRecoms.add(openCourseRecom);
            }

            openCourseInfo.setRecommends(openCourseRecoms);

            String teacher_id_0 = openCourseWithBLOBs.getTeacherids();
            System.out.println(teacher_id_0);
            String[] teacher_id_1 = teacher_id_0.split("\\|");
            int teacher_id_2 = Integer.valueOf(teacher_id_1[1]);
            System.out.println(teacher_id_2);
            openCourseInfo.setTeacher_id(teacher_id_2);

            User user = userMapper.selectByPrimaryKey(teacher_id_2);

            openCourseInfo.setTeacher_largeAvatar(user.getLargeavatar());
            openCourseInfo.setTeacher_nickname(user.getNickname());
            openCourseInfo.setTeacher_title(user.getTitle());

            UserProfileWithBLOBs userProfileWithBLOBs = userProfileMapper.selectByPrimaryKey(teacher_id_2);

            openCourseInfo.setTeacher_signature(userProfileWithBLOBs.getSignature());

            return openCourseInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
