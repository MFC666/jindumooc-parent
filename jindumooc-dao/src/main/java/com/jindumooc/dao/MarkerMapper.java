package com.jindumooc.dao;

import com.jindumooc.pojo.Marker;
import com.jindumooc.pojo.MarkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkerMapper {
    int countByExample(MarkerExample example);

    int deleteByExample(MarkerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Marker record);

    int insertSelective(Marker record);

    List<Marker> selectByExample(MarkerExample example);

    Marker selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Marker record, @Param("example") MarkerExample example);

    int updateByExample(@Param("record") Marker record, @Param("example") MarkerExample example);

    int updateByPrimaryKeySelective(Marker record);

    int updateByPrimaryKey(Marker record);
}