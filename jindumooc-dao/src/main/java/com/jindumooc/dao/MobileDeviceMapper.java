package com.jindumooc.dao;

import com.jindumooc.pojo.MobileDevice;
import com.jindumooc.pojo.MobileDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileDeviceMapper {
    int countByExample(MobileDeviceExample example);

    int deleteByExample(MobileDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MobileDevice record);

    int insertSelective(MobileDevice record);

    List<MobileDevice> selectByExample(MobileDeviceExample example);

    MobileDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MobileDevice record, @Param("example") MobileDeviceExample example);

    int updateByExample(@Param("record") MobileDevice record, @Param("example") MobileDeviceExample example);

    int updateByPrimaryKeySelective(MobileDevice record);

    int updateByPrimaryKey(MobileDevice record);
}