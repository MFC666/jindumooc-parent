package com.jindumooc.dto.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalUser implements Serializable {

    //用于更新用户的实名认证的状态

    private int userId;
    //实名制审核状态
    private String approvalStatus;

    public int getUserId() {
        return userId;
    }



}
