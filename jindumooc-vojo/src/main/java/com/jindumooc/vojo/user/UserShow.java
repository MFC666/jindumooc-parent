package com.jindumooc.vojo.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserShow implements Serializable {
    private Integer userId;
    private String userNickName;
    private String userTitle;
    private String userMediumAvatar;
    private String role;
}

