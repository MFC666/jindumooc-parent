package com.jindumooc.course.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.course.service.CourseManagement;
import com.jindumooc.dao.*;
import com.jindumooc.dto.course.CourseQuestionDTO;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.course.CourseHomeworkResult;
import com.jindumooc.vojo.course.CourseTestScore;
import org.springframework.beans.factory.annotation.Autowired;
import sun.text.normalizer.NormalizerBase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 马洪升 2019年10月4日13:09:17
 */
@Service
public class CourseManagementImpl implements CourseManagement {

    @Autowired
    private QuestionCategoryMapper questionCategoryMapper;

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private TestpaperV8Mapper testpaperV8Mapper;

    @Autowired
    private TestpaperMapper testpaperMapper;

    @Autowired
    private TestpaperItemMapper testpaperItemMapper;

    @Autowired
    private TestpaperItemResultV8Mapper testpaperItemResultV8Mapper;

    @Autowired
    private TestpaperItemResultMapper testpaperItemResultMapper;

    @Autowired
    private TestpaperResultV8Mapper testpaperResultV8Mapper;

    /**
     * 创建题目，视前端情况来进行优化
     *
     * @param questionDTO
     * @return
     */
    @Override
    public boolean createQuestion(CourseQuestionDTO questionDTO) {
        try {
            QuestionWithBLOBs question = new QuestionWithBLOBs();
            question.setType(questionDTO.getType());
            question.setLessonid(questionDTO.getLessonId());
            question.setCourseid(questionDTO.getCourseId());
            question.setCoursesetid(questionDTO.getCourseSetId());
            question.setDifficulty(questionDTO.getDifficulty());
            question.setParentid(questionDTO.getParentId());
            question.setScore(questionDTO.getScore());
            question.setSubcount(questionDTO.getSubCount());
            question.setAnalysis(questionDTO.getAnalysis());
            question.setMetas(questionDTO.getMetas());
            question.setStem(questionDTO.getStem());

            question.setAnswer(questionDTO.getAnswer());

            question.setTarget("course-" + questionDTO.getTargetID());

            QuestionCategoryExample questionCategoryExample = new QuestionCategoryExample();
            QuestionCategoryExample.Criteria criteria = questionCategoryExample.createCriteria();
            criteria.andNameEqualTo(questionDTO.getCategoryName());
            List<QuestionCategory> questionCategories = questionCategoryMapper.selectByExample(questionCategoryExample);

            question.setCategoryid(questionCategories.get(0).getId());

            question.setCreateduserid(questionDTO.getCreatedUserId());
            question.setUpdateduserid(questionDTO.getCreatedUserId());

            question.setFinishedtimes(0);
            question.setPassedtimes(0);

            String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date).getTime();
            int currentTime = (int) (time / 1000);

            question.setCreatedtime(currentTime);
            question.setUpdatedtime(currentTime);

            question.setCopyid(0);
            questionMapper.insert(question);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 得到作业批阅结果
     *
     * @param courseSetID
     * @return
     */
    @Override
    public List<CourseHomeworkResult> getAllHomeworkResult(Integer courseSetID) {
        try {
            List<CourseHomeworkResult> courseHomeworkResults = new ArrayList<>();
            TestpaperV8Example testpaperV8Example = new TestpaperV8Example();
            TestpaperV8Example.Criteria criteria = testpaperV8Example.createCriteria();
            criteria.andCourseidEqualTo(courseSetID);
            criteria.andTypeEqualTo("homework");
            //得到所有作业试卷
            List<TestpaperV8> testpaperV8s = testpaperV8Mapper.selectByExample(testpaperV8Example);

            for (TestpaperV8 t : testpaperV8s) {
                CourseHomeworkResult courseHomeworkResult = new CourseHomeworkResult();
                courseHomeworkResult.setHomeworkName(t.getName());

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long time = new Long(t.getCreatedtime()) * 1000;
                String dateTime = simpleDateFormat.format(time);

                courseHomeworkResult.setTime(dateTime);

                int testID = t.getId();

                int checked = testpaperResultV8Mapper.getFinishedNum(testID);
                int checking = testpaperResultV8Mapper.getCheckingNum(testID);
                int notFinished = testpaperResultV8Mapper.getNotFinishedNum(testID);

                courseHomeworkResult.setChecked(checked);
                courseHomeworkResult.setChecking(checking);
                courseHomeworkResult.setNotFinished(notFinished);

                //计算合格率等统计信息
                List<CourseTestScore> firstScore = testpaperResultV8Mapper.getFirstScore(testID);
                List<CourseTestScore> bestScore = testpaperResultV8Mapper.getBestScore(testID);

                float wholeScore = t.getScore();
                int perfectNumFirst = 0;
                int goodNumFirst = 0;
                int qualifiedNumFirst = 0;
                int notPassNumFirst = 0;

                for (CourseTestScore c : firstScore) {
                    if (c.getScore() / wholeScore >= 1.0) {
                        perfectNumFirst++;
                    } else if (c.getScore() / wholeScore >= 0.80) {
                        goodNumFirst++;
                    } else if (c.getScore() / wholeScore > 0.60) {
                        qualifiedNumFirst++;
                    } else {
                        notPassNumFirst++;
                    }
                }
                courseHomeworkResult.setPerfectNumFirst(perfectNumFirst);
                courseHomeworkResult.setGoodNumFirst(goodNumFirst);
                courseHomeworkResult.setQualifiedNumFirst(qualifiedNumFirst);
                courseHomeworkResult.setNotPassNumFirst(notPassNumFirst);

                int perfectNum = 0;
                int goodNum = 0;
                int qualifiedNum = 0;
                int notPassNum = 0;
                for (CourseTestScore c : bestScore) {
                    if (c.getScore() / wholeScore >= 1.0) {
                        perfectNum++;
                    } else if (c.getScore() / wholeScore >= 0.80) {
                        goodNum++;
                    } else if (c.getScore() / wholeScore > 0.60) {
                        qualifiedNum++;
                    } else {
                        notPassNum++;
                    }
                }
                courseHomeworkResult.setPerfectNum(perfectNum);
                courseHomeworkResult.setGoodNum(goodNum);
                courseHomeworkResult.setQualifiedNum(qualifiedNum);
                courseHomeworkResult.setNotPassNum(notPassNum);

                int passed = bestScore.size() - notPassNum;
                float passPercent = (passed / bestScore.size()) * 100;
                String passedPercent = passPercent + "%";
                courseHomeworkResult.setQualifiedNumPercent(passedPercent);
                courseHomeworkResults.add(courseHomeworkResult);
            }
            return courseHomeworkResults;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
