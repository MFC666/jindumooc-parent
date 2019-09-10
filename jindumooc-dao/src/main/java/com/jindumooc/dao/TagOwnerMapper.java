package com.jindumooc.dao;

import com.jindumooc.pojo.TagOwner;
import com.jindumooc.pojo.TagOwnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagOwnerMapper {
    int countByExample(TagOwnerExample example);

    int deleteByExample(TagOwnerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagOwner record);

    int insertSelective(TagOwner record);

    List<TagOwner> selectByExample(TagOwnerExample example);

    TagOwner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagOwner record, @Param("example") TagOwnerExample example);

    int updateByExample(@Param("record") TagOwner record, @Param("example") TagOwnerExample example);

    int updateByPrimaryKeySelective(TagOwner record);

    int updateByPrimaryKey(TagOwner record);
}