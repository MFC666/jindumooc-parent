package com.jindumooc.dao;

import com.jindumooc.pojo.BatchNotification;
import com.jindumooc.pojo.BatchNotificationExample;
import com.jindumooc.pojo.BatchNotificationWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BatchNotificationMapper {
    int countByExample(BatchNotificationExample example);

    int deleteByExample(BatchNotificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BatchNotificationWithBLOBs record);

    int insertSelective(BatchNotificationWithBLOBs record);

    List<BatchNotificationWithBLOBs> selectByExampleWithBLOBs(BatchNotificationExample example);

    List<BatchNotification> selectByExample(BatchNotificationExample example);

    BatchNotificationWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BatchNotificationWithBLOBs record, @Param("example") BatchNotificationExample example);

    int updateByExampleWithBLOBs(@Param("record") BatchNotificationWithBLOBs record, @Param("example") BatchNotificationExample example);

    int updateByExample(@Param("record") BatchNotification record, @Param("example") BatchNotificationExample example);

    int updateByPrimaryKeySelective(BatchNotificationWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BatchNotificationWithBLOBs record);

    int updateByPrimaryKey(BatchNotification record);
}