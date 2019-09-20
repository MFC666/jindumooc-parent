package com.jindumooc.classes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.jindumooc.classes.service.ClassroomManagement;
import com.jindumooc.dao.*;
import com.jindumooc.dto.classes.ClassroomReviewDTO;
import com.jindumooc.dto.classes.ClassroomThreadDTO;
import com.jindumooc.dto.classes.ClassroomThreadPostDTO;
import com.jindumooc.pojo.*;
import com.jindumooc.pojo.Thread;
import com.jindumooc.vojo.classes.*;
import com.jindumooc.vojo.user.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用于管理班级页面中，班级介绍、班级课程、评价、话题、笔记、师资
 */
@Service
@Transactional
public class ClassroomManagementImpl implements ClassroomManagement {


    @Autowired
    private ClassroomMapper classroomMapper;

    @Autowired
    private ClassroomReviewMapper classroomReviewMapper;

    @Autowired
    private ClassroomMemberMapper classroomMemberMapper;

    @Autowired
    private CourseNoteMapper courseNoteMapper;

    @Autowired
    private ThreadMapper threadMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ThreadPostMapper threadPostMapper;
    /**
     * 获取班级介绍
     * @param classroomId
     * @return
     */
    @Override
    public String getClassroomIntroduction(Integer classroomId) {
        List<String> classroomAboutList = classroomMapper.getClassroomAbout(classroomId);
        if(classroomAboutList.isEmpty()){
            return "无";
        }else{
            return classroomAboutList.get(0);
        }
    }

    /**
     * 获取班级课程
     * @param id：班级编号
     * @return
     */
    @Override
    public List<ClassCourse> getClassroomCourse(Integer id) {
        List<ClassCourse> classroomCourseList = classroomMapper.getClassCourse(id);
        return classroomCourseList;

    }

    /**
     * 获取班级课程
     * @param pageNum
     * @param pageSize
     * @param classroomId
     * @return
     */
    @Override
    public List<ClassReview> getClassroomReview(Integer pageNum, Integer pageSize, Integer classroomId) {

        List<ClassReview> classReviewList = new ArrayList<>();
        PageHelper.startPage(pageNum,pageSize);
        classReviewList = classroomReviewMapper.getClassroomReview(0,classroomId);
        if(classReviewList.get(0)!=null){
            for (int i=0;i<classReviewList.size();i++){
                if(classReviewList.get(i).getUpdateTime()!=0){
                    classReviewList.get(i).setCreatedTime(classReviewList.get(i).getUpdateTime());
                }
                classReviewList.get(i).setCreatedTimeString(transformTime(classReviewList.get(i).getCreatedTime()));

                List<ClassReview> childReviewList = classroomReviewMapper.getClassroomReview(classReviewList.get(i).getId(),classroomId);
                for(int n = 0;n<childReviewList.size();n++){
                    childReviewList.get(n).setCreatedTimeString(transformTime(childReviewList.get(n).getCreatedTime()));

                }

                classReviewList.get(i).setChildClassReview(childReviewList);

            }
        }



        return classReviewList;
    }

    @Override
    public Boolean setClassroomReview(ClassroomReviewDTO classroomReviewDTO) {

        classroomReviewMapper.setClassroomReview(classroomReviewDTO);

        return true;
    }

    @Override
    public List<Teacher> getClassroomTeacher(int pageNum, int pageSize, int classroomId) {
        PageHelper.startPage(pageNum,pageSize);
        List<Teacher> teacherList = classroomMemberMapper.getClassroomTeacher(classroomId);

        return teacherList;
    }

    /**
     * 获取班级的笔记
     * @param pageNum
     * @param pageSize
     * @param orderBy：排序依据
     * @param classroomId
     * @param courseId
     * @return
     */
    @Override
    public List<ClassroomNote> getClassroomNote(int pageNum, int pageSize, String orderBy, int classroomId, int courseId) {
        PageHelper.startPage(pageNum,pageSize,orderBy);
        List<ClassroomNote> classroomNoteList = courseNoteMapper.getClassroomNote(classroomId,courseId);

        for (int i=0;i<classroomNoteList.size();i++) {

            if (null != classroomNoteList.get(i)) {
                classroomNoteList.get(i).setCreatedTimeString(transformTime(classroomNoteList.get(i).getCreatedTime()));

            }
        }

        return classroomNoteList;
    }

    /**
     * 获取班级话题列表
     * @param pageNum
     * @param pageSize
     * @param classroomId：班级编号
     * @param orderBy：排序依据
     * @param type：话题or问题
     * @param nice：是否加精
     * @return
     */
    @Override
    public List<ClassroomThread> getClassroomThread(int pageNum, int pageSize, int classroomId, String orderBy,String type,int nice) {

//        ThreadExample threadExample = new ThreadExample();
//
//        ThreadExample.Criteria criteria = threadExample.createCriteria();
//
//        criteria.andIdEqualTo(classroomId);
//
//        threadExample.setOrderByClause("");
        PageHelper.startPage(pageNum,pageSize,"sticky DESC,"+orderBy+" DESC");
        List<ClassroomThread> classroomThreadList = threadMapper.getClassroomThread(classroomId,type,nice);
        for (int i=0;i<classroomThreadList.size();i++){
            classroomThreadList.get(i).setNewTime(((new Date().getTime() / 1000)-(classroomThreadList.get(i).getLastPostTime())));
            classroomThreadList.get(i).setLastPostUserNickName(userMapper.getUserNickName(classroomThreadList.get(i).getLastPostUserId()));
        }

        return classroomThreadList;
    }

