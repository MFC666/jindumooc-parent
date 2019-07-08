package com.jindumooc.dao;

import com.jindumooc.pojo.SignUserLog;
import com.jindumooc.pojo.SignUserLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignUserLogMapper {
    int countByExample(SignUserLogExample example);

    int deleteByExample(SignUserLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignUserLog record);

    int insertSelective(SignUserLog record);

    List<SignUserLog> selectByExample(SignUserLogExample example);

    SignUserLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignUserLog record, @Param("example") SignUserLogExample example);

    int updateByExample(@Param("record") SignUserLog record, @Param("example") SignUserLogExample example);

    int updateByPrimaryKeySelective(SignUserLog record);

    int updateByPrimaryKey(SignUserLog record);
}