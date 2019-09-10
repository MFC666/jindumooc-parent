package com.jindumooc.pojo;

public class CourseLessonView {
    private Integer id;

    private Integer courseid;

    private Integer lessonid;

    private Integer fileid;

    private Integer userid;

    private String filetype;

    private String filestorage;

    private String filesource;

    private Integer createdtime;

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

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getFilestorage() {
        return filestorage;
    }

    public void setFilestorage(String filestorage) {
        this.filestorage = filestorage == null ? null : filestorage.trim();
    }

    public String getFilesource() {
        return filesource;
    }

    public void setFilesource(String filesource) {
        this.filesource = filesource == null ? null : filesource.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}