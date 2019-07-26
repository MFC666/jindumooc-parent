package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThread;
import com.jindumooc.pojo.GroupsThreadExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GroupsThreadMapper {
    int countByExample(GroupsThreadExample example);

    int deleteByExample(GroupsThreadExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupsThread record);

    int insertSelective(GroupsThread record);

    List<GroupsThread> selectByExampleWithBLOBs(GroupsThreadExample example);

    List<GroupsThread> selectByExample(GroupsThreadExample example);

    GroupsThread selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupsThread record, @Param("example") GroupsThreadExample example);

    int updateByExampleWithBLOBs(@Param("record") GroupsThread record, @Param("example") GroupsThreadExample example);

    int updateByExample(@Param("record") GroupsThread record, @Param("example") GroupsThreadExample example);

    int updateByPrimaryKeySelective(GroupsThread record);

    int updateByPrimaryKeyWithBLOBs(GroupsThread record);

    int updateByPrimaryKey(GroupsThread record);

    /**
     * 设置加精
     *
     * @param id
     * @return
     */
    int setEliteGroupThread(Integer id);

    /**
     * 取消加精
     *
     * @param id
     * @return
     */
    int setNotEliteGroupThread(Integer id);
    /**
     * 设置置顶
     *
     * @param id
     * @return
     */
    int setStickGroupThread(Integer id);

    /**
     * 取消置顶
     *
     * @param id
     * @return
     */
    int setNotStickGroupThread(Integer id);
    /**
     * 打开话题
     *
     * @param id
     * @return
     */
    int openGroupThread(Integer id);

    /**
     * 关闭话题
     *
     * @param id
     * @return
     */
    int closeGroupThread(Integer id);

}