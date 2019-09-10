package com.jindumooc.dao;

import com.jindumooc.pojo.UserBind;
import com.jindumooc.pojo.UserBindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBindMapper {
    int countByExample(UserBindExample example);

    int deleteByExample(UserBindExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBind record);

    int insertSelective(UserBind record);

    List<UserBind> selectByExample(UserBindExample example);

    UserBind selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBind record, @Param("example") UserBindExample example);

    int updateByExample(@Param("record") UserBind record, @Param("example") UserBindExample example);

    int updateByPrimaryKeySelective(UserBind record);

    int updateByPrimaryKey(UserBind record);
}