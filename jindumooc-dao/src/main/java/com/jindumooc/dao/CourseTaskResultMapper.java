package com.jindumooc.dao;

import com.jindumooc.pojo.CourseTaskResult;
import com.jindumooc.pojo.CourseTaskResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTaskResultMapper {
    int countByExample(CourseTaskResultExample example);

    int deleteByExample(CourseTaskResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseTaskResult record);

    int insertSelective(CourseTaskResult record);

    List<CourseTaskResult> selectByExample(CourseTaskResultExample example);

    CourseTaskResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTaskResult record, @Param("example") CourseTaskResultExample example);

    int updateByExample(@Param("record") CourseTaskResult record, @Param("example") CourseTaskResultExample example);

    int updateByPrimaryKeySelective(CourseTaskResult record);

    int updateByPrimaryKey(CourseTaskResult record);
}