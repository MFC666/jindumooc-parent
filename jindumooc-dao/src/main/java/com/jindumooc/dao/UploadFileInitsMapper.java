package com.jindumooc.dao;

import com.jindumooc.pojo.UploadFileInits;
import com.jindumooc.pojo.UploadFileInitsExample;
import com.jindumooc.pojo.UploadFileInitsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFileInitsMapper {
    int countByExample(UploadFileInitsExample example);

    int deleteByExample(UploadFileInitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFileInitsWithBLOBs record);

    int insertSelective(UploadFileInitsWithBLOBs record);

    List<UploadFileInitsWithBLOBs> selectByExampleWithBLOBs(UploadFileInitsExample example);

    List<UploadFileInits> selectByExample(UploadFileInitsExample example);

    UploadFileInitsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFileInitsWithBLOBs record, @Param("example") UploadFileInitsExample example);

    int updateByExampleWithBLOBs(@Param("record") UploadFileInitsWithBLOBs record, @Param("example") UploadFileInitsExample example);

    int updateByExample(@Param("record") UploadFileInits record, @Param("example") UploadFileInitsExample example);

    int updateByPrimaryKeySelective(UploadFileInitsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UploadFileInitsWithBLOBs record);

    int updateByPrimaryKey(UploadFileInits record);
}