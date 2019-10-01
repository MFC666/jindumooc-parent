package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.dto.user.*;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.vojo.user.*;

import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class UserBackGroundManagementController {

    @Reference
    private UserBackGroundManagement userBackGroundManagement;

    /**
     *
     * 参数过多采用post请求
     * @param sm 获取后台管理中用户管理的首页用户、搜索用户
     * @return
     */
    @ApiOperation("获取主页用户")
    @PostMapping("/user/getIndexUser")
    @ResponseBody
    public Result getIndexUser(@RequestBody SearchMessage sm)
    {
        if(sm==null){
            return ResultGenerator.genFailResult("参数出错");
        }

        List<BackGroundIndexUser> backGroundIndexUserList = userBackGroundManagement.getIndexUser(sm);

        return ResultGenerator.genSuccessResult(backGroundIndexUserList);
    }

    /**
     * 封禁用户
     * @param lockMessage 填写封禁用户信息
     * @return
     */
    @ApiOperation("封禁用户")
    @PutMapping("/user/lockedUser")
    @ResponseBody
    public Result lockedUser(@RequestBody LockUser lockMessage){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.lokedUser(lockMessage));
    }

    /**
     * 获取所有用户组名
     * @return
     */
    @ApiOperation("获取所有角色")
    @GetMapping("/user/getAllRoles")
    @ResponseBody
    public Result getAllRoles(){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.getAllRoles());
    }

    /**
     * 更新用户的用户组
     * @param userRole
     * @return
     */
    @ApiOperation("修改用户角色")
    @PutMapping("/user/updateUserRole")
    @ResponseBody
    public boolean updateUserRole(@RequestBody UserRole userRole){

        return userBackGroundManagement.updateUserRole(userRole);
    }

    /**
     * 获取用户数据统计
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ApiOperation("获取用户数据统计")
    @GetMapping("/user/getUserDataStatisticsList")
    @ResponseBody
    public List<UserDataStatistics> getUserDataStatisticsList(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10") int pageSize){
        return userBackGroundManagement.getUserDataStatisticsList(pageNum,pageSize);

    }

    /**
     * 搜索用户数据
     * @param pageNum
     * @param pageSize
     * @param nickName
     * @return
     */
    @ApiOperation("搜索用户数据统计")
    @GetMapping("/user/searchUserDataStatistics")
    @ResponseBody
    public List<UserDataStatistics> searchUserDataStatistics(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10")int pageSize,@RequestParam String nickName){
        return userBackGroundManagement.searchUserDataStatisticsByNickName(pageNum,pageSize,nickName);

    }

    /**
     * 导出用户数据Excel
     * @param
     * @param response
     * @throws IOException
     */
    @ApiOperation("导出用户数据统计")
    @GetMapping("/user/exportDataStatistics")
    @ResponseBody
    public void exportDataStatistics(@RequestParam(defaultValue = " ") String nickName,HttpServletResponse response) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("用户数据统计");
        List<UserDataStatistics> userDataStatisticsList = new ArrayList<>();
        if(" "==nickName){
            userDataStatisticsList = userBackGroundManagement.getUserDataStatisticsList(0,0);
        }else{
            userDataStatisticsList = userBackGroundManagement.searchUserDataStatisticsByNickName(0,0,nickName);
        }


        String fileName = "DataStatistics.xls";
        int rowNum = 1;
        String[] headers = {"用户ID","用户名","加入班级数","退出班级数","加入计划数","退出计划数","学完任务数","学习时长"};
        HSSFRow row = sheet.createRow(0);

        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString string = new HSSFRichTextString(headers[i]);
            cell.setCellValue(string);
        }

        for (UserDataStatistics userDataStatistics:userDataStatisticsList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(userDataStatistics.getUserId());
            row1.createCell(1).setCellValue(userDataStatistics.getNickName());
            row1.createCell(2).setCellValue(userDataStatistics.getJoinedClassroomNum());
            row1.createCell(3).setCellValue(userDataStatistics.getExitClassroomNum());
            row1.createCell(4).setCellValue(userDataStatistics.getJoinedCourseNum());
            row1.createCell(5).setCellValue(userDataStatistics.getExitCourseNum());
            row1.createCell(6).setCellValue(userDataStatistics.getFinishedTaskNum());
            row1.createCell(7).setCellValue(userDataStatistics.getLearnedSeconds());
            rowNum++;

        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }

    /**
     * 搜索教师
     * @param nickName 用户名
     * @return
     */
    @ApiOperation("搜索教师")
    @GetMapping("/user/getAllTeachers")
    @ResponseBody
    public Result getAllTeachers(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10") int pageSize,@RequestParam(defaultValue = "wu") String nickName){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.getAllTeachers(pageNum,pageSize,nickName));
    }

    /**
     *设置推荐教师
     * @param teacherPromoted
     * @return
     */
    @ApiOperation("设置推荐教师")
    @PutMapping("/user/updatePromoted")
    @ResponseBody
    public Result updatePromoted(@RequestBody TeacherPromoted teacherPromoted){


        return ResultGenerator.genSuccessResult(userBackGroundManagement.updatePromoted(teacherPromoted));
    }

    @ApiOperation("修改推荐序号")
    @PutMapping("/user/updatePromotedSeq")
    @ResponseBody
    public Result updatePromotedSeq(@RequestBody TeacherPromoted teacherPromoted){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.updatePromotedSeq(teacherPromoted));
    }

    /**
     * 搜索用户实名验证信息，参数过多采用post请求
     * @param sm
     * @return
     */
    @ApiOperation("获取用户实名认证")
    @PostMapping("/user/getUserApproval")
    @ResponseBody
    public List<UserApprovals> getUserApproval(@RequestBody SearchMessage sm){
        //获取实名认证信息，如果条件为空，则按页码进行全部搜索

        return userBackGroundManagement.getUserApproval(sm);

    }

    /**
     * 修改用户实名认证信息
     * @param userApproval
     * @return
     */
    @ApiOperation("修改用户实名认证状态")
    @PutMapping("/user/updateUserApproval")
    @ResponseBody
    public Result updateUserApproval(@RequestBody ApprovalUser userApproval){


        return ResultGenerator.genSuccessResult(userBackGroundManagement.updateApproval(userApproval));
    }

    /**
     * 获取后台管理所有私信
     * @param sm
     * @return
     */
    @ApiOperation("获取后台私信管理")
    @PostMapping("/user/getAllMessages")
    @ResponseBody
    public Result getAllMessages(@RequestBody SearchMessage sm){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.getAllMessages(sm));
    }

    /**
     * 删除私信
     * @param idList 需要删除的id列表
     * @return
     */
    @ApiOperation("删除私信")
    @DeleteMapping("/user/delMessages")
    @ResponseBody
    public Result delMessages(@RequestParam List<Integer> idList){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.delMessages(idList));
    }

    /**
     * 查看用户详情
     * @param
     * @return
     */
    @ApiOperation("查看用户详情")
    @GetMapping("/user/getUserDetail")
    @ResponseBody
    public Result getUserDetail(@RequestParam(defaultValue = "0") int userId){
        return ResultGenerator.genSuccessResult(userBackGroundManagement.getUserDetail(userId));
    }

    /**
     * 编辑用户信息
     * @param editUser
     * @return
     */
    @ApiOperation("编辑单个用户信息")
    @PutMapping("/user/updateUserDetail")
    @ResponseBody
    public Result updateUserDetail(@RequestBody EditUser editUser){

        return ResultGenerator.genSuccessResult(userBackGroundManagement.updateUserDetail(editUser));
    }

    /**
    上传头像
     */
    @PostMapping("/user/uploadAvatar")
    @ResponseBody
    public String uploadAvatar(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request)throws IllegalStateException, IOException{

        request.setCharacterEncoding("utf-8");
        if(!file.isEmpty()){
            String fileName = file.getOriginalFilename();
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            String filePath = InetAddress.getLocalHost().getHostAddress();
            fileName = UUID.randomUUID()+suffixName;
            File dest = new File(filePath+fileName);
            if(!dest.getParentFile().exists()){
                dest.getParentFile().mkdirs();
            }
            try {
                file.transferTo(dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String filename = "/temp-rainy/" + fileName;
            return filename;
        }
        return null;
    }
}
