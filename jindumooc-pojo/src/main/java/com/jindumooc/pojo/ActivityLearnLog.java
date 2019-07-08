package com.jindumooc.pojo;

public class ActivityLearnLog {
    private Integer id;

    private Integer activityid;

    private Integer coursetaskid;

    private Integer userid;

    private String mediatype;

    private String event;

    private Integer watchtime;

    private Integer learnedtime;

    private Integer createdtime;

    private Integer migratetaskresultid;

    private String data;

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

    public String getMediatype() {
        return mediatype;
    }

    public void setMediatype(String mediatype) {
        this.mediatype = mediatype == null ? null : mediatype.trim();
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    public Integer getWatchtime() {
        return watchtime;
    }

    public void setWatchtime(Integer watchtime) {
        this.watchtime = watchtime;
    }

    public Integer getLearnedtime() {
        return learnedtime;
    }

    public void setLearnedtime(Integer learnedtime) {
        this.learnedtime = learnedtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getMigratetaskresultid() {
        return migratetaskresultid;
    }

    public void setMigratetaskresultid(Integer migratetaskresultid) {
        this.migratetaskresultid = migratetaskresultid;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}