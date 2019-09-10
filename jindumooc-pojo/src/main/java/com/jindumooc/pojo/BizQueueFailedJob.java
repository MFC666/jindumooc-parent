package com.jindumooc.pojo;

public class BizQueueFailedJob {
    private Long id;

    private String queue;

    private String classes;

    private Integer timeout;

    private Integer priority;

    private Integer failedTime;

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

    public Integer getFailedTime() {
        return failedTime;
    }

    public void setFailedTime(Integer failedTime) {
        this.failedTime = failedTime;
    }
}