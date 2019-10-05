package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTestScore implements Serializable {
    private int userID;
    private float score;
}
