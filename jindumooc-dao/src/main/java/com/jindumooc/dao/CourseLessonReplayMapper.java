package com.jindumooc.dao;

import com.jindumooc.pojo.CourseLessonReplay;
import com.jindumooc.pojo.CourseLessonReplayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseLessonReplayMapper {
    int countByExample(CourseLessonReplayExample example);

    int deleteByExample(CourseLessonReplayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseLessonReplay record);

    int insertSelective(CourseLessonReplay record);

    List<CourseLessonReplay> selectByExampleWithBLOBs(CourseLessonReplayExample example);

    List<CourseLessonReplay> selectByExample(CourseLessonReplayExample example);

    CourseLessonReplay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseLessonReplay record, @Param("example") CourseLessonReplayExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseLessonReplay record, @Param("example") CourseLessonReplayExample example);

    int updateByExample(@Param("record") CourseLessonReplay record, @Param("example") CourseLessonReplayExample example);

    int updateByPrimaryKeySelective(CourseLessonReplay record);

    int updateByPrimaryKeyWithBLOBs(CourseLessonReplay record);

    int updateByPrimaryKey(CourseLessonReplay record);
}