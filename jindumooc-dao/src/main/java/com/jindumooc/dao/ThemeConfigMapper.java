package com.jindumooc.dao;

import com.jindumooc.pojo.ThemeConfig;
import com.jindumooc.pojo.ThemeConfigExample;
import com.jindumooc.pojo.ThemeConfigWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeConfigMapper {
    int countByExample(ThemeConfigExample example);

    int deleteByExample(ThemeConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThemeConfigWithBLOBs record);

    int insertSelective(ThemeConfigWithBLOBs record);

    List<ThemeConfigWithBLOBs> selectByExampleWithBLOBs(ThemeConfigExample example);

    List<ThemeConfig> selectByExample(ThemeConfigExample example);

    ThemeConfigWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThemeConfigWithBLOBs record, @Param("example") ThemeConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") ThemeConfigWithBLOBs record, @Param("example") ThemeConfigExample example);

    int updateByExample(@Param("record") ThemeConfig record, @Param("example") ThemeConfigExample example);

    int updateByPrimaryKeySelective(ThemeConfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ThemeConfigWithBLOBs record);

    int updateByPrimaryKey(ThemeConfig record);
}