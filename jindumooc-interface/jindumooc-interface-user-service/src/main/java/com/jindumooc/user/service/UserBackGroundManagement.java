package com.jindumooc.user.service;

import com.jindumooc.pojo.User;
import java.util.*;
import com.jindumooc.vojo.BackGroundIndexUser;

public interface UserBackGroundManagement {

    List<BackGroundIndexUser> getIndexUser(int pageNum, int pageSize, String searchType, String searchparameter);
}
