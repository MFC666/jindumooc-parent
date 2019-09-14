package com.jindumooc.classes.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.classes.service.ClassroomBackgroundManagement;
import com.jindumooc.dto.classes.CreateClassroomDTO;
import com.jindumooc.pojo.Classroom;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/classroom/background")
public class classroomBackgroundController {
    @Reference
    private ClassroomBackgroundManagement classroomBackgroundManagement;

    /**
     * @return 获取后台管理班级列表
     */
    @ApiOperation("获取后台班级列表")
    @GetMapping("/getAll")
    @ResponseBody
    public Result getBackgroundClassroom(){
        try{
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.getBackgroundClassroom());
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端获取班级列表失败");
        }
    }

    /**
     * @param newClassroom 新建班级信息
     * @return 新建班级
     */
    @ApiOperation("新建班级")
    @PostMapping("/create")
    @ResponseBody
    public Result createClassroom(@RequestBody CreateClassroomDTO newClassroom){
        try{
            if(newClassroom==null) return ResultGenerator.genFailResult("新建班级参数出错");
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.createClassroom(newClassroom));
        }catch (Exception e){
            return ResultGenerator.genFailResult(e.getMessage() );
        }
    }

    /**
     * @param id 班级id
     * @return 推荐班级
     */
    @ApiOperation("推荐班级")
    @PostMapping("/recommend/{id}")
    @ResponseBody
    public Result recommendClassroom(@PathVariable Integer id){
        try{
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.recommendClassroom(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端推荐班级失败");
        }
    }

    /**
     * @param id 班级id
     * @return 取消推荐班级
     */
    @ApiOperation("取消推荐班级")
    @PostMapping("/cancelRecommend/{id}")
    @ResponseBody
    public Result cancelRecommendClassroom(@PathVariable Integer id){
        try{
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.cancelRecommendClassroom(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端取消推荐班级失败");
        }
    }

    /**
     * @param id 班级id
     * @param recommendSeq 班级推荐序列, 默认为100
     * @return 设置推荐班级序列
     */
    @ApiOperation("设置推荐班级序列")
    @PostMapping("/setRecommend/{id}")
    @ResponseBody
    public Result setRecommendSeq(@PathVariable Integer id,@RequestParam(defaultValue = "100") int recommendSeq){
        try{
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.setRecommendSeq(id,recommendSeq));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端设置推荐班级序列失败");
        }
    }

    /**
     * @param id 班级id
     * @return 关闭班级
     */
    @ApiOperation("关闭班级")
    @PostMapping("/close/{id}")
    @ResponseBody
    public Result closeClassroom(@PathVariable Integer id){
        try{
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.closeClassroom(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端关闭班级失败");
        }
    }

    /**
     * @param id 班级id
     * @return 删除班级
     */
    @ApiOperation("删除班级")
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Result deleteClassroom(@PathVariable Integer id){
        try{
            return ResultGenerator.genSuccessResult(classroomBackgroundManagement.deleteClassroom(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端删除班级失败");
        }
    }
}
