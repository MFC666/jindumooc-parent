package com.jindumooc.dao;

import com.jindumooc.pojo.OrderRefererLog;
import com.jindumooc.pojo.OrderRefererLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRefererLogMapper {
    int countByExample(OrderRefererLogExample example);

    int deleteByExample(OrderRefererLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderRefererLog record);

    int insertSelective(OrderRefererLog record);

    List<OrderRefererLog> selectByExample(OrderRefererLogExample example);

    OrderRefererLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderRefererLog record, @Param("example") OrderRefererLogExample example);

    int updateByExample(@Param("record") OrderRefererLog record, @Param("example") OrderRefererLogExample example);

    int updateByPrimaryKeySelective(OrderRefererLog record);

    int updateByPrimaryKey(OrderRefererLog record);
}