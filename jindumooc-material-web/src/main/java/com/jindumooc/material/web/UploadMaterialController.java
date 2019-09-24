package com.jindumooc.material.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.dto.material.FileDTO;
import com.jindumooc.material.service.UploadMaterial;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadMaterialController {
    @Reference
    private UploadMaterial uploadMaterial;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping(value = "/material/uploadFile")
    public boolean uploadFile(@RequestBody FileDTO fileDTO) {
        MultipartFile file = fileDTO.getMultipartFile();

        if (file.isEmpty()) {
            logger.warn("文件为空");
            return false;
        }
        //文件名称
        String fileName = file.getOriginalFilename();
        logger.info("文件名称为：" + fileName);

        //获取文件后缀名
        String fileNameExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        logger.info("文件后缀名为：" + fileNameExtension);

        //判断文件类型
        if (fileNameExtension.equals("avi") || fileNameExtension.equals("mpg") || fileNameExtension.equals("wmv") ||
                fileNameExtension.equals("3gp") || fileNameExtension.equals("mov") || fileNameExtension.equals("mp4") ||
                fileNameExtension.equals("asf") || fileNameExtension.equals("asx") ||
                fileNameExtension.equals("flv") || fileNameExtension.equals("mkv")) {
            return uploadMaterial.storeVideo(fileDTO);
        } else if (fileNameExtension.equals("ppt") || fileNameExtension.equals("docx") || fileNameExtension.equals("txt") ||
                fileNameExtension.equals("xlsx") || fileNameExtension.equals("pdf")) {
            return uploadMaterial.storeOfficeFile(fileDTO);
        } else if (fileNameExtension.equals("jpeg") || fileNameExtension.equals("jpg") || fileNameExtension.equals("png") ||
                fileNameExtension.equals("gif")) {
            return uploadMaterial.storePicture(fileDTO);
        }
        return false;
    }
}
