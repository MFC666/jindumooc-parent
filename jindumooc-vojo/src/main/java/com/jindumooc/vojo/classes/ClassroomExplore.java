package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomExplore implements Serializable {
    // 班级id
    private Integer id;
    // 班级名
    private String title;
    // 班级图片
    private String smallpicture;
    // 课程数量
    private Integer coursenum;
    // 学生数量
    private Integer studentnum;
    // 评论数量
    private Integer postnum;
    // 服务
    private String service;

}