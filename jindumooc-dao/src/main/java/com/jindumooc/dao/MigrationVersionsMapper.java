package com.jindumooc.dao;

import com.jindumooc.pojo.MigrationVersions;
import com.jindumooc.pojo.MigrationVersionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MigrationVersionsMapper {
    int countByExample(MigrationVersionsExample example);

    int deleteByExample(MigrationVersionsExample example);

    int deleteByPrimaryKey(String version);

    int insert(MigrationVersions record);

    int insertSelective(MigrationVersions record);

    List<MigrationVersions> selectByExample(MigrationVersionsExample example);

    int updateByExampleSelective(@Param("record") MigrationVersions record, @Param("example") MigrationVersionsExample example);

    int updateByExample(@Param("record") MigrationVersions record, @Param("example") MigrationVersionsExample example);
}