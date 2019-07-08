package com.jindumooc.dao;

import com.jindumooc.pojo.CourseNote;
import com.jindumooc.pojo.CourseNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseNoteMapper {
    int countByExample(CourseNoteExample example);

    int deleteByExample(CourseNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseNote record);

    int insertSelective(CourseNote record);

    List<CourseNote> selectByExampleWithBLOBs(CourseNoteExample example);

    List<CourseNote> selectByExample(CourseNoteExample example);

    CourseNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseNote record, @Param("example") CourseNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseNote record, @Param("example") CourseNoteExample example);

    int updateByExample(@Param("record") CourseNote record, @Param("example") CourseNoteExample example);

    int updateByPrimaryKeySelective(CourseNote record);

    int updateByPrimaryKeyWithBLOBs(CourseNote record);

    int updateByPrimaryKey(CourseNote record);
}