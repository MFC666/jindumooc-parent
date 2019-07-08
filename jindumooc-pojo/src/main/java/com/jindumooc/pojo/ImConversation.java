package com.jindumooc.pojo;

public class ImConversation {
    private Integer id;

    private String no;

    private String targettype;

    private Integer targetid;

    private String memberhash;

    private Integer createdtime;

    private String title;

    private String memberids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
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

    public String getMemberhash() {
        return memberhash;
    }

    public void setMemberhash(String memberhash) {
        this.memberhash = memberhash == null ? null : memberhash.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMemberids() {
        return memberids;
    }

    public void setMemberids(String memberids) {
        this.memberids = memberids == null ? null : memberids.trim();
    }
}