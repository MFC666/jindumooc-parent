package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestPaperDetail implements Serializable {

    private String paperName;

    private int questionId;

    private String nickName;

    private String status;

    private int usedTime;

    private int endTime;

    private String endTimeString;

    private int singleScore;

    private int totalScore;

    private int itemCount;

    private String questionType;

    private String stem;

    private String rightAnswer;

    private String selfAnswer;

    private int selfScore;

    //1:已收藏
    //0：未收藏
    private int favorite;


}
