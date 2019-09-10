package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperItemResultV8;
import com.jindumooc.pojo.TestpaperItemResultV8Example;
import com.jindumooc.pojo.TestpaperItemResultV8WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperItemResultV8Mapper {
    int countByExample(TestpaperItemResultV8Example example);

    int deleteByExample(TestpaperItemResultV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperItemResultV8WithBLOBs record);

    int insertSelective(TestpaperItemResultV8WithBLOBs record);

    List<TestpaperItemResultV8WithBLOBs> selectByExampleWithBLOBs(TestpaperItemResultV8Example example);

    List<TestpaperItemResultV8> selectByExample(TestpaperItemResultV8Example example);

    TestpaperItemResultV8WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperItemResultV8WithBLOBs record, @Param("example") TestpaperItemResultV8Example example);

    int updateByExampleWithBLOBs(@Param("record") TestpaperItemResultV8WithBLOBs record, @Param("example") TestpaperItemResultV8Example example);

    int updateByExample(@Param("record") TestpaperItemResultV8 record, @Param("example") TestpaperItemResultV8Example example);

    int updateByPrimaryKeySelective(TestpaperItemResultV8WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestpaperItemResultV8WithBLOBs record);

    int updateByPrimaryKey(TestpaperItemResultV8 record);
}