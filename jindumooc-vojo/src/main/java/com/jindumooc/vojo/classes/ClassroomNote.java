package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomNote implements Serializable {

    private int userId;

    private int courseId;

    private int classroomId;

    private String largeAvatar;

    private String nickName;

    private int createdTime;

    private String createdTimeString;

    private String title;

    private String content;

    private int likeNum;
}
