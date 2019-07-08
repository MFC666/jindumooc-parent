package com.jindumooc.dao;

import com.jindumooc.pojo.Block;
import com.jindumooc.pojo.BlockExample;
import com.jindumooc.pojo.BlockWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlockMapper {
    int countByExample(BlockExample example);

    int deleteByExample(BlockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlockWithBLOBs record);

    int insertSelective(BlockWithBLOBs record);

    List<BlockWithBLOBs> selectByExampleWithBLOBs(BlockExample example);

    List<Block> selectByExample(BlockExample example);

    BlockWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlockWithBLOBs record, @Param("example") BlockExample example);

    int updateByExampleWithBLOBs(@Param("record") BlockWithBLOBs record, @Param("example") BlockExample example);

    int updateByExample(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByPrimaryKeySelective(BlockWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlockWithBLOBs record);

    int updateByPrimaryKey(Block record);
}