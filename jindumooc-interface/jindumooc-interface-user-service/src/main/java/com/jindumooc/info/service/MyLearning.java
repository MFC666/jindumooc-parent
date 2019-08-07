package com.jindumooc.info.service;

import com.jindumooc.vojo.user.LearningCourse;

import java.util.List;

public interface MyLearning {
    List<LearningCourse> getLearningCourse(int pageNum, int pageSize, int userId, String learnStatus);
}
