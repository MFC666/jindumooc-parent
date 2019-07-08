package com.jindumooc.dao;

import com.jindumooc.pojo.ThreadPost;
import com.jindumooc.pojo.ThreadPostExample;
import com.jindumooc.pojo.ThreadPostWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThreadPostMapper {
    int countByExample(ThreadPostExample example);

    int deleteByExample(ThreadPostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThreadPostWithBLOBs record);

    int insertSelective(ThreadPostWithBLOBs record);

    List<ThreadPostWithBLOBs> selectByExampleWithBLOBs(ThreadPostExample example);

    List<ThreadPost> selectByExample(ThreadPostExample example);

    ThreadPostWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThreadPostWithBLOBs record, @Param("example") ThreadPostExample example);

    int updateByExampleWithBLOBs(@Param("record") ThreadPostWithBLOBs record, @Param("example") ThreadPostExample example);

    int updateByExample(@Param("record") ThreadPost record, @Param("example") ThreadPostExample example);

    int updateByPrimaryKeySelective(ThreadPostWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ThreadPostWithBLOBs record);

    int updateByPrimaryKey(ThreadPost record);
}