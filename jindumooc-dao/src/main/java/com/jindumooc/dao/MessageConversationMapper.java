package com.jindumooc.dao;

import com.jindumooc.pojo.MessageConversation;
import com.jindumooc.pojo.MessageConversationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageConversationMapper {
    int countByExample(MessageConversationExample example);

    int deleteByExample(MessageConversationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageConversation record);

    int insertSelective(MessageConversation record);

    List<MessageConversation> selectByExampleWithBLOBs(MessageConversationExample example);

    List<MessageConversation> selectByExample(MessageConversationExample example);

    MessageConversation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageConversation record, @Param("example") MessageConversationExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageConversation record, @Param("example") MessageConversationExample example);

    int updateByExample(@Param("record") MessageConversation record, @Param("example") MessageConversationExample example);

    int updateByPrimaryKeySelective(MessageConversation record);

    int updateByPrimaryKeyWithBLOBs(MessageConversation record);

    int updateByPrimaryKey(MessageConversation record);

    int getMaxId();
}