package com.jindumooc.vojo.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupIntroduction implements Serializable {
    private String groupTitle;
    private String groupIntroduction;
}
