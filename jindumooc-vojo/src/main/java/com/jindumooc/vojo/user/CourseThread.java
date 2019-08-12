package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseThread implements Serializable {

    //话题id
    private int id;

    //话题标题
    private String title;

    //浏览数
    private int hitNum;

    //所属课程Id
    private int courseId;

    //所属课程标题
    private String courseTitle;

    private String courseSetTitle;

    //所属班级标题
    private String classTitle;

    private int courseSetId;


}
