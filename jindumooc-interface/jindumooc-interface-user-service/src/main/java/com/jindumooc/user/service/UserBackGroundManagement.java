package com.jindumooc.user.service;

import com.jindumooc.vojo.AllRoles;
import com.jindumooc.vojo.BackGroundIndexUser;
import com.jindumooc.dto.SearchMessage;
import com.jindumooc.vojo.UserDataStatistics;

import java.util.*;

public interface UserBackGroundManagement {

    List<BackGroundIndexUser> getIndexUser(SearchMessage sm);

    boolean lokedUser(SearchMessage searchMessage);

    List<AllRoles> getAllRoles();

    boolean updateUserRole(SearchMessage searchMessage);

    List<UserDataStatistics> getUserDataStatistics(SearchMessage sm);
}
