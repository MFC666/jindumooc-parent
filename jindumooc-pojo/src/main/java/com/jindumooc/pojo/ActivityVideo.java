package com.jindumooc.pojo;

public class ActivityVideo {
    private Integer id;

    private String mediasource;

    private Integer mediaid;

    private String finishtype;

    private String finishdetail;

    private Integer migratelessonid;

    private String mediauri;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMediasource() {
        return mediasource;
    }

    public void setMediasource(String mediasource) {
        this.mediasource = mediasource == null ? null : mediasource.trim();
    }

    public Integer getMediaid() {
        return mediaid;
    }

    public void setMediaid(Integer mediaid) {
        this.mediaid = mediaid;
    }

    public String getFinishtype() {
        return finishtype;
    }

    public void setFinishtype(String finishtype) {
        this.finishtype = finishtype == null ? null : finishtype.trim();
    }

    public String getFinishdetail() {
        return finishdetail;
    }

    public void setFinishdetail(String finishdetail) {
        this.finishdetail = finishdetail == null ? null : finishdetail.trim();
    }

    public Integer getMigratelessonid() {
        return migratelessonid;
    }

    public void setMigratelessonid(Integer migratelessonid) {
        this.migratelessonid = migratelessonid;
    }

    public String getMediauri() {
        return mediauri;
    }

    public void setMediauri(String mediauri) {
        this.mediauri = mediauri == null ? null : mediauri.trim();
    }
}