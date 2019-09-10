package com.jindumooc.pojo;

public class ThreadPost {
    private Integer id;

    private Integer threadid;

    private Byte adopted;

    private Integer userid;

    private Integer parentid;

    private Integer subposts;

    private Integer ups;

    private String targettype;

    private Integer targetid;

    private Integer createdtime;

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

    public Byte getAdopted() {
        return adopted;
    }

    public void setAdopted(Byte adopted) {
        this.adopted = adopted;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getSubposts() {
        return subposts;
    }

    public void setSubposts(Integer subposts) {
        this.subposts = subposts;
    }

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
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
}