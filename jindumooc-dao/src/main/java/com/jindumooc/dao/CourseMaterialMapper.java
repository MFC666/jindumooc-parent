package com.jindumooc.dao;

import com.jindumooc.pojo.CourseMaterial;
import com.jindumooc.pojo.CourseMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMaterialMapper {
    int countByExample(CourseMaterialExample example);

    int deleteByExample(CourseMaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseMaterial record);

    int insertSelective(CourseMaterial record);

    List<CourseMaterial> selectByExampleWithBLOBs(CourseMaterialExample example);

    List<CourseMaterial> selectByExample(CourseMaterialExample example);

    CourseMaterial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseMaterial record, @Param("example") CourseMaterialExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseMaterial record, @Param("example") CourseMaterialExample example);

    int updateByExample(@Param("record") CourseMaterial record, @Param("example") CourseMaterialExample example);

    int updateByPrimaryKeySelective(CourseMaterial record);

    int updateByPrimaryKeyWithBLOBs(CourseMaterial record);

    int updateByPrimaryKey(CourseMaterial record);
}