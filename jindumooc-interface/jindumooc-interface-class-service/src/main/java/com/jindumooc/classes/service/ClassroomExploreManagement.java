package com.jindumooc.classes.service;

import com.jindumooc.vojo.classes.ClassroomExplore;
import com.jindumooc.vojo.classes.ClassroomPresentation;

import java.util.List;

public interface ClassroomExploreManagement {
    /**
     * @param sort 排序选项
     * @return 获得所有班级列表
     */
    List<ClassroomExplore> getAllExploreClassroom(String sort);

    /**
     * @param id 班级id
     * @return 获得班级展示信息
     */
    ClassroomPresentation getClassroom(Integer id);

    /**
     * @param sort 排序选项
     * @return 获得免费班级列表
     */
    List<ClassroomExplore> getFreeExploreClassroom(String sort);

    /**
     * @param sort   排序选项
     * @param filter 筛选
     * @param free   是否免费
     * @return 筛选后的班级列表
     */
    List<ClassroomExplore> getFilteredClassroom(String sort, String filter, boolean free);
}
