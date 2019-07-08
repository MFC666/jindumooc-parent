package com.jindumooc.dao;

import com.jindumooc.pojo.RefererLog;
import com.jindumooc.pojo.RefererLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefererLogMapper {
    int countByExample(RefererLogExample example);

    int deleteByExample(RefererLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RefererLog record);

    int insertSelective(RefererLog record);

    List<RefererLog> selectByExampleWithBLOBs(RefererLogExample example);

    List<RefererLog> selectByExample(RefererLogExample example);

    RefererLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RefererLog record, @Param("example") RefererLogExample example);

    int updateByExampleWithBLOBs(@Param("record") RefererLog record, @Param("example") RefererLogExample example);

    int updateByExample(@Param("record") RefererLog record, @Param("example") RefererLogExample example);

    int updateByPrimaryKeySelective(RefererLog record);

    int updateByPrimaryKeyWithBLOBs(RefererLog record);

    int updateByPrimaryKey(RefererLog record);
}