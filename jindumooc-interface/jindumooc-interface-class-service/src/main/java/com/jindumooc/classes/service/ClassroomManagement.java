package com.jindumooc.classes.service;

import com.jindumooc.dto.classes.ClassroomReviewDTO;
import com.jindumooc.dto.classes.ClassroomThreadDTO;
import com.jindumooc.dto.classes.ClassroomThreadPostDTO;
import com.jindumooc.vojo.classes.*;
import com.jindumooc.vojo.user.Teacher;

import java.util.List;

public interface ClassroomManagement {
    String getClassroomIntroduction(Integer classroomId);

    List<ClassCourse> getClassroomCourse(Integer id);

    List<ClassReview> getClassroomReview(Integer pageNum, Integer pageSize, Integer classroomId);

    Boolean setClassroomReview(ClassroomReviewDTO classroomReviewDTO);

    List<Teacher> getClassroomTeacher(int pageNum, int pageSize, int classroomId);

    List<ClassroomNote> getClassroomNote(int pageNum, int pageSize, String orderBy, int classroomId, int courseId);

    List<ClassroomThread> getClassroomThread(int pageNum, int pageSize, int classroomId, String orderBy,String type,int nice);

    boolean setClassroomThread(ClassroomThreadDTO classroomThreadDTO);

    boolean modifyClassroomThread(ClassroomThreadDTO classroomThreadDTO);

    boolean updateClassroomThread(ClassroomThreadDTO classroomThreadDTO);

    List<ClassroomThreadPost> getClassroomThreadPost(int threadId, String posterType);

    Object setClassroomThreadPost(ClassroomThreadPostDTO classroomThreadPostDTO);

    Object setClassroomThreadNice(ClassroomThreadPostDTO classroomThreadPostDTO);
}
