package com.jindumooc.dao;

import com.jindumooc.pojo.BizQueueJob;
import com.jindumooc.pojo.BizQueueJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizQueueJobMapper {
    int countByExample(BizQueueJobExample example);

    int deleteByExample(BizQueueJobExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BizQueueJob record);

    int insertSelective(BizQueueJob record);

    List<BizQueueJob> selectByExampleWithBLOBs(BizQueueJobExample example);

    List<BizQueueJob> selectByExample(BizQueueJobExample example);

    BizQueueJob selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BizQueueJob record, @Param("example") BizQueueJobExample example);

    int updateByExampleWithBLOBs(@Param("record") BizQueueJob record, @Param("example") BizQueueJobExample example);

    int updateByExample(@Param("record") BizQueueJob record, @Param("example") BizQueueJobExample example);

    int updateByPrimaryKeySelective(BizQueueJob record);

    int updateByPrimaryKeyWithBLOBs(BizQueueJob record);

    int updateByPrimaryKey(BizQueueJob record);
}