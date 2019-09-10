package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupThreadAllDTO implements Serializable {
    private Boolean isReward;//是否按照精华筛选
    private String screeningApproach;//筛选方式
    private Integer pageNum;
    private Integer pageSize;
}
