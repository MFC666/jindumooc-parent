package com.jindumooc.dao;

import com.jindumooc.pojo.RewardPointAccountFlow;
import com.jindumooc.pojo.RewardPointAccountFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardPointAccountFlowMapper {
    int countByExample(RewardPointAccountFlowExample example);

    int deleteByExample(RewardPointAccountFlowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardPointAccountFlow record);

    int insertSelective(RewardPointAccountFlow record);

    List<RewardPointAccountFlow> selectByExample(RewardPointAccountFlowExample example);

    RewardPointAccountFlow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardPointAccountFlow record, @Param("example") RewardPointAccountFlowExample example);

    int updateByExample(@Param("record") RewardPointAccountFlow record, @Param("example") RewardPointAccountFlowExample example);

    int updateByPrimaryKeySelective(RewardPointAccountFlow record);

    int updateByPrimaryKey(RewardPointAccountFlow record);
}