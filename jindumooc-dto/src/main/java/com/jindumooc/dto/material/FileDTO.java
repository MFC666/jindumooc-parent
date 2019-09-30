package com.jindumooc.dto.material;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
public class FileDTO implements Serializable {
    private MultipartFile multipartFile;
    private Integer fileGroupID;
    private Integer userID;
    private Byte fileStatus;
}
