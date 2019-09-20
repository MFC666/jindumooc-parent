package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassReview implements Serializable {

    private int id;

    private int userId;

    private String nickName;

    private String title;

    private String content;

    private int rating;

    private int createdTime;

    private String createdTimeString;

    private int updateTime;

    private String updateTimeString;

    private List<ClassReview> childClassReview;
}
