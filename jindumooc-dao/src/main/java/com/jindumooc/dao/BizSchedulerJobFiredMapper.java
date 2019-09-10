package com.jindumooc.dao;

import com.jindumooc.pojo.BizSchedulerJobFired;
import com.jindumooc.pojo.BizSchedulerJobFiredExample;
import com.jindumooc.pojo.BizSchedulerJobFiredWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSchedulerJobFiredMapper {
    int countByExample(BizSchedulerJobFiredExample example);

    int deleteByExample(BizSchedulerJobFiredExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizSchedulerJobFiredWithBLOBs record);

    int insertSelective(BizSchedulerJobFiredWithBLOBs record);

    List<BizSchedulerJobFiredWithBLOBs> selectByExampleWithBLOBs(BizSchedulerJobFiredExample example);

    List<BizSchedulerJobFired> selectByExample(BizSchedulerJobFiredExample example);

    BizSchedulerJobFiredWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizSchedulerJobFiredWithBLOBs record, @Param("example") BizSchedulerJobFiredExample example);

    int updateByExampleWithBLOBs(@Param("record") BizSchedulerJobFiredWithBLOBs record, @Param("example") BizSchedulerJobFiredExample example);

    int updateByExample(@Param("record") BizSchedulerJobFired record, @Param("example") BizSchedulerJobFiredExample example);

    int updateByPrimaryKeySelective(BizSchedulerJobFiredWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BizSchedulerJobFiredWithBLOBs record);

    int updateByPrimaryKey(BizSchedulerJobFired record);
}