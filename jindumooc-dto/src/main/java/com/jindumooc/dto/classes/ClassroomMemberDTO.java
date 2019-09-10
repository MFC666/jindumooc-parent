package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomMemberDTO implements Serializable{
    private Integer classroomId;
    private Integer userId;
    private Integer deadline;
}
