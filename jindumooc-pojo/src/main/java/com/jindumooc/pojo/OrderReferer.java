package com.jindumooc.pojo;

public class OrderReferer {
    private Integer id;

    private String uv;

    private Integer expiredtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv == null ? null : uv.trim();
    }

    public Integer getExpiredtime() {
        return expiredtime;
    }

    public void setExpiredtime(Integer expiredtime) {
        this.expiredtime = expiredtime;
    }
}