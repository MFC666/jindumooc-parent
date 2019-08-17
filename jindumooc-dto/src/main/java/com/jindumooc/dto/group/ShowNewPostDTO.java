package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShowNewPostDTO implements Serializable {
    private Integer groupId;
    private Integer memberNumber;
}
