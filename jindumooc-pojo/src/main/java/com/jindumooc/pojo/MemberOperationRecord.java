package com.jindumooc.pojo;

public class MemberOperationRecord {
    private Integer id;

    private String title;

    private Integer memberId;

    private String memberType;

    private Integer targetId;

    private Integer parentId;

    private Integer courseSetId;

    private String targetType;

    private String operateType;

    private Boolean exitCourseSet;

    private Boolean joinCourseSet;

    private Integer operateTime;

    private Integer operatorId;

    private Integer userId;

    private Integer orderId;

    private Integer refundId;

    private String reason;

    private String reasonType;

    private Integer createdTime;

    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCourseSetId() {
        return courseSetId;
    }

    public void setCourseSetId(Integer courseSetId) {
        this.courseSetId = courseSetId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public Boolean getExitCourseSet() {
        return exitCourseSet;
    }

    public void setExitCourseSet(Boolean exitCourseSet) {
        this.exitCourseSet = exitCourseSet;
    }

    public Boolean getJoinCourseSet() {
        return joinCourseSet;
    }

    public void setJoinCourseSet(Boolean joinCourseSet) {
        this.joinCourseSet = joinCourseSet;
    }

    public Integer getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getReasonType() {
        return reasonType;
    }

    public void setReasonType(String reasonType) {
        this.reasonType = reasonType == null ? null : reasonType.trim();
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