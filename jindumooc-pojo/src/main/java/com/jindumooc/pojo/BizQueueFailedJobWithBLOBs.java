package com.jindumooc.pojo;

public class BizQueueFailedJobWithBLOBs extends BizQueueFailedJob {
    private String body;

    private String reason;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}