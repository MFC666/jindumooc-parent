package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThreadTrade;
import com.jindumooc.pojo.GroupsThreadTradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsThreadTradeMapper {
    int countByExample(GroupsThreadTradeExample example);

    int deleteByExample(GroupsThreadTradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsThreadTrade record);

    int insertSelective(GroupsThreadTrade record);

    List<GroupsThreadTrade> selectByExample(GroupsThreadTradeExample example);

    GroupsThreadTrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsThreadTrade record, @Param("example") GroupsThreadTradeExample example);

    int updateByExample(@Param("record") GroupsThreadTrade record, @Param("example") GroupsThreadTradeExample example);

    int updateByPrimaryKeySelective(GroupsThreadTrade record);

    int updateByPrimaryKey(GroupsThreadTrade record);
}