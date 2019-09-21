package com.jindumooc.group.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.CourseMaterialV8Mapper;
import com.jindumooc.dao.CourseSetV8Mapper;
import com.jindumooc.dao.CourseTaskMapper;
import com.jindumooc.dao.CourseV8Mapper;
import com.jindumooc.group.service.CourseTeachingPlan;
import com.jindumooc.pojo.*;
import com.jindumooc.vojo.course.CourseTeachingCatalog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseTeachingPlanImpl implements CourseTeachingPlan {
    @Autowired
    private CourseV8Mapper courseV8Mapper;// 教学计划表

    @Autowired
    private CourseTaskMapper courseTaskMapper;// 教学任务表，目录中存储的是教学任务

    @Autowired
    private CourseSetV8Mapper courseSetV8Mapper;// 该教学计划所属课程关系表

    @Autowired
    private CourseMaterialV8Mapper courseMaterialV8Mapper;// 教学资料关系表


    /**
     * 得到某一课程教学计划中的目录，目录中包含教学任务
     *
     * @return
     */
    @Override
    public List<CourseTeachingCatalog> getSpecificTeachingPlan(Integer courseID) {
        try {
            List<CourseTeachingCatalog> courseTeachingCatalogs = new ArrayList<>();

            CourseTaskExample courseTaskExample = new CourseTaskExample();
            courseTaskExample.setOrderByClause("`seq` ASC");
            CourseTaskExample.Criteria criteria = courseTaskExample.createCriteria();
            criteria.andCourseidEqualTo(courseID);

            List<CourseTask> courseTasks = courseTaskMapper.selectByExample(courseTaskExample);

            int lessonID = 0;
            for (CourseTask c : courseTasks) {
                String taskName = "任务";
                String seq = c.getSeq().toString();
                String title = c.getTitle();
                taskName += seq + title;

                String type = c.getType();

                lessonID = c.getActivityid();

                CourseMaterialV8Example courseMaterialV8Example = new CourseMaterialV8Example();
                CourseMaterialV8Example.Criteria criteria1 = courseMaterialV8Example.createCriteria();
                criteria1.andLessonidEqualTo(lessonID);

                List<CourseMaterialV8> courseMaterialV8 = courseMaterialV8Mapper.selectByExample(courseMaterialV8Example);

                String link = courseMaterialV8.get(0).getLink();

                CourseTeachingCatalog courseTeachingCatalog = new CourseTeachingCatalog();
                courseTeachingCatalog.setTaskName(taskName);
                courseTeachingCatalog.setLink(link);
                courseTeachingCatalog.setType(type);
                courseTeachingCatalogs.add(courseTeachingCatalog);
            }
            return courseTeachingCatalogs;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
