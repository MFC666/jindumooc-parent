package com.jindumooc.dao;

import com.jindumooc.pojo.UploadFilesShareHistory;
import com.jindumooc.pojo.UploadFilesShareHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFilesShareHistoryMapper {
    int countByExample(UploadFilesShareHistoryExample example);

    int deleteByExample(UploadFilesShareHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFilesShareHistory record);

    int insertSelective(UploadFilesShareHistory record);

    List<UploadFilesShareHistory> selectByExample(UploadFilesShareHistoryExample example);

    UploadFilesShareHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFilesShareHistory record, @Param("example") UploadFilesShareHistoryExample example);

    int updateByExample(@Param("record") UploadFilesShareHistory record, @Param("example") UploadFilesShareHistoryExample example);

    int updateByPrimaryKeySelective(UploadFilesShareHistory record);

    int updateByPrimaryKey(UploadFilesShareHistory record);
}