package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperItem;
import com.jindumooc.pojo.TestpaperItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperItemMapper {
    int countByExample(TestpaperItemExample example);

    int deleteByExample(TestpaperItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperItem record);

    int insertSelective(TestpaperItem record);

    List<TestpaperItem> selectByExample(TestpaperItemExample example);

    TestpaperItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperItem record, @Param("example") TestpaperItemExample example);

    int updateByExample(@Param("record") TestpaperItem record, @Param("example") TestpaperItemExample example);

    int updateByPrimaryKeySelective(TestpaperItem record);

    int updateByPrimaryKey(TestpaperItem record);
}