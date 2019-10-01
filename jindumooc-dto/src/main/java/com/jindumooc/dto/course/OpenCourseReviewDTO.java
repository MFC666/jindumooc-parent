package com.jindumooc.dto.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class OpenCourseReviewDTO implements Serializable {
    private int userId;
    private int courseId;
    private int parentId;
    private String content;

}
