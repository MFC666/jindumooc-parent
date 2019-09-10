package com.jindumooc.dao;

import com.jindumooc.pojo.DictionaryItem;
import com.jindumooc.pojo.DictionaryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryItemMapper {
    int countByExample(DictionaryItemExample example);

    int deleteByExample(DictionaryItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DictionaryItem record);

    int insertSelective(DictionaryItem record);

    List<DictionaryItem> selectByExample(DictionaryItemExample example);

    DictionaryItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DictionaryItem record, @Param("example") DictionaryItemExample example);

    int updateByExample(@Param("record") DictionaryItem record, @Param("example") DictionaryItemExample example);

    int updateByPrimaryKeySelective(DictionaryItem record);

    int updateByPrimaryKey(DictionaryItem record);
}