package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.dao.*;
import com.jindumooc.pojo.QuestionFavoriteExample;
import com.jindumooc.user.service.MyLearning;
import com.jindumooc.vojo.user.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MyLearningImp implements MyLearning {


    @Autowired
    private CourseLessonLearnMapper courseLessonLearnMapper;

    @Autowired
    private ClassroomMemberMapper classroomMemberMapper;

    @Autowired
    private CourseThreadMapper courseThreadMapper;

    @Autowired
    private ThreadMapper threadMapper;

    @Autowired
    private CourseNoteMapper courseNoteMapper;

    @Autowired
    private TestpaperResultMapper testpaperResultMapper;

    @Autowired
    private QuestionFavoriteMapper questionFavoriteMapper;

    /**
     * 获取“我的课程”
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param learnStatus
     * @return
     */
    @Override
    public List<LearningCourse> getLearningCourse(int pageNum, int pageSize, int userId, String learnStatus) {
        PageHelper.startPage(pageNum,pageSize);


        return courseLessonLearnMapper.getLearningCourse(userId,learnStatus);
    }

    /**
     * 获取“我的班级”
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @Override
    public List<LearningClassroom> getLearningClassroom(int pageNum, int pageSize, int userId) {
        PageHelper.startPage(pageNum,pageSize);
        return classroomMemberMapper.getLearningClassroom(userId);


    }

    /**
     * 获取“我的问题”
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @Override
    public List<CourseThread> getMyQuestion(int pageNum, int pageSize, int userId) {
        PageHelper.startPage(pageNum,pageSize);
        return courseThreadMapper.getMyQuestion(userId);
    }

    /**
     * 获取“我的话题”
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param threadType：话题类型
     * @return
     */
    @Override
    public List<CourseThread> getMyDiscussion(int pageNum, int pageSize, int userId, String threadType) {
        List<CourseThread> myDiscussionList = new ArrayList<>();
        if(threadType=="courseMemberThread"){
            PageHelper.startPage(pageNum,pageSize);
            myDiscussionList = courseThreadMapper.getMyDiscussion(userId);
        }else if(threadType=="classMemberThread"){
            PageHelper.startPage(pageNum,pageSize);
            myDiscussionList = threadMapper.getMyDiscussion(userId);
        }else{
            return null;
        }
        return myDiscussionList;
    }

    /**
     * 获得学生笔记
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @Override
    public List<Note> getNoteList(int pageNum, int pageSize, int userId) {

        PageHelper.startPage(pageNum,pageSize);
        List<Note> noteList = courseNoteMapper.getNoteList(userId);

        for (int i= 0;i<noteList.size();i++) {
            noteList.get(i).setTransformedTime(transformTime(noteList.get(i).getUpdatedTime()));
        }


        return noteList;
    }

    /**
     * 获取笔记详情
     * @param pageNum
     * @param pageSize
     * @param userId
     * @param courseId
     * @return
     */
    @Override
    public List<Note> getNoteDetail(int pageNum, int pageSize, int userId, int courseId) {
        PageHelper.startPage(pageNum, pageSize);
        List<Note> noteList = courseNoteMapper.getNoteDetail(userId,courseId);

        for (int i = 0; i < noteList.size(); i++) {
            noteList.get(i).setTransformedTime(transformTime(noteList.get(i).getUpdatedTime()));
        }


        return noteList;
    }

    /**
     * 学生获取自己的考试成绩
     * @param pageNum
     * @param pageSize
     * @param userId
     * @return
     */
    @Override
    public List<TestPaperResult> getStudentTestPaper(int pageNum, int pageSize, int userId,String testPaperType) {
        PageHelper.startPage(pageNum,pageSize);
        return testpaperResultMapper.getStudentTestPaper(userId,testPaperType);
    }

    @Override
    public List<QuestionMessage> getFavoriteQuestion(int pageNum, int pageSize, int userId) {
        PageHelper.startPage(pageNum,pageSize);
        List<QuestionMessage> questionMessageList = questionFavoriteMapper.getFavoriteQuestion(userId);
        for (int i = 0; i< questionMessageList.size(); i++) {

            questionMessageList.get(i).setTransformedTime(transformTime(questionMessageList.get(i).getCreatedTime()));
        }


        return null;
    }

    /**
     * 取消收藏题目
     * @param questionId
     */
    @Override
    public void cancelCollection(int questionId) {

        QuestionFavoriteExample questionFavoriteExample = new QuestionFavoriteExample();
        QuestionFavoriteExample.Criteria criteria = questionFavoriteExample.createCriteria();
        criteria.andQuestionidEqualTo(questionId);
        questionFavoriteMapper.deleteByExample(questionFavoriteExample);

    }

    @Override
    public QuestionMessage getQuestionDetail(int questionId) {

        return questionFavoriteMapper.getQuestionDetail(questionId);
    }


    //转换时间
    public String transformTime(int time){
        Date d = new Date(time*100L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        return sdf.format(d);
    }
}
