package com.jindumooc.user.service;

import com.jindumooc.vojo.user.Teacher;

import java.util.List;

public interface TeacherIntroduction {
    List<Teacher> getTeachers(int pageNum, int pageSize);
}
