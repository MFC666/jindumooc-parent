package com.jindumooc.vojo.group;

import lombok.Data;

import java.util.Date;

@Data
public class GroupThreadShow {
    private int threadID;
    private String threadTitle;
    private String threadContent;
    private String groupName;
    private String userName;
    private Date createdTime;
    private Date updatedTime;
    private String status;
    private int isElite;
}
