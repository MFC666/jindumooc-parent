package com.jindumooc.material.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jindumooc.dao.CourseMaterialV8Mapper;
import com.jindumooc.dao.FileMapper;
import com.jindumooc.dto.material.FileDTO;
import com.jindumooc.material.VideoConvertToMP4;
import com.jindumooc.material.service.UploadMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Date;

@Service
public class UploadMaterialImpl implements UploadMaterial {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private CourseMaterialV8Mapper courseMaterialV8Mapper;

    @Autowired
    private FileMapper fileMapper;

    /**
     * 存储上传的视频
     *
     * @param fileDTO
     */
    @Override
    public boolean storeVideo(FileDTO fileDTO) {
        MultipartFile file = fileDTO.getMultipartFile();

        logger.info("上传开始..");
        //存储临时视频的文件夹
        String tempFilePath = "C:/Users/lenovo/Desktop/temp/";
        //存储最终转换后的视频的文件夹
        String finalFilePath = "C:/Users/lenovo/Desktop/video/";

        //检验文件夹是否存在、检验文件夹是否重名
        File TempFile = new File(tempFilePath);
        if (TempFile.exists()) {
            if (TempFile.isDirectory()) {
                logger.info("该文件夹存在..");
            } else {
                logger.info("同名的文件夹存在，不能创建文件夹..");
            }
        } else {
            logger.info("文件夹不存在，创建该文件夹..");
            TempFile.mkdir();
        }

        //文件名称
        String fileName = file.getOriginalFilename();
        logger.info("文件名称为：" + fileName);

        //获取文件后缀名
        String fileNameExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        logger.info("文件后缀名为：" + fileNameExtension);

        String originalPath = tempFilePath + fileName;
        String pureFileName = fileName.substring(0, fileName.lastIndexOf("."));

        //使用流进行存储
        try {
            logger.info("正在写入本地服务器..");
            String filePath;
            if (fileNameExtension.equals("mp4")) {
                filePath = finalFilePath;
            } else {
                filePath = tempFilePath;
            }
            InputStream inputStream = file.getInputStream();
            OutputStream outputStream = new FileOutputStream(new File(filePath, fileName));
            int length = 0;
            byte[] buffer = new byte[2048];

            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

            outputStream.close();
            outputStream.flush();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.info("========上传完成，开始调用转码工具类=======");

        //调用转码机制flv mp4 f4v m3u8 webm ogg放行直接播放，
        //asx，asf，mpg，wmv，3gp，mov，avi等进行其他转码为mp4
        if (fileNameExtension.equals("avi") || fileNameExtension.equals("rm")
                || fileNameExtension.equals("rmvb") || fileNameExtension.equals("wmv")
                || fileNameExtension.equals("3gp") || fileNameExtension.equals("mov")
                || fileNameExtension.equals("flv") || fileNameExtension.equals("ogg")
        ) {

            convertVideoNow(originalPath);   //调用转码
            logger.info("=================转码过程彻底结束=====================");
        }

        //获取转码后的mp4文件名
        pureFileName = pureFileName + ".mp4";
        String NewVideoPath = finalFilePath + pureFileName;
        logger.info("新视频的url:" + NewVideoPath);

        //删除临时文件
        File file2 = new File(tempFilePath);
        if (!file2.exists()) {
            logger.info("没有该文件");
        }
        if (!file2.isDirectory()) {
            logger.info("没有该文件夹");
        }
        String[] tempList = file2.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (tempFilePath.endsWith(File.separator)) {
                temp = new File(tempFilePath + tempList[i]);
            } else {
                temp = new File(tempFilePath + File.separator + tempList[i]);
            }
            if (temp.isFile() || temp.isDirectory()) {
                temp.delete();//删除文件夹里面的文件
            }
        }
        logger.info("所有的临时视频文件删除成功");

        //存入数据库，待写
        File finalFile = new File(NewVideoPath);
        long fileSize = finalFile.length();
        Date currentTime = new Date();
        int time = (int) (currentTime.getTime() / 1000);

        com.jindumooc.pojo.File fileToDB = new com.jindumooc.pojo.File();

        fileToDB.setUserid(fileDTO.getUserID());
        fileToDB.setGroupid(fileDTO.getFileGroupID());
        fileToDB.setMime(null);
        fileToDB.setSize(fileSize);
        fileToDB.setStatus(fileDTO.getFileStatus());
        fileToDB.setUploadfileid(null);
        fileToDB.setUri(NewVideoPath);
        fileToDB.setCreatedtime(time);

        fileMapper.insertSelective(fileToDB);
        return true;
    }

