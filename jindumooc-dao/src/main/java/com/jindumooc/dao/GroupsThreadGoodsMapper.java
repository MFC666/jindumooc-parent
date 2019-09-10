package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThreadGoods;
import com.jindumooc.pojo.GroupsThreadGoodsExample;
import com.jindumooc.pojo.GroupsThreadGoodsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupsThreadGoodsMapper {
    int countByExample(GroupsThreadGoodsExample example);

    int deleteByExample(GroupsThreadGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsThreadGoodsWithBLOBs record);

    int insertSelective(GroupsThreadGoodsWithBLOBs record);

    List<GroupsThreadGoodsWithBLOBs> selectByExampleWithBLOBs(GroupsThreadGoodsExample example);

    List<GroupsThreadGoods> selectByExample(GroupsThreadGoodsExample example);

    GroupsThreadGoodsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsThreadGoodsWithBLOBs record, @Param("example") GroupsThreadGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") GroupsThreadGoodsWithBLOBs record, @Param("example") GroupsThreadGoodsExample example);

    int updateByExample(@Param("record") GroupsThreadGoods record, @Param("example") GroupsThreadGoodsExample example);

    int updateByPrimaryKeySelective(GroupsThreadGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GroupsThreadGoodsWithBLOBs record);

    int updateByPrimaryKey(GroupsThreadGoods record);
}