package com.jindumooc.dao;

import com.jindumooc.pojo.BizTargetlog;
import com.jindumooc.pojo.BizTargetlogExample;
import com.jindumooc.pojo.BizTargetlogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizTargetlogMapper {
    int countByExample(BizTargetlogExample example);

    int deleteByExample(BizTargetlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizTargetlogWithBLOBs record);

    int insertSelective(BizTargetlogWithBLOBs record);

    List<BizTargetlogWithBLOBs> selectByExampleWithBLOBs(BizTargetlogExample example);

    List<BizTargetlog> selectByExample(BizTargetlogExample example);

    BizTargetlogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizTargetlogWithBLOBs record, @Param("example") BizTargetlogExample example);

    int updateByExampleWithBLOBs(@Param("record") BizTargetlogWithBLOBs record, @Param("example") BizTargetlogExample example);

    int updateByExample(@Param("record") BizTargetlog record, @Param("example") BizTargetlogExample example);

    int updateByPrimaryKeySelective(BizTargetlogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BizTargetlogWithBLOBs record);

    int updateByPrimaryKey(BizTargetlog record);
}