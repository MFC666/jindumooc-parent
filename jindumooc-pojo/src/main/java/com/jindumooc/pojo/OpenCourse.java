package com.jindumooc.pojo;

public class OpenCourse {
    private Integer id;

    private String title;

    private String subtitle;

    private String status;

    private String type;

    private Integer lessonnum;

    private Integer categoryid;

    private String smallpicture;

    private String middlepicture;

    private String largepicture;

    private Integer studentnum;

    private Integer hitnum;

    private Integer likenum;

    private Integer postnum;

    private Integer userid;

    private Integer parentid;

    private Integer locked;

    private Byte recommended;

    private Integer recommendedseq;

    private Integer recommendedtime;

    private Integer createdtime;

    private Integer updatedtime;

    private Integer orgid;

    private String orgcode;

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getLessonnum() {
        return lessonnum;
    }

    public void setLessonnum(Integer lessonnum) {
        this.lessonnum = lessonnum;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getSmallpicture() {
        return smallpicture;
    }

    public void setSmallpicture(String smallpicture) {
        this.smallpicture = smallpicture == null ? null : smallpicture.trim();
    }

    public String getMiddlepicture() {
        return middlepicture;
    }

    public void setMiddlepicture(String middlepicture) {
        this.middlepicture = middlepicture == null ? null : middlepicture.trim();
    }

    public String getLargepicture() {
        return largepicture;
    }

    public void setLargepicture(String largepicture) {
        this.largepicture = largepicture == null ? null : largepicture.trim();
    }

    public Integer getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(Integer studentnum) {
        this.studentnum = studentnum;
    }

    public Integer getHitnum() {
        return hitnum;
    }

    public void setHitnum(Integer hitnum) {
        this.hitnum = hitnum;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Byte getRecommended() {
        return recommended;
    }

    public void setRecommended(Byte recommended) {
        this.recommended = recommended;
    }

    public Integer getRecommendedseq() {
        return recommendedseq;
    }

    public void setRecommendedseq(Integer recommendedseq) {
        this.recommendedseq = recommendedseq;
    }

    public Integer getRecommendedtime() {
        return recommendedtime;
    }

    public void setRecommendedtime(Integer recommendedtime) {
        this.recommendedtime = recommendedtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }
}