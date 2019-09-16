package com.jindumooc.vojo.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomCoursesShortcut implements Serializable{
    private Integer id;

    private Integer classroomid;

    private Integer courseid;
//
//    private Integer parentcourseid;
//
//    private Boolean disabled;
//
//    private Integer seq;
//
//    private Integer coursesetid;
}