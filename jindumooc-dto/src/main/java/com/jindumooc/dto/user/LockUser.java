package com.jindumooc.dto.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LockUser implements Serializable {

    //封禁用户
    private int userId;

    //锁定用户
    private int locked;

}
