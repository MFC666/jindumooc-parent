package com.jindumooc.dao;

import com.jindumooc.pojo.UpgradeNotice;
import com.jindumooc.pojo.UpgradeNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpgradeNoticeMapper {
    int countByExample(UpgradeNoticeExample example);

    int deleteByExample(UpgradeNoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpgradeNotice record);

    int insertSelective(UpgradeNotice record);

    List<UpgradeNotice> selectByExample(UpgradeNoticeExample example);

    UpgradeNotice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpgradeNotice record, @Param("example") UpgradeNoticeExample example);

    int updateByExample(@Param("record") UpgradeNotice record, @Param("example") UpgradeNoticeExample example);

    int updateByPrimaryKeySelective(UpgradeNotice record);

    int updateByPrimaryKey(UpgradeNotice record);
}