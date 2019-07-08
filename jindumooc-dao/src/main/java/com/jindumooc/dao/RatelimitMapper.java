package com.jindumooc.dao;

import com.jindumooc.pojo.Ratelimit;
import com.jindumooc.pojo.RatelimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RatelimitMapper {
    int countByExample(RatelimitExample example);

    int deleteByExample(RatelimitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ratelimit record);

    int insertSelective(Ratelimit record);

    List<Ratelimit> selectByExample(RatelimitExample example);

    Ratelimit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ratelimit record, @Param("example") RatelimitExample example);

    int updateByExample(@Param("record") Ratelimit record, @Param("example") RatelimitExample example);

    int updateByPrimaryKeySelective(Ratelimit record);

    int updateByPrimaryKey(Ratelimit record);
}