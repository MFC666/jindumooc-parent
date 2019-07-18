package com.jindumooc.user.web;

import com.jindumooc.dto.user.SearchMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MyTeachingController {

    /*
    我的教学模块
     */
    /*
    在教课程
     */
    @RequestMapping("/user/getTeachingCourse")
    @ResponseBody
    public List<TeachingCourse> getTeachingCourse(SearchMessage sm){

    }
}
