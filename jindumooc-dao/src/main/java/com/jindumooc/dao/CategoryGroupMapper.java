package com.jindumooc.dao;

import com.jindumooc.pojo.CategoryGroup;
import com.jindumooc.pojo.CategoryGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryGroupMapper {
    int countByExample(CategoryGroupExample example);

    int deleteByExample(CategoryGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CategoryGroup record);

    int insertSelective(CategoryGroup record);

    List<CategoryGroup> selectByExample(CategoryGroupExample example);

    CategoryGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CategoryGroup record, @Param("example") CategoryGroupExample example);

    int updateByExample(@Param("record") CategoryGroup record, @Param("example") CategoryGroupExample example);

    int updateByPrimaryKeySelective(CategoryGroup record);

    int updateByPrimaryKey(CategoryGroup record);
}