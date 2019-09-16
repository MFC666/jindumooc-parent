package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomPresentation implements Serializable{
    // id
    private Integer id;
    // 班级名
    private String title;
    // 价格 （0 元转换成 “免费” ）
    private String price;
    // 图片
    private String largepicture;
    // 班主任id (从user里搜索)
    private ClassroomTeacher headteacherid;
    // 学生数量
    private Integer studentnum;
    // 课程数量
    private Integer coursenum;
    // 笔记数量
    private Integer notenum;
    // 评论数量
    private Integer postnum;
    // 服务
    private String service;
    // 有效期
    private String expiryString;
    // 评分
    private Integer ratingnum;
    // 状态
    private String status;
}