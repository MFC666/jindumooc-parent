package com.jindumooc.vojo.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class PostNew implements Serializable {
    private Integer threadId;
    private String content;
    private Integer userId;
    private Integer fromUserId;
    private Integer postId;
}

