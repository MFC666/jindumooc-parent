package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note implements Serializable {

    private int id;

    private int userId;

    private int courseId;

    private int taskId;

    private String taskTitle;

    //笔记内容字数
    private int length;

    private String courseTitle;

    private String content;

    private int updatedTime;

    private String transformedTime;


}
