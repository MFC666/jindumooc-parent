package com.jindumooc.vojo.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupThreadSearch implements Serializable {
    private int threadID;
    private int postNum;
    private int isElite;
    private int userId;
    private String userName;
    private String threadTitle;
    private String lastPostTime;
    private int lastPostMemberId;
    private String lastPostMemberName;
    private String createdTime;
    private String status;
}