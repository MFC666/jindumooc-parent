package com.jindumooc.dao;

import com.jindumooc.pojo.QuestionMarker;
import com.jindumooc.pojo.QuestionMarkerExample;
import com.jindumooc.pojo.QuestionMarkerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMarkerMapper {
    int countByExample(QuestionMarkerExample example);

    int deleteByExample(QuestionMarkerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuestionMarkerWithBLOBs record);

    int insertSelective(QuestionMarkerWithBLOBs record);

    List<QuestionMarkerWithBLOBs> selectByExampleWithBLOBs(QuestionMarkerExample example);

    List<QuestionMarker> selectByExample(QuestionMarkerExample example);

    QuestionMarkerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuestionMarkerWithBLOBs record, @Param("example") QuestionMarkerExample example);

    int updateByExampleWithBLOBs(@Param("record") QuestionMarkerWithBLOBs record, @Param("example") QuestionMarkerExample example);

    int updateByExample(@Param("record") QuestionMarker record, @Param("example") QuestionMarkerExample example);

    int updateByPrimaryKeySelective(QuestionMarkerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(QuestionMarkerWithBLOBs record);

    int updateByPrimaryKey(QuestionMarker record);
}