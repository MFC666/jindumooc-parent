package com.jindumooc.classes.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.classes.service.ClassroomExploreManagement;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomWithBLOBs;
import com.jindumooc.vojo.classes.ClassroomExplore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/classroom")
public class classroomController {
    @Reference
    private ClassroomExploreManagement classroomExploreManagement;

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
}
