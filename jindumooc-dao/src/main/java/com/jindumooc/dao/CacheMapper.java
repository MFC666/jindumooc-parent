package com.jindumooc.dao;

import com.jindumooc.pojo.Cache;
import com.jindumooc.pojo.CacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    int countByExample(CacheExample example);

    int deleteByExample(CacheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cache record);

    int insertSelective(Cache record);

    List<Cache> selectByExampleWithBLOBs(CacheExample example);

    List<Cache> selectByExample(CacheExample example);

    Cache selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cache record, @Param("example") CacheExample example);

    int updateByExampleWithBLOBs(@Param("record") Cache record, @Param("example") CacheExample example);

    int updateByExample(@Param("record") Cache record, @Param("example") CacheExample example);

    int updateByPrimaryKeySelective(Cache record);

    int updateByPrimaryKeyWithBLOBs(Cache record);

    int updateByPrimaryKey(Cache record);
}