package com.jindumooc.pojo;

public class Question {
    private Integer id;

    private String type;

    private Float score;

    private Integer categoryid;

    private String difficulty;

    private String target;

    private Integer coursesetid;

    private Integer courseid;

    private Integer lessonid;

    private Integer parentid;

    private Integer subcount;

    private Integer finishedtimes;

    private Integer passedtimes;

    private Integer createduserid;

    private Integer updateduserid;

    private Integer updatedtime;

    private Integer createdtime;

    private Integer copyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty == null ? null : difficulty.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Integer getCoursesetid() {
        return coursesetid;
    }

    public void setCoursesetid(Integer coursesetid) {
        this.coursesetid = coursesetid;
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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getSubcount() {
        return subcount;
    }

    public void setSubcount(Integer subcount) {
        this.subcount = subcount;
    }

    public Integer getFinishedtimes() {
        return finishedtimes;
    }

    public void setFinishedtimes(Integer finishedtimes) {
        this.finishedtimes = finishedtimes;
    }

    public Integer getPassedtimes() {
        return passedtimes;
    }

    public void setPassedtimes(Integer passedtimes) {
        this.passedtimes = passedtimes;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
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

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getCopyid() {
        return copyid;
    }

    public void setCopyid(Integer copyid) {
        this.copyid = copyid;
    }
}