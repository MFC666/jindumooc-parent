package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeachingClassroom implements Serializable {

    //储存在教班级
    private Integer id;

    private String title;

    private String smallpicture;

    private String middlepicture;

    private String largepicture;

    private Integer studentnum;

    private Integer coursenum;

    private Integer threadnum;

    private int todayNewStudent;


}
