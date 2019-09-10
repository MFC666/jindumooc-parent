package com.jindumooc.pojo;

public class GroupsThreadPost {
    private Integer id;

    private Integer threadid;

    private Integer userid;

    private Integer fromuserid;

    private Integer postid;

    private Integer createdtime;

    private Integer adopt;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThreadid() {
        return threadid;
    }

    public void setThreadid(Integer threadid) {
        this.threadid = threadid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(Integer fromuserid) {
        this.fromuserid = fromuserid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getAdopt() {
        return adopt;
    }

    public void setAdopt(Integer adopt) {
        this.adopt = adopt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}