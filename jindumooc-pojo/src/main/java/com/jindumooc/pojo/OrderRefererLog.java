package com.jindumooc.pojo;

public class OrderRefererLog {
    private Integer id;

    private Integer refererlogid;

    private Integer orderid;

    private Integer sourcetargetid;

    private String sourcetargettype;

    private String targettype;

    private Integer targetid;

    private Integer createdtime;

    private Integer createduserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefererlogid() {
        return refererlogid;
    }

    public void setRefererlogid(Integer refererlogid) {
        this.refererlogid = refererlogid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getSourcetargetid() {
        return sourcetargetid;
    }

    public void setSourcetargetid(Integer sourcetargetid) {
        this.sourcetargetid = sourcetargetid;
    }

    public String getSourcetargettype() {
        return sourcetargettype;
    }

    public void setSourcetargettype(String sourcetargettype) {
        this.sourcetargettype = sourcetargettype == null ? null : sourcetargettype.trim();
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
}