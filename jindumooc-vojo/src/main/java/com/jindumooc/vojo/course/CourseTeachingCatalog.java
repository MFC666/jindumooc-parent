package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseTeachingCatalog implements Serializable {
    private String taskName;
    private String link;
    private String type;
}
