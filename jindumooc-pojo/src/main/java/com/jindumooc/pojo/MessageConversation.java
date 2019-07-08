package com.jindumooc.pojo;

public class MessageConversation {
    private Integer id;

    private Integer fromid;

    private Integer toid;

    private Integer messagenum;

    private Integer latestmessageuserid;

    private Integer latestmessagetime;

    private String latestmessagetype;

    private Integer unreadnum;

    private Integer createdtime;

    private String latestmessagecontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromid() {
        return fromid;
    }

    public void setFromid(Integer fromid) {
        this.fromid = fromid;
    }

    public Integer getToid() {
        return toid;
    }

    public void setToid(Integer toid) {
        this.toid = toid;
    }

    public Integer getMessagenum() {
        return messagenum;
    }

    public void setMessagenum(Integer messagenum) {
        this.messagenum = messagenum;
    }

    public Integer getLatestmessageuserid() {
        return latestmessageuserid;
    }

    public void setLatestmessageuserid(Integer latestmessageuserid) {
        this.latestmessageuserid = latestmessageuserid;
    }

    public Integer getLatestmessagetime() {
        return latestmessagetime;
    }

    public void setLatestmessagetime(Integer latestmessagetime) {
        this.latestmessagetime = latestmessagetime;
    }

    public String getLatestmessagetype() {
        return latestmessagetype;
    }

    public void setLatestmessagetype(String latestmessagetype) {
        this.latestmessagetype = latestmessagetype == null ? null : latestmessagetype.trim();
    }

    public Integer getUnreadnum() {
        return unreadnum;
    }

    public void setUnreadnum(Integer unreadnum) {
        this.unreadnum = unreadnum;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getLatestmessagecontent() {
        return latestmessagecontent;
    }

    public void setLatestmessagecontent(String latestmessagecontent) {
        this.latestmessagecontent = latestmessagecontent == null ? null : latestmessagecontent.trim();
    }
}