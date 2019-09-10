package com.jindumooc.pojo;

public class CourseThreadPost {
    private Integer id;

    private Integer courseid;

    private Integer taskid;

    private Integer threadid;

    private Integer userid;

    private Byte iselite;

    private Integer createdtime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getThreadid() {
        return threadid;
    }

    public void setThreadid(Integer threadid) {
        this.threadid = threadid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getIselite() {
        return iselite;
    }

    public void setIselite(Byte iselite) {
        this.iselite = iselite;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}