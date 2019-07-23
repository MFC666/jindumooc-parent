package com.jindumooc.dto.user;

import java.io.Serializable;

public class UserRole implements Serializable {
    //用户组信息
    private int userId;

    private String newRole;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNewRole() {
        return newRole;
    }

    public void setNewRole(String newRole) {
        this.newRole = newRole;
    }
}
