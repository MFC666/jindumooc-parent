package com.jindumooc.dao;

import com.jindumooc.dto.SearchMessage;
import com.jindumooc.pojo.UserLearnStatisticsTotal;
import com.jindumooc.pojo.UserLearnStatisticsTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLearnStatisticsTotalMapper {
    int countByExample(UserLearnStatisticsTotalExample example);

    int deleteByExample(UserLearnStatisticsTotalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLearnStatisticsTotal record);

    int insertSelective(UserLearnStatisticsTotal record);

    List<UserLearnStatisticsTotal> selectByExample(UserLearnStatisticsTotalExample example);

    UserLearnStatisticsTotal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLearnStatisticsTotal record, @Param("example") UserLearnStatisticsTotalExample example);

    int updateByExample(@Param("record") UserLearnStatisticsTotal record, @Param("example") UserLearnStatisticsTotalExample example);

    int updateByPrimaryKeySelective(UserLearnStatisticsTotal record);

    int updateByPrimaryKey(UserLearnStatisticsTotal record);

    List<UserLearnStatisticsTotal> getUserDataStatistrics(SearchMessage sm);
}