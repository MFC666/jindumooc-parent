package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.*;
import com.jindumooc.user.service.MyTeaching;
import com.jindumooc.vojo.user.TeachingClassroom;
import com.jindumooc.vojo.user.TeachingCourse;
import com.jindumooc.vojo.user.CourseThread;
import com.jindumooc.vojo.user.TestPaperResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

@Service
public class MyTeachingImpl implements MyTeaching {


    @Autowired
    private CourseV8Mapper courseV8Mapper;

    @Autowired
    private ClassroomMapper classroomMapper;

    @Autowired
    private CourseThreadMapper courseThreadMapper;

    @Autowired
    private ThreadMapper threadMapper;

    @Autowired
    private TestpaperResultMapper testpaperResultMapper;
    /**
     * 获取在教课程
     * @param teacherId
     * @param courseType
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public List<TeachingCourse> getTeachingCourse(String teacherId,String courseType,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TeachingCourse> teachingCourseList = courseV8Mapper.getTeachingCourse(teacherId,courseType);
        return teachingCourseList;
    }

    /**
     * 获取所管理班级
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    @Override
    public List<TeachingClassroom> getTeachingClassroom(int pageNum, int pageSize, int teacherId) {


        long current=System.currentTimeMillis();
        PageHelper.startPage(pageNum,pageSize);
        classroomMapper.getTeachingClassroom(teacherId,(current/(1000*3600*24)*(1000*3600*24)-TimeZone.getDefault().getRawOffset())/ 1000);

        return null;
    }

    /**
     * 获得课程问题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    @Override
    public List<CourseThread> getCourseQuestion(int pageNum, int pageSize, int teacherId) {

        PageHelper.startPage(pageNum,pageSize);

        return  courseThreadMapper.getCourseQuestion("|"+teacherId+"|");
    }

    /**
     * 获取学生话题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param threadType，标记是课程学员话题（courseMemberThread）、班级学员话题（classMemberThread）
     * @return
     */
    @Override
    public List<CourseThread> getCourseDiscussion(int pageNum, int pageSize, int teacherId, String threadType) {

        List<CourseThread> courseThreadList = new ArrayList<>();
        if(threadType=="courseMemberThread"){
            PageHelper.startPage(pageNum,pageSize);
            courseThreadList = courseThreadMapper.getCourseDiscussion("|"+teacherId+"|");
        }else if(threadType=="classMemberThread"){
            PageHelper.startPage(pageNum,pageSize);
            courseThreadList = threadMapper.getCourseDiscussion("|"+teacherId+"|");
        }else{

            return null;
        }


        return courseThreadList;
    }

    /**
     * 获取学生考试结果
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param testPaperStatus：考试状态
     * @return
     */
    @Override
    public List<TestPaperResult> getTestPaperResult(int pageNum, int pageSize, int teacherId, String testPaperStatus) {

        PageHelper.startPage(pageNum,pageSize);
        return testpaperResultMapper.getTestPaperResult(teacherId,testPaperStatus);
    }

    
}
