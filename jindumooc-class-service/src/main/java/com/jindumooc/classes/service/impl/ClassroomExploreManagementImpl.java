package com.jindumooc.classes.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.classes.service.ClassroomExploreManagement;
import com.jindumooc.dao.ClassroomMapper;
import com.jindumooc.dao.CourseMemberMapper;
import com.jindumooc.dao.FriendMapper;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.pojo.Classroom;
import com.jindumooc.pojo.ClassroomWithBLOBs;
import com.jindumooc.pojo.User;
import com.jindumooc.vojo.classes.ClassroomExplore;
import com.jindumooc.vojo.classes.ClassroomPresentation;
import com.jindumooc.vojo.classes.ClassroomTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class ClassroomExploreManagementImpl implements ClassroomExploreManagement {
    @Autowired
    private ClassroomMapper classroomMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CourseMemberMapper courseMemberMapper;
    @Autowired
    private FriendMapper friendMapper;

    /**
     * @param sort 排序选项
     * @return 获取所有班级信息
     * @author 唐欣然
     */
    @Override
    public List<ClassroomExplore> getAllExploreClassroom(String sort) {
        List<Classroom> list = classroomMapper.getAllClassroom();
        List<ClassroomExplore> result = new ArrayList<>();
        // 排序
        list = sortClassroom(sort, list);
        list.forEach(each -> {
            if (each.getStatus().equals("published"))
                result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
        });
        return result;
    }

    /**
     * @param sort 排序选项
     * @return 获取免费班级信息
     * @author 唐欣然
     */
    @Override
    public List<ClassroomExplore> getFreeExploreClassroom(String sort) {
        List<Classroom> list = classroomMapper.getAllClassroom();
        List<ClassroomExplore> result = new ArrayList<>();
        // 排序
        list = sortClassroom(sort, list);
        list.forEach(each -> {
            if (each.getStatus().equals("published"))
                if (each.getPrice() == 0)
                    result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));

        });
        return result;
    }

    /**
     * @param sort   排序选项
     * @param filter 筛选条件
     * @param free   是否免费
     * @return 获得筛选班级信息
     */
    @Override
    public List<ClassroomExplore> getFilteredClassroom(String sort, String filter, boolean free) {
        List<Classroom> list = classroomMapper.getAllClassroom();
        List<ClassroomExplore> result = new ArrayList<>();
        // 排序
        list = sortClassroom(sort, list);
        list.forEach(each -> {
            if (each.getStatus().equals("published"))
                if (free) {
                    // 选取免费班级
                    switch (filter) {
                        case ("primary"):
                            if (each.getCategoryid() == 7)
                                if (each.getPrice() == 0)
                                    result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
                            break;
                        case ("middle"):
                            if (each.getCategoryid() == 8)
                                if (each.getPrice() == 0)
                                    result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
                            break;
                        case ("high"):
                            if (each.getCategoryid() == 12)
                                if (each.getPrice() == 0)
                                    result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
                            break;
                    }
                } else {
                    switch (filter) {
                        case ("primary"):
                            if (each.getCategoryid() == 7)
                                result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
                            break;
                        case ("middle"):
                            if (each.getCategoryid() == 8)
                                result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
                            break;
                        case ("high"):
                            if (each.getCategoryid() == 12)
                                result.add(new ClassroomExplore(each.getId(), each.getTitle(), each.getSmallpicture(), each.getCoursenum(), each.getStudentnum(), each.getPostnum(), each.getService()));
                            break;
                    }
                }

        });
        return result;
    }

    /**
     * @param id 班级id
     * @return 查看单个班级课程相关信息
     * @author 唐欣然
     */
    @Override
    public ClassroomPresentation getClassroom(Integer id) {
        ClassroomWithBLOBs classroomWithBLOBs = classroomMapper.selectByPrimaryKey(id);
        String status = classroomWithBLOBs.getStatus().equals("published") ? "已发布" : (classroomWithBLOBs.getStatus().equals("closed") ? "已关闭" : "未发布");
        String expire = classroomWithBLOBs.getExpirymode().equals("forever") ? "永久有效" : classroomWithBLOBs.getExpiryvalue() + " 天";
        String price = classroomWithBLOBs.getPrice() == 0 ? "免费" : classroomWithBLOBs.getPrice() + " 元";
        // 班主任
        User temp = classroomWithBLOBs.getHeadteacherid() != 0 ? userMapper.selectByPrimaryKey(classroomWithBLOBs.getHeadteacherid()) : null;
        Integer count = temp != null ? courseMemberMapper.selectCourseCount(temp.getId()) : 0;
        Integer follow = temp != null ? friendMapper.countUserFollow(temp.getId()) : 0;
        Integer fan = temp != null ? friendMapper.countUserFan(temp.getId()) : 0;
        ClassroomTeacher teacher = temp != null ? new ClassroomTeacher(temp.getId(), temp.getNickname(), temp.getTitle(), temp.getSmallavatar(), "|headTeacher|", count, follow, fan) : null;
        return new ClassroomPresentation(classroomWithBLOBs.getId(), classroomWithBLOBs.getTitle(), price, classroomWithBLOBs.getLargepicture(), teacher, classroomWithBLOBs.getStudentnum(), classroomWithBLOBs.getCoursenum(), classroomWithBLOBs.getNotenum(), classroomWithBLOBs.getPostnum(), classroomWithBLOBs.getService(), expire, classroomWithBLOBs.getRatingnum(), status);
    }

    /**
     * @param sort         排序模式
     * @param unsortedList 班级列表
     * @return 排序后的班级列表
     */
    private List<Classroom> sortClassroom(String sort, List<Classroom> unsortedList) {
        switch (sort) {
            case "new":
                unsortedList.sort((o1, o2) -> {
                    // 这里按照时间先后，那么createTime越大越优先
                    return Integer.compare(o2.getCreatedtime() - o1.getCreatedtime(), 0);
                });
                break;
            case "hot":
                unsortedList.sort((o1, o2) -> {
                    // 热度越大越优先
                    return Integer.compare(o2.getHotseq() - o1.getHotseq(), 0);
                });
                break;
            case "recommend":
                unsortedList.sort((o1, o2) -> {
                    // 都被推荐了,比较推荐序列
                    Integer r1 = o1.getRecommended() ? 1 : 0;
                    Integer r2 = o2.getRecommended() ? 1 : 0;
                    // 热度越大越优先
                    return Integer.compare(o2.getRecommendedseq() * r2 - o1.getRecommendedseq() * r1, 0);
                });
                break;
        }
        return unsortedList;
    }
    // TODO:转换时间，与前端对接后修改
    public String transformTime(int time){
        Date d = new Date(time*100L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        return sdf.format(d);
    }
}
