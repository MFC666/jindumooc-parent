package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTeachingMaterial implements Serializable {
    private int id;
    private String title;
    private String description;
    private String link;
    private String time;
    private String userName;
}