package com.jindumooc.dao;

import com.jindumooc.pojo.Status;
import com.jindumooc.pojo.StatusExample;
import com.jindumooc.pojo.StatusWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusMapper {
    int countByExample(StatusExample example);

    int deleteByExample(StatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatusWithBLOBs record);

    int insertSelective(StatusWithBLOBs record);

    List<StatusWithBLOBs> selectByExampleWithBLOBs(StatusExample example);

    List<Status> selectByExample(StatusExample example);

    StatusWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatusWithBLOBs record, @Param("example") StatusExample example);

    int updateByExampleWithBLOBs(@Param("record") StatusWithBLOBs record, @Param("example") StatusExample example);

    int updateByExample(@Param("record") Status record, @Param("example") StatusExample example);

    int updateByPrimaryKeySelective(StatusWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(StatusWithBLOBs record);

    int updateByPrimaryKey(Status record);
}