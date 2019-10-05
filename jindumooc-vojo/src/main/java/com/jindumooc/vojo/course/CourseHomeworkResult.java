package com.jindumooc.vojo.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseHomeworkResult implements Serializable {
    private String homeworkName;
    private String time;
    private int checked;
    private int checking;
    private int notFinished;

    private int perfectNum;
    private int goodNum;
    private int qualifiedNum;
    private int notPassNum;

    private int perfectNumFirst;
    private int goodNumFirst;
    private int qualifiedNumFirst;
    private int notPassNumFirst;

    private String qualifiedNumPercent;//合格率
}
