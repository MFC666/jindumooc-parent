package com.jindumooc.dao;

import com.jindumooc.pojo.UserLearnStatisticsDaily;
import com.jindumooc.pojo.UserLearnStatisticsDailyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLearnStatisticsDailyMapper {
    int countByExample(UserLearnStatisticsDailyExample example);

    int deleteByExample(UserLearnStatisticsDailyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLearnStatisticsDaily record);

    int insertSelective(UserLearnStatisticsDaily record);

    List<UserLearnStatisticsDaily> selectByExample(UserLearnStatisticsDailyExample example);

    UserLearnStatisticsDaily selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLearnStatisticsDaily record, @Param("example") UserLearnStatisticsDailyExample example);

    int updateByExample(@Param("record") UserLearnStatisticsDaily record, @Param("example") UserLearnStatisticsDailyExample example);

    int updateByPrimaryKeySelective(UserLearnStatisticsDaily record);

    int updateByPrimaryKey(UserLearnStatisticsDaily record);
}