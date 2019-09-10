package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class SetGroupLogoDTO implements Serializable {
    private Integer  groupId;
    private String logo;
}
