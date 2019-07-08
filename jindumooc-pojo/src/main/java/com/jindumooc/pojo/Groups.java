package com.jindumooc.pojo;

public class Groups {
    private Integer id;

    private String title;

    private String logo;

    private String backgroundlogo;

    private String status;

    private Integer membernum;

    private Integer threadnum;

    private Integer postnum;

    private Integer ownerid;

    private Integer createdtime;

    private String about;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBackgroundlogo() {
        return backgroundlogo;
    }

    public void setBackgroundlogo(String backgroundlogo) {
        this.backgroundlogo = backgroundlogo == null ? null : backgroundlogo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getMembernum() {
        return membernum;
    }

    public void setMembernum(Integer membernum) {
        this.membernum = membernum;
    }

    public Integer getThreadnum() {
        return threadnum;
    }

    public void setThreadnum(Integer threadnum) {
        this.threadnum = threadnum;
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }
}