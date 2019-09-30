package com.jindumooc.material.service;

import com.jindumooc.dto.material.FileDTO;
import org.springframework.web.multipart.MultipartFile;

public interface UploadMaterial {

    boolean storeVideo(FileDTO file);

    boolean storeOfficeFile(FileDTO file);

    boolean storePicture(FileDTO file);
}
