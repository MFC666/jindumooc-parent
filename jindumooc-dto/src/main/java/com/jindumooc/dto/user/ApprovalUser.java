package com.jindumooc.dto.user;

import java.io.Serializable;

public class ApprovalUser implements Serializable {

    //用于更新用户的实名认证的状态

    private int userId;
    //实名制审核状态
    private String approvalStatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }
}
