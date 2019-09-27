package com.jindumooc.classes.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.classes.service.ClassroomInformationManagement;
import com.jindumooc.dto.classes.ClassroomCoursesDTO;
import com.jindumooc.dto.classes.ClassroomDTO;
import com.jindumooc.dto.classes.ClassroomMemberDTO;
import com.jindumooc.dto.classes.ClassroomStudentSearchDTO;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomCourses;
import com.jindumooc.pojo.Course;
import com.jindumooc.vojo.classes.CourseExplore;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.util.List;

@Controller
@RequestMapping("/classroom")
public class classroomManagementController {
    @Reference
    private ClassroomInformationManagement classroomManagement;

    /**
     * @param id        班级id
     * @param editClass 修改班级信息
     * @return 修改班级信息
     * @author 唐欣然 2019/07/23
     */
    @ApiOperation("修改班级信息")
    @PutMapping("/management/set_info/{id}")
    @ResponseBody
    public Result updateClassInfo(@PathVariable Integer id, @RequestBody ClassroomDTO editClass) {
        try {
            if(editClass==null) return ResultGenerator.genFailResult("修改班级信息参数出错");
            return ResultGenerator.genSuccessResult(classroomManagement.editClassInfo(editClass));
        }  catch (Exception e2) {
            return ResultGenerator.genFailResult("后端修改班级信息失败");
        }
    }

    /**
     * @param id 班级Id
     * @return 查询班级对应课程列表
     * @author 唐欣然 2019/07/23
     */
    @ApiOperation("查找班级对应课程列表")
    @GetMapping("/management/get_courses/{id}")
    @ResponseBody
    public Result getClassroomCourses(@PathVariable Integer id, @RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        try {
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomCourses(id, pageNum, pageSize));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端获取班级课程列表失败");
        }
    }


    /**
     * @param classroomCourses 班级课程
     * @return 添加班级课程
     * @author 唐欣然 2019/07/23
     */
    @ApiOperation("添加班级课程")
    @PostMapping("/management/add_courses")
    @ResponseBody
    public Result addClassroomCourses(@RequestBody ClassroomCoursesDTO classroomCourses) {
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.addCourse(classroomCourses));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端添加班级课程失败");
        }
    }

    /**
     * @param classroomCourses 班级课程
     * @return 删除班级课程
     * @author 唐欣然
     */
    @ApiOperation("删除班级课程")
    @DeleteMapping("/management/delete_courses")
    @ResponseBody
    public Result deleteClassroomCourses(@RequestBody ClassroomCoursesDTO classroomCourses) {
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.deleteCourse(classroomCourses));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端添加班级课程失败");
        }
    }


    /**
     * @param classroomStudentSearchDTO 班级学员
     * @return 搜索班级学员
     * @author 唐欣然
     */
    @ApiOperation("搜索班级学员")
    @GetMapping("/management/delete_courses")
    @ResponseBody
    public Result searchStudent(@RequestBody ClassroomStudentSearchDTO classroomStudentSearchDTO) {
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.searchStudent(classroomStudentSearchDTO));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端搜索班级学员失败");
        }
    }
    /**
     * @param id 班级Id
     * @return 获取班级对应教师
     */
    @ApiOperation("获得班级对应教师")
    @GetMapping("/management/get_teachers/{id}")
    @ResponseBody
    public Result getClassroomTeacher(@PathVariable Integer id) {
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.getClassroomTeacher(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端获取班级老师失败");
        }
    }

    /**
     * @param id 班级Id
     * @return 获得班级对应学员,按加入时间排序
     */
    @ApiOperation("获得班级对应学员")
    @GetMapping("/management/get_students/{id}")
    @ResponseBody
    public Result getClassroomStudent(@PathVariable Integer id){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.getNewStudents(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端获取班级成员失败");
        }
    }

    /**
     * @param teacherId 验证Id
     * @return 验证用户身份是否为教师
     */
    @ApiOperation("验证用户身份是否为教师")
    @GetMapping("/management/valid_hteacher")
    @ResponseBody
    public Result isValidId(@RequestParam Integer teacherId){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.isUserIdValid(teacherId));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端验证用户身份失败");
        }
    }

    /**
     * @param id 班级Id
     * @param teacherId 教师Id
     * @return 设置教师为班级班主任
     */
    @ApiOperation("设置班级班主任")
    @PutMapping("/management/set_hteacher/{id}")
    @ResponseBody
    public Result setHeadTeacher(@PathVariable Integer id,@RequestParam Integer teacherId){
        try{
            if(!classroomManagement.isUserIdValid(teacherId)) return ResultGenerator.genFailResult("提供Id为非教师Id");
            return ResultGenerator.genSuccessResult(classroomManagement.setHeadTeacher(id,teacherId));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端设置班主任失败");
        }
    }

    /**
     * @param id 用户Id
     * @param classroomMemberDTO 班级成员
     * @return 添加教师
     */
    @ApiOperation("添加教师")
    @PostMapping("/management/add_teacher/{id}")
    @ResponseBody
    public Result addTeacher(@PathVariable Integer id, @RequestBody ClassroomMemberDTO classroomMemberDTO){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.addTeacher(classroomMemberDTO));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端添加教师失败"+e.getMessage());
        }
    }
    /**
     * @param id 班级Id
     * @return 查看学员最新动态
     */
    @ApiOperation("查看学员最新动态")
    @GetMapping("/management/activity/{id}")
    @ResponseBody
    public Result getActivity(@PathVariable Integer id){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.getStudentActivity(id));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端获取学员活动失败");
        }
    }

    /**
     * @param classroomMemberDTO 学员信息
     * @return 更新班级学员有效期
     */
    @ApiOperation("更新学员有效期")
    @PutMapping("/management/set_deadline")
    @ResponseBody
    public Result updateValidDate(@RequestBody ClassroomMemberDTO classroomMemberDTO){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.updateValidDate(classroomMemberDTO));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端更新学员有效期失败");
        }
    }

    /**
     * @param classroomMemberDTO 班级成员
     * @return 添加单个学员
     */
    @ApiOperation("添加单个学员")
    @PostMapping("/management/add_student")
    @ResponseBody
    public Result addStudent(@RequestBody ClassroomMemberDTO classroomMemberDTO){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.addStudent(classroomMemberDTO));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端添加学员失败"+e.getMessage());
        }
    }

    /**
     * @param id 班级Id
     * @param studentId 学员Id
     * @return 移除学员
     */
    @ApiOperation("移除学员")
    @DeleteMapping("/management/delete_student/{id}")
    @ResponseBody
    public Result updateValidDate(@PathVariable Integer id,@RequestParam Integer studentId){
        try{
            return ResultGenerator.genSuccessResult(classroomManagement.deleteClassroomStudent(id,studentId));
        }catch (Exception e){
            return ResultGenerator.genFailResult("后端移除学员失败");
        }
    }


}
