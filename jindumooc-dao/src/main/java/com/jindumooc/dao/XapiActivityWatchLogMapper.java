package com.jindumooc.dao;

import com.jindumooc.pojo.XapiActivityWatchLog;
import com.jindumooc.pojo.XapiActivityWatchLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XapiActivityWatchLogMapper {
    int countByExample(XapiActivityWatchLogExample example);

    int deleteByExample(XapiActivityWatchLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XapiActivityWatchLog record);

    int insertSelective(XapiActivityWatchLog record);

    List<XapiActivityWatchLog> selectByExample(XapiActivityWatchLogExample example);

    XapiActivityWatchLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XapiActivityWatchLog record, @Param("example") XapiActivityWatchLogExample example);

    int updateByExample(@Param("record") XapiActivityWatchLog record, @Param("example") XapiActivityWatchLogExample example);

    int updateByPrimaryKeySelective(XapiActivityWatchLog record);

    int updateByPrimaryKey(XapiActivityWatchLog record);
}