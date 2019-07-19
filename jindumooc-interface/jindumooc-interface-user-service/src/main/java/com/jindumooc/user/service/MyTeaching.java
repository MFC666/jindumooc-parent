package com.jindumooc.user.service;

import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.vojo.user.TeachingCourse;

import java.util.List;

public interface MyTeaching {

    /*
    我的教学中的内容
     */
    List<TeachingCourse> getTeachingCourse(SearchMessage sm);
}