    /**
     * 插入话题或者问题
     * @param classroomThreadDTO
     * @return
     */
    @Override
    public boolean setClassroomThread(ClassroomThreadDTO classroomThreadDTO) {

        classroomThreadDTO.setCreatedTime((int)(new Date().getTime() / 1000));
        threadMapper.setClassroomThread(classroomThreadDTO);

        return true;
    }

    /**
     * 加精、删除
     * @param classroomThreadDTO
     * @return
     */
    @Override
    public boolean modifyClassroomThread(ClassroomThreadDTO classroomThreadDTO) {


        if(classroomThreadDTO.getDelete()==1){
            //删除
            ThreadPostExample threadPostExample = new ThreadPostExample();
            ThreadPostExample.Criteria criteria = threadPostExample.createCriteria();
            criteria.andThreadidEqualTo(classroomThreadDTO.getThreadId());
            threadMapper.deleteByPrimaryKey(classroomThreadDTO.getThreadId());
            threadPostMapper.deleteByExample(threadPostExample);
        }else{
            Thread thread = new Thread();
            thread.setId(classroomThreadDTO.getThreadId());
            thread.setSticky(classroomThreadDTO.getSticky());
            thread.setNice(classroomThreadDTO.getNice());
            threadMapper.updateByPrimaryKey(thread);
        }
        return true;
    }

    @Override
    public boolean updateClassroomThread(ClassroomThreadDTO classroomThreadDTO) {

        threadMapper.updateClassroomThread(classroomThreadDTO);
        return true;
    }

    @Override
    public List<ClassroomThreadPost> getClassroomThreadPost(int threadId, String posterType) {

        List<ClassroomThreadPost> classroomThreadPostList = threadPostMapper.getClassroomThreadPost(threadId,posterType,0);
        for (int i= 0;i<classroomThreadPostList.size();i++){
            List<ClassroomThreadPost> classroomThreadPosts = threadPostMapper.getClassroomThreadPost(threadId,posterType,classroomThreadPostList.get(i).getThreadPostId());
            classroomThreadPostList.get(i).setCreatedNewTime(((new Date().getTime() / 1000)-(classroomThreadPostList.get(i).getCreatedTime())));
            classroomThreadPostList.get(i).setClassroomThreadPostList(classroomThreadPosts);
        }

        //修改查询次数

        Thread threadOri = threadMapper.selectByPrimaryKey(threadId);
        Thread thread = new Thread();
        thread.setId(threadId);
        thread.setHitnum(threadOri.getHitnum()+1);
        threadMapper.updateByPrimaryKey(thread);

        return classroomThreadPostList;
    }

    /**
     * 回复消息
     * @param classroomThreadPostDTO
     * @return
     */
    @Override
    public Object setClassroomThreadPost(ClassroomThreadPostDTO classroomThreadPostDTO) {


        //首先获取用户角色
        User user = userMapper.selectByPrimaryKey(classroomThreadPostDTO.getUserId());
        Thread threadOri = threadMapper.selectByPrimaryKey(classroomThreadPostDTO.getThreadId());
        ThreadPost threadPostOri = threadPostMapper.selectByPrimaryKey(classroomThreadPostDTO.getParentId());

        if(0 == classroomThreadPostDTO.getParentId()&&-1 != user.getRoles().indexOf("ROLE_TEACHER")){
            //说明话题被老师回答
            Thread thread = new Thread();
            thread.setId(classroomThreadPostDTO.getThreadId());
            Byte aByte = 1;
            thread.setSolved(aByte);
            thread.setPostnum(threadOri.getPostnum()+1);
            thread.setLastpostuserid(classroomThreadPostDTO.getUserId());
            thread.setLastposttime((int)(new Date().getTime() / 1000));
            thread.setUpdatetime((int)(new Date().getTime() / 1000));
            threadMapper.updateByPrimaryKey(thread);
        }else if(0 != classroomThreadPostDTO.getParentId()&&-1 != user.getRoles().indexOf("ROLE_TEACHER")){
            Thread thread = new Thread();
            thread.setId(classroomThreadPostDTO.getThreadId());
            thread.setPostnum(threadOri.getPostnum()+1);
            thread.setLastpostuserid(classroomThreadPostDTO.getUserId());
            thread.setLastposttime((int)(new Date().getTime() / 1000));
            thread.setUpdatetime((int)(new Date().getTime() / 1000));
            threadMapper.updateByPrimaryKey(thread);
            ThreadPost threadPost = new ThreadPost();
            threadPost.setId(classroomThreadPostDTO.getParentId());
            Byte aByte = 1;
            threadPost.setAdopted(aByte);
            threadPostMapper.updateByPrimaryKey(threadPost);
        }

        threadPostMapper.insertClassroomThreadPost(classroomThreadPostDTO);

        return true;
    }

    /**
     * 点赞
     * @param classroomThreadPostDTO
     * @return
     */
    @Override
    public Object setClassroomThreadNice(ClassroomThreadPostDTO classroomThreadPostDTO) {

        //点赞的为用户回复
        ThreadPost threadPostOri = threadPostMapper.selectByPrimaryKey(classroomThreadPostDTO.getThreadPostId());
        ThreadPost threadPost = new ThreadPost();
        threadPost.setId(classroomThreadPostDTO.getThreadPostId());
        threadPost.setUps(threadPostOri.getUps()+1);
        threadPostMapper.updateByPrimaryKey(threadPost);

        return true;
    }

    /**
     * 转换时间
     */
    public String transformTime(int originalTime){
        Date d = new Date(originalTime * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        return s;
    }

}
