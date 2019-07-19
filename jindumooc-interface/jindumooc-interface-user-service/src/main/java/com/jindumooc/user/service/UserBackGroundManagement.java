package com.jindumooc.user.service;

import com.jindumooc.dto.user.EditUser;
import com.jindumooc.dto.user.SearchMessage;
import com.jindumooc.vojo.user.*;

import java.util.*;

public interface UserBackGroundManagement {

    List<BackGroundIndexUser> getIndexUser(SearchMessage sm);

    boolean lokedUser(SearchMessage searchMessage);

    List<AllRoles> getAllRoles();

    boolean updateUserRole(SearchMessage searchMessage);

    List<UserDataStatistics> getUserDataStatistics(SearchMessage sm);

    List<Teacher> getAllTeachers(SearchMessage sm);

    boolean updatePromoted(SearchMessage sm);

    boolean updatePromotedSeq(SearchMessage sm);

    List<UserApprovals> getUserApproval(SearchMessage sm);

    boolean updateApproval(SearchMessage sm);

    List<Messages> getAllMessages(SearchMessage sm);

    Boolean delMessages(List<Integer> idList);

    UserDetail getUserDetail(SearchMessage sm);

    boolean updateUserDetail(EditUser editUser);
}
