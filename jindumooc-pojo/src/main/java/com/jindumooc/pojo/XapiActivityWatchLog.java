package com.jindumooc.pojo;

public class XapiActivityWatchLog {
    private Integer id;

    private Integer userId;

    private Integer activityId;

    private Integer courseId;

    private Integer taskId;

    private Integer watchedTime;

    private Integer createdTime;

    private Integer updatedTime;

    private Byte isPush;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getWatchedTime() {
        return watchedTime;
    }

    public void setWatchedTime(Integer watchedTime) {
        this.watchedTime = watchedTime;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Byte getIsPush() {
        return isPush;
    }

    public void setIsPush(Byte isPush) {
        this.isPush = isPush;
    }
}