package com.jindumooc.dao;

import com.jindumooc.pojo.ActivityTestpaper;
import com.jindumooc.pojo.ActivityTestpaperExample;
import com.jindumooc.pojo.ActivityTestpaperWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityTestpaperMapper {
    int countByExample(ActivityTestpaperExample example);

    int deleteByExample(ActivityTestpaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ActivityTestpaperWithBLOBs record);

    int insertSelective(ActivityTestpaperWithBLOBs record);

    List<ActivityTestpaperWithBLOBs> selectByExampleWithBLOBs(ActivityTestpaperExample example);

    List<ActivityTestpaper> selectByExample(ActivityTestpaperExample example);

    ActivityTestpaperWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ActivityTestpaperWithBLOBs record, @Param("example") ActivityTestpaperExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityTestpaperWithBLOBs record, @Param("example") ActivityTestpaperExample example);

    int updateByExample(@Param("record") ActivityTestpaper record, @Param("example") ActivityTestpaperExample example);

    int updateByPrimaryKeySelective(ActivityTestpaperWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityTestpaperWithBLOBs record);

    int updateByPrimaryKey(ActivityTestpaper record);
}