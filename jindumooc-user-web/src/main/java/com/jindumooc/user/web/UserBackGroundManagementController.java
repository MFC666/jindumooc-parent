package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.Result.Result;
import com.jindumooc.Result.ResultGenerator;
import com.jindumooc.dto.user.*;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.vojo.user.*;
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
    @PutMapping("/user/lockedUser")
    @ResponseBody
    public boolean lockedUser(@RequestBody LockUser lockMessage){

        return userBackGroundManagement.lokedUser(lockMessage);
    }

    /**
     * 获取所有用户组名
     * @return
     */
    @GetMapping("/user/getAllRoles")
    @ResponseBody
    public List<AllRoles> getAllRoles(){

        return userBackGroundManagement.getAllRoles();
    }

    /**
     * 更新用户的用户组
     * @param userRole
     * @return
     */
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
            row.createCell(0).setCellValue(userDataStatistics.getUserId());
            row.createCell(1).setCellValue(userDataStatistics.getNickName());
            row.createCell(2).setCellValue(userDataStatistics.getJoinedClassroomNum());
            row.createCell(3).setCellValue(userDataStatistics.getExitClassroomNum());
            row.createCell(4).setCellValue(userDataStatistics.getJoinedCourseNum());
            row.createCell(5).setCellValue(userDataStatistics.getExitCourseNum());
            row.createCell(6).setCellValue(userDataStatistics.getFinishedTaskNum());
            row.createCell(7).setCellValue(userDataStatistics.getLearnedSeconds());
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
    @GetMapping("/user/getAllTeachers")
    @ResponseBody
    public List<Teacher> getAllTeachers(@RequestParam(defaultValue = "1") int pageNum,@RequestParam(defaultValue = "10") int pageSize,@RequestParam(defaultValue = "") String nickName){

        return userBackGroundManagement.getAllTeachers(pageNum,pageSize,nickName);
    }

    /**
     *设置推荐教师
     * @param teacherPromoted
     * @return
     */
    @PutMapping("/user/updatePromoted")
    @ResponseBody
    public boolean updatePromoted(@RequestBody TeacherPromoted teacherPromoted){

        return userBackGroundManagement.updatePromoted(teacherPromoted);
    }

    @PutMapping("/user/updatePromotedSeq")
    @ResponseBody
    public boolean updatePromotedSeq(@RequestBody TeacherPromoted teacherPromoted){

        return userBackGroundManagement.updatePromotedSeq(teacherPromoted);
    }

    /**
     * 搜索用户实名验证信息，参数过多采用post请求
     * @param sm
     * @return
     */
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
    @PutMapping("/user/updateUserApproval")
    @ResponseBody
    public boolean updateUserApproval(@RequestBody ApprovalUser userApproval){


        return userBackGroundManagement.updateApproval(userApproval);
    }

    /**
     * 获取所有私信
     * @param sm
     * @return
     */
    @PostMapping("/user/getAllMessages")
    @ResponseBody
    public List<Messages> getAllMessages(@RequestBody SearchMessage sm){

        return userBackGroundManagement.getAllMessages(sm);
    }

    /**
     * 删除私信
     * @param idList 需要删除的id列表
     * @return
     */
    @DeleteMapping("/user/delMessages")
    @ResponseBody
    public Boolean delMessages(@RequestParam List<Integer> idList){

        return userBackGroundManagement.delMessages(idList);
    }

    /**
     * 查看用户详情
     * @param
     * @return
     */
    @GetMapping("/user/getUserDetail")
    @ResponseBody
    public UserDetail getUserDetail(@RequestParam(defaultValue = "0") int userId){
        return userBackGroundManagement.getUserDetail(userId);
    }

    /**
     * 编辑用户信息
     * @param editUser
     * @return
     */
    @PutMapping("/user/updateUserDetail")
    @ResponseBody
    public boolean updateUserDetail(@RequestBody EditUser editUser){

        return userBackGroundManagement.updateUserDetail(editUser);
    }

    /*
    上传头像
     */
    @RequestMapping("/user/uploadAvatar")
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
