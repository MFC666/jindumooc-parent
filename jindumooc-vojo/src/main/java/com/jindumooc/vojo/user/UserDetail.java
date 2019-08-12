package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail implements Serializable {
    /*
    用户的详情
     */
    private int id;

    private String nickname;

    private String email;

    private String trueName;

    private String gender;

    private String idcard;

    private String mobile;

    private String company;

    private String job;

    private String qq;

    private Date birthday;

    private String weibo;

    private String weixin;

    private String site;

    private String signature;

    private String about;

    private String iam;

    private Integer logintime;

    private String transformedLoginTime;

    private String loginip;

    private String loginarea;

    private Integer createdtime;

    private String createdip;

    private String createdarea;

    private String transformedCreatedTime;

    private String roles;

    private List<String> rolesName;

    private Integer isqqpublic;

    private Integer isweixinpublic;

    private Integer isweibopublic;

}
