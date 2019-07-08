package com.jindumooc.dao;

import com.jindumooc.pojo.ThreadMember;
import com.jindumooc.pojo.ThreadMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadMemberMapper {
    int countByExample(ThreadMemberExample example);

    int deleteByExample(ThreadMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreadMember record);

    int insertSelective(ThreadMember record);

    List<ThreadMember> selectByExample(ThreadMemberExample example);

    ThreadMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreadMember record, @Param("example") ThreadMemberExample example);

    int updateByExample(@Param("record") ThreadMember record, @Param("example") ThreadMemberExample example);

    int updateByPrimaryKeySelective(ThreadMember record);

    int updateByPrimaryKey(ThreadMember record);
}