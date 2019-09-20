package com.jindumooc.dao;


import com.jindumooc.dto.classes.CreateClassroomDTO;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomExample;
import com.jindumooc.pojo.ClassroomWithBLOBs;
import com.jindumooc.vojo.classes.ClassCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassroomMapper {
    int countByExample(ClassroomExample example);

    int deleteByExample(ClassroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomWithBLOBs record);

    int insertSelective(ClassroomWithBLOBs record);

    List<ClassroomWithBLOBs> selectByExampleWithBLOBs(ClassroomExample example);

    List<Classroom> selectByExample(ClassroomExample example);

    ClassroomWithBLOBs selectByPrimaryKey(Integer id);


    /**
     * @param id 班级id
     * @return 选择班级
     * @author 唐欣然 2019/07/23
     */
    Classroom selectClassroom(Integer id);

    int updateByExampleSelective(@Param("record") ClassroomWithBLOBs record, @Param("example") ClassroomExample example);

    int updateByExampleWithBLOBs(@Param("record") ClassroomWithBLOBs record, @Param("example") ClassroomExample example);

    int updateByExample(@Param("record") Classroom record, @Param("example") ClassroomExample example);

    int updateByPrimaryKeySelective(ClassroomWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClassroomWithBLOBs record);

    int updateByPrimaryKey(Classroom record);


    /**
     * @return 班级列表
     * @author 唐欣然 2019/07/23
     */
    List<Classroom> getAllClassroom();

    /**
     * 增加课程数量
     *
     * @author 唐欣然
     */
    void updateCourseNumber(Integer id);

    /**
     * 减少课程数量
     *
     * @author 唐欣然
     */
    void decreaseCourseNumber(Integer id);

    /**
     * 添加新的班级
     * @param record 新班级
     */
    void insertNewClassroom(@Param("record") CreateClassroomDTO record);

    /**
     * 推荐班级
     * @param id 推荐班级Id
     */
    void updateRecommend(@Param("id") Integer id);

    /**
     * 取消推荐班级
     * @param id 推荐班级Id
     */
    void cancelRecommend(@Param("id") Integer id);

    /**
     * 设置班级推荐序列
     * @param id 班级id
     * @param recommendedSeq 推荐序列
     */
    void setRecommendSeq(@Param("id") Integer id, @Param("recommendSeq") Integer recommendedSeq);

    /**
     * 关闭班级
     * @param id 班级id
     */
    void closeClassroom(@Param("id") Integer id);

    /**
     * 设置班级班主任
     * @param cId 班级Id
     * @param tId 教师Id
     */
    void updateHeadTeacher(@Param("cId") Integer cId, @Param("tId") Integer tId);

    void getTeachingClassroom(@Param("teacherId") int teacherId, @Param("nowTime") long nowTime);

    /**
     * 增加班级学员数量
     * @param id 班级Id
     */
    void updateStudentNumber(Integer id);

    /**
     * 减少班级学员数量
     * @param id 班级Id
     */
    void decreaseStudentNumber(Integer id);

    /**
     * 获取班级介绍
     * @param classroomId
     * @return
     */
    List<String> getClassroomAbout(@Param("classroomId") Integer classroomId);

    List<ClassCourse> getClassCourse(@Param("classroomId") Integer id);
}