package com.jindumooc.dao;

import com.jindumooc.pojo.UploadFilesTag;
import com.jindumooc.pojo.UploadFilesTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFilesTagMapper {
    int countByExample(UploadFilesTagExample example);

    int deleteByExample(UploadFilesTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFilesTag record);

    int insertSelective(UploadFilesTag record);

    List<UploadFilesTag> selectByExample(UploadFilesTagExample example);

    UploadFilesTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFilesTag record, @Param("example") UploadFilesTagExample example);

    int updateByExample(@Param("record") UploadFilesTag record, @Param("example") UploadFilesTagExample example);

    int updateByPrimaryKeySelective(UploadFilesTag record);

    int updateByPrimaryKey(UploadFilesTag record);
}