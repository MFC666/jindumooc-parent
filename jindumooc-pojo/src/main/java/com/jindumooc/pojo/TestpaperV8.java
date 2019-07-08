package com.jindumooc.pojo;

public class TestpaperV8 {
    private Integer id;

    private String name;

    private Integer courseid;

    private Integer lessonid;

    private Integer limitedtime;

    private String pattern;

    private String target;

    private String status;

    private Float score;

    private Integer itemcount;

    private Integer createduserid;

    private Integer createdtime;

    private Integer updateduserid;

    private Integer updatedtime;

    private Integer copyid;

    private String type;

    private Integer coursesetid;

    private Integer migratetestid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getLimitedtime() {
        return limitedtime;
    }

    public void setLimitedtime(Integer limitedtime) {
        this.limitedtime = limitedtime;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getItemcount() {
        return itemcount;
    }

    public void setItemcount(Integer itemcount) {
        this.itemcount = itemcount;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdateduserid() {
        return updateduserid;
    }

    public void setUpdateduserid(Integer updateduserid) {
        this.updateduserid = updateduserid;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getCopyid() {
        return copyid;
    }

    public void setCopyid(Integer copyid) {
        this.copyid = copyid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCoursesetid() {
        return coursesetid;
    }

    public void setCoursesetid(Integer coursesetid) {
        this.coursesetid = coursesetid;
    }

    public Integer getMigratetestid() {
        return migratetestid;
    }

    public void setMigratetestid(Integer migratetestid) {
        this.migratetestid = migratetestid;
    }
}