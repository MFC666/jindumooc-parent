package com.jindumooc.dao;

import com.jindumooc.pojo.QuestionFavorite;
import com.jindumooc.pojo.QuestionFavoriteExample;
import java.util.List;

import com.jindumooc.vojo.user.QuestionMessage;
import org.apache.ibatis.annotations.Param;

public interface QuestionFavoriteMapper {
    int countByExample(QuestionFavoriteExample example);

    int deleteByExample(QuestionFavoriteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionFavorite record);

    int insertSelective(QuestionFavorite record);

    List<QuestionFavorite> selectByExample(QuestionFavoriteExample example);

    QuestionFavorite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionFavorite record, @Param("example") QuestionFavoriteExample example);

    int updateByExample(@Param("record") QuestionFavorite record, @Param("example") QuestionFavoriteExample example);

    int updateByPrimaryKeySelective(QuestionFavorite record);

    int updateByPrimaryKey(QuestionFavorite record);

    List<QuestionMessage> getFavoriteQuestion(@Param("userId") int userId);

    QuestionMessage getQuestionDetail(@Param("questionId") int questionId);
}