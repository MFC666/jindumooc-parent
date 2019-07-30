package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.CourseLessonLearnMapper;
import com.jindumooc.user.service.MyLearning;
import com.jindumooc.vojo.user.LearningCourse;

import java.util.List;

public class MyLearningImp implements MyLearning {


    @Reference
    private CourseLessonLearnMapper courseLessonLearnMapper;

    @Override
    public List<LearningCourse> getLearningCourse(int pageNum, int pageSize, int userId, String learnStatus) {
        PageHelper.startPage(pageNum,pageSize);
        courseLessonLearnMapper.getLearningCourse(userId,learnStatus);

        return null;
    }
}
