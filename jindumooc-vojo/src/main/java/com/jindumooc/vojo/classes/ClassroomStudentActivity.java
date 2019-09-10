package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomStudentActivity implements Serializable{
    // 时间
    private Integer updateTime;
    // 姓名
    private String nickname;
    // 内容
    private String content;
}
