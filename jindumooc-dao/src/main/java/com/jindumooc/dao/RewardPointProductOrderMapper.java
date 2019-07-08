package com.jindumooc.dao;

import com.jindumooc.pojo.RewardPointProductOrder;
import com.jindumooc.pojo.RewardPointProductOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardPointProductOrderMapper {
    int countByExample(RewardPointProductOrderExample example);

    int deleteByExample(RewardPointProductOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardPointProductOrder record);

    int insertSelective(RewardPointProductOrder record);

    List<RewardPointProductOrder> selectByExample(RewardPointProductOrderExample example);

    RewardPointProductOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardPointProductOrder record, @Param("example") RewardPointProductOrderExample example);

    int updateByExample(@Param("record") RewardPointProductOrder record, @Param("example") RewardPointProductOrderExample example);

    int updateByPrimaryKeySelective(RewardPointProductOrder record);

    int updateByPrimaryKey(RewardPointProductOrder record);
}