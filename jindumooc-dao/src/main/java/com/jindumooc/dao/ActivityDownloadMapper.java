package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityDownload;
import com.jindumooc.pojo.ActivityDownloadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityDownloadMapper {
    int countByExample(ActivityDownloadExample example);

    int deleteByExample(ActivityDownloadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityDownload record);

    int insertSelective(ActivityDownload record);

    List<ActivityDownload> selectByExample(ActivityDownloadExample example);

    ActivityDownload selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityDownload record, @Param("example") ActivityDownloadExample example);

    int updateByExample(@Param("record") ActivityDownload record, @Param("example") ActivityDownloadExample example);

    int updateByPrimaryKeySelective(ActivityDownload record);

    int updateByPrimaryKey(ActivityDownload record);
}