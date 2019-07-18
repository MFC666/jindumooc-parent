package com.jindumooc.vojo.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserDetail implements Serializable {
    /*
    用户的详情
     */
    private int id;

    private String nickname;

    private String email;

    private String trueName;

    private String gender;

    private String idcard;

    private String mobile;

    private String company;

    private String job;

    private String qq;

    private Date birthday;

    private String weibo;

    private String weixin;

    private String site;

    private String signature;

    private String about;

    private String iam;

    private Integer logintime;

    private String loginTime;

    private String loginip;

    private String loginarea;

    private Integer createdtime;

    private String createdip;

    private String createdarea;

    private String createdTime;

    private String roles;

    private List<String> rolesName;

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<String> getRolesName() {
        return rolesName;
    }

    public void setRolesName(List<String> rolesName) {
        this.rolesName = rolesName;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    private Integer isqqpublic;

    private Integer isweixinpublic;

    private Integer isweibopublic;

    public Integer getIsqqpublic() {
        return isqqpublic;
    }

    public void setIsqqpublic(Integer isqqpublic) {
        this.isqqpublic = isqqpublic;
    }

    public Integer getIsweixinpublic() {
        return isweixinpublic;
    }

    public void setIsweixinpublic(Integer isweixinpublic) {
        this.isweixinpublic = isweixinpublic;
    }

    public Integer getIsweibopublic() {
        return isweibopublic;
    }

    public void setIsweibopublic(Integer isweibopublic) {
        this.isweibopublic = isweibopublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getCreatedip() {
        return createdip;
    }

    public void setCreatedip(String createdip) {
        this.createdip = createdip;
    }

    public String getIam() {
        return iam;
    }

    public void setIam(String iam) {
        this.iam = iam;
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip;
    }

    public String getLoginarea() {
        return loginarea;
    }

    public void setLoginarea(String loginarea) {
        this.loginarea = loginarea;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getUpdatedtime() {
        return createdip;
    }

    public void setUpdatedtime(String createdip) {
        this.createdip = createdip;
    }

    public String getCreatedarea() {
        return createdarea;
    }

    public void setCreatedarea(String createdarea) {
        this.createdarea = createdarea;
    }
}
