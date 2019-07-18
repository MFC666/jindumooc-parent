package com.jindumooc.dto.user;

import java.io.Serializable;

public class SearchMessage implements Serializable {

    private int userId;
    private int pageNum;
    private int pageSize;
    //搜索条件
    private String searchType;
    private String searchParameter;
    //按时间搜索
    private String searchTimeType;
    private Long starTime;
    private Long endTime;
    //锁定用户
    private int locked;
    //设置角色
    private String role;
    //设置推荐
    private int promoted;
    private int promotedSeq;
    //实名制审核状态
    private String approvalStatus;
    //搜索私信管理
    //发信人昵称
    private int fromId;
    private String content;


    public int getFromNickName() {
        return fromId;
    }

    public void setFromNickName(int fromId) {
        this.fromId = fromId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public int getPromotedSeq() {
        return promotedSeq;
    }

    public void setPromotedSeq(int promotedSeq) {
        this.promotedSeq = promotedSeq;
    }

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSearchTimeType() {
        return searchTimeType;
    }

    public void setSearchTimeType(String searchTimeType) {
        this.searchTimeType = searchTimeType;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getNewRole() {
        return newRole;
    }

    public void setNewRole(String newRole) {
        this.newRole = newRole;
    }

    private String newRole;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public Long getStarTime() {
        return starTime;
    }

    public void setStarTime(Long starTime) {
        this.starTime = starTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchParameter() {
        return searchParameter;
    }

    public void setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
    }
}
