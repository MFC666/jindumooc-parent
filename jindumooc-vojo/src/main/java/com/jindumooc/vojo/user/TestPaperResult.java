package com.jindumooc.vojo.user;

import java.io.Serializable;

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

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getObjectiveScore() {
        return objectiveScore;
    }

    public void setObjectiveScore(float objectiveScore) {
        this.objectiveScore = objectiveScore;
    }

    public float getSubjectiveScore() {
        return subjectiveScore;
    }

    public void setSubjectiveScore(float subjectiveScore) {
        this.subjectiveScore = subjectiveScore;
    }

    public float getPassedStatus() {
        return passedStatus;
    }

    public void setPassedStatus(float passedStatus) {
        this.passedStatus = passedStatus;
    }
}
