package com.jindumooc.pojo;

public class CourseTaskResult {
    private Integer id;

    private Integer activityid;

    private Integer courseid;

    private Integer coursetaskid;

    private Integer userid;

    private String status;

    private Integer finishedtime;

    private Integer createdtime;

    private Integer updatedtime;

    private Integer time;

    private Integer watchtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getCoursetaskid() {
        return coursetaskid;
    }

    public void setCoursetaskid(Integer coursetaskid) {
        this.coursetaskid = coursetaskid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getFinishedtime() {
        return finishedtime;
    }

    public void setFinishedtime(Integer finishedtime) {
        this.finishedtime = finishedtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getWatchtime() {
        return watchtime;
    }

    public void setWatchtime(Integer watchtime) {
        this.watchtime = watchtime;
    }
}