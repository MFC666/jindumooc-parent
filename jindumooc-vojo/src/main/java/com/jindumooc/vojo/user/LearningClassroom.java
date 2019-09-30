package com.jindumooc.vojo.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LearningClassroom implements Serializable {

    //储存我的班级
    private Integer id;

    private String title;

    private String smallPicture;

    private String middlePicture;

    private String largePicture;

    private Integer studentnum;

    private Integer coursenum;

    private Integer threadnum;


    private int todayClassroom;

}
