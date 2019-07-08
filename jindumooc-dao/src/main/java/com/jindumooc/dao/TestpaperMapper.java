package com.jindumooc.dao;

import com.jindumooc.pojo.Testpaper;
import com.jindumooc.pojo.TestpaperExample;
import com.jindumooc.pojo.TestpaperWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestpaperMapper {
    int countByExample(TestpaperExample example);

    int deleteByExample(TestpaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperWithBLOBs record);

    int insertSelective(TestpaperWithBLOBs record);

    List<TestpaperWithBLOBs> selectByExampleWithBLOBs(TestpaperExample example);

    List<Testpaper> selectByExample(TestpaperExample example);

    TestpaperWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperWithBLOBs record, @Param("example") TestpaperExample example);

    int updateByExampleWithBLOBs(@Param("record") TestpaperWithBLOBs record, @Param("example") TestpaperExample example);

    int updateByExample(@Param("record") Testpaper record, @Param("example") TestpaperExample example);

    int updateByPrimaryKeySelective(TestpaperWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestpaperWithBLOBs record);

    int updateByPrimaryKey(Testpaper record);
}