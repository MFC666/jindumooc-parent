package com.jindumooc.dto.user;

import java.io.Serializable;

public class TeacherPromoted implements Serializable {
    //推荐教师
    private int userId;
    //设置推荐
    private int promoted;

    private int promotedSeq;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPromoted() {
        return promoted;
    }

    public void setPromoted(int promoted) {
        this.promoted = promoted;
    }

    public int getPromotedSeq() {
        return promotedSeq;
    }

    public void setPromotedSeq(int promotedSeq) {
        this.promotedSeq = promotedSeq;
    }
}
