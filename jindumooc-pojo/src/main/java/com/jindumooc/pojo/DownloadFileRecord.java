package com.jindumooc.pojo;

public class DownloadFileRecord {
    private Integer id;

    private Integer downloadactivityid;

    private Integer materialid;

    private String fileid;

    private String link;

    private Integer createdtime;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDownloadactivityid() {
        return downloadactivityid;
    }

    public void setDownloadactivityid(Integer downloadactivityid) {
        this.downloadactivityid = downloadactivityid;
    }

    public Integer getMaterialid() {
        return materialid;
    }

    public void setMaterialid(Integer materialid) {
        this.materialid = materialid;
    }

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}