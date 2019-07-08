package com.jindumooc.dao;

import com.jindumooc.pojo.TagGroup;
import com.jindumooc.pojo.TagGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagGroupMapper {
    int countByExample(TagGroupExample example);

    int deleteByExample(TagGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagGroup record);

    int insertSelective(TagGroup record);

    List<TagGroup> selectByExample(TagGroupExample example);

    TagGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagGroup record, @Param("example") TagGroupExample example);

    int updateByExample(@Param("record") TagGroup record, @Param("example") TagGroupExample example);

    int updateByPrimaryKeySelective(TagGroup record);

    int updateByPrimaryKey(TagGroup record);
}