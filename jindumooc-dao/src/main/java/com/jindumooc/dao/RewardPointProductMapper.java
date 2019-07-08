package com.jindumooc.dao;

import com.jindumooc.pojo.RewardPointProduct;
import com.jindumooc.pojo.RewardPointProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardPointProductMapper {
    int countByExample(RewardPointProductExample example);

    int deleteByExample(RewardPointProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardPointProduct record);

    int insertSelective(RewardPointProduct record);

    List<RewardPointProduct> selectByExampleWithBLOBs(RewardPointProductExample example);

    List<RewardPointProduct> selectByExample(RewardPointProductExample example);

    RewardPointProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardPointProduct record, @Param("example") RewardPointProductExample example);

    int updateByExampleWithBLOBs(@Param("record") RewardPointProduct record, @Param("example") RewardPointProductExample example);

    int updateByExample(@Param("record") RewardPointProduct record, @Param("example") RewardPointProductExample example);

    int updateByPrimaryKeySelective(RewardPointProduct record);

    int updateByPrimaryKeyWithBLOBs(RewardPointProduct record);

    int updateByPrimaryKey(RewardPointProduct record);
}