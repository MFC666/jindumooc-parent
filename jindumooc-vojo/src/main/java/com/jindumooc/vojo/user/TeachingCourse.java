package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeachingCourse implements Serializable {

    /*
    正在教授的课程
     */
    private Integer id;

    private String teacherids;

    private Integer studentnum;

    private String status;

    private String coursesettitle;

    private String type;

    private String cover;


}
