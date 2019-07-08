package com.jindumooc.dao;

import com.jindumooc.pojo.BizSchedulerJobPool;
import com.jindumooc.pojo.BizSchedulerJobPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSchedulerJobPoolMapper {
    int countByExample(BizSchedulerJobPoolExample example);

    int deleteByExample(BizSchedulerJobPoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizSchedulerJobPool record);

    int insertSelective(BizSchedulerJobPool record);

    List<BizSchedulerJobPool> selectByExample(BizSchedulerJobPoolExample example);

    BizSchedulerJobPool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizSchedulerJobPool record, @Param("example") BizSchedulerJobPoolExample example);

    int updateByExample(@Param("record") BizSchedulerJobPool record, @Param("example") BizSchedulerJobPoolExample example);

    int updateByPrimaryKeySelective(BizSchedulerJobPool record);

    int updateByPrimaryKey(BizSchedulerJobPool record);
}