package com.jindumooc.pojo;

public class GroupsThread {
    private Integer id;

    private String title;

    private Integer iselite;

    private Integer isstick;

    private Integer lastpostmemberid;

    private Integer lastposttime;

    private Integer groupid;

    private Integer userid;

    private Integer createdtime;

    private Integer updatedtime;

    private Integer postnum;

    private String status;

    private Integer hitnum;

    private Integer rewardcoin;

    private String type;

    private String content;

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

    public Integer getIselite() {
        return iselite;
    }

    public void setIselite(Integer iselite) {
        this.iselite = iselite;
    }

    public Integer getIsstick() {
        return isstick;
    }

    public void setIsstick(Integer isstick) {
        this.isstick = isstick;
    }

    public Integer getLastpostmemberid() {
        return lastpostmemberid;
    }

    public void setLastpostmemberid(Integer lastpostmemberid) {
        this.lastpostmemberid = lastpostmemberid;
    }

    public Integer getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Integer lastposttime) {
        this.lastposttime = lastposttime;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getHitnum() {
        return hitnum;
    }

    public void setHitnum(Integer hitnum) {
        this.hitnum = hitnum;
    }

    public Integer getRewardcoin() {
        return rewardcoin;
    }

    public void setRewardcoin(Integer rewardcoin) {
        this.rewardcoin = rewardcoin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}