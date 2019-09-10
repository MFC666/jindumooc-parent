package com.jindumooc.dao;

import com.jindumooc.pojo.CourseTaskView;
import com.jindumooc.pojo.CourseTaskViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTaskViewMapper {
    int countByExample(CourseTaskViewExample example);

    int deleteByExample(CourseTaskViewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseTaskView record);

    int insertSelective(CourseTaskView record);

    List<CourseTaskView> selectByExample(CourseTaskViewExample example);

    CourseTaskView selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTaskView record, @Param("example") CourseTaskViewExample example);

    int updateByExample(@Param("record") CourseTaskView record, @Param("example") CourseTaskViewExample example);

    int updateByPrimaryKeySelective(CourseTaskView record);

    int updateByPrimaryKey(CourseTaskView record);
}