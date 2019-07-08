package com.jindumooc.pojo;

public class BizSchedulerJobProcess {
    private Integer id;

    private String pid;

    private Long startTime;

    private Long endTime;

    private Integer costTime;

    private Long peakMemory;

    private Integer createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public Long getPeakMemory() {
        return peakMemory;
    }

    public void setPeakMemory(Long peakMemory) {
        this.peakMemory = peakMemory;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }
}