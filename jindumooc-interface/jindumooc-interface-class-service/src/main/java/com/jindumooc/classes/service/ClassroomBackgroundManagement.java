package com.jindumooc.classes.service;

import com.jindumooc.dto.classes.CreateClassroomDTO;
import com.jindumooc.vojo.classes.BackGroundClassroom;

import java.util.List;

public interface ClassroomBackgroundManagement {
    // 获取后台班级列表
    List<BackGroundClassroom> getBackgroundClassroom();

    // 创建班级
    boolean createClassroom(CreateClassroomDTO newClassroom);

    // 推荐班级
    boolean recommendClassroom(Integer classroomId);

    // 取消推荐
    boolean cancelRecommendClassroom(Integer classroomId);

    // 设置推荐序号
    boolean setRecommendSeq(Integer classroomId, Integer recommendSeq);

    // 关闭班级
    boolean closeClassroom(Integer classroomId);

    // 删除班级
    boolean deleteClassroom(Integer classroomId);
    // TODO：发送发布通知短信
}
