package com.jindumooc.dto.group;

import lombok.Data;

@Data
public class SearchGroupInDBDTO {
    private String groupStatus;
    private String groupTitle;
    private int ownerId;
}
