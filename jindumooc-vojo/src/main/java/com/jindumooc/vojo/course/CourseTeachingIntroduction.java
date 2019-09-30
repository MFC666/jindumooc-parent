package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CourseTeachingIntroduction implements Serializable {
    private String introduction;
    private List<String> goals;
    private String audiences;
}
