package com.jindumooc.vojo.group;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GroupNew implements Serializable {
    private String groupTitle;
    private String groupLogo;
    private Date groupCreatedDate;
}
