package com.jindumooc.dao;

import com.jindumooc.pojo.BizToken;
import com.jindumooc.pojo.BizTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizTokenMapper {
    int countByExample(BizTokenExample example);

    int deleteByExample(BizTokenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizToken record);

    int insertSelective(BizToken record);

    List<BizToken> selectByExampleWithBLOBs(BizTokenExample example);

    List<BizToken> selectByExample(BizTokenExample example);

    BizToken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizToken record, @Param("example") BizTokenExample example);

    int updateByExampleWithBLOBs(@Param("record") BizToken record, @Param("example") BizTokenExample example);

    int updateByExample(@Param("record") BizToken record, @Param("example") BizTokenExample example);

    int updateByPrimaryKeySelective(BizToken record);

    int updateByPrimaryKeyWithBLOBs(BizToken record);

    int updateByPrimaryKey(BizToken record);
}