package com.jindumooc.pojo;

public class CrontabJob {
    private Integer id;

    private String name;

    private String cycle;

    private String cycletime;

    private String jobclass;

    private String targettype;

    private Integer targetid;

    private Byte executing;

    private Integer nextexcutedtime;

    private Integer latestexecutedtime;

    private Integer creatorid;

    private Integer createdtime;

    private Boolean enabled;

    private String jobparams;

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

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }

    public String getCycletime() {
        return cycletime;
    }

    public void setCycletime(String cycletime) {
        this.cycletime = cycletime == null ? null : cycletime.trim();
    }

    public String getJobclass() {
        return jobclass;
    }

    public void setJobclass(String jobclass) {
        this.jobclass = jobclass == null ? null : jobclass.trim();
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public Byte getExecuting() {
        return executing;
    }

    public void setExecuting(Byte executing) {
        this.executing = executing;
    }

    public Integer getNextexcutedtime() {
        return nextexcutedtime;
    }

    public void setNextexcutedtime(Integer nextexcutedtime) {
        this.nextexcutedtime = nextexcutedtime;
    }

    public Integer getLatestexecutedtime() {
        return latestexecutedtime;
    }

    public void setLatestexecutedtime(Integer latestexecutedtime) {
        this.latestexecutedtime = latestexecutedtime;
    }

    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getJobparams() {
        return jobparams;
    }

    public void setJobparams(String jobparams) {
        this.jobparams = jobparams == null ? null : jobparams.trim();
    }
}