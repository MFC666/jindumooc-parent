package com.jindumooc.dao;

import com.jindumooc.pojo.XapiStatementArchive;
import com.jindumooc.pojo.XapiStatementArchiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XapiStatementArchiveMapper {
    int countByExample(XapiStatementArchiveExample example);

    int deleteByExample(XapiStatementArchiveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XapiStatementArchive record);

    int insertSelective(XapiStatementArchive record);

    List<XapiStatementArchive> selectByExampleWithBLOBs(XapiStatementArchiveExample example);

    List<XapiStatementArchive> selectByExample(XapiStatementArchiveExample example);

    XapiStatementArchive selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XapiStatementArchive record, @Param("example") XapiStatementArchiveExample example);

    int updateByExampleWithBLOBs(@Param("record") XapiStatementArchive record, @Param("example") XapiStatementArchiveExample example);

    int updateByExample(@Param("record") XapiStatementArchive record, @Param("example") XapiStatementArchiveExample example);

    int updateByPrimaryKeySelective(XapiStatementArchive record);

    int updateByPrimaryKeyWithBLOBs(XapiStatementArchive record);

    int updateByPrimaryKey(XapiStatementArchive record);
}