package com.jindumooc.pojo;

public class Testpaper {
    private Integer id;

    private String name;

    private Integer limitedtime;

    private String pattern;

    private String target;

    private String status;

    private Float score;

    private Float passedscore;

    private Integer itemcount;

    private Integer createduserid;

    private Integer createdtime;

    private Integer updateduserid;

    private Integer updatedtime;

    private Integer copyid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLimitedtime() {
        return limitedtime;
    }

    public void setLimitedtime(Integer limitedtime) {
        this.limitedtime = limitedtime;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Float getPassedscore() {
        return passedscore;
    }

    public void setPassedscore(Float passedscore) {
        this.passedscore = passedscore;
    }

    public Integer getItemcount() {
        return itemcount;
    }

    public void setItemcount(Integer itemcount) {
        this.itemcount = itemcount;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdateduserid() {
        return updateduserid;
    }

    public void setUpdateduserid(Integer updateduserid) {
        this.updateduserid = updateduserid;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getCopyid() {
        return copyid;
    }

    public void setCopyid(Integer copyid) {
        this.copyid = copyid;
    }
}