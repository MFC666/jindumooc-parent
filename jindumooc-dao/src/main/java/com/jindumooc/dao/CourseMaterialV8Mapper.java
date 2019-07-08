package com.jindumooc.dao;

import com.jindumooc.pojo.CourseMaterialV8;
import com.jindumooc.pojo.CourseMaterialV8Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseMaterialV8Mapper {
    int countByExample(CourseMaterialV8Example example);

    int deleteByExample(CourseMaterialV8Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseMaterialV8 record);

    int insertSelective(CourseMaterialV8 record);

    List<CourseMaterialV8> selectByExampleWithBLOBs(CourseMaterialV8Example example);

    List<CourseMaterialV8> selectByExample(CourseMaterialV8Example example);

    CourseMaterialV8 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseMaterialV8 record, @Param("example") CourseMaterialV8Example example);

    int updateByExampleWithBLOBs(@Param("record") CourseMaterialV8 record, @Param("example") CourseMaterialV8Example example);

    int updateByExample(@Param("record") CourseMaterialV8 record, @Param("example") CourseMaterialV8Example example);

    int updateByPrimaryKeySelective(CourseMaterialV8 record);

    int updateByPrimaryKeyWithBLOBs(CourseMaterialV8 record);

    int updateByPrimaryKey(CourseMaterialV8 record);
}