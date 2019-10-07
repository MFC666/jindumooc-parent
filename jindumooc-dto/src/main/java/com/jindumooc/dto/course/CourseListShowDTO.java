package com.jindumooc.dto.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseListShowDTO implements Serializable {
    private int categoryId;
    private int isFree;
    private String sort;
}
