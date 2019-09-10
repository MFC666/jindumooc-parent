package com.jindumooc.pojo;

public class KeywordBanlog {
    private Integer id;

    private Integer keywordid;

    private String keywordname;

    private String state;

    private Integer userid;

    private String ip;

    private Integer createdtime;

    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKeywordid() {
        return keywordid;
    }

    public void setKeywordid(Integer keywordid) {
        this.keywordid = keywordid;
    }

    public String getKeywordname() {
        return keywordname;
    }

    public void setKeywordname(String keywordname) {
        this.keywordname = keywordname == null ? null : keywordname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}