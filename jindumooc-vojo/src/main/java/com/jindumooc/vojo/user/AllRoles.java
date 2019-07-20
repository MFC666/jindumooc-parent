package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllRoles implements Serializable {
    //用于用户组类型和id的储存

    private int id;
    private String code;
    private String name;

}
