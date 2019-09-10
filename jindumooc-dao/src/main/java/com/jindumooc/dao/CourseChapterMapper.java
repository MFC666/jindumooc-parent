package com.jindumooc.dao;

import com.jindumooc.pojo.CourseChapter;
import com.jindumooc.pojo.CourseChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseChapterMapper {
    int countByExample(CourseChapterExample example);

    int deleteByExample(CourseChapterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseChapter record);

    int insertSelective(CourseChapter record);

    List<CourseChapter> selectByExample(CourseChapterExample example);

    CourseChapter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseChapter record, @Param("example") CourseChapterExample example);

    int updateByExample(@Param("record") CourseChapter record, @Param("example") CourseChapterExample example);

    int updateByPrimaryKeySelective(CourseChapter record);

    int updateByPrimaryKey(CourseChapter record);
}