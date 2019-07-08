package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperResultV8;
import com.jindumooc.pojo.TestpaperResultV8Example;
import com.jindumooc.pojo.TestpaperResultV8WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperResultV8Mapper {
    int countByExample(TestpaperResultV8Example example);

    int deleteByExample(TestpaperResultV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperResultV8WithBLOBs record);

    int insertSelective(TestpaperResultV8WithBLOBs record);

    List<TestpaperResultV8WithBLOBs> selectByExampleWithBLOBs(TestpaperResultV8Example example);

    List<TestpaperResultV8> selectByExample(TestpaperResultV8Example example);

    TestpaperResultV8WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperResultV8WithBLOBs record, @Param("example") TestpaperResultV8Example example);

    int updateByExampleWithBLOBs(@Param("record") TestpaperResultV8WithBLOBs record, @Param("example") TestpaperResultV8Example example);

    int updateByExample(@Param("record") TestpaperResultV8 record, @Param("example") TestpaperResultV8Example example);

    int updateByPrimaryKeySelective(TestpaperResultV8WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestpaperResultV8WithBLOBs record);

    int updateByPrimaryKey(TestpaperResultV8 record);
}