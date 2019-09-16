package com.jindumooc.dto.group;

import lombok.Data;

import java.io.Serializable;

/**
 * 构建“查找组”类，根据小组状态、小组名、组长名找到该小组
 *
 * @author 马洪升
 * @date 2019年7月12日10:53:56
 */
@Data
public class SearchGroupDTO implements Serializable {
    private String groupStatus;
    private String groupTitle;
    private String groupOwnerName;
    private int pageNum;
    private int pageSize;
}
