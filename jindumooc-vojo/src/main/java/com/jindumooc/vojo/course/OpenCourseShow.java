package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpenCourseShow implements Serializable {
    private int id;
    private int hitNum;
    private int postNum;
    private String title;
    private String picture;
}