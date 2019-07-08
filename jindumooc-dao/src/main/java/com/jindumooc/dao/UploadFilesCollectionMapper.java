package com.jindumooc.dao;

import com.jindumooc.pojo.UploadFilesCollection;
import com.jindumooc.pojo.UploadFilesCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadFilesCollectionMapper {
    int countByExample(UploadFilesCollectionExample example);

    int deleteByExample(UploadFilesCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFilesCollection record);

    int insertSelective(UploadFilesCollection record);

    List<UploadFilesCollection> selectByExample(UploadFilesCollectionExample example);

    UploadFilesCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFilesCollection record, @Param("example") UploadFilesCollectionExample example);

    int updateByExample(@Param("record") UploadFilesCollection record, @Param("example") UploadFilesCollectionExample example);

    int updateByPrimaryKeySelective(UploadFilesCollection record);

    int updateByPrimaryKey(UploadFilesCollection record);
}