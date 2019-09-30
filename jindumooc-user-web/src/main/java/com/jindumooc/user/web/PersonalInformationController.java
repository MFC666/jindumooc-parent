package com.jindumooc.user.web;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.dto.user.Fans;
import com.jindumooc.pojo.Message;
import com.jindumooc.user.service.PersonalInformation;
import com.jindumooc.vojo.user.Messages;
import com.jindumooc.vojo.user.PersonalDetail;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonalInformationController {

    @Reference
    private PersonalInformation personalInformation;

    /**
     * 获取个人信息详情
     * @param userId
     * @return
     */
    @ApiOperation("获取个人信息详情")
    @GetMapping("/user/getPersonalDetail")
    @ResponseBody
    public Result getPersonalDetail(@RequestParam(defaultValue = "0") int userId){

        if(0 == userId){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(personalInformation.getPersonalDetail(userId));
    }

    @ApiOperation("更新个人信息详情")
    @PutMapping("/user/updatePersonalDetail")
    @ResponseBody
    public Result updatePersonalDetail(@RequestBody PersonalDetail personalDetail){

        if(personalDetail == null){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(personalInformation.updatePersonalDetail(personalDetail));
    }

    @ApiOperation("关注用户")
    @PutMapping("/user/followedUser")
    @ResponseBody
    public Result followedUser(@RequestBody Fans fans){
        if(fans == null){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(personalInformation.followedUser(fans));
    }

    @ApiOperation("取消关注")
    @PutMapping("/user/delFollowedUser")
    @ResponseBody
    public Result delFollowedUser(@RequestBody Fans fans){
        if(fans == null){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(personalInformation.delFollowedUser(fans));
    }

    @ApiOperation("发送私信")
    @PutMapping("/user/sendMessage")
    @ResponseBody
    public Result sendMessage(@RequestBody Messages messages){

        if(messages.equals(null)){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(personalInformation.sendMessage(messages));
    }

    @ApiOperation("已读私信")
    @PutMapping("/user/readMessage")
    @ResponseBody
    public Result readMessage(@RequestBody Messages messages){

        if(messages.equals(null)){

            return ResultGenerator.genFailResult("参数错误");
        }

        return ResultGenerator.genSuccessResult(personalInformation.sendMessage(messages));
    }

}
