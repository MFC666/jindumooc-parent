package com.jindumooc.dao;

import com.jindumooc.pojo.UploadFilesShare;
import com.jindumooc.pojo.UploadFilesShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFilesShareMapper {
    int countByExample(UploadFilesShareExample example);

    int deleteByExample(UploadFilesShareExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFilesShare record);

    int insertSelective(UploadFilesShare record);

    List<UploadFilesShare> selectByExample(UploadFilesShareExample example);

    UploadFilesShare selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFilesShare record, @Param("example") UploadFilesShareExample example);

    int updateByExample(@Param("record") UploadFilesShare record, @Param("example") UploadFilesShareExample example);

    int updateByPrimaryKeySelective(UploadFilesShare record);

    int updateByPrimaryKey(UploadFilesShare record);
}