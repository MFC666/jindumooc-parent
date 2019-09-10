package com.jindumooc.dao;

import com.jindumooc.pojo.CourseMember;
import com.jindumooc.pojo.CourseMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMemberMapper {
    int countByExample(CourseMemberExample example);

    int deleteByExample(CourseMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseMember record);

    int insertSelective(CourseMember record);

    List<CourseMember> selectByExample(CourseMemberExample example);


    /**
     * @param id 班级Id
     * @return 对应班级的course
     */
    List<CourseMember> selectByClassroomId(@Param("id") Integer id);

    CourseMember selectByPrimaryKey(Integer id);

    /**
     * @param id 用户Id
     * @return 用户参与课程总数
     */
    Integer selectCourseCount(@Param("id") Integer id);

    int updateByExampleSelective(@Param("record") CourseMember record, @Param("example") CourseMemberExample example);

    int updateByExample(@Param("record") CourseMember record, @Param("example") CourseMemberExample example);

    int updateByPrimaryKeySelective(CourseMember record);

    int updateByPrimaryKey(CourseMember record);
}