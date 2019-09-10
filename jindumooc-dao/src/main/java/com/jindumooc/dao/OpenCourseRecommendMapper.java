package com.jindumooc.dao;

import com.jindumooc.pojo.OpenCourseRecommend;
import com.jindumooc.pojo.OpenCourseRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenCourseRecommendMapper {
    int countByExample(OpenCourseRecommendExample example);

    int deleteByExample(OpenCourseRecommendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpenCourseRecommend record);

    int insertSelective(OpenCourseRecommend record);

    List<OpenCourseRecommend> selectByExample(OpenCourseRecommendExample example);

    OpenCourseRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpenCourseRecommend record, @Param("example") OpenCourseRecommendExample example);

    int updateByExample(@Param("record") OpenCourseRecommend record, @Param("example") OpenCourseRecommendExample example);

    int updateByPrimaryKeySelective(OpenCourseRecommend record);

    int updateByPrimaryKey(OpenCourseRecommend record);
}