package com.jindumooc.dao;

import com.jindumooc.pojo.CourseSetV8;
import com.jindumooc.pojo.CourseSetV8Example;
import com.jindumooc.pojo.CourseSetV8WithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseSetV8Mapper {
    int countByExample(CourseSetV8Example example);

    int deleteByExample(CourseSetV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseSetV8WithBLOBs record);

    int insertSelective(CourseSetV8WithBLOBs record);

    List<CourseSetV8WithBLOBs> selectByExampleWithBLOBs(CourseSetV8Example example);

    List<CourseSetV8> selectByExample(CourseSetV8Example example);

    CourseSetV8WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseSetV8WithBLOBs record, @Param("example") CourseSetV8Example example);

    int updateByExampleWithBLOBs(@Param("record") CourseSetV8WithBLOBs record, @Param("example") CourseSetV8Example example);

    int updateByExample(@Param("record") CourseSetV8 record, @Param("example") CourseSetV8Example example);

    int updateByPrimaryKeySelective(CourseSetV8WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseSetV8WithBLOBs record);

    int updateByPrimaryKey(CourseSetV8 record);
}