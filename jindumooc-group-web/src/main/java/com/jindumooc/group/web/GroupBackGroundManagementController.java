package com.jindumooc.group.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.SearchGroup;
import com.jindumooc.group.service.GroupBackGroundManagement;
import com.jindumooc.vojo.ground.BackGroundIndexGroup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GroupBackGroundManagementController {

    @Reference
    private GroupBackGroundManagement groupBackGroundManagement;

    @RequestMapping("/getIndexGroup")
    @ResponseBody
    public List<BackGroundIndexGroup> getIndexGroup(SearchGroup searchGroup)
    {
        return groupBackGroundManagement.getIndexGroup(searchGroup);
    }

}
