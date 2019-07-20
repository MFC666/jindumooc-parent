package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Serializable {
    //用于储存教师搜索
    private int id;
    private String nickName;
    //是否推荐、推荐为1，不推荐为0
    private int promoted;
    private String loginTime;
    private String loginArea;
    private String loginIp;
    private int totalNum;

}
