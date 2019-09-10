package com.jindumooc.dao;

import com.jindumooc.pojo.RecentPostNum;
import com.jindumooc.pojo.RecentPostNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecentPostNumMapper {
    int countByExample(RecentPostNumExample example);

    int deleteByExample(RecentPostNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RecentPostNum record);

    int insertSelective(RecentPostNum record);

    List<RecentPostNum> selectByExample(RecentPostNumExample example);

    RecentPostNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RecentPostNum record, @Param("example") RecentPostNumExample example);

    int updateByExample(@Param("record") RecentPostNum record, @Param("example") RecentPostNumExample example);

    int updateByPrimaryKeySelective(RecentPostNum record);

    int updateByPrimaryKey(RecentPostNum record);
}