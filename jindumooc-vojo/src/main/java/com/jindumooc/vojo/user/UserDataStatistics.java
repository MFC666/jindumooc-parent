package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDataStatistics implements Serializable {
    //用于储存后台用户数据统计


    private int userId;

    private String nickName;

    private int joinedClassroomNum;

    private int exitClassroomNum;
    //加入非班级课程数

    private int joinedCourseNum;

    private int exitCourseNum;

    private int finishedTaskNum;

    private int learnedSeconds;

    private int totalNum;

}
