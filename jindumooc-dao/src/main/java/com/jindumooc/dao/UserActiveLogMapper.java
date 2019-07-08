package com.jindumooc.dao;

import com.jindumooc.pojo.UserActiveLog;
import com.jindumooc.pojo.UserActiveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserActiveLogMapper {
    int countByExample(UserActiveLogExample example);

    int deleteByExample(UserActiveLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserActiveLog record);

    int insertSelective(UserActiveLog record);

    List<UserActiveLog> selectByExample(UserActiveLogExample example);

    UserActiveLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserActiveLog record, @Param("example") UserActiveLogExample example);

    int updateByExample(@Param("record") UserActiveLog record, @Param("example") UserActiveLogExample example);

    int updateByPrimaryKeySelective(UserActiveLog record);

    int updateByPrimaryKey(UserActiveLog record);
}