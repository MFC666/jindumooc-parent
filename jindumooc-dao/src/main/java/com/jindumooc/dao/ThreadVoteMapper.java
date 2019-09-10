package com.jindumooc.dao;

import com.jindumooc.pojo.ThreadVote;
import com.jindumooc.pojo.ThreadVoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadVoteMapper {
    int countByExample(ThreadVoteExample example);

    int deleteByExample(ThreadVoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreadVote record);

    int insertSelective(ThreadVote record);

    List<ThreadVote> selectByExample(ThreadVoteExample example);

    ThreadVote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreadVote record, @Param("example") ThreadVoteExample example);

    int updateByExample(@Param("record") ThreadVote record, @Param("example") ThreadVoteExample example);

    int updateByPrimaryKeySelective(ThreadVote record);

    int updateByPrimaryKey(ThreadVote record);
}