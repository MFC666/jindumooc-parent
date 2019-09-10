package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomStudent implements Serializable{
    // 学生id
    private Integer id;
    // 姓名
    private String nickname;
    // 头像
    private String smallavatar;
    // 加入时间
    private Integer createdTime;
    // 在学
    private Integer learningNum;
    // 关注
    private Integer followNUm;
    // 粉丝
    private Integer fanNum;
}
