package com.jindumooc.dao;

import com.jindumooc.pojo.CourseLessonView;
import com.jindumooc.pojo.CourseLessonViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseLessonViewMapper {
    int countByExample(CourseLessonViewExample example);

    int deleteByExample(CourseLessonViewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseLessonView record);

    int insertSelective(CourseLessonView record);

    List<CourseLessonView> selectByExample(CourseLessonViewExample example);

    CourseLessonView selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseLessonView record, @Param("example") CourseLessonViewExample example);

    int updateByExample(@Param("record") CourseLessonView record, @Param("example") CourseLessonViewExample example);

    int updateByPrimaryKeySelective(CourseLessonView record);

    int updateByPrimaryKey(CourseLessonView record);
}