package com.jindumooc.vojo.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserNew implements Serializable {
    private Integer userId;
    private String userSmallAvatar;
}

