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


    //搜索私信管理
    //发信人昵称
    private int fromId;
    private String content;
    //课程类型
    private String courseType;
    private String teacherId;
    private int teacherIds;
    private int approvalStatus;
    private String role;


}
