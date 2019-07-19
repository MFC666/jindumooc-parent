package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.user.service.MyTeaching;
import com.jindumooc.vojo.user.TeachingCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class MyTeachingController {

    @Reference
    private MyTeaching myTeaching;
    /*
    我的教学模块
     */
    /*
    在教课程
     */
    @RequestMapping("/user/getTeachingCourse")
    @ResponseBody
    public List<TeachingCourse> getTeachingCourse(SearchMessage sm){

        return myTeaching.getTeachingCourse(sm);
    }
}
