package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityDoc;
import com.jindumooc.pojo.ActivityDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityDocMapper {
    int countByExample(ActivityDocExample example);

    int deleteByExample(ActivityDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDoc record);

    int insertSelective(ActivityDoc record);

    List<ActivityDoc> selectByExample(ActivityDocExample example);

    ActivityDoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDoc record, @Param("example") ActivityDocExample example);

    int updateByExample(@Param("record") ActivityDoc record, @Param("example") ActivityDocExample example);

    int updateByPrimaryKeySelective(ActivityDoc record);

    int updateByPrimaryKey(ActivityDoc record);
}