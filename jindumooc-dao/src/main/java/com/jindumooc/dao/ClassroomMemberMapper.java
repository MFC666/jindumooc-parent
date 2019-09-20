package com.jindumooc.dao;


import com.jindumooc.dto.classes.ClassroomMemberDTO;
import com.jindumooc.pojo.ClassroomMember;
import com.jindumooc.pojo.ClassroomMemberExample;
import java.util.List;
import com.jindumooc.vojo.user.LearningClassroom;
import com.jindumooc.vojo.user.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;

public interface ClassroomMemberMapper {
    int countByExample(ClassroomMemberExample example);

    int deleteByExample(ClassroomMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomMember record);

    int insertSelective(ClassroomMember record);

    List<ClassroomMember> selectByExampleWithBLOBs(ClassroomMemberExample example);

    List<ClassroomMember> selectByExample(ClassroomMemberExample example);

    ClassroomMember selectByPrimaryKey(Integer id);

    // 按照学员id搜索
    ClassroomMember selectByStudentId(Integer sId, Integer cId);

    int updateByExampleSelective(@Param("record") ClassroomMember record, @Param("example") ClassroomMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") ClassroomMember record, @Param("example") ClassroomMemberExample example);

    int updateByExample(@Param("record") ClassroomMember record, @Param("example") ClassroomMemberExample example);

    int updateByPrimaryKeySelective(ClassroomMember record);

    int updateByPrimaryKeyWithBLOBs(ClassroomMember record);

    int updateByPrimaryKey(ClassroomMember record);

    // 移除学员
    void deleteByStudentId(Integer classroomId, Integer studentId);
    // 更新有效期
    void updateDeadline(ClassroomMemberDTO classroomMemberDTO);
    // 设置role为班主任
    void updateRole(ClassroomMemberDTO classroomMemberDTO);

    List<LearningClassroom> getLearningClassroom(@Param("userId") int userId);

    List<Teacher> getClassroomTeacher(@Param("classroomId") int classroomId);
}