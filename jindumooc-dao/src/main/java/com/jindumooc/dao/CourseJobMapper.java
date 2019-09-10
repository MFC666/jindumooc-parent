package com.jindumooc.dao;

import com.jindumooc.pojo.CourseJob;
import com.jindumooc.pojo.CourseJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseJobMapper {
    int countByExample(CourseJobExample example);

    int deleteByExample(CourseJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseJob record);

    int insertSelective(CourseJob record);

    List<CourseJob> selectByExampleWithBLOBs(CourseJobExample example);

    List<CourseJob> selectByExample(CourseJobExample example);

    CourseJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseJob record, @Param("example") CourseJobExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseJob record, @Param("example") CourseJobExample example);

    int updateByExample(@Param("record") CourseJob record, @Param("example") CourseJobExample example);

    int updateByPrimaryKeySelective(CourseJob record);

    int updateByPrimaryKeyWithBLOBs(CourseJob record);

    int updateByPrimaryKey(CourseJob record);
}