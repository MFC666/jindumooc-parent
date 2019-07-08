package com.jindumooc.dao;

import com.jindumooc.pojo.CourseTask8022Backup;
import com.jindumooc.pojo.CourseTask8022BackupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTask8022BackupMapper {
    int countByExample(CourseTask8022BackupExample example);

    int deleteByExample(CourseTask8022BackupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseTask8022Backup record);

    int insertSelective(CourseTask8022Backup record);

    List<CourseTask8022Backup> selectByExample(CourseTask8022BackupExample example);

    CourseTask8022Backup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseTask8022Backup record, @Param("example") CourseTask8022BackupExample example);

    int updateByExample(@Param("record") CourseTask8022Backup record, @Param("example") CourseTask8022BackupExample example);

    int updateByPrimaryKeySelective(CourseTask8022Backup record);

    int updateByPrimaryKey(CourseTask8022Backup record);
}