package com.jindumooc.pojo;

public class OpenCourseRecommend {
    private Integer id;

    private Integer opencourseid;

    private Integer recommendcourseid;

    private Integer seq;

    private String type;

    private Integer createdtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpencourseid() {
        return opencourseid;
    }

    public void setOpencourseid(Integer opencourseid) {
        this.opencourseid = opencourseid;
    }

    public Integer getRecommendcourseid() {
        return recommendcourseid;
    }

    public void setRecommendcourseid(Integer recommendcourseid) {
        this.recommendcourseid = recommendcourseid;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }
}