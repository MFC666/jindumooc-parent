package com.jindumooc.dao;

import com.jindumooc.pojo.BizSchedulerJobProcess;
import com.jindumooc.pojo.BizSchedulerJobProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSchedulerJobProcessMapper {
    int countByExample(BizSchedulerJobProcessExample example);

    int deleteByExample(BizSchedulerJobProcessExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizSchedulerJobProcess record);

    int insertSelective(BizSchedulerJobProcess record);

    List<BizSchedulerJobProcess> selectByExample(BizSchedulerJobProcessExample example);

    BizSchedulerJobProcess selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizSchedulerJobProcess record, @Param("example") BizSchedulerJobProcessExample example);

    int updateByExample(@Param("record") BizSchedulerJobProcess record, @Param("example") BizSchedulerJobProcessExample example);

    int updateByPrimaryKeySelective(BizSchedulerJobProcess record);

    int updateByPrimaryKey(BizSchedulerJobProcess record);
}