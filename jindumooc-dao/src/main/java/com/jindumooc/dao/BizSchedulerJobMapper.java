package com.jindumooc.dao;

import com.jindumooc.pojo.BizSchedulerJob;
import com.jindumooc.pojo.BizSchedulerJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSchedulerJobMapper {
    int countByExample(BizSchedulerJobExample example);

    int deleteByExample(BizSchedulerJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizSchedulerJob record);

    int insertSelective(BizSchedulerJob record);

    List<BizSchedulerJob> selectByExampleWithBLOBs(BizSchedulerJobExample example);

    List<BizSchedulerJob> selectByExample(BizSchedulerJobExample example);

    BizSchedulerJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizSchedulerJob record, @Param("example") BizSchedulerJobExample example);

    int updateByExampleWithBLOBs(@Param("record") BizSchedulerJob record, @Param("example") BizSchedulerJobExample example);

    int updateByExample(@Param("record") BizSchedulerJob record, @Param("example") BizSchedulerJobExample example);

    int updateByPrimaryKeySelective(BizSchedulerJob record);

    int updateByPrimaryKeyWithBLOBs(BizSchedulerJob record);

    int updateByPrimaryKey(BizSchedulerJob record);
}