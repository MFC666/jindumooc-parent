package com.jindumooc.pojo;

public class QuestionAnalysis {
    private Integer id;

    private Integer targetid;

    private String targettype;

    private Integer activityid;

    private Integer questionid;

    private Integer choiceindex;

    private Integer firstanswercount;

    private Integer totalanswercount;

    private Integer createdtime;

    private Integer updatedtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getChoiceindex() {
        return choiceindex;
    }

    public void setChoiceindex(Integer choiceindex) {
        this.choiceindex = choiceindex;
    }

    public Integer getFirstanswercount() {
        return firstanswercount;
    }

    public void setFirstanswercount(Integer firstanswercount) {
        this.firstanswercount = firstanswercount;
    }

    public Integer getTotalanswercount() {
        return totalanswercount;
    }

    public void setTotalanswercount(Integer totalanswercount) {
        this.totalanswercount = totalanswercount;
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
}