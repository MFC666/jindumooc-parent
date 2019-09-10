package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomStudentSearchDTO implements Serializable{
    // 用户名
    private String nickName;
    // 邮箱
    private String email;
    // 手机号
    private String phone;
}
