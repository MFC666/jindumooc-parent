package com.jindumooc.dao;

import com.jindumooc.pojo.TagGroupTag;
import com.jindumooc.pojo.TagGroupTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagGroupTagMapper {
    int countByExample(TagGroupTagExample example);

    int deleteByExample(TagGroupTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagGroupTag record);

    int insertSelective(TagGroupTag record);

    List<TagGroupTag> selectByExample(TagGroupTagExample example);

    TagGroupTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagGroupTag record, @Param("example") TagGroupTagExample example);

    int updateByExample(@Param("record") TagGroupTag record, @Param("example") TagGroupTagExample example);

    int updateByPrimaryKeySelective(TagGroupTag record);

    int updateByPrimaryKey(TagGroupTag record);
}