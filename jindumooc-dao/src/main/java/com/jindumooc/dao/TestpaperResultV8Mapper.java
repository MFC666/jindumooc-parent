package com.jindumooc.dao;

import com.jindumooc.pojo.TestpaperResultV8;
import com.jindumooc.pojo.TestpaperResultV8Example;
import com.jindumooc.pojo.TestpaperResultV8WithBLOBs;

import java.util.List;

import com.jindumooc.vojo.course.CourseTestScore;
import com.jindumooc.vojo.user.TestPaperDetail;
import com.jindumooc.vojo.user.TestPaperResult;
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

    List<TestPaperResult> getTestPaperResult(@Param("teacherId") int teacherId, @Param("testPaperStatus") String testPaperStatus);

    List<TestPaperResult> getStudentTestPaper(@Param("userId") int userId, @Param("testPaperStatus") String testPaperStatus);

    List<TestPaperDetail> getTestPaperDetail(@Param("testPaperId") int testPaperId, @Param("userId") int userId);

    /**
     * 得到已批阅数量
     *
     * @param id
     * @return
     */
    int getFinishedNum(Integer id);

    /**
     * 得到未批阅数量
     *
     * @param id
     * @return
     */
    int getCheckingNum(Integer id);

    /**
     * 得到未交数量
     *
     * @param id
     * @return
     */
    int getNotFinishedNum(Integer id);

    /**
     * 得到首次成绩
     *
     * @param id
     * @return
     */
    List<CourseTestScore> getFirstScore(Integer id);

    /**
     * 得到最好成绩
     *
     * @param id
     * @return
     */
    List<CourseTestScore> getBestScore(Integer id);
}