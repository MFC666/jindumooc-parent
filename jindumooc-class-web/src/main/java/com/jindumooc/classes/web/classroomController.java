package com.jindumooc.classes.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.classes.service.ClassroomExploreManagement;
import com.jindumooc.classes.service.ClassroomManagement;
import com.jindumooc.dto.classes.ClassroomReviewDTO;
import com.jindumooc.dto.classes.ClassroomThreadDTO;
import com.jindumooc.dto.classes.ClassroomThreadPostDTO;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomWithBLOBs;
import com.jindumooc.vojo.classes.ClassroomExplore;
import com.jindumooc.vojo.user.Teacher;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classroom")
public class classroomController {
    @Reference
    private ClassroomExploreManagement classroomExploreManagement;

    @Reference
    private ClassroomManagement classroomManagement;

    /**
     * @return 班级列表
     * @author 唐欣然 2019/07/23
     */
    @GetMapping("/explore")
    @ResponseBody
    public Result getAllClassroom(@RequestParam(defaultValue = "false") boolean free, @RequestParam(defaultValue = "new") String sort, @RequestParam(defaultValue = "all") String filter) {
        try {
            if (!free) {
                if (filter.equals("all")) {
                    // 获取所有班级列表
                    List<ClassroomExplore> list = classroomExploreManagement.getAllExploreClassroom(sort);
                    return ResultGenerator.genSuccessResult(list);
                } else {
                    // 获取筛选班级列表
                    List<ClassroomExplore> list = classroomExploreManagement.getFilteredClassroom(sort, filter, false);
                    return ResultGenerator.genSuccessResult(list);
                }
            } else {
                if (filter.equals("all")) {
                    // 获取免费班级列表
                    List<ClassroomExplore> list = classroomExploreManagement.getFreeExploreClassroom(sort);
                    return ResultGenerator.genSuccessResult(list);
                } else {
                    // 获取筛选班级列表
                    List<ClassroomExplore> list = classroomExploreManagement.getFilteredClassroom(sort, filter, true);
                    return ResultGenerator.genSuccessResult(list);
                }
            }
        } catch (Exception e) {
            return ResultGenerator.genFailResult("后端获取班级信息失败");
        }
    }

    /**
     * @param id 班级id
     * @return 具体班级信息
     * @author 唐欣然 2019/07/23
     */
    @GetMapping("/explore/{id}")
    @ResponseBody
    public Result getClassroom(@PathVariable Integer id) {
        try {
            return ResultGenerator.genSuccessResult(classroomExploreManagement.getClassroom(id));
        } catch (Exception e) {
            return ResultGenerator.genFailResult("后端获取班级信息失败");
        }

    }

