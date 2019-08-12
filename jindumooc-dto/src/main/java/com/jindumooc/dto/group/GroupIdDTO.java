package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupIdDTO implements Serializable {
    private Integer groupID;

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }
}