package com.jindumooc.user.service;

import com.jindumooc.vojo.AllRoles;
import com.jindumooc.vojo.BackGroundIndexUser;
import com.jindumooc.dto.SearchMessage;

import java.sql.Date;
import java.util.*;

public interface UserBackGroundManagement {

    List<BackGroundIndexUser> getIndexUser(int pageNum, int pageSize, String searchType, String searchparameter);

    List<BackGroundIndexUser> searchIndexUserByTime(String searchType, Date starTime, Date endTime);

    boolean lokedUser(SearchMessage searchMessage);

    List<AllRoles> getAllRoles();

    boolean updateUserRole(SearchMessage searchMessage);
}
