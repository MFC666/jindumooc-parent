package com.jindumooc.dao;

import com.jindumooc.pojo.MessageRelation;
import com.jindumooc.pojo.MessageRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageRelationMapper {
    int countByExample(MessageRelationExample example);

    int deleteByExample(MessageRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageRelation record);

    int insertSelective(MessageRelation record);

    List<MessageRelation> selectByExample(MessageRelationExample example);

    MessageRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageRelation record, @Param("example") MessageRelationExample example);

    int updateByExample(@Param("record") MessageRelation record, @Param("example") MessageRelationExample example);

    int updateByPrimaryKeySelective(MessageRelation record);

    int updateByPrimaryKey(MessageRelation record);
}