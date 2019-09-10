package com.jindumooc.dao;

import com.jindumooc.pojo.BizQueueFailedJob;
import com.jindumooc.pojo.BizQueueFailedJobExample;
import com.jindumooc.pojo.BizQueueFailedJobWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizQueueFailedJobMapper {
    int countByExample(BizQueueFailedJobExample example);

    int deleteByExample(BizQueueFailedJobExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizQueueFailedJobWithBLOBs record);

    int insertSelective(BizQueueFailedJobWithBLOBs record);

    List<BizQueueFailedJobWithBLOBs> selectByExampleWithBLOBs(BizQueueFailedJobExample example);

    List<BizQueueFailedJob> selectByExample(BizQueueFailedJobExample example);

    BizQueueFailedJobWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizQueueFailedJobWithBLOBs record, @Param("example") BizQueueFailedJobExample example);

    int updateByExampleWithBLOBs(@Param("record") BizQueueFailedJobWithBLOBs record, @Param("example") BizQueueFailedJobExample example);

    int updateByExample(@Param("record") BizQueueFailedJob record, @Param("example") BizQueueFailedJobExample example);

    int updateByPrimaryKeySelective(BizQueueFailedJobWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BizQueueFailedJobWithBLOBs record);

    int updateByPrimaryKey(BizQueueFailedJob record);
}