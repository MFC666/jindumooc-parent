package com.jindumooc.dao;

import com.jindumooc.pojo.QuestionAnalysis;
import com.jindumooc.pojo.QuestionAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionAnalysisMapper {
    int countByExample(QuestionAnalysisExample example);

    int deleteByExample(QuestionAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionAnalysis record);

    int insertSelective(QuestionAnalysis record);

    List<QuestionAnalysis> selectByExample(QuestionAnalysisExample example);

    QuestionAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionAnalysis record, @Param("example") QuestionAnalysisExample example);

    int updateByExample(@Param("record") QuestionAnalysis record, @Param("example") QuestionAnalysisExample example);

    int updateByPrimaryKeySelective(QuestionAnalysis record);

    int updateByPrimaryKey(QuestionAnalysis record);
}