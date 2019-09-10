package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.user.service.TeacherIntroduction;
import com.jindumooc.vojo.user.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TeacherIntroductionImpl implements TeacherIntroduction {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Teacher> getTeachers(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Teacher> teachers = userMapper.getTeachers();

        return teachers;
    }
}
