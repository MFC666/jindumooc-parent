package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperItemResult;
import com.jindumooc.pojo.TestpaperItemResultExample;
import com.jindumooc.pojo.TestpaperItemResultWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperItemResultMapper {
    int countByExample(TestpaperItemResultExample example);

    int deleteByExample(TestpaperItemResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperItemResultWithBLOBs record);

    int insertSelective(TestpaperItemResultWithBLOBs record);

    List<TestpaperItemResultWithBLOBs> selectByExampleWithBLOBs(TestpaperItemResultExample example);

    List<TestpaperItemResult> selectByExample(TestpaperItemResultExample example);

    TestpaperItemResultWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperItemResultWithBLOBs record, @Param("example") TestpaperItemResultExample example);

    int updateByExampleWithBLOBs(@Param("record") TestpaperItemResultWithBLOBs record, @Param("example") TestpaperItemResultExample example);

    int updateByExample(@Param("record") TestpaperItemResult record, @Param("example") TestpaperItemResultExample example);

    int updateByPrimaryKeySelective(TestpaperItemResultWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestpaperItemResultWithBLOBs record);

    int updateByPrimaryKey(TestpaperItemResult record);
}