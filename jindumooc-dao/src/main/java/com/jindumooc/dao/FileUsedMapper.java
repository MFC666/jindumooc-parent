package com.jindumooc.dao;

import com.jindumooc.pojo.FileUsed;
import com.jindumooc.pojo.FileUsedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileUsedMapper {
    int countByExample(FileUsedExample example);

    int deleteByExample(FileUsedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FileUsed record);

    int insertSelective(FileUsed record);

    List<FileUsed> selectByExample(FileUsedExample example);

    FileUsed selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FileUsed record, @Param("example") FileUsedExample example);

    int updateByExample(@Param("record") FileUsed record, @Param("example") FileUsedExample example);

    int updateByPrimaryKeySelective(FileUsed record);

    int updateByPrimaryKey(FileUsed record);
}