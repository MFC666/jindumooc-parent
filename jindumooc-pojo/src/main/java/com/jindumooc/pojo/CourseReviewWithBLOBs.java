package com.jindumooc.pojo;

public class CourseReviewWithBLOBs extends CourseReview {
    private String content;

    private String meta;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta == null ? null : meta.trim();
    }
}