package com.jindumooc.pojo;

public class UserSecureQuestion {
    private Integer id;

    private Integer userid;

    private String securityquestioncode;

    private String securityanswer;

    private String securityanswersalt;

    private Integer createdtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getSecurityquestioncode() {
        return securityquestioncode;
    }

    public void setSecurityquestioncode(String securityquestioncode) {
        this.securityquestioncode = securityquestioncode == null ? null : securityquestioncode.trim();
    }

    public String getSecurityanswer() {
        return securityanswer;
    }

    public void setSecurityanswer(String securityanswer) {
        this.securityanswer = securityanswer == null ? null : securityanswer.trim();
    }

    public String getSecurityanswersalt() {
        return securityanswersalt;
    }

    public void setSecurityanswersalt(String securityanswersalt) {
        this.securityanswersalt = securityanswersalt == null ? null : securityanswersalt.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}