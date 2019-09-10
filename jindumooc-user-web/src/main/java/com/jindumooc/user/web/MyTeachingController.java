package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.user.service.MyTeaching;
import com.jindumooc.vojo.user.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
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
    @ApiOperation("获取在教课程")
    @GetMapping("/user/getTeachingCourse")
    @ResponseBody
    public Result getTeachingCourse(@RequestParam(defaultValue = "")String teacherId, @RequestParam(defaultValue = "")String courseType, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize){
        if(teacherId==null||teacherId==""){
            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myTeaching.getTeachingCourse("|"+teacherId+"|",courseType,pageNum,pageSize));

    }

    /**
     * 获得在教班级
     */
    @ApiOperation("获取在教班级")
    @GetMapping("/user/getTeachingClassroom")
    @ResponseBody
    public Result getTeachingClassroom(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize, @RequestParam(defaultValue = "0") int teacherId){

        if(0==teacherId){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myTeaching.getTeachingClassroom(pageNum,pageSize,teacherId));
    }

    /**
     * 获取学生问题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @return
     */
    @ApiOperation("获取课程问题")
    @GetMapping("/user/getCourseQuestion")
    @ResponseBody
    public Result getCourseQuestion(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10")int pageSize, @RequestParam(defaultValue = "0") int teacherId){

        if(0==teacherId){

            return ResultGenerator.genFailResult("参数错误");
        }
        return ResultGenerator.genSuccessResult(myTeaching.getCourseQuestion(pageNum,pageSize,teacherId));

    }

    /**
     * 获取学生话题
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param threadType，话题类型
     * @return
     */
    @ApiOperation("获取学生话题")
    @GetMapping("/user/getCourseDiscussion")
    @ResponseBody
    public Result getCourseDiscussion(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10")int pageSize, @RequestParam(defaultValue = "0") int teacherId,@RequestParam(defaultValue = "null") String threadType){

        if(0==teacherId||threadType.equals(null)){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myTeaching.getCourseDiscussion(pageNum,pageSize,teacherId,threadType));
    }

    /**
     * 获取学生考试结果
     * @param pageNum
     * @param pageSize
     * @param teacherId
     * @param testPaperStatus ：考试状态，已结束/批阅中。。
     * @return
     */
    @ApiOperation("获取学生考试结果")
    @GetMapping("/user/getTestPaperResult")
    @ResponseBody
    public Result getTestPaperResult(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "10")int pageSize,@RequestParam(defaultValue = "0")int teacherId,@RequestParam(defaultValue = "0")String testPaperStatus){
        if(testPaperStatus == "0" || teacherId == 0){

            return ResultGenerator.genFailResult("参数错误");
        }else{

            return ResultGenerator.genSuccessResult(myTeaching.getTestPaperResult(pageNum,pageSize,teacherId,testPaperStatus));
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
    @ApiOperation("获取课后作业")
    @GetMapping("/user/getHomeWork")
    @ResponseBody
    public List<HomeWork> getHomeWork(@RequestParam(defaultValue = "1")int pageNum, @RequestParam(defaultValue = "10")int pageSize, @RequestParam(defaultValue = "0")int teacherId, @RequestParam(defaultValue = "0")String testPaperStatus){


        return null;
    }

}
