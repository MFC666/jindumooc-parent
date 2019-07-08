package com.jindumooc.pojo;

public class CourseMember {
    private Integer id;

    private Integer courseid;

    private Integer classroomid;

    private String joinedtype;

    private Integer userid;

    private Integer orderid;

    private Integer deadline;

    private Integer refunddeadline;

    private Integer levelid;

    private Integer learnednum;

    private Integer learnedcompulsorytasknum;

    private Integer credit;

    private Integer notenum;

    private Integer notelastupdatetime;

    private Byte islearned;

    private Integer finishedtime;

    private Integer seq;

    private String remark;

    private Byte isvisible;

    private String role;

    private Byte locked;

    private Integer deadlinenotified;

    private Integer createdtime;

    private Integer lastlearntime;

    private Integer updatedtime;

    private Integer lastviewtime;

    private Integer coursesetid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public String getJoinedtype() {
        return joinedtype;
    }

    public void setJoinedtype(String joinedtype) {
        this.joinedtype = joinedtype == null ? null : joinedtype.trim();
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

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public Integer getLearnednum() {
        return learnednum;
    }

    public void setLearnednum(Integer learnednum) {
        this.learnednum = learnednum;
    }

    public Integer getLearnedcompulsorytasknum() {
        return learnedcompulsorytasknum;
    }

    public void setLearnedcompulsorytasknum(Integer learnedcompulsorytasknum) {
        this.learnedcompulsorytasknum = learnedcompulsorytasknum;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getNotenum() {
        return notenum;
    }

    public void setNotenum(Integer notenum) {
        this.notenum = notenum;
    }

    public Integer getNotelastupdatetime() {
        return notelastupdatetime;
    }

    public void setNotelastupdatetime(Integer notelastupdatetime) {
        this.notelastupdatetime = notelastupdatetime;
    }

    public Byte getIslearned() {
        return islearned;
    }

    public void setIslearned(Byte islearned) {
        this.islearned = islearned;
    }

    public Integer getFinishedtime() {
        return finishedtime;
    }

    public void setFinishedtime(Integer finishedtime) {
        this.finishedtime = finishedtime;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(Byte isvisible) {
        this.isvisible = isvisible;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Integer getDeadlinenotified() {
        return deadlinenotified;
    }

    public void setDeadlinenotified(Integer deadlinenotified) {
        this.deadlinenotified = deadlinenotified;
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

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getLastviewtime() {
        return lastviewtime;
    }

    public void setLastviewtime(Integer lastviewtime) {
        this.lastviewtime = lastviewtime;
    }

    public Integer getCoursesetid() {
        return coursesetid;
    }

    public void setCoursesetid(Integer coursesetid) {
        this.coursesetid = coursesetid;
    }
}