package com.jindumooc.vojo.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Messages implements Serializable {
    //用于储存私信
    private Integer id;

    private String type;

    private Integer fromId;

    private Integer toId;

    private String content;

    private String createdTime;

    private int totalMessages;


}
