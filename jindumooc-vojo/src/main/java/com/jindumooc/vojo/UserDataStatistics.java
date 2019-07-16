package com.jindumooc.vojo;

import java.io.Serializable;

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

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getJoinedClassroomNum() {
        return joinedClassroomNum;
    }

    public void setJoinedClassroomNum(int joinedClassNum) {
        this.joinedClassroomNum = joinedClassNum;
    }

    public int getExitClassroomNum() {
        return exitClassroomNum;
    }

    public void setExitClassroomNum(int exitClassroomNum) {
        this.exitClassroomNum = exitClassroomNum;
    }

    public int getJoinedCourseNum() {
        return joinedCourseNum;
    }

    public void setJoinedCourseNum(int joinedCourseNum) {
        this.joinedCourseNum = joinedCourseNum;
    }

    public int getExitCourseNum() {
        return exitCourseNum;
    }

    public void setExitCourseNum(int exitCourseNum) {
        this.exitCourseNum = exitCourseNum;
    }

    public int getFinishedTaskNum() {
        return finishedTaskNum;
    }

    public void setFinishedTaskNum(int finishedTaskNum) {
        this.finishedTaskNum = finishedTaskNum;
    }

    public int getLearnedSeconds() {
        return learnedSeconds;
    }

    public void setLearnedSeconds(int learnedSeconds) {
        this.learnedSeconds = learnedSeconds;
    }
}
