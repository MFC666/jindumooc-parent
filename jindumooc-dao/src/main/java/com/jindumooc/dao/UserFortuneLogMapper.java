package com.jindumooc.dao;

import com.jindumooc.pojo.UserFortuneLog;
import com.jindumooc.pojo.UserFortuneLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFortuneLogMapper {
    int countByExample(UserFortuneLogExample example);

    int deleteByExample(UserFortuneLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserFortuneLog record);

    int insertSelective(UserFortuneLog record);

    List<UserFortuneLog> selectByExample(UserFortuneLogExample example);

    UserFortuneLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserFortuneLog record, @Param("example") UserFortuneLogExample example);

    int updateByExample(@Param("record") UserFortuneLog record, @Param("example") UserFortuneLogExample example);

    int updateByPrimaryKeySelective(UserFortuneLog record);

    int updateByPrimaryKey(UserFortuneLog record);
}