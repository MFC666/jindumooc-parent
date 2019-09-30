package com.jindumooc.user.service;

import com.jindumooc.vojo.user.LearningCourse;

import com.jindumooc.vojo.user.*;


import java.util.List;

public interface MyLearning {
    List<LearningCourse> getLearningCourse(int pageNum, int pageSize, int userId, String learnStatus);

    List<LearningClassroom> getLearningClassroom(int pageNum, int pageSize, int userId);

    List<CourseThread> getMyQuestion(int pageNum, int pageSize, int userId);

    List<CourseThread> getMyDiscussion(int pageNum, int pageSize, int userId, String threadType);

    List<Note> getNoteList(int pageNum, int pageSize, int userId);

    List<Note> getNoteDetail(int pageNum, int pageSize, int userId, int courseId);

    List<TestPaperResult> getStudentTestPaper(int pageNum, int pageSize, int userId,String testPaperTyte);

    List getFavoriteQuestion(int pageNum, int pageSize, int userId);

    void cancelCollection(int questionId);

    QuestionMessage getQuestionDetail(int questionId);

    Object getTestPaperDetail(int testPaperId, int userId);
}
