package com.jindumooc.dao;

import com.jindumooc.pojo.SignCard;
import com.jindumooc.pojo.SignCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignCardMapper {
    int countByExample(SignCardExample example);

    int deleteByExample(SignCardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SignCard record);

    int insertSelective(SignCard record);

    List<SignCard> selectByExample(SignCardExample example);

    SignCard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SignCard record, @Param("example") SignCardExample example);

    int updateByExample(@Param("record") SignCard record, @Param("example") SignCardExample example);

    int updateByPrimaryKeySelective(SignCard record);

    int updateByPrimaryKey(SignCard record);
}