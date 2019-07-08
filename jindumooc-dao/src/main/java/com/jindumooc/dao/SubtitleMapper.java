package com.jindumooc.dao;

import com.jindumooc.pojo.Subtitle;
import com.jindumooc.pojo.SubtitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubtitleMapper {
    int countByExample(SubtitleExample example);

    int deleteByExample(SubtitleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Subtitle record);

    int insertSelective(Subtitle record);

    List<Subtitle> selectByExample(SubtitleExample example);

    Subtitle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Subtitle record, @Param("example") SubtitleExample example);

    int updateByExample(@Param("record") Subtitle record, @Param("example") SubtitleExample example);

    int updateByPrimaryKeySelective(Subtitle record);

    int updateByPrimaryKey(Subtitle record);
}