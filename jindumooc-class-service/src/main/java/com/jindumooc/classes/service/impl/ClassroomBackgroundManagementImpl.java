package com.jindumooc.classes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.classes.service.ClassroomBackgroundManagement;
import com.jindumooc.dao.ClassroomMapper;
import com.jindumooc.dto.classes.CreateClassroomDTO;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomWithBLOBs;
import com.jindumooc.vojo.classes.BackGroundClassroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ClassroomBackgroundManagementImpl implements ClassroomBackgroundManagement {
    @Autowired
    private ClassroomMapper classroomMapper;

    /**
     * @return 获得后台管理课程列表
     */
    @Override
    public List<BackGroundClassroom> getBackgroundClassroom() {
        List<Classroom> list = classroomMapper.getAllClassroom();
        List<BackGroundClassroom> result = new ArrayList<>();
        list.forEach(each -> {
            String status = each.getStatus().equals("published") ? "已发布" : (each.getStatus().equals("closed") ? "已关闭" : "已关闭");
            result.add(new BackGroundClassroom(each.getId(), each.getTitle(), each.getCoursenum(), each.getStudentnum(), each.getPrice(), status));
        });
        return result;
    }

    /**
     * @param newClassroom 新班级
     * @return 创建新班级
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean createClassroom(CreateClassroomDTO newClassroom) {
            ClassroomWithBLOBs classroom = new ClassroomWithBLOBs();
            classroom.setTitle(newClassroom.getTitle());
            classroom.setShowable(newClassroom.getShowable());
            classroom.setBuyable(newClassroom.getBuyable());
            classroom.setStatus("closed");

            classroomMapper.insertSelective(classroom);
            return true;
    }

    /**
     * @param classroomId 推荐班级
     * @return 推荐班级
     */
    @Override
    public boolean recommendClassroom(Integer classroomId) {
        try{
            classroomMapper.updateRecommend(classroomId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * @param classroomId 取消推荐班级
     * @return 取消推荐班级
     */
    @Override
    public boolean cancelRecommendClassroom(Integer classroomId) {
        try{
            classroomMapper.cancelRecommend(classroomId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * @param classroomId 推荐班级
     * @param recommendSeq 设置推荐序列
     * @return 设置班级推荐序列
     */
    @Override
    public boolean setRecommendSeq(Integer classroomId, Integer recommendSeq) {
        try{
            classroomMapper.setRecommendSeq(classroomId,recommendSeq);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * @param classroomId 班级id
     * @return 关闭班级操作
     */
    @Override
    public boolean closeClassroom(Integer classroomId) {
        try{
            classroomMapper.closeClassroom(classroomId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * @param classroomId 班级id
     * @return 删除班级
     */
    @Override
    public boolean deleteClassroom(Integer classroomId) {
        try{
            classroomMapper.deleteByPrimaryKey(classroomId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    // TODO:转换时间，与前端对接后修改
    public String transformTime(int time){
        Date d = new Date(time*100L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        return sdf.format(d);
    }
}
