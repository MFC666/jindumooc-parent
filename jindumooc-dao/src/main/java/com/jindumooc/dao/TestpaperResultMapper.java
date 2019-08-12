package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperResult;
import com.jindumooc.pojo.TestpaperResultExample;
import java.util.List;

import com.jindumooc.vojo.user.TestPaperResult;
import org.apache.ibatis.annotations.Param;

public interface TestpaperResultMapper {
    int countByExample(TestpaperResultExample example);

    int deleteByExample(TestpaperResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestpaperResult record);

    int insertSelective(TestpaperResult record);

    List<TestpaperResult> selectByExampleWithBLOBs(TestpaperResultExample example);

    List<TestpaperResult> selectByExample(TestpaperResultExample example);

    TestpaperResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestpaperResult record, @Param("example") TestpaperResultExample example);

    int updateByExampleWithBLOBs(@Param("record") TestpaperResult record, @Param("example") TestpaperResultExample example);

    int updateByExample(@Param("record") TestpaperResult record, @Param("example") TestpaperResultExample example);

    int updateByPrimaryKeySelective(TestpaperResult record);

    int updateByPrimaryKeyWithBLOBs(TestpaperResult record);

    int updateByPrimaryKey(TestpaperResult record);

    List<TestPaperResult> getTestPaperResult(@Param("teacherId") int teacherId,@Param("testPaperStatus") String testPaperStatus);

    List<TestPaperResult> getStudentTestPaper(@Param("userId") int userId,@Param("testPaperStatus") String testPaperStatus);
}