package com.jindumooc.dao;

import com.jindumooc.pojo.RewardPointAccount;
import com.jindumooc.pojo.RewardPointAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardPointAccountMapper {
    int countByExample(RewardPointAccountExample example);

    int deleteByExample(RewardPointAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardPointAccount record);

    int insertSelective(RewardPointAccount record);

    List<RewardPointAccount> selectByExample(RewardPointAccountExample example);

    RewardPointAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardPointAccount record, @Param("example") RewardPointAccountExample example);

    int updateByExample(@Param("record") RewardPointAccount record, @Param("example") RewardPointAccountExample example);

    int updateByPrimaryKeySelective(RewardPointAccount record);

    int updateByPrimaryKey(RewardPointAccount record);
}