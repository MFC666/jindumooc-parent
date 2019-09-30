package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseSummaryNote implements Serializable {
    private int id;
    private int userId;
    private String userName;
    private String userSmallAvatar;
    private String taskName;
    private String content;
    private int likeNum;
    private String time;
}