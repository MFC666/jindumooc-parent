package com.jindumooc.pojo;

public class TestpaperResult {
    private Integer id;

    private String papername;

    private Integer testid;

    private Integer userid;

    private Float score;

    private Float objectivescore;

    private Float subjectivescore;

    private Integer rightitemcount;

    private String passedstatus;

    private Integer limitedtime;

    private Integer begintime;

    private Integer endtime;

    private Integer updatetime;

    private Byte active;

    private String status;

    private String target;

    private Integer checkteacherid;

    private Integer checkedtime;

    private Integer usedtime;

    private String teachersay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getObjectivescore() {
        return objectivescore;
    }

    public void setObjectivescore(Float objectivescore) {
        this.objectivescore = objectivescore;
    }

    public Float getSubjectivescore() {
        return subjectivescore;
    }

    public void setSubjectivescore(Float subjectivescore) {
        this.subjectivescore = subjectivescore;
    }

    public Integer getRightitemcount() {
        return rightitemcount;
    }

    public void setRightitemcount(Integer rightitemcount) {
        this.rightitemcount = rightitemcount;
    }

    public String getPassedstatus() {
        return passedstatus;
    }

    public void setPassedstatus(String passedstatus) {
        this.passedstatus = passedstatus == null ? null : passedstatus.trim();
    }

    public Integer getLimitedtime() {
        return limitedtime;
    }

    public void setLimitedtime(Integer limitedtime) {
        this.limitedtime = limitedtime;
    }

    public Integer getBegintime() {
        return begintime;
    }

    public void setBegintime(Integer begintime) {
        this.begintime = begintime;
    }

    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Integer getCheckteacherid() {
        return checkteacherid;
    }

    public void setCheckteacherid(Integer checkteacherid) {
        this.checkteacherid = checkteacherid;
    }

    public Integer getCheckedtime() {
        return checkedtime;
    }

    public void setCheckedtime(Integer checkedtime) {
        this.checkedtime = checkedtime;
    }

    public Integer getUsedtime() {
        return usedtime;
    }

    public void setUsedtime(Integer usedtime) {
        this.usedtime = usedtime;
    }

    public String getTeachersay() {
        return teachersay;
    }

    public void setTeachersay(String teachersay) {
        this.teachersay = teachersay == null ? null : teachersay.trim();
    }
}