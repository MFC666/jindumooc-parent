package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OpenCourseInfo implements Serializable {
    private int id;
    private int hitNum;
    private int postNum;
    private int likeNum;
    private String title;
    private String subtitle;
    private List<OpenCourseRecom> recommends;
    private String smallPicture;
    private int teacher_id;
    private String teacher_nickname;
    private String teacher_title;
    private String teacher_largeAvatar;
    private String teacher_signature;
}