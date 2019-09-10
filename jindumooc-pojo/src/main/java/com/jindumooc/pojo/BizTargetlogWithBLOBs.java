package com.jindumooc.pojo;

public class BizTargetlogWithBLOBs extends BizTargetlog {
    private String message;

    private String context;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}