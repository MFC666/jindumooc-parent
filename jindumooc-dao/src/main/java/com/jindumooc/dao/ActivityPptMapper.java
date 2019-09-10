package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityPpt;
import com.jindumooc.pojo.ActivityPptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityPptMapper {
    int countByExample(ActivityPptExample example);

    int deleteByExample(ActivityPptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityPpt record);

    int insertSelective(ActivityPpt record);

    List<ActivityPpt> selectByExample(ActivityPptExample example);

    ActivityPpt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityPpt record, @Param("example") ActivityPptExample example);

    int updateByExample(@Param("record") ActivityPpt record, @Param("example") ActivityPptExample example);

    int updateByPrimaryKeySelective(ActivityPpt record);

    int updateByPrimaryKey(ActivityPpt record);
}