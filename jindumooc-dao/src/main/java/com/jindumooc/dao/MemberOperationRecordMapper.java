package com.jindumooc.dao;

import com.jindumooc.pojo.MemberOperationRecord;
import com.jindumooc.pojo.MemberOperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberOperationRecordMapper {
    int countByExample(MemberOperationRecordExample example);

    int deleteByExample(MemberOperationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberOperationRecord record);

    int insertSelective(MemberOperationRecord record);

    List<MemberOperationRecord> selectByExampleWithBLOBs(MemberOperationRecordExample example);

    List<MemberOperationRecord> selectByExample(MemberOperationRecordExample example);

    MemberOperationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberOperationRecord record, @Param("example") MemberOperationRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberOperationRecord record, @Param("example") MemberOperationRecordExample example);

    int updateByExample(@Param("record") MemberOperationRecord record, @Param("example") MemberOperationRecordExample example);

    int updateByPrimaryKeySelective(MemberOperationRecord record);

    int updateByPrimaryKeyWithBLOBs(MemberOperationRecord record);

    int updateByPrimaryKey(MemberOperationRecord record);
}