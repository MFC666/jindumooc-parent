package com.jindumooc.pojo;

public class ActivityPpt {
    private Integer id;

    private Integer mediaid;

    private String finishtype;

    private String finishdetail;

    private Integer createdtime;

    private Integer createduserid;

    private Integer updatedtime;

    private Integer migratelessonid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getMigratelessonid() {
        return migratelessonid;
    }

    public void setMigratelessonid(Integer migratelessonid) {
        this.migratelessonid = migratelessonid;
    }
}