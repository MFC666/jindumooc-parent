package com.jindumooc.vojo;

import java.io.Serializable;

/**
 * 用户后台“小组话题管理”模块，“小组管理”展示
 * 与全端对应的实体类
 *
 * @author 马洪升
 * @date 2019年7月12日09:51:28
 */
public class BackGroundIndexGroup implements Serializable {
    // 需要展示的属性
    private int groupID;
    private String groupTitle;
    private int groupOwnerID;
    private int groupMemberNum;
    private int groupThreadNum;
    private int groupPostNum;
    private String groupStatus;

    // 所有Getter&&Setter方法
    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupTitle() {
        return groupTitle;
    }

    public void setGroupTitle(String groupTitle) {
        this.groupTitle = groupTitle;
    }

    public int getGroupOwnerID() {
        return groupOwnerID;
    }

    public void setGroupOwnerID(int groupOwnerID) {
        this.groupOwnerID = groupOwnerID;
    }

    public int getGroupMemberNum() {
        return groupMemberNum;
    }

    public void setGroupMemberNum(int groupMemberNum) {
        this.groupMemberNum = groupMemberNum;
    }

    public int getGroupThreadNum() {
        return groupThreadNum;
    }

    public void setGroupThreadNum(int groupThreadNum) {
        this.groupThreadNum = groupThreadNum;
    }

    public int getGroupPostNum() {
        return groupPostNum;
    }

    public void setGroupPostNum(int groupPostNum) {
        this.groupPostNum = groupPostNum;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
    }

}
