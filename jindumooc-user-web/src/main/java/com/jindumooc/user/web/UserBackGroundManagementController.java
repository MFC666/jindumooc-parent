package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.pojo.User;
import com.jindumooc.user.service.UserBackGroundManagement;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserBackGroundManagementController {

    @Reference
    private UserBackGroundManagement userBackGroundManagement;

    //获取后台管理中用户管理的首页
    @RequestMapping("/getIndexUser")
    @ResponseBody
    public List<User> getIndexUser()
    {
        int pageNum = 1;
        int pageSize = 1;
        return userBackGroundManagement.getIndexUser(pageNum,pageSize);
    }
}
