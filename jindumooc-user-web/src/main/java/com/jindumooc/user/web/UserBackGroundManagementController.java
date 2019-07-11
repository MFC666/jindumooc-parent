package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.pojo.User;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.vojo.BackGroundIndexUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserBackGroundManagementController {

    @Reference
    private UserBackGroundManagement userBackGroundManagement;

    /*获取后台管理中用户管理的首页用户、搜索用户
        pageNum:页码
        pageSize：每页大小
        searchType：搜索类型
        searchParameter：搜索数据
        获取首页用户时type和parameter为null
     */
    @RequestMapping("/getIndexUser")
    @ResponseBody
    public List<BackGroundIndexUser> getIndexUser()
    {
        String searchType = null;
        String searchParameter = null;
        int pageNum = 1;
        int pageSize = 1;
        return userBackGroundManagement.getIndexUser(pageNum,pageSize,searchType,searchParameter);
    }


}
