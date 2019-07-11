package com.jindumooc.pojo;

public class User {
    private Integer id;

    private String email;

    private String verifiedmobile;

    private String password;

    private String salt;

    private String paypassword;

    private String paypasswordsalt;

    private String locale;

    private String uri;

    private String nickname;

    private String title;

    private String tags;

    private String type;

    private Integer point;

    private Integer coin;

    private String smallavatar;

    private String mediumavatar;

    private String largeavatar;

    private Boolean emailverified;

    private Byte setup;

    private String roles;

    private Byte promoted;

    private Integer promotedseq;

    private Integer promotedtime;

    private Byte locked;

    private Integer lockdeadline;

    private Integer consecutivepassworderrortimes;

    private Integer lastpasswordfailtime;

    private Integer logintime;

    private String loginip;

    private String loginsessionid;

    private Integer approvaltime;

    private String approvalstatus;

    private Integer newmessagenum;

    private Integer newnotificationnum;

    private String createdip;

    private Integer createdtime;

    private Integer updatedtime;

    private String invitecode;

    private Integer orgid;

    private String orgcode;

    private String registeredway;

    private String distributortoken;

    private String uuid;

    private Boolean passwordinit;

    private String birthday;

    private String loginarea;

    private String createdarea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getVerifiedmobile() {
        return verifiedmobile;
    }

    public void setVerifiedmobile(String verifiedmobile) {
        this.verifiedmobile = verifiedmobile == null ? null : verifiedmobile.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword == null ? null : paypassword.trim();
    }

    public String getPaypasswordsalt() {
        return paypasswordsalt;
    }

    public void setPaypasswordsalt(String paypasswordsalt) {
        this.paypasswordsalt = paypasswordsalt == null ? null : paypasswordsalt.trim();
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale == null ? null : locale.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public String getSmallavatar() {
        return smallavatar;
    }

    public void setSmallavatar(String smallavatar) {
        this.smallavatar = smallavatar == null ? null : smallavatar.trim();
    }

    public String getMediumavatar() {
        return mediumavatar;
    }

    public void setMediumavatar(String mediumavatar) {
        this.mediumavatar = mediumavatar == null ? null : mediumavatar.trim();
    }

    public String getLargeavatar() {
        return largeavatar;
    }

    public void setLargeavatar(String largeavatar) {
        this.largeavatar = largeavatar == null ? null : largeavatar.trim();
    }

    public Boolean getEmailverified() {
        return emailverified;
    }

    public void setEmailverified(Boolean emailverified) {
        this.emailverified = emailverified;
    }

    public Byte getSetup() {
        return setup;
    }

    public void setSetup(Byte setup) {
        this.setup = setup;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }

    public Byte getPromoted() {
        return promoted;
    }

    public void setPromoted(Byte promoted) {
        this.promoted = promoted;
    }

    public Integer getPromotedseq() {
        return promotedseq;
    }

    public void setPromotedseq(Integer promotedseq) {
        this.promotedseq = promotedseq;
    }

    public Integer getPromotedtime() {
        return promotedtime;
    }

    public void setPromotedtime(Integer promotedtime) {
        this.promotedtime = promotedtime;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Integer getLockdeadline() {
        return lockdeadline;
    }

    public void setLockdeadline(Integer lockdeadline) {
        this.lockdeadline = lockdeadline;
    }

    public Integer getConsecutivepassworderrortimes() {
        return consecutivepassworderrortimes;
    }

    public void setConsecutivepassworderrortimes(Integer consecutivepassworderrortimes) {
        this.consecutivepassworderrortimes = consecutivepassworderrortimes;
    }

    public Integer getLastpasswordfailtime() {
        return lastpasswordfailtime;
    }

    public void setLastpasswordfailtime(Integer lastpasswordfailtime) {
        this.lastpasswordfailtime = lastpasswordfailtime;
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
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public String getLoginsessionid() {
        return loginsessionid;
    }

    public void setLoginsessionid(String loginsessionid) {
        this.loginsessionid = loginsessionid == null ? null : loginsessionid.trim();
    }

    public Integer getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(Integer approvaltime) {
        this.approvaltime = approvaltime;
    }

    public String getApprovalstatus() {
        return approvalstatus;
    }

    public void setApprovalstatus(String approvalstatus) {
        this.approvalstatus = approvalstatus == null ? null : approvalstatus.trim();
    }

    public Integer getNewmessagenum() {
        return newmessagenum;
    }

    public void setNewmessagenum(Integer newmessagenum) {
        this.newmessagenum = newmessagenum;
    }

    public Integer getNewnotificationnum() {
        return newnotificationnum;
    }

    public void setNewnotificationnum(Integer newnotificationnum) {
        this.newnotificationnum = newnotificationnum;
    }

    public String getCreatedip() {
        return createdip;
    }

    public void setCreatedip(String createdip) {
        this.createdip = createdip == null ? null : createdip.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public String getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(String invitecode) {
        this.invitecode = invitecode == null ? null : invitecode.trim();
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getRegisteredway() {
        return registeredway;
    }

    public void setRegisteredway(String registeredway) {
        this.registeredway = registeredway == null ? null : registeredway.trim();
    }

    public String getDistributortoken() {
        return distributortoken;
    }

    public void setDistributortoken(String distributortoken) {
        this.distributortoken = distributortoken == null ? null : distributortoken.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Boolean getPasswordinit() {
        return passwordinit;
    }

    public void setPasswordinit(Boolean passwordinit) {
        this.passwordinit = passwordinit;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getLoginarea() {
        return loginarea;
    }

    public void setLoginarea(String loginarea) {
        this.loginarea = loginarea == null ? null : loginarea.trim();
    }

    public String getCreatedarea() {
        return createdarea;
    }

    public void setCreatedarea(String createdarea) {
        this.createdarea = createdarea == null ? null : createdarea.trim();
    }
}