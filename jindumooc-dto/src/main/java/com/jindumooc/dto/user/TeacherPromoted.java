package com.jindumooc.dto.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TeacherPromoted implements Serializable {
    //推荐教师
    private int userId;
    //设置推荐
    private int promoted;

    private int promotedSeq;


}
