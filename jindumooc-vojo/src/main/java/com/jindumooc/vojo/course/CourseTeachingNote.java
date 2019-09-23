package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTeachingNote implements Serializable {
    private int id ;
    private String authorName;
    private String time;
    private int likeNum;
    private String content;
}
