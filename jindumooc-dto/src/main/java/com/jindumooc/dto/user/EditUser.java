package com.jindumooc.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditUser implements Serializable {

    private int id;

    private String truename;

    private String gender;

    private String idcard;


    private String mobile;

    private String company;

    private String job;

    private String qq;

    private String weibo;

    private String weixin;

    private String site;

    private String signature;

    private String about;

    private String iam;

}
