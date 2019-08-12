package com.jindumooc.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole implements Serializable {
    //用户组信息
    private int userId;

    private String newRole;

}
