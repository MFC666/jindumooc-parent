package com.jindumooc.dao;

import com.jindumooc.pojo.ImConversation;
import com.jindumooc.pojo.ImConversationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImConversationMapper {
    int countByExample(ImConversationExample example);

    int deleteByExample(ImConversationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImConversation record);

    int insertSelective(ImConversation record);

    List<ImConversation> selectByExampleWithBLOBs(ImConversationExample example);

    List<ImConversation> selectByExample(ImConversationExample example);

    ImConversation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImConversation record, @Param("example") ImConversationExample example);

    int updateByExampleWithBLOBs(@Param("record") ImConversation record, @Param("example") ImConversationExample example);

    int updateByExample(@Param("record") ImConversation record, @Param("example") ImConversationExample example);

    int updateByPrimaryKeySelective(ImConversation record);

    int updateByPrimaryKeyWithBLOBs(ImConversation record);

    int updateByPrimaryKey(ImConversation record);
}