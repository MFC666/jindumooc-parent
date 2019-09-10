package com.jindumooc.dao;

import com.jindumooc.pojo.KeywordBanlog;
import com.jindumooc.pojo.KeywordBanlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordBanlogMapper {
    int countByExample(KeywordBanlogExample example);

    int deleteByExample(KeywordBanlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KeywordBanlog record);

    int insertSelective(KeywordBanlog record);

    List<KeywordBanlog> selectByExampleWithBLOBs(KeywordBanlogExample example);

    List<KeywordBanlog> selectByExample(KeywordBanlogExample example);

    KeywordBanlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KeywordBanlog record, @Param("example") KeywordBanlogExample example);

    int updateByExampleWithBLOBs(@Param("record") KeywordBanlog record, @Param("example") KeywordBanlogExample example);

    int updateByExample(@Param("record") KeywordBanlog record, @Param("example") KeywordBanlogExample example);

    int updateByPrimaryKeySelective(KeywordBanlog record);

    int updateByPrimaryKeyWithBLOBs(KeywordBanlog record);

    int updateByPrimaryKey(KeywordBanlog record);
}