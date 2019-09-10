package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//用于后台管理首页用户列表的展示
public class BackGroundIndexUser implements Serializable {

    private int userId ;

    private String birthDay;

    private String loginIp;

    private String loginIpArea;

    private String loginTime;

    private String creatIp;

    private List<String> rolesName;

    private String creatIpArea;

    private String creatTime;

    private String nickName;

    private int locked;
    //获得符合当前的条件的用户的总数

    private int totalUser;

    private List<String> roles;


}

