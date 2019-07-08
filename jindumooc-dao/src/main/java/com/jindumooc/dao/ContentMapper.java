package com.jindumooc.dao;

import com.jindumooc.pojo.Content;
import com.jindumooc.pojo.ContentExample;
import com.jindumooc.pojo.ContentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
    int countByExample(ContentExample example);

    int deleteByExample(ContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContentWithBLOBs record);

    int insertSelective(ContentWithBLOBs record);

    List<ContentWithBLOBs> selectByExampleWithBLOBs(ContentExample example);

    List<Content> selectByExample(ContentExample example);

    ContentWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContentWithBLOBs record, @Param("example") ContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ContentWithBLOBs record, @Param("example") ContentExample example);

    int updateByExample(@Param("record") Content record, @Param("example") ContentExample example);

    int updateByPrimaryKeySelective(ContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ContentWithBLOBs record);

    int updateByPrimaryKey(Content record);
}