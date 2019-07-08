package com.jindumooc.dao;

import com.jindumooc.pojo.ClassroomMember;
import com.jindumooc.pojo.ClassroomMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroomMemberMapper {
    int countByExample(ClassroomMemberExample example);

    int deleteByExample(ClassroomMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomMember record);

    int insertSelective(ClassroomMember record);

    List<ClassroomMember> selectByExampleWithBLOBs(ClassroomMemberExample example);

    List<ClassroomMember> selectByExample(ClassroomMemberExample example);

    ClassroomMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassroomMember record, @Param("example") ClassroomMemberExample example);

    int updateByExampleWithBLOBs(@Param("record") ClassroomMember record, @Param("example") ClassroomMemberExample example);

    int updateByExample(@Param("record") ClassroomMember record, @Param("example") ClassroomMemberExample example);

    int updateByPrimaryKeySelective(ClassroomMember record);

    int updateByPrimaryKeyWithBLOBs(ClassroomMember record);

    int updateByPrimaryKey(ClassroomMember record);
}