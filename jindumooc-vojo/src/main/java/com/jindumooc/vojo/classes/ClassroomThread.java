package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomThread implements Serializable {

    private int threadId;

    private String title;

    private String content;

    private int lastPostUserId;

    private String lastPostUserNickName;

    //发表人的id
    private int userId;

    private String userNickName;

    //回复次数
    private int postNum;

    //点击数
    private int hitNum;

    //距离当前时间
    private Long newTime;

    private int lastPostTime;
}
