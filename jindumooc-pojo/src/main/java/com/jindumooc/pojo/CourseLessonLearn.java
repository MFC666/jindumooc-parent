package com.jindumooc.pojo;

public class CourseLessonLearn {
    private Integer id;

    private Integer userid;

    private Integer courseid;

    private Integer lessonid;

    private String status;

    private Integer starttime;

    private Integer finishedtime;

    private Integer learntime;

    private Integer watchtime;

    private Integer watchnum;

    private String videostatus;

    private Integer updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    public Integer getFinishedtime() {
        return finishedtime;
    }

    public void setFinishedtime(Integer finishedtime) {
        this.finishedtime = finishedtime;
    }

    public Integer getLearntime() {
        return learntime;
    }

    public void setLearntime(Integer learntime) {
        this.learntime = learntime;
    }

    public Integer getWatchtime() {
        return watchtime;
    }

    public void setWatchtime(Integer watchtime) {
        this.watchtime = watchtime;
    }

    public Integer getWatchnum() {
        return watchnum;
    }

    public void setWatchnum(Integer watchnum) {
        this.watchnum = watchnum;
    }

    public String getVideostatus() {
        return videostatus;
    }

    public void setVideostatus(String videostatus) {
        this.videostatus = videostatus == null ? null : videostatus.trim();
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }
}