    /**
     * 获取班级接收
     * @param classroomId：班级编号
     * @return
     */
    @GetMapping("/classIntroduction/{id}")
    @ResponseBody
    @ApiOperation("获取班级介绍")
    public Result getClassroomIntroduction(@PathVariable Integer classroomId){
        if(classroomId!=null){
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomIntroduction(classroomId));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }

    }

    /**
     * 获取班级课程
     * @param id：班级id
     * @return
     */
    @GetMapping("/classroomCourse/{id}")
    @ResponseBody
    @ApiOperation("获取班级课程")
    public Result getClassroomCourse(@PathVariable Integer id){
        if(id!=null){
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomCourse(id));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }

    }

    @GetMapping("/getClassroomReview")
    @ResponseBody
    @ApiOperation("获取班级评价")
    public Result getClassroomReview(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize,@RequestParam(defaultValue = "null") Integer classroomId){

        if(classroomId != null){
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomReview(pageNum,pageSize,classroomId));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }
    }

    @PostMapping("/setClassroomReview")
    @ResponseBody
    @ApiOperation("评论课程/追加评论")
    public Result setClassroomReview(@RequestBody ClassroomReviewDTO classroomReviewDTO){

        if(null!=classroomReviewDTO){

            return ResultGenerator.genSuccessResult(classroomManagement.setClassroomReview(classroomReviewDTO));
        }else{
            return ResultGenerator.genFailResult("参数为空");
        }

    }

    /**
     * 获取班级教师
     * @param pageNum：页码
     * @param pageSize：每页大小
     * @param classroomId：班级编号
     * @return
     */
    @GetMapping("/getClassroonTeacher")
    @ResponseBody
    @ApiOperation("获取班级教师")
    public Result getClassRoomTeacher(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "10")int pageSize,@RequestParam(defaultValue = "0")int classroomId){
        if(0!=classroomId ){
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomTeacher(pageNum,pageSize,classroomId));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }
    }

    /**
     * 获取班级笔记
     * @param pageNum
     * @param pageSize
     * @param orderBy：笔记排序依据likeNum：点赞数量，createdTime：创建时间
     * @param classroomId：班级编号
     * @param courseId：课程编号
     * @return
     */
    @GetMapping("/getClassroomNote")
    @ResponseBody
    @ApiOperation("获取班级笔记")
    public Result getClassroomNote(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "10")int pageSize,@RequestParam(defaultValue = "null")String orderBy,@RequestParam(defaultValue = "0")int classroomId,@RequestParam(defaultValue = "0")int courseId){

        if(null!=orderBy&&0!=classroomId){
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomNote(pageNum,pageSize,orderBy,classroomId,courseId));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }
    }

    /**
     * 获取班级话题
     * @param pageNum
     * @param pageSize
     * @param classroomId
     * @param orderBy：话题排序依据
     * @param type：话题/问题
     * @param nice：是否加精
     * @return
     */
    @GetMapping("/getClassroomThread")
    @ResponseBody
    @ApiOperation("获取班级话题")
    public Result getClassroomThread(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "10")int pageSize,@RequestParam(defaultValue = "0")int classroomId,@RequestParam(defaultValue = "null")String orderBy,@RequestParam(defaultValue = "null")String type,@RequestParam(defaultValue = "0")int nice){
        if (0!=classroomId&&null!=type){
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomThread(pageNum,pageSize,classroomId,orderBy,type,nice));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }
    }


    /**
     *
     */
    @PostMapping("/setClassroomThread")
    @ResponseBody
    @ApiOperation("发话题、提问题")
    public Result setClassroomThread(@RequestBody ClassroomThreadDTO classroomThreadDTO){

        if(null != classroomThreadDTO){
            return ResultGenerator.genSuccessResult(classroomManagement.setClassroomThread(classroomThreadDTO));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }
    }

    /**
     *
     * @param classroomThreadDTO
     * @return
     */
    @PostMapping("/modifyClassroomThread")
    @ResponseBody
    @ApiOperation("加精、置顶、删除")
    public Result modifyClassroomThread(@RequestBody ClassroomThreadDTO classroomThreadDTO){

        if(null != classroomThreadDTO){
            return ResultGenerator.genSuccessResult(classroomManagement.modifyClassroomThread(classroomThreadDTO));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }

    }

    /**
     * 更新班级话题内容、标题
     * @param classroomThreadDTO
     * @return
     */
    @PostMapping("/updateClassroomThread")
    @ResponseBody
    @ApiOperation("编辑话题")
    public Result updateClassroomThread(@RequestBody ClassroomThreadDTO classroomThreadDTO){
        if(null != classroomThreadDTO){
            return ResultGenerator.genSuccessResult(classroomManagement.updateClassroomThread(classroomThreadDTO));
        }else{
            return ResultGenerator.genFailResult("参数错误");
        }
    }

    /**
     * 获取班级话题
     * @param threadId
     * @param posterType：话题回复人的身份，教师，全部
     * @return
     */
    @GetMapping("/getClassroomThreadPost")
    @ResponseBody
    @ApiOperation("获取班级话题回复")
    public Result getClassroomThread(@RequestParam(defaultValue = "0")int threadId,@RequestParam(defaultValue = "All")String posterType){

        if(threadId == 0){
            return ResultGenerator.genFailResult("参数错误");
        }else{
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomThreadPost(threadId,posterType));
        }
    }

    /**
     * 回复班级话题
     * @param classroomThreadPostDTO
     * @return
     */
    @PostMapping("/setClassroomThreadPost")
    @ResponseBody
    @ApiOperation("回复班级话题")
    public Result setClassroomThreadPost(@RequestBody ClassroomThreadPostDTO classroomThreadPostDTO){

        if(null == classroomThreadPostDTO){
            return ResultGenerator.genFailResult("参数错误");
        }else{
            return ResultGenerator.genSuccessResult(classroomManagement.setClassroomThreadPost(classroomThreadPostDTO));
        }
    }

    @PostMapping("/setClassroomThreadNice")
    @ResponseBody
    @ApiOperation("点赞")
    public Result setClassroomThreadNice(@RequestBody ClassroomThreadPostDTO classroomThreadPostDTO){
        if(null == classroomThreadPostDTO){
            return ResultGenerator.genFailResult("参数错误");
        }else{
            return ResultGenerator.genSuccessResult(classroomManagement.setClassroomThreadNice(classroomThreadPostDTO));
        }
    }
}
