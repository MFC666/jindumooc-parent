package com.jindumooc.pojo;

public class CourseLessonReplay {
    private Integer id;

    private Integer lessonid;

    private Integer courseid;

    private String title;

    private String globalid;

    private Integer userid;

    private Integer createdtime;

    private Boolean hidden;

    private String type;

    private Integer copyid;

    private String replayid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getGlobalid() {
        return globalid;
    }

    public void setGlobalid(String globalid) {
        this.globalid = globalid == null ? null : globalid.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCopyid() {
        return copyid;
    }

    public void setCopyid(Integer copyid) {
        this.copyid = copyid;
    }

    public String getReplayid() {
        return replayid;
    }

    public void setReplayid(String replayid) {
        this.replayid = replayid == null ? null : replayid.trim();
    }
}