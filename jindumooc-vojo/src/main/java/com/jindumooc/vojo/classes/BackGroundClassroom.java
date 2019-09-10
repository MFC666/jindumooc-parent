package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackGroundClassroom implements Serializable {
    // 班级编号
    private Integer id;
    // 班级名
    private String title;
    // 课程数量
    private Integer coursenum;
    // 学生数量
    private Integer studentnum;
    // 价格
    private Float price;
    // TODO:原价
    // 状态 “已发布”，“已关闭”
    private String status;
}
