package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomThreadDTO implements Serializable {

    private int threadId;

    private int classroomId;

    private String title;

    private String content;

    private int userId;

    //问题、话题
    private String type;

    private int createdTime;

    //是否加精
    private int nice;

    //是否置顶
    private int sticky;

    //是否删除:1删除，0不删除
    private int delete;

}
