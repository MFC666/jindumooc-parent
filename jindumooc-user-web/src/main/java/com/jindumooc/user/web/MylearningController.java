package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.user.service.MyLearning;
import com.jindumooc.vojo.user.LearningClassroom;
import com.jindumooc.vojo.user.LearningCourse;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 我的学习
 */
@Controller
public class MylearningController {

    @Reference
    private MyLearning myLearning;

    /**
     * 获取我的课程
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param learnStatus：学习中、已完成。
     * @return
     */
    @ApiOperation("获取我的课程")
    @GetMapping("/user/getLearningCourse")
    @ResponseBody
    public Result getLearningCourse(@RequestParam(defaultValue = "1")int pageNum,
                                                         @RequestParam(defaultValue = "10")int pageSize,
                                                         @RequestParam(defaultValue = "0")int userId,
                                                         @RequestParam(defaultValue = "learning")String learnStatus){

        //if(userId)
        if(userId==0){
            return ResultGenerator.genFailResult("参数输入存在错误");
        }
        return ResultGenerator.genSuccessResult(myLearning.getLearningCourse(pageNum,pageSize,userId,learnStatus));

    }

    /**
     * 根据用户ID获取我的班级
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @ApiOperation("获取我的班级")
    @GetMapping("/user/getLearningClassroom")
    @ResponseBody
    public Result getLearningClassroom(@RequestParam(defaultValue = "1")int pageNum,
                                                    @RequestParam(defaultValue = "10")int pageSize,
                                                    @RequestParam(defaultValue = "0")int userId){

        if(userId==0){
            return ResultGenerator.genFailResult("参数输入错误");
        }
        return ResultGenerator.genSuccessResult(myLearning.getLearningClassroom(pageNum,pageSize,userId));
    }

    /**
     * 获取我的问题
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @ApiOperation("获取我的问题")
    @GetMapping("/user/getMyQuestion")
    @ResponseBody
    public Result getMyQuestion(@RequestParam(defaultValue = "1")int pageNum,
                                @RequestParam(defaultValue = "10")int pageSize,
                                @RequestParam(defaultValue = "0")int userId){
        if(userId==0){
            return ResultGenerator.genFailResult("参数输入错误");
        }
        return ResultGenerator.genSuccessResult(myLearning.getMyQuestion(pageNum,pageSize,userId));
    }

    /**
     * 获取“我的话题”
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param threadType：话题类型:班级话题、课程话题
     * @return
     */
    @ApiOperation("获取我的话题")
    @GetMapping("/user/getMyDiscussion")
    @ResponseBody
    public Result getMyDiscussion(@RequestParam(defaultValue = "1")int pageNum,
                                  @RequestParam(defaultValue = "10")int pageSize,
                                  @RequestParam(defaultValue = "0")int userId,
                                  @RequestParam(defaultValue = "courseMemberThread") String threadType){
        if(userId==0||threadType==null){
            return ResultGenerator.genFailResult("参数输入错误");
        }
        return ResultGenerator.genSuccessResult(myLearning.getMyDiscussion(pageNum,pageSize,userId,threadType));

    }

    /**
     * 获得学习笔记
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @ApiOperation("获取笔记列表")
    @GetMapping("/user/getNoteList")
    @ResponseBody
    public Result getNoteList(@RequestParam(defaultValue = "1")int pageNum,
                          @RequestParam(defaultValue = "10")int pageSize,
                          @RequestParam(defaultValue = "0")int userId){
        if(userId==0){
            return ResultGenerator.genFailResult("参数输入错误");
        }
        return ResultGenerator.genSuccessResult(myLearning.getNoteList(pageNum,pageSize,userId));

    }

    /**
     * 获取笔记详情
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param courseId：笔记对应的课程Id
     * @return
     */
    @ApiOperation("获取笔记详情")
    @GetMapping("/user/getNoteDetil")
    @ResponseBody
    public Result getNoteDetail(@RequestParam(defaultValue = "1")int pageNum,
                                @RequestParam(defaultValue = "10")int pageSize,
                                @RequestParam(defaultValue = "0")int userId,
                                @RequestParam(defaultValue = "0")int courseId){

        if(userId==0||courseId==0){
            return ResultGenerator.genFailResult("参数输入错误");
        }
        return ResultGenerator.genSuccessResult(myLearning.getNoteDetail(pageNum,pageSize,userId,courseId));
    }

    /**
     * 根据类型获取我的考试结果
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param testPaperType：批阅中、批阅完
     * @return
     */
    @ApiOperation("获得自己的考试成绩")
    @GetMapping("/user/getStudentTestPaper")
    @ResponseBody
    public Result getStudentTestPaper(@RequestParam(defaultValue = "1")int pageNum,
                                      @RequestParam(defaultValue = "10")int pageSize,
                                      @RequestParam(defaultValue = "0")int userId,
                                      @RequestParam(defaultValue = "finished")String testPaperType){

        if(0==userId){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myLearning.getStudentTestPaper(pageNum,pageSize,userId,testPaperType));

    }


    /**
     * 获取用户下收藏的题目
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @ApiOperation("获取收藏的题目")
    @GetMapping("/user/getFavoriteQuestion")
    @ResponseBody
    public Result getFavoriteQuestion(@RequestParam(defaultValue = "1")int pageNum,
                                   @RequestParam(defaultValue = "10")int pageSize,
                                   @RequestParam(defaultValue = "0")int userId){
        if(0==userId){
            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myLearning.getFavoriteQuestion(pageNum,pageSize,userId));

    }

    /**
     * 取消收藏题目
     * @param questionId
     * @return
     */
    @ApiOperation("取消收藏题目")
    @DeleteMapping("/user/cancelCollection")
    @ResponseBody
    public Result cancelCollection(@RequestParam(defaultValue = "0")int questionId){

        if(questionId == 0){

            return ResultGenerator.genFailResult("参数错误");
        }

        myLearning.cancelCollection(questionId);
        return ResultGenerator.genSuccessResult("修改成功");
    }

    /**
     * 查看题目的详情
     * @param questionId
     * @return
     */
    @ApiOperation("查看题目详情")
    @GetMapping("/user/getQuestionDetail")
    @ResponseBody
    public Result getQuestionDetail(@RequestParam(defaultValue = "0") int questionId){

        if(questionId == 0){
            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myLearning.getQuestionDetail(questionId));
    }

    /**
     *
     * @param testPaperId
     * @param userId
     * @return
     */
    @ApiOperation("查看考试详情")
    @GetMapping("/user/getTestPaperDetail")
    @ResponseBody
    public Result getTestPaperDetail(@RequestParam(defaultValue = "0") int testPaperId,@RequestParam(defaultValue = "0") int userId){

        if(testPaperId == 0||userId==0){
            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(myLearning.getTestPaperDetail(testPaperId,userId));
    }

}
