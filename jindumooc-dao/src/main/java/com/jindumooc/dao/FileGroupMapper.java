package com.jindumooc.dao;

import com.jindumooc.pojo.FileGroup;
import com.jindumooc.pojo.FileGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileGroupMapper {
    int countByExample(FileGroupExample example);

    int deleteByExample(FileGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileGroup record);

    int insertSelective(FileGroup record);

    List<FileGroup> selectByExample(FileGroupExample example);

    FileGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileGroup record, @Param("example") FileGroupExample example);

    int updateByExample(@Param("record") FileGroup record, @Param("example") FileGroupExample example);

    int updateByPrimaryKeySelective(FileGroup record);

    int updateByPrimaryKey(FileGroup record);
}