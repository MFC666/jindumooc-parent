package com.jindumooc.pojo;

public class ActivityDownload {
    private Integer id;

    private Integer mediacount;

    private Integer createdtime;

    private Integer updatedtime;

    private String fileids;

    private Integer migratelessonid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMediacount() {
        return mediacount;
    }

    public void setMediacount(Integer mediacount) {
        this.mediacount = mediacount;
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

    public String getFileids() {
        return fileids;
    }

    public void setFileids(String fileids) {
        this.fileids = fileids == null ? null : fileids.trim();
    }

    public Integer getMigratelessonid() {
        return migratelessonid;
    }

    public void setMigratelessonid(Integer migratelessonid) {
        this.migratelessonid = migratelessonid;
    }
}