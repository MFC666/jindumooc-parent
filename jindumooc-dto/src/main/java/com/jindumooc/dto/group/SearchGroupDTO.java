package com.jindumooc.dto.group;

import java.io.Serializable;

/**
 * 构建“查找组”类，根据小组状态、小组名、组长名找到该小组
 *
 * @author 马洪升
 * @date 2019年7月12日10:53:56
 */
public class SearchGroupDTO implements Serializable {
    private String groupStatus;
    private String groupTitle;
    private String groupOwnerName;
    private int pageNum;
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

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
