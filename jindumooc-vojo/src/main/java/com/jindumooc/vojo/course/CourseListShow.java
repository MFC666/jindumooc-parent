package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CourseListShow implements Serializable {
    private int id;
    private int categoryId;
    private int ratingNum;
    private int studentNum;
    private int hitNum;
    private int isFree;
    private int isRecommend;
    private String title;
    private String picture;
    private String serializeMode;
    private String updatedTime;
}