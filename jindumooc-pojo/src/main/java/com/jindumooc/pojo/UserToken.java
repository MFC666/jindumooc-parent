package com.jindumooc.pojo;

public class UserToken {
    private Integer id;

    private String token;

    private Integer userid;

    private String type;

    private Integer times;

    private Integer remainedtimes;

    private Integer expiredtime;

    private Integer createdtime;

    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getRemainedtimes() {
        return remainedtimes;
    }

    public void setRemainedtimes(Integer remainedtimes) {
        this.remainedtimes = remainedtimes;
    }

    public Integer getExpiredtime() {
        return expiredtime;
    }

    public void setExpiredtime(Integer expiredtime) {
        this.expiredtime = expiredtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}