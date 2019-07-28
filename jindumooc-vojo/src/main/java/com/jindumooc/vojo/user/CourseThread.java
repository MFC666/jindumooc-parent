package com.jindumooc.vojo.user;

import java.io.Serializable;

public class CourseThread implements Serializable {

    //话题id
    private int id;

    //话题标题
    private String title;

    //浏览数
    private int hitNum;

    //所属课程Id
    private int courseId;

    //所属课程标题
    private String courseTitle;

    private String courseSetTitle;

    //所属班级标题
    private String classTitle;

    private int courseSetId;

    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHitNum() {
        return hitNum;
    }

    public void setHitNum(int hitNum) {
        this.hitNum = hitNum;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseSetTitle() {
        return courseSetTitle;
    }

    public void setCourseSetTitle(String courseSetTitle) {
        this.courseSetTitle = courseSetTitle;
    }

    public int getCourseSetId() {
        return courseSetId;
    }

    public void setCourseSetId(int courseSetId) {
        this.courseSetId = courseSetId;
    }
}
