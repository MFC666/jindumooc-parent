package com.jindumooc.dao;

import com.jindumooc.pojo.DownloadFileRecord;
import com.jindumooc.pojo.DownloadFileRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownloadFileRecordMapper {
    int countByExample(DownloadFileRecordExample example);

    int deleteByExample(DownloadFileRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DownloadFileRecord record);

    int insertSelective(DownloadFileRecord record);

    List<DownloadFileRecord> selectByExample(DownloadFileRecordExample example);

    DownloadFileRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DownloadFileRecord record, @Param("example") DownloadFileRecordExample example);

    int updateByExample(@Param("record") DownloadFileRecord record, @Param("example") DownloadFileRecordExample example);

    int updateByPrimaryKeySelective(DownloadFileRecord record);

    int updateByPrimaryKey(DownloadFileRecord record);
}