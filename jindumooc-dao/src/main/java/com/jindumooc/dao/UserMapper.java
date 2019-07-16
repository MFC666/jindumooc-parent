package com.jindumooc.dao;

import com.jindumooc.pojo.Role;
import com.jindumooc.pojo.User;
import com.jindumooc.pojo.UserExample;
import java.util.List;

import com.jindumooc.dto.SearchMessage;
import com.jindumooc.pojo.UserLearnStatisticsTotal;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //后台管理搜索用户
    List<User> getIndexUser(SearchMessage sm);

    List<User> searchIndexUserByTime(SearchMessage sm);

    void lockedUser(SearchMessage searchMessage);

    void updateUserRole(SearchMessage searchMessage);

    String getUserNickName(Integer id);

    int getUserNum(SearchMessage sm);

    List<User> getAllTeachers(SearchMessage sm);

    int getTeachersNum(SearchMessage sm);

    void updatePromoted(SearchMessage sm);

    void updatePromotedSeq(SearchMessage sm);
}