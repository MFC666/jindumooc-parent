package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetail implements Serializable {

    private int id;

    private String trueName;

    private String nickName;

    private String gender;

    private String about;

    private String title;

    private String company;

    private String job;

    private String qq;

    private String weibo;

    private String weixin;

    private String site;

    private String signature;

    private String mediumAvatar;

    private int fansNum;

    private int followedNum;
}
