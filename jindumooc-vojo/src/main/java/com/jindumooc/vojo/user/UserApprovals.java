package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserApprovals implements Serializable {

    //用于储存申请实名认证的信息

    private int userId;

    private int id;

    private String idCard;

    private String faceImg;

    private String backImg;

    private String trueName;

    private String note;

    private String status;

    private int operatorId;

    private String createdTime;

    private int totalApproval;

    private String nickName;

}
