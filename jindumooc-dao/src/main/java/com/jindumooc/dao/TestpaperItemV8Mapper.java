package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperItemV8;
import com.jindumooc.pojo.TestpaperItemV8Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperItemV8Mapper {
    int countByExample(TestpaperItemV8Example example);

    int deleteByExample(TestpaperItemV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperItemV8 record);

    int insertSelective(TestpaperItemV8 record);

    List<TestpaperItemV8> selectByExample(TestpaperItemV8Example example);

    TestpaperItemV8 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperItemV8 record, @Param("example") TestpaperItemV8Example example);

    int updateByExample(@Param("record") TestpaperItemV8 record, @Param("example") TestpaperItemV8Example example);

    int updateByPrimaryKeySelective(TestpaperItemV8 record);

    int updateByPrimaryKey(TestpaperItemV8 record);
}