package com.jindumooc.dao;

import com.jindumooc.pojo.UserField;
import com.jindumooc.pojo.UserFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFieldMapper {
    int countByExample(UserFieldExample example);

    int deleteByExample(UserFieldExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserField record);

    int insertSelective(UserField record);

    List<UserField> selectByExample(UserFieldExample example);

    UserField selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserField record, @Param("example") UserFieldExample example);

    int updateByExample(@Param("record") UserField record, @Param("example") UserFieldExample example);

    int updateByPrimaryKeySelective(UserField record);

    int updateByPrimaryKey(UserField record);
}