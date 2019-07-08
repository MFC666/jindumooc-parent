package com.jindumooc.dao;

import com.jindumooc.pojo.UpgradeLogs;
import com.jindumooc.pojo.UpgradeLogsExample;
import com.jindumooc.pojo.UpgradeLogsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpgradeLogsMapper {
    int countByExample(UpgradeLogsExample example);

    int deleteByExample(UpgradeLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpgradeLogsWithBLOBs record);

    int insertSelective(UpgradeLogsWithBLOBs record);

    List<UpgradeLogsWithBLOBs> selectByExampleWithBLOBs(UpgradeLogsExample example);

    List<UpgradeLogs> selectByExample(UpgradeLogsExample example);

    UpgradeLogsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpgradeLogsWithBLOBs record, @Param("example") UpgradeLogsExample example);

    int updateByExampleWithBLOBs(@Param("record") UpgradeLogsWithBLOBs record, @Param("example") UpgradeLogsExample example);

    int updateByExample(@Param("record") UpgradeLogs record, @Param("example") UpgradeLogsExample example);

    int updateByPrimaryKeySelective(UpgradeLogsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UpgradeLogsWithBLOBs record);

    int updateByPrimaryKey(UpgradeLogs record);
}