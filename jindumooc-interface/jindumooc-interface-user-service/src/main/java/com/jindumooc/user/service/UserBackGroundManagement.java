package com.jindumooc.user.service;

import com.jindumooc.pojo.User;
import com.jindumooc.vojo.BackGroundIndexUser;

import java.util.*;

public interface UserBackGroundManagement {

    List<BackGroundIndexUser> getIndexUser(int pageNum, int pageSize, String searchType, String searchparameter);
}
