package com.jindumooc.vojo.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TestPaperResult implements Serializable {

    private int courseId;

    private int lessonId;

    private int testId;

    private String courseTitle;

    private String lessonTitle;

    private String paperName;

    private float score;

    private float objectiveScore;

    private float subjectiveScore;

    private float passedStatus;

}
