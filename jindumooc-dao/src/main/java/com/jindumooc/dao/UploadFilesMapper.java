package com.jindumooc.dao;

import com.jindumooc.pojo.UploadFiles;
import com.jindumooc.pojo.UploadFilesExample;
import com.jindumooc.pojo.UploadFilesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFilesMapper {
    int countByExample(UploadFilesExample example);

    int deleteByExample(UploadFilesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFilesWithBLOBs record);

    int insertSelective(UploadFilesWithBLOBs record);

    List<UploadFilesWithBLOBs> selectByExampleWithBLOBs(UploadFilesExample example);

    List<UploadFiles> selectByExample(UploadFilesExample example);

    UploadFilesWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFilesWithBLOBs record, @Param("example") UploadFilesExample example);

    int updateByExampleWithBLOBs(@Param("record") UploadFilesWithBLOBs record, @Param("example") UploadFilesExample example);

    int updateByExample(@Param("record") UploadFiles record, @Param("example") UploadFilesExample example);

    int updateByPrimaryKeySelective(UploadFilesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UploadFilesWithBLOBs record);

    int updateByPrimaryKey(UploadFiles record);
}