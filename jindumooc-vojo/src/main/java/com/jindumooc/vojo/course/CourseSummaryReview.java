package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseSummaryReview implements Serializable {
    private int id;
    private int parentId;
    private int userId;
    private String userName;
    private String userSmallAvatar;
    private String content;
    private int rating;
    private String time;
    private String meta;
    private String courseSet;
}