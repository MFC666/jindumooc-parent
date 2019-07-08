package com.jindumooc.dao;

import com.jindumooc.pojo.CourseLessonLearn;
import com.jindumooc.pojo.CourseLessonLearnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseLessonLearnMapper {
    int countByExample(CourseLessonLearnExample example);

    int deleteByExample(CourseLessonLearnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseLessonLearn record);

    int insertSelective(CourseLessonLearn record);

    List<CourseLessonLearn> selectByExample(CourseLessonLearnExample example);

    CourseLessonLearn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseLessonLearn record, @Param("example") CourseLessonLearnExample example);

    int updateByExample(@Param("record") CourseLessonLearn record, @Param("example") CourseLessonLearnExample example);

    int updateByPrimaryKeySelective(CourseLessonLearn record);

    int updateByPrimaryKey(CourseLessonLearn record);
}