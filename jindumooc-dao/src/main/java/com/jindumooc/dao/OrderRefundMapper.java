package com.jindumooc.dao;

import com.jindumooc.pojo.OrderRefund;
import com.jindumooc.pojo.OrderRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRefundMapper {
    int countByExample(OrderRefundExample example);

    int deleteByExample(OrderRefundExample example);

    int insert(OrderRefund record);

    int insertSelective(OrderRefund record);

    List<OrderRefund> selectByExample(OrderRefundExample example);

    int updateByExampleSelective(@Param("record") OrderRefund record, @Param("example") OrderRefundExample example);

    int updateByExample(@Param("record") OrderRefund record, @Param("example") OrderRefundExample example);
}