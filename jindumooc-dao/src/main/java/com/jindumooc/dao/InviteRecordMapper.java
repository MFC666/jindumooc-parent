package com.jindumooc.dao;

import com.jindumooc.pojo.InviteRecord;
import com.jindumooc.pojo.InviteRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InviteRecordMapper {
    int countByExample(InviteRecordExample example);

    int deleteByExample(InviteRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InviteRecord record);

    int insertSelective(InviteRecord record);

    List<InviteRecord> selectByExample(InviteRecordExample example);

    InviteRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InviteRecord record, @Param("example") InviteRecordExample example);

    int updateByExample(@Param("record") InviteRecord record, @Param("example") InviteRecordExample example);

    int updateByPrimaryKeySelective(InviteRecord record);

    int updateByPrimaryKey(InviteRecord record);
}