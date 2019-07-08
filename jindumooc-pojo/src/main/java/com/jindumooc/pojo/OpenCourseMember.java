package com.jindumooc.pojo;

public class OpenCourseMember {
    private Integer id;

    private Integer courseid;

    private Integer userid;

    private String mobile;

    private Integer learnednum;

    private Integer learntime;

    private Integer seq;

    private Byte isvisible;

    private String role;

    private String ip;

    private Integer lastentertime;

    private Integer isnotified;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getLearnednum() {
        return learnednum;
    }

    public void setLearnednum(Integer learnednum) {
        this.learnednum = learnednum;
    }

    public Integer getLearntime() {
        return learntime;
    }

    public void setLearntime(Integer learntime) {
        this.learntime = learntime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Byte getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(Byte isvisible) {
        this.isvisible = isvisible;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getLastentertime() {
        return lastentertime;
    }

    public void setLastentertime(Integer lastentertime) {
        this.lastentertime = lastentertime;
    }

    public Integer getIsnotified() {
        return isnotified;
    }

    public void setIsnotified(Integer isnotified) {
        this.isnotified = isnotified;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}