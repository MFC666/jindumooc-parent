package com.jindumooc.dao;

import com.jindumooc.pojo.Question;
import com.jindumooc.pojo.QuestionExample;
import com.jindumooc.pojo.QuestionWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    int countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionWithBLOBs record);

    int insertSelective(QuestionWithBLOBs record);

    List<QuestionWithBLOBs> selectByExampleWithBLOBs(QuestionExample example);

    List<Question> selectByExample(QuestionExample example);

    QuestionWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionWithBLOBs record, @Param("example") QuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionWithBLOBs record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByPrimaryKeySelective(QuestionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionWithBLOBs record);

    int updateByPrimaryKey(Question record);
}