package com.jindumooc.pojo;

public class BlockHistoryWithBLOBs extends BlockHistory {
    private String templatedata;

    private String data;

    private String content;

    public String getTemplatedata() {
        return templatedata;
    }

    public void setTemplatedata(String templatedata) {
        this.templatedata = templatedata == null ? null : templatedata.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}