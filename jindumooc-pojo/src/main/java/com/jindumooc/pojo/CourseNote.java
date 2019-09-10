package com.jindumooc.pojo;

public class CourseNote {
    private Integer id;

    private Integer userid;

    private Integer courseid;

    private Integer taskid;

    private Integer length;

    private Integer likenum;

    private Boolean status;

    private Integer createdtime;

    private Integer updatedtime;

    private Integer coursesetid;

    private String content;

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

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public Integer getCoursesetid() {
        return coursesetid;
    }

    public void setCoursesetid(Integer coursesetid) {
        this.coursesetid = coursesetid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}