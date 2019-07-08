package com.jindumooc.dao;

import com.jindumooc.pojo.Org;
import com.jindumooc.pojo.OrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrgMapper {
    int countByExample(OrgExample example);

    int deleteByExample(OrgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Org record);

    int insertSelective(Org record);

    List<Org> selectByExampleWithBLOBs(OrgExample example);

    List<Org> selectByExample(OrgExample example);

    Org selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByExampleWithBLOBs(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByExample(@Param("record") Org record, @Param("example") OrgExample example);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKeyWithBLOBs(Org record);

    int updateByPrimaryKey(Org record);
}