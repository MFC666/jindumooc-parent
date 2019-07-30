package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.user.service.MyTeaching;
import com.jindumooc.vojo.user.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class MyTeachingController {

    @Reference
    private MyTeaching myTeaching;


    /**
     * 获得在教课程
     * @param teacherId
     * @param courseType
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/user/getTeachingCourse")
    @ResponseBody
    public List<TeachingCourse> getTeachingCourse(@RequestParam(defaultValue = "")String teacherId,@RequestParam(defaultValue = "")String courseType,@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10") int pageSize){
        if(teacherId==null||teacherId==""){
            return null;
        }
        return myTeaching.getTeachingCourse("|"+teacherId+"|",courseType,pageNum,pageSize);
    }

    /**
     * 获得在教班级
     */
    @GetMapping("/user/getTeachingClassroom")
    @ResponseBody
    public List<TeachingClassroom> getTeachingClassroom(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize, @RequestParam(defaultValue = "0") int teacherId){

        if(0==teacherId){

            return null;
        }

        return myTeaching.getTeachingClassroom(pageNum,pageSize,teacherId);
    }

    /**
     * 获取学生问题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    @GetMapping("/user/getCourseQuestion")
    @ResponseBody
    public List<CourseThread> getCourseQuestion(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10")int pageSize, @RequestParam(defaultValue = "0") int teacherId){

        return myTeaching.getCourseQuestion(pageNum,pageSize,teacherId);

    }

    /**
     * 获取学生话题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param threadType，话题类型
     * @return
     */
    @GetMapping("/user/getCourseDiscussion")
    @ResponseBody
    public List<CourseThread> getCourseDiscussion(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10")int pageSize, @RequestParam(defaultValue = "0") int teacherId,@RequestParam(defaultValue = "null") String threadType){

        return myTeaching.getCourseDiscussion(pageNum,pageSize,teacherId,threadType);
    }

    /**
     * 获取学生考试结果
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param testPaperStatus ：考试状态，已结束/批阅中。。
     * @return
     */
    @GetMapping("/user/getTestPaperResult")
    @ResponseBody
    public List<TestPaperResult> getTestPaperResult(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "10")int pageSize,@RequestParam(defaultValue = "0")int teacherId,@RequestParam(defaultValue = "0")String testPaperStatus){
        if(testPaperStatus == "0" || teacherId == 0){

            return null;
        }else{

            return myTeaching.getTestPaperResult(pageNum,pageSize,teacherId,testPaperStatus);
        }

    }

    /**
     * 获取课后作业
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param testPaperStatus
     * @return
     */
    @GetMapping("/user/getHomeWork")
    @ResponseBody
    public List<HomeWork> getHomeWork(@RequestParam(defaultValue = "1")int pageNum, @RequestParam(defaultValue = "10")int pageSize, @RequestParam(defaultValue = "0")int teacherId, @RequestParam(defaultValue = "0")String testPaperStatus){


        return null;
    }

}
