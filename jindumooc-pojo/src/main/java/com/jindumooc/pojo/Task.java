package com.jindumooc.pojo;

public class Task {
    private Integer id;

    private String title;

    private Integer userid;

    private String tasktype;

    private Integer batchid;

    private Integer targetid;

    private String targettype;

    private Integer taskstarttime;

    private Integer taskendtime;

    private Short intervaldate;

    private String status;

    private Boolean required;

    private Integer completedtime;

    private Integer createdtime;

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
        this.title = title == null ? null : title.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public Integer getBatchid() {
        return batchid;
    }

    public void setBatchid(Integer batchid) {
        this.batchid = batchid;
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public Integer getTaskstarttime() {
        return taskstarttime;
    }

    public void setTaskstarttime(Integer taskstarttime) {
        this.taskstarttime = taskstarttime;
    }

    public Integer getTaskendtime() {
        return taskendtime;
    }

    public void setTaskendtime(Integer taskendtime) {
        this.taskendtime = taskendtime;
    }

    public Short getIntervaldate() {
        return intervaldate;
    }

    public void setIntervaldate(Short intervaldate) {
        this.intervaldate = intervaldate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Integer getCompletedtime() {
        return completedtime;
    }

    public void setCompletedtime(Integer completedtime) {
        this.completedtime = completedtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}