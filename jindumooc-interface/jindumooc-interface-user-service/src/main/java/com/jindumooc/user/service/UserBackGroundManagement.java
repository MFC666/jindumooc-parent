package com.jindumooc.user.service;

import com.jindumooc.pojo.User;
import java.util.*;
import com.github.pagehelper.PageInfo;
import com.jindumooc.vojo.BackGroundIndexUser;

public interface UserBackGroundManagement {
    List<BackGroundIndexUser> getIndexUser(int pageNum, int pageSize);

    //List<User> searchIndexUser(int pageNum, int pageSize);
}
