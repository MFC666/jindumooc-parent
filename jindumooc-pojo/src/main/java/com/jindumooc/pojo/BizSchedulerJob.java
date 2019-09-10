package com.jindumooc.pojo;

public class BizSchedulerJob {
    private Integer id;

    private String name;

    private String pool;

    private String source;

    private String expression;

    private String classes;

    private Integer priority;

    private Integer preFireTime;

    private Integer nextFireTime;

    private Integer misfireThreshold;

    private String misfirePolicy;

    private Boolean enabled;

    private Integer creatorId;

    private Integer updatedTime;

    private Integer createdTime;

    private String args;

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

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool == null ? null : pool.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression == null ? null : expression.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getPreFireTime() {
        return preFireTime;
    }

    public void setPreFireTime(Integer preFireTime) {
        this.preFireTime = preFireTime;
    }

    public Integer getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Integer nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public Integer getMisfireThreshold() {
        return misfireThreshold;
    }

    public void setMisfireThreshold(Integer misfireThreshold) {
        this.misfireThreshold = misfireThreshold;
    }

    public String getMisfirePolicy() {
        return misfirePolicy;
    }

    public void setMisfirePolicy(String misfirePolicy) {
        this.misfirePolicy = misfirePolicy == null ? null : misfirePolicy.trim();
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args == null ? null : args.trim();
    }
}