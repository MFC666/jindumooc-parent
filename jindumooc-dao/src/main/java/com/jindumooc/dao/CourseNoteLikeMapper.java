package com.jindumooc.dao;

import com.jindumooc.pojo.CourseNoteLike;
import com.jindumooc.pojo.CourseNoteLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseNoteLikeMapper {
    int countByExample(CourseNoteLikeExample example);

    int deleteByExample(CourseNoteLikeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseNoteLike record);

    int insertSelective(CourseNoteLike record);

    List<CourseNoteLike> selectByExample(CourseNoteLikeExample example);

    CourseNoteLike selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseNoteLike record, @Param("example") CourseNoteLikeExample example);

    int updateByExample(@Param("record") CourseNoteLike record, @Param("example") CourseNoteLikeExample example);

    int updateByPrimaryKeySelective(CourseNoteLike record);

    int updateByPrimaryKey(CourseNoteLike record);
}