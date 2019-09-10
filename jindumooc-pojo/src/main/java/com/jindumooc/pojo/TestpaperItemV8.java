package com.jindumooc.pojo;

public class TestpaperItemV8 {
    private Integer id;

    private Integer testid;

    private Integer seq;

    private Integer questionid;

    private String questiontype;

    private Integer parentid;

    private Float score;

    private Float missscore;

    private Integer copyid;

    private String type;

    private Integer migrateitemid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(String questiontype) {
        this.questiontype = questiontype == null ? null : questiontype.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getMissscore() {
        return missscore;
    }

    public void setMissscore(Float missscore) {
        this.missscore = missscore;
    }

    public Integer getCopyid() {
        return copyid;
    }

    public void setCopyid(Integer copyid) {
        this.copyid = copyid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getMigrateitemid() {
        return migrateitemid;
    }

    public void setMigrateitemid(Integer migrateitemid) {
        this.migrateitemid = migrateitemid;
    }
}