package com.jindumooc.vojo;

import java.io.Serializable;

//用于后台管理首页用户列表的展示
public class BackGroundIndexUser implements Serializable {

    private int userId ;
    private String birthDay;
    private String loginIp;
    private String loginIpArea;
    private String loginTime;
    private String creatIp;

    public String getLoginIpArea() {
        return loginIpArea;
    }

    public void setLoginIpArea(String loginIpArea) {
        this.loginIpArea = loginIpArea;
    }

    public String getCreatIpArea() {
        return creatIpArea;
    }

    public void setCreatIpArea(String creatIpArea) {
        this.creatIpArea = creatIpArea;
    }

    private String creatIpArea;
    private String creatTime;
    private String nickName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getCreatIp() {
        return creatIp;
    }

    public void setCreatIp(String creatIp) {
        this.creatIp = creatIp;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

