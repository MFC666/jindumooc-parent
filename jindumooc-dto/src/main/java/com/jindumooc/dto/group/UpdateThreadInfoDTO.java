package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateThreadInfoDTO implements Serializable {
    private Integer threadId;
    private String title;
    private String content;
}
