package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseSummaryIntroduce implements Serializable {
    private int id;
    private String subtitle;
    private String summary;
    private String audiences;
}