package com.jindumooc.pojo;

public class BizSession {
    private Integer id;

    private Integer sessTime;

    private Integer sessDeadline;

    private Integer createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSessTime() {
        return sessTime;
    }

    public void setSessTime(Integer sessTime) {
        this.sessTime = sessTime;
    }

    public Integer getSessDeadline() {
        return sessDeadline;
    }

    public void setSessDeadline(Integer sessDeadline) {
        this.sessDeadline = sessDeadline;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }
}