package com.jindumooc.dao;

import com.jindumooc.pojo.QuestionCategory;
import com.jindumooc.pojo.QuestionCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionCategoryMapper {
    int countByExample(QuestionCategoryExample example);

    int deleteByExample(QuestionCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionCategory record);

    int insertSelective(QuestionCategory record);

    List<QuestionCategory> selectByExample(QuestionCategoryExample example);

    QuestionCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionCategory record, @Param("example") QuestionCategoryExample example);

    int updateByExample(@Param("record") QuestionCategory record, @Param("example") QuestionCategoryExample example);

    int updateByPrimaryKeySelective(QuestionCategory record);

    int updateByPrimaryKey(QuestionCategory record);
}