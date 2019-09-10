package com.jindumooc.dao;

import com.jindumooc.pojo.GroupsThread;
import com.jindumooc.pojo.GroupsThreadExample;

import java.util.List;


import com.jindumooc.vojo.group.GroupThreadSearch;

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


    /**
     * 展示最后更新的小组话题
     *
     * @return
     */
    List<GroupsThread> showRecentGroupThread(Integer groupThreadNum);

    /**
     * 编辑话题信息
     *
     * @param gt
     * @return
     */
    int updateThreadInfo(GroupsThread gt);


    /**
     * 搜索组内话题
     *
     * @param groupId,content
     * @return
     */
    List<GroupThreadSearch> searchThread(@Param("groupId") Integer groupId, @Param("content") String content);

    /**
     * 返回组内全部话题
     *
     * @param groupId
     * @return
     */
    List<GroupThreadSearch> allThread(Integer groupId);

    /**
     * 返回所有的精华小组话题
     *
     * @return
     */
    List<GroupsThread> showAllEliteGroupThread();

    /**
     * 按照最近时间筛选
     *
     * @return
     */
    List<GroupsThread> screeningByTime();

    /**
     * 按照最后回复筛选
     *
     * @return
     */
    List<GroupsThread> screeningByLastPost();

    /**
     * 按照回复数筛选
     *
     * @return
     */
    List<GroupsThread> screeningByPostNum();

    /**
     * 按照最近时间筛选且精华
     *
     * @return
     */
    List<GroupsThread> screeningByTimeAndElite();

    /**
     * 按照最后回复筛选且精华
     *
     * @return
     */
    List<GroupsThread> screeningByLastPostAndElite();

    /**
     * 按照回复数筛选且精华
     *
     * @return
     */
    List<GroupsThread> screeningByPostNumAndElite();

}