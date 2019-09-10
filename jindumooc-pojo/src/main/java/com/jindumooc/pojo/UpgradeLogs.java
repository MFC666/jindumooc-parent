package com.jindumooc.pojo;

public class UpgradeLogs {
    private Integer id;

    private Integer remoteid;

    private Integer installedid;

    private String ename;

    private String cname;

    private String fromv;

    private String tov;

    private Short type;

    private String status;

    private Integer logtime;

    private Integer uid;

    private String ip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRemoteid() {
        return remoteid;
    }

    public void setRemoteid(Integer remoteid) {
        this.remoteid = remoteid;
    }

    public Integer getInstalledid() {
        return installedid;
    }

    public void setInstalledid(Integer installedid) {
        this.installedid = installedid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getFromv() {
        return fromv;
    }

    public void setFromv(String fromv) {
        this.fromv = fromv == null ? null : fromv.trim();
    }

    public String getTov() {
        return tov;
    }

    public void setTov(String tov) {
        this.tov = tov == null ? null : tov.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getLogtime() {
        return logtime;
    }

    public void setLogtime(Integer logtime) {
        this.logtime = logtime;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}