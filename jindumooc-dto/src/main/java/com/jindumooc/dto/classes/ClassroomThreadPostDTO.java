package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomThreadPostDTO implements Serializable {

    private int threadPostId;

    private int threadId;

    private int parentId;

    private String content;

    private int userId;

    private int createdTime;

    private int classroomId;

}
