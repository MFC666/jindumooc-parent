package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityFlash;
import com.jindumooc.pojo.ActivityFlashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityFlashMapper {
    int countByExample(ActivityFlashExample example);

    int deleteByExample(ActivityFlashExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityFlash record);

    int insertSelective(ActivityFlash record);

    List<ActivityFlash> selectByExample(ActivityFlashExample example);

    ActivityFlash selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityFlash record, @Param("example") ActivityFlashExample example);

    int updateByExample(@Param("record") ActivityFlash record, @Param("example") ActivityFlashExample example);

    int updateByPrimaryKeySelective(ActivityFlash record);

    int updateByPrimaryKey(ActivityFlash record);
}