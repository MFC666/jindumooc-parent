package com.jindumooc.pojo;

public class ThreadWithBLOBs extends Thread {
    private String content;

    private String ats;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAts() {
        return ats;
    }

    public void setAts(String ats) {
        this.ats = ats == null ? null : ats.trim();
    }
}