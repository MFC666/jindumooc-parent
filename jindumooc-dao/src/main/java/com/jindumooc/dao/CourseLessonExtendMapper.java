package com.jindumooc.dao;

import com.jindumooc.pojo.CourseLessonExtend;
import com.jindumooc.pojo.CourseLessonExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseLessonExtendMapper {
    int countByExample(CourseLessonExtendExample example);

    int deleteByExample(CourseLessonExtendExample example);

    int insert(CourseLessonExtend record);

    int insertSelective(CourseLessonExtend record);

    List<CourseLessonExtend> selectByExample(CourseLessonExtendExample example);

    int updateByExampleSelective(@Param("record") CourseLessonExtend record, @Param("example") CourseLessonExtendExample example);

    int updateByExample(@Param("record") CourseLessonExtend record, @Param("example") CourseLessonExtendExample example);
}