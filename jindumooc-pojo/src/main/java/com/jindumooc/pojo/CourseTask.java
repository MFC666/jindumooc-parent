package com.jindumooc.pojo;

public class CourseTask {
    private Integer id;

    private Integer courseid;

    private Integer fromcoursesetid;

    private Integer seq;

    private Integer categoryid;

    private Integer activityid;

    private String title;

    private Integer isfree;

    private Integer isoptional;

    private Integer starttime;

    private Integer endtime;

    private String status;

    private Integer createduserid;

    private Integer createdtime;

    private Integer updatedtime;

    private String mode;

    private String number;

    private String type;

    private String mediasource;

    private Integer length;

    private Integer maxonlinenum;

    private Integer copyid;

    private Integer migratelessonid;

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

    public Integer getFromcoursesetid() {
        return fromcoursesetid;
    }

    public void setFromcoursesetid(Integer fromcoursesetid) {
        this.fromcoursesetid = fromcoursesetid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getIsfree() {
        return isfree;
    }

    public void setIsfree(Integer isfree) {
        this.isfree = isfree;
    }

    public Integer getIsoptional() {
        return isoptional;
    }

    public void setIsoptional(Integer isoptional) {
        this.isoptional = isoptional;
    }

    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMediasource() {
        return mediasource;
    }

    public void setMediasource(String mediasource) {
        this.mediasource = mediasource == null ? null : mediasource.trim();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getMaxonlinenum() {
        return maxonlinenum;
    }

    public void setMaxonlinenum(Integer maxonlinenum) {
        this.maxonlinenum = maxonlinenum;
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
}