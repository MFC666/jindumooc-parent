package com.jindumooc.dao;

import com.jindumooc.pojo.IpBlacklist;
import com.jindumooc.pojo.IpBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpBlacklistMapper {
    int countByExample(IpBlacklistExample example);

    int deleteByExample(IpBlacklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpBlacklist record);

    int insertSelective(IpBlacklist record);

    List<IpBlacklist> selectByExample(IpBlacklistExample example);

    IpBlacklist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpBlacklist record, @Param("example") IpBlacklistExample example);

    int updateByExample(@Param("record") IpBlacklist record, @Param("example") IpBlacklistExample example);

    int updateByPrimaryKeySelective(IpBlacklist record);

    int updateByPrimaryKey(IpBlacklist record);
}