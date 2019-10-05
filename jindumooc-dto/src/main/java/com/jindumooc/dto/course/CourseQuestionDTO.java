package com.jindumooc.dto.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseQuestionDTO implements Serializable {
    private String type;
    private Float score;
    private String categoryName;
    private String difficulty;
    private Integer targetID;
    private Integer courseSetId;
    private Integer courseId;
    private Integer lessonId;
    private Integer parentId;
    private Integer subCount;
    private Integer createdUserId;


    private String stem;
    private String answer;
    private String analysis;
    private String metas;
}
