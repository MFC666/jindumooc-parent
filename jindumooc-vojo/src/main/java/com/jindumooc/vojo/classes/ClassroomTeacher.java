package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomTeacher implements Serializable{
    // 教师id
    private Integer id;
    // 姓名
    private String nickname;
    // 头衔
    private String title;
    // 头像
    private String smallavatar;
    // 教师类型
    private String role;
    // 在学
    private Integer learningNum;
    // 关注
    private Integer followNUm;
    // 粉丝
    private Integer fanNum;
}
