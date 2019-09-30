package com.jindumooc.dto.course;

import lombok.Data;

import java.io.Serializable;

@Data
public class CourseSummaryNoticeDTO implements Serializable {
    private int userId;
    private String url;
    private int targetId;
    private String content;
    private String startTime;
    private String endTime;
}
