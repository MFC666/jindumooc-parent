package com.jindumooc.dao;

import com.jindumooc.dto.classes.ClassroomReviewDTO;
import com.jindumooc.pojo.ClassroomReview;
import com.jindumooc.pojo.ClassroomReviewExample;
import com.jindumooc.pojo.ClassroomReviewWithBLOBs;
import java.util.List;

import com.jindumooc.vojo.classes.ClassReview;
import org.apache.ibatis.annotations.Param;

public interface ClassroomReviewMapper {
    int countByExample(ClassroomReviewExample example);

    int deleteByExample(ClassroomReviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomReviewWithBLOBs record);

    int insertSelective(ClassroomReviewWithBLOBs record);

    List<ClassroomReviewWithBLOBs> selectByExampleWithBLOBs(ClassroomReviewExample example);

    List<ClassroomReview> selectByExample(ClassroomReviewExample example);

    ClassroomReviewWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClassroomReviewWithBLOBs record, @Param("example") ClassroomReviewExample example);

    int updateByExampleWithBLOBs(@Param("record") ClassroomReviewWithBLOBs record, @Param("example") ClassroomReviewExample example);

    int updateByExample(@Param("record") ClassroomReview record, @Param("example") ClassroomReviewExample example);

    int updateByPrimaryKeySelective(ClassroomReviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ClassroomReviewWithBLOBs record);

    int updateByPrimaryKey(ClassroomReview record);

    List<ClassReview> getClassroomReview(@Param("parentId") int i, @Param("classroomId") Integer classroomId);

    void setClassroomReview(ClassroomReviewDTO classroomReviewDTO);
}