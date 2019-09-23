package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTeachingThread implements Serializable {
    private int id;
    private int courseId;
    private String userNickName;
    private int isStick;
    private int isElite;
    private String logo;
    private int postNum;
    private int hitNum;
    private int followNum;
    private String title;
    private String time;

}
