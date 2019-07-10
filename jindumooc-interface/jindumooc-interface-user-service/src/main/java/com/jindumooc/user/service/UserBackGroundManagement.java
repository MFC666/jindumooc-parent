package com.jindumooc.user.service;

import com.jindumooc.pojo.User;
import java.util.*;
import com.github.pagehelper.PageInfo;

public interface UserBackGroundManagement {
    List<User> getIndexUser(int pageNum,int pageSize);

    List<User> searchIndexUser(int pageNum, int pageSize, String searchType, String searchParameter);
}
