package com.jindumooc.pojo;

public class Coupon {
    private Integer id;

    private String code;

    private String type;

    private String status;

    private Float rate;

    private Integer batchid;

    private Integer userid;

    private Integer deadline;

    private String targettype;

    private Integer targetid;

    private Integer orderid;

    private Integer ordertime;

    private Integer createdtime;

    private Integer receivetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Integer getBatchid() {
        return batchid;
    }

    public void setBatchid(Integer batchid) {
        this.batchid = batchid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Integer ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Integer receivetime) {
        this.receivetime = receivetime;
    }
}