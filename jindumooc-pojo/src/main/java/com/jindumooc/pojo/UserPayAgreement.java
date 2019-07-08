package com.jindumooc.pojo;

public class UserPayAgreement {
    private Integer id;

    private Integer userid;

    private Integer type;

    private String bankname;

    private Integer banknumber;

    private String userauth;

    private String bankauth;

    private Integer bankid;

    private Integer updatedtime;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public Integer getBanknumber() {
        return banknumber;
    }

    public void setBanknumber(Integer banknumber) {
        this.banknumber = banknumber;
    }

    public String getUserauth() {
        return userauth;
    }

    public void setUserauth(String userauth) {
        this.userauth = userauth == null ? null : userauth.trim();
    }

    public String getBankauth() {
        return bankauth;
    }

    public void setBankauth(String bankauth) {
        this.bankauth = bankauth == null ? null : bankauth.trim();
    }

    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}