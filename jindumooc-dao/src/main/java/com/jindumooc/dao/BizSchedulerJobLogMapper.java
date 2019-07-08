package com.jindumooc.dao;

import com.jindumooc.pojo.BizSchedulerJobLog;
import com.jindumooc.pojo.BizSchedulerJobLogExample;
import com.jindumooc.pojo.BizSchedulerJobLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSchedulerJobLogMapper {
    int countByExample(BizSchedulerJobLogExample example);

    int deleteByExample(BizSchedulerJobLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizSchedulerJobLogWithBLOBs record);

    int insertSelective(BizSchedulerJobLogWithBLOBs record);

    List<BizSchedulerJobLogWithBLOBs> selectByExampleWithBLOBs(BizSchedulerJobLogExample example);

    List<BizSchedulerJobLog> selectByExample(BizSchedulerJobLogExample example);

    BizSchedulerJobLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizSchedulerJobLogWithBLOBs record, @Param("example") BizSchedulerJobLogExample example);

    int updateByExampleWithBLOBs(@Param("record") BizSchedulerJobLogWithBLOBs record, @Param("example") BizSchedulerJobLogExample example);

    int updateByExample(@Param("record") BizSchedulerJobLog record, @Param("example") BizSchedulerJobLogExample example);

    int updateByPrimaryKeySelective(BizSchedulerJobLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BizSchedulerJobLogWithBLOBs record);

    int updateByPrimaryKey(BizSchedulerJobLog record);
}