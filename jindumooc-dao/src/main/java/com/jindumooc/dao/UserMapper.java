package com.jindumooc.dao;

import com.jindumooc.dto.classes.ClassroomStudentSearchDTO;
import com.jindumooc.dto.user.LockUser;
import com.jindumooc.dto.user.TeacherPromoted;
import com.jindumooc.dto.user.UserRole;
import com.jindumooc.pojo.User;
import com.jindumooc.pojo.UserExample;

import java.util.List;

import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.vojo.user.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //后台管理搜索用户
    List<User> getIndexUser(SearchMessage sm);

    List<User> searchIndexUserByTime(SearchMessage sm);

    void lockedUser(LockUser lockUser);

    void updateUserRole(UserRole userRole);

    String getUserNickName(Integer id);

    int getUserNum(SearchMessage sm);

    List<Teacher> getAllTeachers(String nickName);

    void updatePromoted(TeacherPromoted teacherPromoted);

    void updatePromotedSeq(TeacherPromoted teacherPromoted);

    // 选取班级老师(不包括班主任)
    List<User> selectClassroomTeacher(Integer id);

    // 选取班级学员
    List<User> selectClassroomStudent(Integer id);

    // 按手机、邮箱、用户名查找学生
    User getClassroomUser(ClassroomStudentSearchDTO sm);

    // 按班级查找班主任
    User getClassroomHeadteacher(Integer id);

    List<Teacher> getTeachers();

    /**
     * 根据用户ID查找用户名称
     *
     * @param userId
     * @return
     */
    String getUserNameById(Integer userId);

}