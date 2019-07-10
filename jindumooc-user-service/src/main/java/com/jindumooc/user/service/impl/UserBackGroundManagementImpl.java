package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jindumooc.dao.UserMapper;
import com.jindumooc.pojo.UserExample;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

@Service
public class UserBackGroundManagementImpl implements UserBackGroundManagement {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getIndexUser(int pageNum,int pageSize) {
        PageHelper.startPage(1,1);
        List<User> listUser = userMapper.getIndexUser();
        return listUser;

    }
}
