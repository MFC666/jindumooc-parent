package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateClassroomDTO implements Serializable{
    // 班级名称
    private String title;
    // 班级展示
    private Boolean showable;
    // 班级购买
    private Boolean buyable;
    // 状态 （初始为未发布）
    private String status = "closed";
}
