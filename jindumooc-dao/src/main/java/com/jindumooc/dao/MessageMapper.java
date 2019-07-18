package com.jindumooc.dao;

import com.jindumooc.dto.SearchMessage;
import com.jindumooc.pojo.Message;
import com.jindumooc.pojo.MessageExample;
import java.util.List;

import com.jindumooc.vojo.Messages;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    int countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExampleWithBLOBs(MessageExample example);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExampleWithBLOBs(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKeyWithBLOBs(Message record);

    int updateByPrimaryKey(Message record);

    List<Message> getAllMessages(SearchMessage sm);

    int getAllMessagesNum(SearchMessage sm);
}