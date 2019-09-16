package com.jindumooc.classes.service;

import com.jindumooc.dto.classes.ClassroomCoursesDTO;
import com.jindumooc.dto.classes.ClassroomDTO;
import com.jindumooc.dto.classes.ClassroomMemberDTO;
import com.jindumooc.dto.classes.ClassroomStudentSearchDTO;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.User;
import com.jindumooc.vojo.classes.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClassroomInformationManagement {
    // 添加班级课程
    boolean addCourse(ClassroomCoursesDTO classroomCourses);

    // 删除班级课程
    boolean deleteCourse(ClassroomCoursesDTO classroomCourses);

    User searchStudent(ClassroomStudentSearchDTO classroomStudentSearchDTO);

    // 编辑班级信息
    boolean editClassInfo(ClassroomDTO editClassDTO);

    // 获取班级课程列表
    List<CourseExplore> getClassroomCourses(Integer classroomId, int pageNum, int pageSize);

    // 获取班级教师列表
    List<ClassroomTeacher> getClassroomTeacher(Integer classroomId);

    // 获取新加入学员列表
    List<ClassroomStudent> getNewStudents(Integer classroomId);

    // 设置班主任
    boolean setHeadTeacher(Integer classroomId, Integer userId);

    // 验证用户Id
    boolean isUserIdValid(Integer userId);

    // 获得学生动态
    List<ClassroomStudentActivity> getStudentActivity(Integer classroomId);


    @Transactional(rollbackFor = Exception.class)
    boolean addStudent(ClassroomMemberDTO classroomMemberDTO);

    @Transactional(rollbackFor = Exception.class)
    boolean addTeacher(ClassroomMemberDTO classroomMemberDTO);

    boolean deleteClassroomStudent(Integer classroomId, Integer studentId);

    boolean updateValidDate(ClassroomMemberDTO classroomMemberDTO);
}
