package com.jindumooc.dao;

import com.jindumooc.pojo.BlockTemplate;
import com.jindumooc.pojo.BlockTemplateExample;
import com.jindumooc.pojo.BlockTemplateWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlockTemplateMapper {
    int countByExample(BlockTemplateExample example);

    int deleteByExample(BlockTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlockTemplateWithBLOBs record);

    int insertSelective(BlockTemplateWithBLOBs record);

    List<BlockTemplateWithBLOBs> selectByExampleWithBLOBs(BlockTemplateExample example);

    List<BlockTemplate> selectByExample(BlockTemplateExample example);

    BlockTemplateWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlockTemplateWithBLOBs record, @Param("example") BlockTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") BlockTemplateWithBLOBs record, @Param("example") BlockTemplateExample example);

    int updateByExample(@Param("record") BlockTemplate record, @Param("example") BlockTemplateExample example);

    int updateByPrimaryKeySelective(BlockTemplateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlockTemplateWithBLOBs record);

    int updateByPrimaryKey(BlockTemplate record);
}