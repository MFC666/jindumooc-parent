package com.jindumooc.dao;

import com.jindumooc.pojo.Friend;
import com.jindumooc.pojo.FriendExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendMapper {
    int countByExample(FriendExample example);

    int deleteByExample(FriendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Friend record);

    int insertSelective(Friend record);

    List<Friend> selectByExample(FriendExample example);

    Friend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Friend record, @Param("example") FriendExample example);

    int updateByExample(@Param("record") Friend record, @Param("example") FriendExample example);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);


    /**
     * @param id 用户Id
     * @return 计算用户关注数
     */
    Integer countUserFollow(@Param("id") Integer id);

    /**
     * @param id 用户Id
     * @return 计算用户粉丝数
     */
    Integer countUserFan(@Param("id") Integer id);

}