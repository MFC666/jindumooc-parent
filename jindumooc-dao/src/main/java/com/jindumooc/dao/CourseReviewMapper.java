package com.jindumooc.dao;

import com.jindumooc.pojo.CourseReview;
import com.jindumooc.pojo.CourseReviewExample;
import com.jindumooc.pojo.CourseReviewWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseReviewMapper {
    int countByExample(CourseReviewExample example);

    int deleteByExample(CourseReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseReviewWithBLOBs record);

    int insertSelective(CourseReviewWithBLOBs record);

    List<CourseReviewWithBLOBs> selectByExampleWithBLOBs(CourseReviewExample example);

    List<CourseReview> selectByExample(CourseReviewExample example);

    CourseReviewWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseReviewWithBLOBs record, @Param("example") CourseReviewExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseReviewWithBLOBs record, @Param("example") CourseReviewExample example);

    int updateByExample(@Param("record") CourseReview record, @Param("example") CourseReviewExample example);

    int updateByPrimaryKeySelective(CourseReviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseReviewWithBLOBs record);

    int updateByPrimaryKey(CourseReview record);
}