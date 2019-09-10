package com.jindumooc.dao;

import com.jindumooc.pojo.Shortcut;
import com.jindumooc.pojo.ShortcutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShortcutMapper {
    int countByExample(ShortcutExample example);

    int deleteByExample(ShortcutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shortcut record);

    int insertSelective(Shortcut record);

    List<Shortcut> selectByExample(ShortcutExample example);

    Shortcut selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shortcut record, @Param("example") ShortcutExample example);

    int updateByExample(@Param("record") Shortcut record, @Param("example") ShortcutExample example);

    int updateByPrimaryKeySelective(Shortcut record);

    int updateByPrimaryKey(Shortcut record);
}