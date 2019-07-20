package com.jindumooc.dto.user;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchMessage implements Serializable {

    private int userId;
    private int pageNum;
    private int pageSize;
    //搜索条件
    private String searchType;
    private String searchParameter;
    //按时间搜索
    private String searchTimeType;
    private Long starTime;
    private Long endTime;
    //锁定用户
    private int locked;
    //设置角色
    private String role;
    private String newRole;
    //设置推荐
    private int promoted;
    private int promotedSeq;
    //实名制审核状态
    private String approvalStatus;
    //搜索私信管理
    //发信人昵称
    private int fromId;
    private String content;
    //课程类型
    private String courseType;
    private String teacherId;
    private int teacherIds;
    //

}
