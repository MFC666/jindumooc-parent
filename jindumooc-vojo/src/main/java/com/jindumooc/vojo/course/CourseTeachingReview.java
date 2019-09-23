package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTeachingReview implements Serializable {
    private int id;
    private String userName;
    private String title;
    private String content;
    private int rating;
    private String time;
    private String courseSet;
}
