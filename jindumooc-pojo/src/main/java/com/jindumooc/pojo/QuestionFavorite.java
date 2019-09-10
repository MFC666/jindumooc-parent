package com.jindumooc.pojo;

public class QuestionFavorite {
    private Integer id;

    private Integer questionid;

    private String targettype;

    private Integer targetid;

    private String target;

    private Integer userid;

    private Integer createdtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}