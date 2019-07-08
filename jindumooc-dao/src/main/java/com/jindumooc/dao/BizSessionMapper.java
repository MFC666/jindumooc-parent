package com.jindumooc.dao;

import com.jindumooc.pojo.BizSession;
import com.jindumooc.pojo.BizSessionExample;
import com.jindumooc.pojo.BizSessionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizSessionMapper {
    int countByExample(BizSessionExample example);

    int deleteByExample(BizSessionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizSessionWithBLOBs record);

    int insertSelective(BizSessionWithBLOBs record);

    List<BizSessionWithBLOBs> selectByExampleWithBLOBs(BizSessionExample example);

    List<BizSession> selectByExample(BizSessionExample example);

    BizSessionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizSessionWithBLOBs record, @Param("example") BizSessionExample example);

    int updateByExampleWithBLOBs(@Param("record") BizSessionWithBLOBs record, @Param("example") BizSessionExample example);

    int updateByExample(@Param("record") BizSession record, @Param("example") BizSessionExample example);

    int updateByPrimaryKeySelective(BizSessionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BizSessionWithBLOBs record);

    int updateByPrimaryKey(BizSession record);
}