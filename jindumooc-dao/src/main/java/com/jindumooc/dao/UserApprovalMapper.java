package com.jindumooc.dao;

import com.jindumooc.pojo.UserApproval;
import com.jindumooc.pojo.UserApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserApprovalMapper {
    int countByExample(UserApprovalExample example);

    int deleteByExample(UserApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserApproval record);

    int insertSelective(UserApproval record);

    List<UserApproval> selectByExampleWithBLOBs(UserApprovalExample example);

    List<UserApproval> selectByExample(UserApprovalExample example);

    UserApproval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserApproval record, @Param("example") UserApprovalExample example);

    int updateByExampleWithBLOBs(@Param("record") UserApproval record, @Param("example") UserApprovalExample example);

    int updateByExample(@Param("record") UserApproval record, @Param("example") UserApprovalExample example);

    int updateByPrimaryKeySelective(UserApproval record);

    int updateByPrimaryKeyWithBLOBs(UserApproval record);

    int updateByPrimaryKey(UserApproval record);
}