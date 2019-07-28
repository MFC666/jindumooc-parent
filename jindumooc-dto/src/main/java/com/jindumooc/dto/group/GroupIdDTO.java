package com.jindumooc.dto.group;

import lombok.Data;

@Data
public class GroupIdDTO {
    private Integer groupID;

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }
}