package com.jindumooc.dao;

import com.jindumooc.pojo.DiscoveryColumn;
import com.jindumooc.pojo.DiscoveryColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscoveryColumnMapper {
    int countByExample(DiscoveryColumnExample example);

    int deleteByExample(DiscoveryColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DiscoveryColumn record);

    int insertSelective(DiscoveryColumn record);

    List<DiscoveryColumn> selectByExample(DiscoveryColumnExample example);

    DiscoveryColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DiscoveryColumn record, @Param("example") DiscoveryColumnExample example);

    int updateByExample(@Param("record") DiscoveryColumn record, @Param("example") DiscoveryColumnExample example);

    int updateByPrimaryKeySelective(DiscoveryColumn record);

    int updateByPrimaryKey(DiscoveryColumn record);
}