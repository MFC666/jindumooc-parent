package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LearningCourse implements Serializable {

    private int learnTime;

    private int length;

    private String title;

    private int watchTime;

    private int courseId;

    private int lessonId;

    private int lessonLearnId;


}
