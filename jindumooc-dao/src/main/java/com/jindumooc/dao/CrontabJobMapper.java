package com.jindumooc.dao;

import com.jindumooc.pojo.CrontabJob;
import com.jindumooc.pojo.CrontabJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrontabJobMapper {
    int countByExample(CrontabJobExample example);

    int deleteByExample(CrontabJobExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrontabJob record);

    int insertSelective(CrontabJob record);

    List<CrontabJob> selectByExampleWithBLOBs(CrontabJobExample example);

    List<CrontabJob> selectByExample(CrontabJobExample example);

    CrontabJob selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrontabJob record, @Param("example") CrontabJobExample example);

    int updateByExampleWithBLOBs(@Param("record") CrontabJob record, @Param("example") CrontabJobExample example);

    int updateByExample(@Param("record") CrontabJob record, @Param("example") CrontabJobExample example);

    int updateByPrimaryKeySelective(CrontabJob record);

    int updateByPrimaryKeyWithBLOBs(CrontabJob record);

    int updateByPrimaryKey(CrontabJob record);
}