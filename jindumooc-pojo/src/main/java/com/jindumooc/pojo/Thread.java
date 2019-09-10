package com.jindumooc.pojo;

public class Thread {
    private Integer id;

    private String targettype;

    private Integer targetid;

    private String title;

    private Integer nice;

    private Integer sticky;

    private Byte solved;

    private Integer lastpostuserid;

    private Integer lastposttime;

    private Integer userid;

    private String type;

    private Integer postnum;

    private Integer hitnum;

    private Integer membernum;

    private String status;

    private Integer starttime;

    private Integer endtime;

    private Integer maxusers;

    private String actvitypicture;

    private String location;

    private Integer relationid;

    private Integer categoryid;

    private Integer createdtime;

    private Integer updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getNice() {
        return nice;
    }

    public void setNice(Integer nice) {
        this.nice = nice;
    }

    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

    public Byte getSolved() {
        return solved;
    }

    public void setSolved(Byte solved) {
        this.solved = solved;
    }

    public Integer getLastpostuserid() {
        return lastpostuserid;
    }

    public void setLastpostuserid(Integer lastpostuserid) {
        this.lastpostuserid = lastpostuserid;
    }

    public Integer getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Integer lastposttime) {
        this.lastposttime = lastposttime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public Integer getHitnum() {
        return hitnum;
    }

    public void setHitnum(Integer hitnum) {
        this.hitnum = hitnum;
    }

    public Integer getMembernum() {
        return membernum;
    }

    public void setMembernum(Integer membernum) {
        this.membernum = membernum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public Integer getMaxusers() {
        return maxusers;
    }

    public void setMaxusers(Integer maxusers) {
        this.maxusers = maxusers;
    }

    public String getActvitypicture() {
        return actvitypicture;
    }

    public void setActvitypicture(String actvitypicture) {
        this.actvitypicture = actvitypicture == null ? null : actvitypicture.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getRelationid() {
        return relationid;
    }

    public void setRelationid(Integer relationid) {
        this.relationid = relationid;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }
}