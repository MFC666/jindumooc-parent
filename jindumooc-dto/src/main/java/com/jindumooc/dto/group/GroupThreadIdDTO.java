package com.jindumooc.dto.group;

import lombok.Data;

@Data
public class GroupThreadIdDTO {
    private int threadID;

    public int getThreadID() {
        return threadID;
    }

    public void setThreadID(int threadID) {
        this.threadID = threadID;
    }
}
