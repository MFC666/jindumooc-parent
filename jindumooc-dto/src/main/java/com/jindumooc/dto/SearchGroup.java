package com.jindumooc.dto;

import java.io.Serializable;

/**
 * 构建“查找组”类，根据小组状态、小组名、组长名找到该小组
 *
 * @author 马洪升
 * @date 2019年7月12日10:53:56
 */
public class SearchGroup implements Serializable {
    private String groupStatus;
    private String groupTitle;
    private String groupOwnerName;

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public String getGroupOwnerName() {
        return groupOwnerName;
    }

    public void setGroupOwnerName(String groupOwnerName) {
        this.groupOwnerName = groupOwnerName;
    }
}
