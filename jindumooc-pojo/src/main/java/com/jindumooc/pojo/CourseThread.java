package com.jindumooc.pojo;

public class CourseThread {
    private Integer id;

    private Integer courseid;

    private Integer taskid;

    private Integer userid;

    private String type;

    private Byte isstick;

    private Byte iselite;

    private Integer isclosed;

    private Boolean hide;

    private String title;

    private Integer postnum;

    private Integer hitnum;

    private Integer follownum;

    private Integer latestpostuserid;

    private Integer latestposttime;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getIsstick() {
        return isstick;
    }

    public void setIsstick(Byte isstick) {
        this.isstick = isstick;
    }

    public Byte getIselite() {
        return iselite;
    }

    public void setIselite(Byte iselite) {
        this.iselite = iselite;
    }

    public Integer getIsclosed() {
        return isclosed;
    }

    public void setIsclosed(Integer isclosed) {
        this.isclosed = isclosed;
    }

    public Boolean getHide() {
        return hide;
    }

    public void setHide(Boolean hide) {
        this.hide = hide;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public Integer getHitnum() {
        return hitnum;
    }

    public void setHitnum(Integer hitnum) {
        this.hitnum = hitnum;
    }

    public Integer getFollownum() {
        return follownum;
    }

    public void setFollownum(Integer follownum) {
        this.follownum = follownum;
    }

    public Integer getLatestpostuserid() {
        return latestpostuserid;
    }

    public void setLatestpostuserid(Integer latestpostuserid) {
        this.latestpostuserid = latestpostuserid;
    }

    public Integer getLatestposttime() {
        return latestposttime;
    }

    public void setLatestposttime(Integer latestposttime) {
        this.latestposttime = latestposttime;
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