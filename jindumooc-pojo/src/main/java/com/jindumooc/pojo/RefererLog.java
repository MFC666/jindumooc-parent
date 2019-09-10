package com.jindumooc.pojo;

public class RefererLog {
    private Integer id;

    private String targetid;

    private String targettype;

    private String targetinnertype;

    private String refererurl;

    private String refererhost;

    private String referername;

    private Integer ordercount;

    private String ip;

    private String uri;

    private Integer createduserid;

    private Integer createdtime;

    private Integer updatedtime;

    private String useragent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTargetid() {
        return targetid;
    }

    public void setTargetid(String targetid) {
        this.targetid = targetid == null ? null : targetid.trim();
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public String getTargetinnertype() {
        return targetinnertype;
    }

    public void setTargetinnertype(String targetinnertype) {
        this.targetinnertype = targetinnertype == null ? null : targetinnertype.trim();
    }

    public String getRefererurl() {
        return refererurl;
    }

    public void setRefererurl(String refererurl) {
        this.refererurl = refererurl == null ? null : refererurl.trim();
    }

    public String getRefererhost() {
        return refererhost;
    }

    public void setRefererhost(String refererhost) {
        this.refererhost = refererhost == null ? null : refererhost.trim();
    }

    public String getReferername() {
        return referername;
    }

    public void setReferername(String referername) {
        this.referername = referername == null ? null : referername.trim();
    }

    public Integer getOrdercount() {
        return ordercount;
    }

    public void setOrdercount(Integer ordercount) {
        this.ordercount = ordercount;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
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

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent == null ? null : useragent.trim();
    }
}