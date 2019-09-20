package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomReviewDTO implements Serializable {

    private int userId;

    private int createdTime;

    private int updateTime;

    private String title;

    private String content;

    private int rating;

    private int parentId;

    private int classroomId;


}
