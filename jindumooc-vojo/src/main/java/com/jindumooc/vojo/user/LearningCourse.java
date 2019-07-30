package com.jindumooc.vojo.user;

import java.io.Serializable;

public class LearningCourse implements Serializable {

    private int learnTime;

    private int length;

    private String title;

    private int watchTime;

    private int courseId;

    private int lessonId;

    private int lessonLearnId;

    public int getLearnTime() {
        return learnTime;
    }

    public void setLearnTime(int learnTime) {
        this.learnTime = learnTime;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public int getLessonLearnId() {
        return lessonLearnId;
    }

    public void setLessonLearnId(int lessonLearnId) {
        this.lessonLearnId = lessonLearnId;
    }

}
