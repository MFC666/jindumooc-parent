package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class SetGroupInfoDTO implements Serializable {
    private Integer groupId;
    private String title;
    private String about;

}
