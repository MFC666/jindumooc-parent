package com.jindumooc.vojo.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupThreadShow implements Serializable {
    private int threadID;
    private String threadTitle;
    private String threadContent;
    private String groupName;
    private String userName;
    private String createdTime;
    private String updatedTime;
    private String status;
    private int isElite;
}
