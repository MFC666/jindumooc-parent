package com.jindumooc.user.service.impl;

import com.jindumooc.dao.CourseV8Mapper;
import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.pojo.CourseV8;
import com.jindumooc.user.service.MyTeaching;
import com.jindumooc.vojo.user.TeachingCourse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyTeachingImpl implements MyTeaching {


    @Autowired
    private CourseV8Mapper courseV8Mapper;
    /*
    根据类别获取当前在教课程
    sm.courseType
     */
    @Override
    public List<TeachingCourse> getTeachingCourse(SearchMessage sm) {

        return courseV8Mapper.getTeachingCourse(sm);
    }
}
