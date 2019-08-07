package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.info.service.MyLearning;
import com.jindumooc.vojo.user.LearningClassroom;
import com.jindumooc.vojo.user.LearningCourse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 我的学习
 */
public class MylearningController {

    @Reference
    private MyLearning myLearning;

    /**
     * 获取我的课程
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param learnStatus：学习中、已完成。。
     * @return
     */
    @GetMapping("/user/getLearningCourse")
    @ResponseBody
    public List<LearningCourse> getLearningCourse(@RequestParam(defaultValue = "1")int pageNum,
                                                  @RequestParam(defaultValue = "10")int pageSize,
                                                  @RequestParam(defaultValue = "0")int userId,
                                                  @RequestParam(defaultValue = "null")String learnStatus){

        //if(userId)
        if(userId==0){
            return null;
        }
        return myLearning.getLearningCourse(pageNum,pageSize,userId,learnStatus);

    }

    @GetMapping("/user/getLearningClassroom")
    @ResponseBody
    public List<LearningClassroom> getLearningClass(@RequestParam(defaultValue = "1")int pageNum,
                                                    @RequestParam(defaultValue = "10")int pageSize,
                                                    @RequestParam(defaultValue = "0")int userId){

        if(userId==0){

        }
        return null;
    }

}
