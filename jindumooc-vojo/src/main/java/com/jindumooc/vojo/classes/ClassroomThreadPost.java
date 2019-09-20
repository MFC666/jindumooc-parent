package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomThreadPost implements Serializable {

    private int threadPostId;

    //发表者的id
    private int userId;

    //发布者的用户名
    private String nickName;

    private int parentId;

    private String content;

    //点赞数量
    private String ups;

    //创建时间
    private int createdTime;

    private Long createdNewTime;

    List<ClassroomThreadPost> classroomThreadPostList;
}
