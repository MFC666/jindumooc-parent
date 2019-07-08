package com.jindumooc.dao;

import com.jindumooc.pojo.CourseTask;
import com.jindumooc.pojo.CourseTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTaskMapper {
    int countByExample(CourseTaskExample example);

    int deleteByExample(CourseTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseTask record);

    int insertSelective(CourseTask record);

    List<CourseTask> selectByExample(CourseTaskExample example);

    CourseTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTask record, @Param("example") CourseTaskExample example);

    int updateByExample(@Param("record") CourseTask record, @Param("example") CourseTaskExample example);

    int updateByPrimaryKeySelective(CourseTask record);

    int updateByPrimaryKey(CourseTask record);
}