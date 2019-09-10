package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupThreadDTO implements Serializable {
    private String title;
    private Integer groupId;
    private Integer userId;
    private String type;
    private String content;
}
