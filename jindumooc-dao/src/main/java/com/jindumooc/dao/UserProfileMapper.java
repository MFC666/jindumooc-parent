package com.jindumooc.dao;

import com.jindumooc.dto.user.EditUser;
import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.pojo.UserProfile;
import com.jindumooc.pojo.UserProfileExample;
import com.jindumooc.pojo.UserProfileWithBLOBs;
import java.util.List;

import com.jindumooc.vojo.user.UserDetail;
import org.apache.ibatis.annotations.Param;

public interface UserProfileMapper {
    int countByExample(UserProfileExample example);

    int deleteByExample(UserProfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserProfileWithBLOBs record);

    int insertSelective(UserProfileWithBLOBs record);

    List<UserProfileWithBLOBs> selectByExampleWithBLOBs(UserProfileExample example);

    List<UserProfile> selectByExample(UserProfileExample example);

    UserProfileWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserProfileWithBLOBs record, @Param("example") UserProfileExample example);

    int updateByExampleWithBLOBs(@Param("record") UserProfileWithBLOBs record, @Param("example") UserProfileExample example);

    int updateByExample(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    int updateByPrimaryKeySelective(UserProfileWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserProfileWithBLOBs record);

    int updateByPrimaryKey(UserProfile record);

    UserDetail getUserDetail(int userId);

    void updateUserDetail(EditUser editUser);
}