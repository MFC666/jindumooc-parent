package com.jindumooc.dto.user;

import java.io.Serializable;

public class LockUser implements Serializable {

    //封禁用户
    private int userId;

    //锁定用户
    private int locked;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }
}
