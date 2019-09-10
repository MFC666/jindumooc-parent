package com.jindumooc.pojo;

public class Activity {
    private Integer id;

    private String title;

    private Integer mediaid;

    private String mediatype;

    private Integer length;

    private Integer fromcourseid;

    private Integer fromcoursesetid;

    private Integer fromuserid;

    private Integer starttime;

    private Integer endtime;

    private Integer createdtime;

    private Integer updatedtime;

    private Integer copyid;

    private Integer migratelessonid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getMediaid() {
        return mediaid;
    }

    public void setMediaid(Integer mediaid) {
        this.mediaid = mediaid;
    }

    public String getMediatype() {
        return mediatype;
    }

    public void setMediatype(String mediatype) {
        this.mediatype = mediatype == null ? null : mediatype.trim();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getFromcourseid() {
        return fromcourseid;
    }

    public void setFromcourseid(Integer fromcourseid) {
        this.fromcourseid = fromcourseid;
    }

    public Integer getFromcoursesetid() {
        return fromcoursesetid;
    }

    public void setFromcoursesetid(Integer fromcoursesetid) {
        this.fromcoursesetid = fromcoursesetid;
    }

    public Integer getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(Integer fromuserid) {
        this.fromuserid = fromuserid;
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
}