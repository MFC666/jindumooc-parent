package com.jindumooc.dao;

import com.jindumooc.pojo.UserPayAgreement;
import com.jindumooc.pojo.UserPayAgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPayAgreementMapper {
    int countByExample(UserPayAgreementExample example);

    int deleteByExample(UserPayAgreementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPayAgreement record);

    int insertSelective(UserPayAgreement record);

    List<UserPayAgreement> selectByExample(UserPayAgreementExample example);

    UserPayAgreement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPayAgreement record, @Param("example") UserPayAgreementExample example);

    int updateByExample(@Param("record") UserPayAgreement record, @Param("example") UserPayAgreementExample example);

    int updateByPrimaryKeySelective(UserPayAgreement record);

    int updateByPrimaryKey(UserPayAgreement record);
}