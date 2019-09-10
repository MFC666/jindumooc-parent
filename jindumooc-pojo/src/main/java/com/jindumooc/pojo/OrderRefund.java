package com.jindumooc.pojo;

public class OrderRefund {
    private Integer id;

    private Integer orderid;

    private Integer userid;

    private String targettype;

    private Integer targetid;

    private String status;

    private Float expectedamount;

    private Float actualamount;

    private String reasontype;

    private String reasonnote;

    private Integer updatedtime;

    private Integer createdtime;

    private Integer operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Float getExpectedamount() {
        return expectedamount;
    }

    public void setExpectedamount(Float expectedamount) {
        this.expectedamount = expectedamount;
    }

    public Float getActualamount() {
        return actualamount;
    }

    public void setActualamount(Float actualamount) {
        this.actualamount = actualamount;
    }

    public String getReasontype() {
        return reasontype;
    }

    public void setReasontype(String reasontype) {
        this.reasontype = reasontype == null ? null : reasontype.trim();
    }

    public String getReasonnote() {
        return reasonnote;
    }

    public void setReasonnote(String reasonnote) {
        this.reasonnote = reasonnote == null ? null : reasonnote.trim();
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }
}