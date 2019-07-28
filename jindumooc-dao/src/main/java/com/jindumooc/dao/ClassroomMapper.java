package com.jindumooc.dao;

import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomExample;
import com.jindumooc.pojo.ClassroomWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassroomMapper {
    int countByExample(ClassroomExample example);

    int deleteByExample(ClassroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomWithBLOBs record);

    int insertSelective(ClassroomWithBLOBs record);

    List<ClassroomWithBLOBs> selectByExampleWithBLOBs(ClassroomExample example);

    List<Classroom> selectByExample(ClassroomExample example);

    ClassroomWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassroomWithBLOBs record, @Param("example") ClassroomExample example);

    int updateByExampleWithBLOBs(@Param("record") ClassroomWithBLOBs record, @Param("example") ClassroomExample example);

    int updateByExample(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    int updateByPrimaryKeySelective(ClassroomWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClassroomWithBLOBs record);

    int updateByPrimaryKey(Classroom record);

    void getTeachingClassroom(@Param("teacherId") int teacherId,@Param("nowTime") long nowTime);
}