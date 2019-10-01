package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpenCourseDown implements Serializable {
    private int id;
    private String fileUri;
}