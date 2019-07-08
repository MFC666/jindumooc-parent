package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityVideo;
import com.jindumooc.pojo.ActivityVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityVideoMapper {
    int countByExample(ActivityVideoExample example);

    int deleteByExample(ActivityVideoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityVideo record);

    int insertSelective(ActivityVideo record);

    List<ActivityVideo> selectByExampleWithBLOBs(ActivityVideoExample example);

    List<ActivityVideo> selectByExample(ActivityVideoExample example);

    ActivityVideo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityVideo record, @Param("example") ActivityVideoExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityVideo record, @Param("example") ActivityVideoExample example);

    int updateByExample(@Param("record") ActivityVideo record, @Param("example") ActivityVideoExample example);

    int updateByPrimaryKeySelective(ActivityVideo record);

    int updateByPrimaryKeyWithBLOBs(ActivityVideo record);

    int updateByPrimaryKey(ActivityVideo record);
}