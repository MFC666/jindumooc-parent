package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityLearnLog;
import com.jindumooc.pojo.ActivityLearnLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityLearnLogMapper {
    int countByExample(ActivityLearnLogExample example);

    int deleteByExample(ActivityLearnLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityLearnLog record);

    int insertSelective(ActivityLearnLog record);

    List<ActivityLearnLog> selectByExampleWithBLOBs(ActivityLearnLogExample example);

    List<ActivityLearnLog> selectByExample(ActivityLearnLogExample example);

    ActivityLearnLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityLearnLog record, @Param("example") ActivityLearnLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityLearnLog record, @Param("example") ActivityLearnLogExample example);

    int updateByExample(@Param("record") ActivityLearnLog record, @Param("example") ActivityLearnLogExample example);

    int updateByPrimaryKeySelective(ActivityLearnLog record);

    int updateByPrimaryKeyWithBLOBs(ActivityLearnLog record);

    int updateByPrimaryKey(ActivityLearnLog record);
}