package com.jindumooc.pojo;

public class UserApproval {
    private Integer id;

    private Integer userid;

    private String idcard;

    private String faceimg;

    private String backimg;

    private String truename;

    private String status;

    private Integer operatorid;

    private Integer createdtime;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getFaceimg() {
        return faceimg;
    }

    public void setFaceimg(String faceimg) {
        this.faceimg = faceimg == null ? null : faceimg.trim();
    }

    public String getBackimg() {
        return backimg;
    }

    public void setBackimg(String backimg) {
        this.backimg = backimg == null ? null : backimg.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}