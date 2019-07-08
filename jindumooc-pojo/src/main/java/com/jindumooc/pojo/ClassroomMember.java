package com.jindumooc.pojo;

public class ClassroomMember {
    private Integer id;

    private Integer classroomid;

    private Integer userid;

    private Integer orderid;

    private Integer levelid;

    private Integer notenum;

    private Integer threadnum;

    private Byte locked;

    private String role;

    private Integer createdtime;

    private Integer lastlearntime;

    private Integer learnednum;

    private Integer updatedtime;

    private Integer deadline;

    private Integer refunddeadline;

    private Integer deadlinenotified;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public Integer getNotenum() {
        return notenum;
    }

    public void setNotenum(Integer notenum) {
        this.notenum = notenum;
    }

    public Integer getThreadnum() {
        return threadnum;
    }

    public void setThreadnum(Integer threadnum) {
        this.threadnum = threadnum;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getLastlearntime() {
        return lastlearntime;
    }

    public void setLastlearntime(Integer lastlearntime) {
        this.lastlearntime = lastlearntime;
    }

    public Integer getLearnednum() {
        return learnednum;
    }

    public void setLearnednum(Integer learnednum) {
        this.learnednum = learnednum;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Integer getRefunddeadline() {
        return refunddeadline;
    }

    public void setRefunddeadline(Integer refunddeadline) {
        this.refunddeadline = refunddeadline;
    }

    public Integer getDeadlinenotified() {
        return deadlinenotified;
    }

    public void setDeadlinenotified(Integer deadlinenotified) {
        this.deadlinenotified = deadlinenotified;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}