package com.jindumooc.dto.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomCoursesDTO implements Serializable{
    private Integer id;

    private Integer classroomid;

    private Integer courseid;
}
