package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityText;
import com.jindumooc.pojo.ActivityTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTextMapper {
    int countByExample(ActivityTextExample example);

    int deleteByExample(ActivityTextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityText record);

    int insertSelective(ActivityText record);

    List<ActivityText> selectByExample(ActivityTextExample example);

    ActivityText selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityText record, @Param("example") ActivityTextExample example);

    int updateByExample(@Param("record") ActivityText record, @Param("example") ActivityTextExample example);

    int updateByPrimaryKeySelective(ActivityText record);

    int updateByPrimaryKey(ActivityText record);
}