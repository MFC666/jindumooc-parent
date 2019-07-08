package com.jindumooc.dao;

import com.jindumooc.pojo.DistributorJobData;
import com.jindumooc.pojo.DistributorJobDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributorJobDataMapper {
    int countByExample(DistributorJobDataExample example);

    int deleteByExample(DistributorJobDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DistributorJobData record);

    int insertSelective(DistributorJobData record);

    List<DistributorJobData> selectByExampleWithBLOBs(DistributorJobDataExample example);

    List<DistributorJobData> selectByExample(DistributorJobDataExample example);

    DistributorJobData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DistributorJobData record, @Param("example") DistributorJobDataExample example);

    int updateByExampleWithBLOBs(@Param("record") DistributorJobData record, @Param("example") DistributorJobDataExample example);

    int updateByExample(@Param("record") DistributorJobData record, @Param("example") DistributorJobDataExample example);

    int updateByPrimaryKeySelective(DistributorJobData record);

    int updateByPrimaryKeyWithBLOBs(DistributorJobData record);

    int updateByPrimaryKey(DistributorJobData record);
}