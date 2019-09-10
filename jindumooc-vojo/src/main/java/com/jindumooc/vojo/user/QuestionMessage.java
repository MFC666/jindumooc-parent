package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionMessage implements Serializable {

    //收藏的题目的id
    private int id;

    private int createdTime;

    //题干
    private String stem;

    //试卷题目
    private String testPaperName;

    private String transformedTime;

    private String type;

    private String answer;

    private String metas;

    private String difficulty;

    private String analysis;

    private int score;



}
