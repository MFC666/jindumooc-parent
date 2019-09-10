package com.jindumooc.pojo;

public class XapiStatementArchive {
    private Integer id;

    private String uuid;

    private String version;

    private Integer pushTime;

    private Integer userId;

    private String verb;

    private Integer targetId;

    private String targetType;

    private String status;

    private Integer occurTime;

    private Integer createdTime;

    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getPushTime() {
        return pushTime;
    }

    public void setPushTime(Integer pushTime) {
        this.pushTime = pushTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb == null ? null : verb.trim();
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Integer occurTime) {
        this.occurTime = occurTime;
    }

    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}