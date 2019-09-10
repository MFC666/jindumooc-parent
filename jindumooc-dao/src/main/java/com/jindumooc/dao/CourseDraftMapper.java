package com.jindumooc.dao;

import com.jindumooc.pojo.CourseDraft;
import com.jindumooc.pojo.CourseDraftExample;
import com.jindumooc.pojo.CourseDraftWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseDraftMapper {
    int countByExample(CourseDraftExample example);

    int deleteByExample(CourseDraftExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseDraftWithBLOBs record);

    int insertSelective(CourseDraftWithBLOBs record);

    List<CourseDraftWithBLOBs> selectByExampleWithBLOBs(CourseDraftExample example);

    List<CourseDraft> selectByExample(CourseDraftExample example);

    CourseDraftWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseDraftWithBLOBs record, @Param("example") CourseDraftExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseDraftWithBLOBs record, @Param("example") CourseDraftExample example);

    int updateByExample(@Param("record") CourseDraft record, @Param("example") CourseDraftExample example);

    int updateByPrimaryKeySelective(CourseDraftWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseDraftWithBLOBs record);

    int updateByPrimaryKey(CourseDraft record);
}