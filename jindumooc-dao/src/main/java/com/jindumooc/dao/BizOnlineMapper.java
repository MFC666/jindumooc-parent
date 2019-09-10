package com.jindumooc.dao;

import com.jindumooc.pojo.BizOnline;
import com.jindumooc.pojo.BizOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizOnlineMapper {
    int countByExample(BizOnlineExample example);

    int deleteByExample(BizOnlineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizOnline record);

    int insertSelective(BizOnline record);

    List<BizOnline> selectByExampleWithBLOBs(BizOnlineExample example);

    List<BizOnline> selectByExample(BizOnlineExample example);

    BizOnline selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizOnline record, @Param("example") BizOnlineExample example);

    int updateByExampleWithBLOBs(@Param("record") BizOnline record, @Param("example") BizOnlineExample example);

    int updateByExample(@Param("record") BizOnline record, @Param("example") BizOnlineExample example);

    int updateByPrimaryKeySelective(BizOnline record);

    int updateByPrimaryKeyWithBLOBs(BizOnline record);

    int updateByPrimaryKey(BizOnline record);
}