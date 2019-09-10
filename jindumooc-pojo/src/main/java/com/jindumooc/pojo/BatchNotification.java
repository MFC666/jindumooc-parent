package com.jindumooc.pojo;

public class BatchNotification {
    private Integer id;

    private String type;

    private Integer fromid;

    private Integer targetid;

    private Integer createdtime;

    private Integer published;

    private Integer sendedtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getFromid() {
        return fromid;
    }

    public void setFromid(Integer fromid) {
        this.fromid = fromid;
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

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public Integer getSendedtime() {
        return sendedtime;
    }

    public void setSendedtime(Integer sendedtime) {
        this.sendedtime = sendedtime;
    }
}