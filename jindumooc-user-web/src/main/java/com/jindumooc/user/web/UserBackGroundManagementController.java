package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.vojo.AllRoles;
import com.jindumooc.vojo.BackGroundIndexUser;
import com.jindumooc.dto.SearchMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
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
    public List<BackGroundIndexUser> getIndexUser(int pageNum,int pageSize,String searchType,String searchParameter)
    {
        return userBackGroundManagement.getIndexUser(pageNum,pageSize,searchType,searchParameter);
    }

    /*
    搜索用户通过时间
    searchType：时间类型
    starTime：开始时间
    endTime：结束时间
     */
    @RequestMapping("/searchIndexUserByTime")
    @ResponseBody
    public List<BackGroundIndexUser> searchIndexUserByTime(String searchType, Date starTime, Date endTime){
         return userBackGroundManagement.searchIndexUserByTime(searchType,starTime,endTime);
    }

    /*
    封禁用户
     */
    @RequestMapping("/lockedUser")
    @ResponseBody
    public boolean lockedUser(int userId,int locked){
        SearchMessage searchMessage = new SearchMessage();
        searchMessage.setUserId(userId);
        searchMessage.setLocked(locked);
        return userBackGroundManagement.lokedUser(searchMessage);
    }

    /*
    获取所有用户组类型
     */
    @RequestMapping("/getAllRoles")
    @ResponseBody
    public List<AllRoles> getAllRoles(){

        return userBackGroundManagement.getAllRoles();
    }

    /*
    更新用户
     */
    @RequestMapping("/updateUserRole")
    @ResponseBody
    public boolean updateUserRole(String newRole,int userId){
        SearchMessage searchMessage = new SearchMessage();
        searchMessage.setUserId(userId);
        searchMessage.setNewRole(newRole);

        return userBackGroundManagement.updateUserRole(searchMessage);
    }

    /*

     */
}
