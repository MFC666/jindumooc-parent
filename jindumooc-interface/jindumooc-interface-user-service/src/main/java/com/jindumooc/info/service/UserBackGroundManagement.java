package com.jindumooc.info.service;

import com.jindumooc.dto.user.*;
import com.jindumooc.vojo.user.*;

import java.util.*;

public interface UserBackGroundManagement {

    List<BackGroundIndexUser> getIndexUser(SearchMessage sm);

    boolean lokedUser(LockUser lockUser);

    List<AllRoles> getAllRoles();

    boolean updateUserRole(UserRole userRole);

    List<UserDataStatistics> getUserDataStatisticsList(int pageNum,int pageSize);

    List<Teacher> getAllTeachers(int pageNum,int pageSize,String nickName);

    boolean updatePromoted(TeacherPromoted teacherPromoted);

    boolean updatePromotedSeq(TeacherPromoted teacherPromoted);

    List<UserApprovals> getUserApproval(SearchMessage sm);

    boolean updateApproval(ApprovalUser approvalUser);

    List<Messages> getAllMessages(SearchMessage sm);

    Boolean delMessages(List<Integer> idList);

    UserDetail getUserDetail(int UserId);

    boolean updateUserDetail(EditUser editUser);

    List<UserDataStatistics> searchUserDataStatisticsByNickName(int pageNum, int pageSize, String nickName);
}