    /**
     * 存储办公文档
     *
     * @param fileDTO
     * @return
     */
    @Override
    public boolean storeOfficeFile(FileDTO fileDTO) {
        MultipartFile file = fileDTO.getMultipartFile();

        String filePath = "C:/Users/lenovo/Desktop/officeFile/";
        try {
            String fileName = file.getOriginalFilename();
            long fileSize = file.getSize();
            String url = filePath + fileName;
            Date currentTime = new Date();
            int time = (int) (currentTime.getTime() / 1000);

            //使用流进行存储
            logger.info("正在写入本地服务器..");
            InputStream inputStream = file.getInputStream();
            OutputStream outputStream = new FileOutputStream(new File(filePath, fileName));
            int length = 0;
            byte[] buffer = new byte[2048];

            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

            outputStream.close();
            outputStream.flush();
            inputStream.close();

            //存入数据库
            com.jindumooc.pojo.File fileToDB = new com.jindumooc.pojo.File();

            fileToDB.setUserid(fileDTO.getUserID());
            fileToDB.setGroupid(fileDTO.getFileGroupID());
            fileToDB.setMime(null);
            fileToDB.setSize(fileSize);
            fileToDB.setStatus(fileDTO.getFileStatus());
            fileToDB.setUploadfileid(null);
            fileToDB.setUri(url);
            fileToDB.setCreatedtime(time);

            fileMapper.insertSelective(fileToDB);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 存储图片
     *
     * @param fileDTO
     * @return
     */
    @Override
    public boolean storePicture(FileDTO fileDTO) {
        MultipartFile file = fileDTO.getMultipartFile();
        String filePath = "C:/Users/lenovo/Desktop/pictureFile/";
        try {
            String fileName = file.getOriginalFilename();
            long fileSize = file.getSize();
            String url = filePath + fileName;
            Date currentTime = new Date();
            int time = (int) (currentTime.getTime() / 1000);

            //使用流进行存储

            logger.info("正在写入本地服务器..");
            InputStream inputStream = file.getInputStream();
            OutputStream outputStream = new FileOutputStream(new File(filePath, fileName));
            int length = 0;
            byte[] buffer = new byte[2048];

            while ((length = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }

            outputStream.close();
            outputStream.flush();
            inputStream.close();


            //存入数据库
            com.jindumooc.pojo.File fileToDB = new com.jindumooc.pojo.File();

            fileToDB.setUserid(fileDTO.getUserID());
            fileToDB.setGroupid(fileDTO.getFileGroupID());
            fileToDB.setMime(null);
            fileToDB.setSize(fileSize);
            fileToDB.setStatus(fileDTO.getFileStatus());
            fileToDB.setUploadfileid(null);
            fileToDB.setUri(url);
            fileToDB.setCreatedtime(time);

            fileMapper.insertSelective(fileToDB);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 将视频进行转码
     *
     * @param originalPath
     */
    public void convertVideoNow(String originalPath) {
        try {
            // 转码和截图功能开始

            String filePath = originalPath;//web传入的源视频
            System.out.println("ConverVideoTest说:传入工具类的源视频为:" + filePath);

            VideoConvertToMP4 videoConvertToMP4 = new VideoConvertToMP4(filePath);//传入path
            String targetExtension = ".mp4";//设置转换的格式

            //删除源文件
            boolean beginConvert = videoConvertToMP4.beginConvert(targetExtension);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
