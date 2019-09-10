package com.jindumooc.pojo;

public class UserBind {
    private Integer id;

    private String type;

    private String fromid;

    private Integer toid;

    private String token;

    private String refreshtoken;

    private Integer expiredtime;

    private Integer createdtime;

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

    public String getFromid() {
        return fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid == null ? null : fromid.trim();
    }

    public Integer getToid() {
        return toid;
    }

    public void setToid(Integer toid) {
        this.toid = toid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getRefreshtoken() {
        return refreshtoken;
    }

    public void setRefreshtoken(String refreshtoken) {
        this.refreshtoken = refreshtoken == null ? null : refreshtoken.trim();
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
}