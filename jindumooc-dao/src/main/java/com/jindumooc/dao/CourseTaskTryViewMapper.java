package com.jindumooc.dao;

import com.jindumooc.pojo.CourseTaskTryView;
import com.jindumooc.pojo.CourseTaskTryViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTaskTryViewMapper {
    int countByExample(CourseTaskTryViewExample example);

    int deleteByExample(CourseTaskTryViewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseTaskTryView record);

    int insertSelective(CourseTaskTryView record);

    List<CourseTaskTryView> selectByExample(CourseTaskTryViewExample example);

    CourseTaskTryView selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTaskTryView record, @Param("example") CourseTaskTryViewExample example);

    int updateByExample(@Param("record") CourseTaskTryView record, @Param("example") CourseTaskTryViewExample example);

    int updateByPrimaryKeySelective(CourseTaskTryView record);

    int updateByPrimaryKey(CourseTaskTryView record);
}