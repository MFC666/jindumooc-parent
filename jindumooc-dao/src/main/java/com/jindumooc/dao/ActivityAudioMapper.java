package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityAudio;
import com.jindumooc.pojo.ActivityAudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityAudioMapper {
    int countByExample(ActivityAudioExample example);

    int deleteByExample(ActivityAudioExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityAudio record);

    int insertSelective(ActivityAudio record);

    List<ActivityAudio> selectByExample(ActivityAudioExample example);

    ActivityAudio selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityAudio record, @Param("example") ActivityAudioExample example);

    int updateByExample(@Param("record") ActivityAudio record, @Param("example") ActivityAudioExample example);

    int updateByPrimaryKeySelective(ActivityAudio record);

    int updateByPrimaryKey(ActivityAudio record);
}