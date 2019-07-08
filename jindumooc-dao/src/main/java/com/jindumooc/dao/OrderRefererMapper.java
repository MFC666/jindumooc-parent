package com.jindumooc.dao;

import com.jindumooc.pojo.OrderReferer;
import com.jindumooc.pojo.OrderRefererExample;
import com.jindumooc.pojo.OrderRefererWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRefererMapper {
    int countByExample(OrderRefererExample example);

    int deleteByExample(OrderRefererExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderRefererWithBLOBs record);

    int insertSelective(OrderRefererWithBLOBs record);

    List<OrderRefererWithBLOBs> selectByExampleWithBLOBs(OrderRefererExample example);

    List<OrderReferer> selectByExample(OrderRefererExample example);

    OrderRefererWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderRefererWithBLOBs record, @Param("example") OrderRefererExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderRefererWithBLOBs record, @Param("example") OrderRefererExample example);

    int updateByExample(@Param("record") OrderReferer record, @Param("example") OrderRefererExample example);

    int updateByPrimaryKeySelective(OrderRefererWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrderRefererWithBLOBs record);

    int updateByPrimaryKey(OrderReferer record);
}