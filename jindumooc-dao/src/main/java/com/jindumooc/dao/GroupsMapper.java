package com.jindumooc.dao;

import com.jindumooc.dto.group.SearchGroupDTO;
import com.jindumooc.pojo.Groups;
import com.jindumooc.pojo.GroupsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GroupsMapper {
    int countByExample(GroupsExample example);

    int deleteByExample(GroupsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Groups record);

    int insertSelective(Groups record);

    List<Groups> selectByExampleWithBLOBs(GroupsExample example);

    List<Groups> selectByExample(GroupsExample example);

    Groups selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExampleWithBLOBs(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKeyWithBLOBs(Groups record);

    int updateByPrimaryKey(Groups record);

    /**
     * 查找小组
     *
     * @param sg
     * @return
     */
    List<Groups> getIndexGroup(SearchGroupDTO sg);

    /**
     * 打开小组
     *
     * @param id
     * @return
     */
    int openGroupStatusByPrimaryKey(Integer id);

    /**
     * 关闭小组
     *
     * @param id
     * @return
     */
    int closeGroupStatusByPrimaryKey(Integer id);

    /**
     * 平均小组话题数
     *
     * @return
     */
    int avgThreadNum();

    /**
     * 展示最新的n个小组
     *
     * @param n
     * @return
     */
    List<Groups> showNewNGroups(Integer n);

    /**
     * 编辑小组名称和介绍
     *
     * @param group
     * @return
     */
    int setGroupInfo(Groups group);

    /**
     * 设置小组图标
     *
     * @param group
     * @return
     */
    int setGroupLogo(Groups group);

    /**
     * 设置小组背景
     *
     * @param group
     * @return
     */
    int setGroupBackground(Groups group);
}