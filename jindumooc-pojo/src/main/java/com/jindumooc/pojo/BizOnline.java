package com.jindumooc.pojo;

public class BizOnline {
    private Integer id;

    private Integer activeTime;

    private Integer deadline;

    private Boolean isLogin;

    private Integer userId;

    private String ip;

    private String userAgent;

    private String source;

    private Integer createdTime;

    private byte[] sessId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Integer activeTime) {
        this.activeTime = activeTime;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Boolean getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public byte[] getSessId() {
        return sessId;
    }

    public void setSessId(byte[] sessId) {
        this.sessId = sessId;
    }
}