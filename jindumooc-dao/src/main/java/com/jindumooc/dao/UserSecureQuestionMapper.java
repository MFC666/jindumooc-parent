package com.jindumooc.dao;

import com.jindumooc.pojo.UserSecureQuestion;
import com.jindumooc.pojo.UserSecureQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSecureQuestionMapper {
    int countByExample(UserSecureQuestionExample example);

    int deleteByExample(UserSecureQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserSecureQuestion record);

    int insertSelective(UserSecureQuestion record);

    List<UserSecureQuestion> selectByExample(UserSecureQuestionExample example);

    UserSecureQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserSecureQuestion record, @Param("example") UserSecureQuestionExample example);

    int updateByExample(@Param("record") UserSecureQuestion record, @Param("example") UserSecureQuestionExample example);

    int updateByPrimaryKeySelective(UserSecureQuestion record);

    int updateByPrimaryKey(UserSecureQuestion record);
}