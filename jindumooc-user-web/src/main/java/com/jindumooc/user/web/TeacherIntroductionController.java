package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.user.service.TeacherIntroduction;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Api("师资介绍")
@Controller
public class TeacherIntroductionController {

    @Reference
    private TeacherIntroduction teacherIntroduction;

    @ApiOperation("师资介绍首页")
    @GetMapping("/user/getTeachers")
    @ResponseBody
    public Result getTeachers(@RequestParam(defaultValue = "1")int pageNum,@RequestParam(defaultValue = "12")int pageSize){

        return ResultGenerator.genSuccessResult(teacherIntroduction.getTeachers(pageNum,pageSize));
    }

}
