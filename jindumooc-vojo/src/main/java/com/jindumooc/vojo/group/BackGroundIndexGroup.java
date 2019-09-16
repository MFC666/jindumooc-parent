package com.jindumooc.vojo.group;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户后台“小组话题管理”模块，“小组管理”展示
 * 与全端对应的实体类
 *
 * @author 马洪升
 * @date 2019年7月12日09:51:28
 */
@Data
public class BackGroundIndexGroup implements Serializable {
    // 需要展示的属性
    private int groupID;
    private String groupTitle;
    private String groupOwnerName;
    private int groupMemberNum;
    private int groupThreadNum;
    private int groupPostNum;
    private String groupStatus;
}
