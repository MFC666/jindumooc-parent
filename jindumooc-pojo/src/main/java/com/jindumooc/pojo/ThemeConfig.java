package com.jindumooc.pojo;

public class ThemeConfig {
    private Integer id;

    private String name;

    private Integer updatedtime;

    private Integer createdtime;

    private Integer updateduserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public Integer getUpdateduserid() {
        return updateduserid;
    }

    public void setUpdateduserid(Integer updateduserid) {
        this.updateduserid = updateduserid;
    }
}