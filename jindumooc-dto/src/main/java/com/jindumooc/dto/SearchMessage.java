package com.jindumooc.dto;

import java.io.Serializable;

public class SearchMessage implements Serializable {

    private String searchType;
    private String searchParameter;
    private Long starTime;
    private Long endTime;
    private int locked;
    private int userId;

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
