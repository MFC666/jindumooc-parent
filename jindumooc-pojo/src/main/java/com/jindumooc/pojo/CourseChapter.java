package com.jindumooc.pojo;

public class CourseChapter {
    private Integer id;

    private Integer courseid;

    private String type;

    private Integer number;

    private Integer seq;

    private String title;

    private Integer createdtime;

    private Integer updatedtime;

    private Integer copyid;

    private Integer migratelessonid;

    private Integer migratecopycourseid;

    private Integer migratereftaskid;

    private Integer mgratecopytaskid;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Integer getCopyid() {
        return copyid;
    }

    public void setCopyid(Integer copyid) {
        this.copyid = copyid;
    }

    public Integer getMigratelessonid() {
        return migratelessonid;
    }

    public void setMigratelessonid(Integer migratelessonid) {
        this.migratelessonid = migratelessonid;
    }

    public Integer getMigratecopycourseid() {
        return migratecopycourseid;
    }

    public void setMigratecopycourseid(Integer migratecopycourseid) {
        this.migratecopycourseid = migratecopycourseid;
    }

    public Integer getMigratereftaskid() {
        return migratereftaskid;
    }

    public void setMigratereftaskid(Integer migratereftaskid) {
        this.migratereftaskid = migratereftaskid;
    }

    public Integer getMgratecopytaskid() {
        return mgratecopytaskid;
    }

    public void setMgratecopytaskid(Integer mgratecopytaskid) {
        this.mgratecopytaskid = mgratecopytaskid;
    }
}