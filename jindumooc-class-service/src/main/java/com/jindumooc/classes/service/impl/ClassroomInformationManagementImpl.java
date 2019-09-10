package com.jindumooc.classes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.jindumooc.classes.service.ClassroomInformationManagement;
import com.jindumooc.dao.*;
import com.jindumooc.dto.classes.ClassroomCoursesDTO;
import com.jindumooc.dto.classes.ClassroomDTO;
import com.jindumooc.dto.classes.ClassroomMemberDTO;
import com.jindumooc.dto.classes.ClassroomStudentSearchDTO;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.classes.*;
import com.jindumooc.vojo.user.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ClassroomInformationManagementImpl implements ClassroomInformationManagement {
    @Autowired
    ClassroomCoursesMapper classroomCoursesMapper;
    @Autowired
    ClassroomMapper classroomMapper;
    @Autowired
    CourseV8Mapper courseV8Mapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    ClassroomMemberMapper classroomMemberMapper;
    @Autowired
    FriendMapper friendMapper;
    @Autowired
    CourseMemberMapper courseMemberMapper;

    /**
     * @param classroomCourses 选择班级对应课程
     * @return 添加班级课程
     * @author 唐欣然 2019/07/23
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addCourse(ClassroomCoursesDTO classroomCourses) {
        try {
            ClassroomCourses course = new ClassroomCourses();
            course.setCoursesetid(classroomCourses.getCourseid());
            course.setId(classroomCourses.getId());
            course.setClassroomid(classroomCourses.getClassroomid());

            classroomCoursesMapper.insertSelective(course);
            classroomMapper.updateCourseNumber(classroomCourses.getClassroomid());
            return true;
        } catch (Exception e) {
            System.out.println("Exception:添加班级课程");
            return false;
        }
    }

    /**
     * @param classroomCourses 选择班级对应课程
     * @return 删除班级课程
     * @author 唐欣然 2019/07/23
     */
    @Override
    public boolean deleteCourse(ClassroomCoursesDTO classroomCourses) {
        try {
            classroomCoursesMapper.deleteByPrimaryKey(classroomCourses.getId());
            classroomMapper.decreaseCourseNumber(classroomCourses.getClassroomid());
            return true;
        } catch (Exception e) {
            System.out.println("Exception:删除班级课程");
            return false;
        }
    }

    /**
     * @param classroomStudentSearchDTO 根据邮箱、用户名或手机号搜索
     * @return 搜索学员
     */
    @Override
    public User searchStudent(ClassroomStudentSearchDTO classroomStudentSearchDTO) {
        return userMapper.getClassroomUser(classroomStudentSearchDTO);

    }

    /**
     * @param editClassDTO 当前班级
     * @return 更改班级信息
     * @author 唐欣然 2019/07/23
     */
    @Override
    public boolean editClassInfo(ClassroomDTO editClassDTO) {
        try {
            Classroom editClass = new Classroom();
            editClass.setTitle(editClassDTO.getTitle());
            classroomMapper.updateByPrimaryKey(editClass);
            return true;
        } catch (Exception e) {
            System.out.println("Exception:更改班级信息");
            return false;
        }
    }

    /**
     * @param classroomId 班级Id
     * @return 查询课程列表
     * @author 唐欣然 2019/07/23
     */
    @Override
    public List<CourseExplore> getClassroomCourses(Integer classroomId, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CourseV8> list = courseV8Mapper.selectClassroomCourses(classroomId);
        List<CourseExplore> result = new ArrayList<>();
        list.forEach(each -> {
            // 把cover专程json对象，获取图片URL
            JSONObject json = (JSONObject) JSON.parse(each.getCover());
            result.add(new CourseExplore(each.getId(), each.getCoursesettitle(), each.getOriginprice(), each.getRatingnum(), json.get("large").toString()));
        });
        return result;
    }

    /**
     * @param classroomId 班级Id
     * @return 获取班级教师
     */
    @Override
    public List<ClassroomTeacher> getClassroomTeacher(Integer classroomId) {
        List<User> allTeachers = userMapper.selectClassroomTeacher(classroomId);
        List<ClassroomTeacher> result = new ArrayList<>();
        User temp = userMapper.getClassroomHeadteacher(classroomId);
        Integer count = courseMemberMapper.selectCourseCount(temp.getId());
        Integer follow = friendMapper.countUserFollow(temp.getId());
        Integer fan = friendMapper.countUserFan(temp.getId());
        // 班主任
        ClassroomTeacher headTeacher = new ClassroomTeacher(temp.getId(), temp.getNickname(), temp.getTitle(), temp.getSmallavatar(), "|headTeacher|", count, follow, fan);
        result.add(headTeacher);
        allTeachers.forEach(each -> {
            result.add(new ClassroomTeacher(each.getId(), each.getNickname(), each.getTitle(), each.getSmallavatar(), "|teacher|", count, follow, fan));
        });
        return result;
    }

    /**
     * @param classroomId 班级Id
     * @return 获取班级新加学员(按照createdTime进行排序)
     */
    @Override
    public List<ClassroomStudent> getNewStudents(Integer classroomId) {
        List<User> allStudents = userMapper.selectClassroomStudent(classroomId);
        List<ClassroomStudent> result = new ArrayList<>();
        allStudents.forEach(each -> {
            Integer createdTIme = classroomMemberMapper.selectByStudentId(each.getId(), classroomId).getCreatedtime();
            Integer count = courseMemberMapper.selectCourseCount(each.getId());
            Integer follow = friendMapper.countUserFollow(each.getId());
            Integer fan = friendMapper.countUserFan(each.getId());
            result.add(new ClassroomStudent(each.getId(), each.getNickname(), each.getSmallavatar(), createdTIme, count, follow, fan));
        });
        result.sort((o1, o2) -> {
            // 越新加入,createdTime越大,按createdTime倒序排列
            return o2.getCreatedTime() - o1.getCreatedTime();
        });
        return result;
    }

    /**
     * @param classroomId 选择班级
     * @return 设置班级班主任
     */
    @Override
    public boolean setHeadTeacher(Integer classroomId, Integer userId) {
        try {
            ClassroomMemberDTO classroomMember = new ClassroomMemberDTO();
            classroomMember.setClassroomId(classroomId);
            classroomMember.setUserId(userId);
            // classroomMember 更新班主任信息
            classroomMemberMapper.updateRole(classroomMember);
            // classroom更新班主任信息
            classroomMapper.updateHeadTeacher(classroomId, userId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @param userId 用户Id
     * @return 验证用户是否为教师
     */
    @Override
    public boolean isUserIdValid(Integer userId) {
        return userMapper.selectByPrimaryKey(userId).getRoles().contains("ROLE_TEACHER");
    }

    /**
     * @param classroomId 班级Id
     * @return 查看学员最新动态
     */
    @Override
    public List<ClassroomStudentActivity> getStudentActivity(Integer classroomId) {
        List<CourseMember> courseMembers = courseMemberMapper.selectByClassroomId(classroomId);
        List<ClassroomStudentActivity> result = new ArrayList<>();
        courseMembers.forEach(each -> {
            String userNickname = userMapper.selectByPrimaryKey(each.getUserid()).getNickname();
            String courseSetTitle = courseV8Mapper.selectByPrimaryKey(each.getCourseid()).getTitle();
            result.add(new ClassroomStudentActivity(each.getUpdatedtime(), userNickname, courseSetTitle));
        });
        result.sort((o1, o2) -> o2.getUpdateTime() - o1.getUpdateTime());
        return result;
    }

    /**
     * @param classroomId 班级id
     * @param studentId 学员id
     * @return 移除学员
     */
    @Override
    public boolean deleteClassroomStudent(Integer classroomId, Integer studentId) {
        try{
            classroomMemberMapper.deleteByStudentId(classroomId,studentId);
            classroomMapper.decreaseStudentNumber(classroomId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * @param classroomMemberDTO 要修改的班级学员信息
     * @return 修改学员有效期
     */
    @Override
    public boolean updateValidDate(ClassroomMemberDTO classroomMemberDTO){
        try{
            classroomMemberMapper.updateDeadline(classroomMemberDTO);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    // TODO:转换时间，与前端对接后修改
    public String transformTime(int time){
        Date d = new Date(time*100L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        return sdf.format(d);
    }
}
