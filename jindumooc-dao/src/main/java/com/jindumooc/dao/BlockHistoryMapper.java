package com.jindumooc.dao;

import com.jindumooc.pojo.BlockHistory;
import com.jindumooc.pojo.BlockHistoryExample;
import com.jindumooc.pojo.BlockHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlockHistoryMapper {
    int countByExample(BlockHistoryExample example);

    int deleteByExample(BlockHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlockHistoryWithBLOBs record);

    int insertSelective(BlockHistoryWithBLOBs record);

    List<BlockHistoryWithBLOBs> selectByExampleWithBLOBs(BlockHistoryExample example);

    List<BlockHistory> selectByExample(BlockHistoryExample example);

    BlockHistoryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlockHistoryWithBLOBs record, @Param("example") BlockHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") BlockHistoryWithBLOBs record, @Param("example") BlockHistoryExample example);

    int updateByExample(@Param("record") BlockHistory record, @Param("example") BlockHistoryExample example);

    int updateByPrimaryKeySelective(BlockHistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlockHistoryWithBLOBs record);

    int updateByPrimaryKey(BlockHistory record);
}