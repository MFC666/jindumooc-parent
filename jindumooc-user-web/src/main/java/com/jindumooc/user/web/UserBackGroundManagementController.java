package com.jindumooc.user.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.user.service.UserBackGroundManagement;
import com.jindumooc.vojo.*;
import com.jindumooc.dto.SearchMessage;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class UserBackGroundManagementController {

    @Reference
    private UserBackGroundManagement userBackGroundManagement;

    /*获取后台管理中用户管理的首页用户、搜索用户
        pageNum:页码
        pageSize：每页大小
        searchType：搜索类型
        searchParameter：搜索数d据
        获取首页用户时type和parameter为null
     */
    @RequestMapping("/user/getIndexUser")
    @ResponseBody
    public List<BackGroundIndexUser> getIndexUser(@RequestBody SearchMessage sm)
    {
        return userBackGroundManagement.getIndexUser(sm);
    }

    /*
    封禁用户
     */
    @RequestMapping("/user/lockedUser")
    @ResponseBody
    public boolean lockedUser(@RequestBody int userId,int locked){
        SearchMessage searchMessage = new SearchMessage();
        searchMessage.setUserId(userId);
        searchMessage.setLocked(locked);
        return userBackGroundManagement.lokedUser(searchMessage);
    }

    /*
    获取所有用户组类型
     */
    @RequestMapping("/user/getAllRoles")
    @ResponseBody
    public List<AllRoles> getAllRoles(){

        return userBackGroundManagement.getAllRoles();
    }

    /*
    更新用户
     */
    @RequestMapping("/user/updateUserRole")
    @ResponseBody
    public boolean updateUserRole(@RequestBody String newRole,int userId){
        SearchMessage searchMessage = new SearchMessage();
        searchMessage.setUserId(userId);
        searchMessage.setNewRole(newRole);

        return userBackGroundManagement.updateUserRole(searchMessage);
    }

    /*
        用户数据统计
        searchParameter：用户名，默认null
        pageSize：每页用户数
        pageNum：页码
     */
    @RequestMapping("/user/getUserDataStatistics")
    @ResponseBody
    public List<UserDataStatistics> getUserDataStatistics(@RequestBody SearchMessage sm){
        return userBackGroundManagement.getUserDataStatistics(sm);

    }

    /*
    测试下载Excel表格，搜索用户的功能
     */

    @RequestMapping("/user/exportDataStatistics")
    @ResponseBody
    public void exportDataStatistics(@RequestBody SearchMessage sm,HttpServletResponse response) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("用户数据统计");
        List<UserDataStatistics> userDataStatisticsList = userBackGroundManagement.getUserDataStatistics(sm);

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

    /*
      搜索所有教师
     */
    @RequestMapping("/user/getAllTeachers")
    @ResponseBody
    public List<Teacher> getAllTeachers(@RequestBody SearchMessage sm){

        return userBackGroundManagement.getAllTeachers(sm);
    }

    /*
    更改是否推荐
     */
    @RequestMapping("/user/updatePromoted")
    @ResponseBody
    public boolean updatePromoted(@RequestBody SearchMessage sm){

        return userBackGroundManagement.updatePromoted(sm);
    }

    /*
    设置推荐序号
     */
    @RequestMapping("/user/updatePromotedSeq")
    @ResponseBody
    public boolean updatePromotedSeq(@RequestBody SearchMessage sm){

        return userBackGroundManagement.updatePromotedSeq(sm);
    }

    /*
    进行实名认证
     */
    @RequestMapping("/getUserApproval")
    @ResponseBody
    public List<UserApproval> getUserApproval(@RequestBody SearchMessage sm){
        //获取实名认证信息，如果条件为空，则按页码进行全部搜索

        return userBackGroundManagement.getUserApproval(sm);

    }

    /*
    修改实名认证状态
     */
    @RequestMapping("updateUserApproval")
    @ResponseBody
    public boolean updateUserApproval(@RequestBody SearchMessage sm){


        return userBackGroundManagement.updateApproval(sm);
    }

    /*
    获取所有私信
     */
    @RequestMapping("/user/getAllMessages")
    @ResponseBody
    public List<Messages> getAllMessages(@RequestBody SearchMessage sm){

        return userBackGroundManagement.getAllMessages(sm);
    }

    /*
    删除私信
     */
    @RequestMapping("/user/delMessages")
    @ResponseBody
    public Boolean delMessages(@RequestBody List<Integer> idList){

        return userBackGroundManagement.delMessages(idList);
    }
}
