package com.jindumooc.pojo;

public class BizQueueJob {
    private Long id;

    private String queue;

    private String classes;

    private Integer timeout;

    private Integer priority;

    private Integer executions;

    private Integer availableTime;

    private Integer reservedTime;

    private Integer expiredTime;

    private String body;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue == null ? null : queue.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getExecutions() {
        return executions;
    }

    public void setExecutions(Integer executions) {
        this.executions = executions;
    }

    public Integer getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(Integer availableTime) {
        this.availableTime = availableTime;
    }

    public Integer getReservedTime() {
        return reservedTime;
    }

    public void setReservedTime(Integer reservedTime) {
        this.reservedTime = reservedTime;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}