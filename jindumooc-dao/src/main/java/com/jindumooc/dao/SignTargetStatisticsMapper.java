package com.jindumooc.dao;

import com.jindumooc.pojo.SignTargetStatistics;
import com.jindumooc.pojo.SignTargetStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignTargetStatisticsMapper {
    int countByExample(SignTargetStatisticsExample example);

    int deleteByExample(SignTargetStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignTargetStatistics record);

    int insertSelective(SignTargetStatistics record);

    List<SignTargetStatistics> selectByExample(SignTargetStatisticsExample example);

    SignTargetStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignTargetStatistics record, @Param("example") SignTargetStatisticsExample example);

    int updateByExample(@Param("record") SignTargetStatistics record, @Param("example") SignTargetStatisticsExample example);

    int updateByPrimaryKeySelective(SignTargetStatistics record);

    int updateByPrimaryKey(SignTargetStatistics record);
}