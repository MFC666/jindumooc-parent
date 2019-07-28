package com.jindumooc.vojo.user;

import java.io.Serializable;

public class TeachingClassroom implements Serializable {

    private Integer id;

    private String title;

    private String smallpicture;

    private String middlepicture;

    private String largepicture;

    private Integer studentnum;

    private Integer coursenum;

    private Integer threadnum;

    private int todayNewStudent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSmallpicture() {
        return smallpicture;
    }

    public void setSmallpicture(String smallpicture) {
        this.smallpicture = smallpicture;
    }

    public String getMiddlepicture() {
        return middlepicture;
    }

    public void setMiddlepicture(String middlepicture) {
        this.middlepicture = middlepicture;
    }

    public String getLargepicture() {
        return largepicture;
    }

    public void setLargepicture(String largepicture) {
        this.largepicture = largepicture;
    }

    public Integer getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(Integer studentnum) {
        this.studentnum = studentnum;
    }

    public Integer getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(Integer coursenum) {
        this.coursenum = coursenum;
    }

    public Integer getThreadnum() {
        return threadnum;
    }

    public void setThreadnum(Integer threadnum) {
        this.threadnum = threadnum;
    }

    public int getTodayNewStudent() {
        return todayNewStudent;
    }

    public void setTodayNewStudent(int todayNewStudent) {
        this.todayNewStudent = todayNewStudent;
    }
}
