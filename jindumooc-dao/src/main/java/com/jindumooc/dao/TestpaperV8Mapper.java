package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperV8;
import com.jindumooc.pojo.TestpaperV8Example;
import com.jindumooc.pojo.TestpaperV8WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperV8Mapper {
    int countByExample(TestpaperV8Example example);

    int deleteByExample(TestpaperV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperV8WithBLOBs record);

    int insertSelective(TestpaperV8WithBLOBs record);

    List<TestpaperV8WithBLOBs> selectByExampleWithBLOBs(TestpaperV8Example example);

    List<TestpaperV8> selectByExample(TestpaperV8Example example);

    TestpaperV8WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperV8WithBLOBs record, @Param("example") TestpaperV8Example example);

    int updateByExampleWithBLOBs(@Param("record") TestpaperV8WithBLOBs record, @Param("example") TestpaperV8Example example);

    int updateByExample(@Param("record") TestpaperV8 record, @Param("example") TestpaperV8Example example);

    int updateByPrimaryKeySelective(TestpaperV8WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestpaperV8WithBLOBs record);

    int updateByPrimaryKey(TestpaperV8 record);
}