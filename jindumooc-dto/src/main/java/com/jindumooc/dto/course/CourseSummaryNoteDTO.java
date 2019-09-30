package com.jindumooc.dto.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseSummaryNoteDTO implements Serializable {
    private int courseId;
    private String sort;
    private int taskId;
}
