package com.jindumooc.user.service;

import com.jindumooc.vojo.*;
import com.jindumooc.dto.SearchMessage;

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

    List<UserApproval> getUserApproval(SearchMessage sm);

    boolean updateApproval(SearchMessage sm);

    List<Messages> getAllMessages(SearchMessage sm);

    Boolean delMessages(List<Integer> idList);
}
