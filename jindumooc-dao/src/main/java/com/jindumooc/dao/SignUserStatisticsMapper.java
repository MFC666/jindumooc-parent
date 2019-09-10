package com.jindumooc.dao;

import com.jindumooc.pojo.SignUserStatistics;
import com.jindumooc.pojo.SignUserStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignUserStatisticsMapper {
    int countByExample(SignUserStatisticsExample example);

    int deleteByExample(SignUserStatisticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignUserStatistics record);

    int insertSelective(SignUserStatistics record);

    List<SignUserStatistics> selectByExample(SignUserStatisticsExample example);

    SignUserStatistics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignUserStatistics record, @Param("example") SignUserStatisticsExample example);

    int updateByExample(@Param("record") SignUserStatistics record, @Param("example") SignUserStatisticsExample example);

    int updateByPrimaryKeySelective(SignUserStatistics record);

    int updateByPrimaryKey(SignUserStatistics record);
}