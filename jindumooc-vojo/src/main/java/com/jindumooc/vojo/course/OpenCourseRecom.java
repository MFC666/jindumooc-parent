package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpenCourseRecom implements Serializable {
    private int id;
    private int seq;
    private String title;
}