package com.jindumooc.dao;

import com.jindumooc.pojo.XapiStatement;
import com.jindumooc.pojo.XapiStatementExample;
import com.jindumooc.pojo.XapiStatementWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XapiStatementMapper {
    int countByExample(XapiStatementExample example);

    int deleteByExample(XapiStatementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XapiStatementWithBLOBs record);

    int insertSelective(XapiStatementWithBLOBs record);

    List<XapiStatementWithBLOBs> selectByExampleWithBLOBs(XapiStatementExample example);

    List<XapiStatement> selectByExample(XapiStatementExample example);

    XapiStatementWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XapiStatementWithBLOBs record, @Param("example") XapiStatementExample example);

    int updateByExampleWithBLOBs(@Param("record") XapiStatementWithBLOBs record, @Param("example") XapiStatementExample example);

    int updateByExample(@Param("record") XapiStatement record, @Param("example") XapiStatementExample example);

    int updateByPrimaryKeySelective(XapiStatementWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(XapiStatementWithBLOBs record);

    int updateByPrimaryKey(XapiStatement record);
}