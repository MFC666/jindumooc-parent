package com.jindumooc.pojo;

public class BlockTemplateWithBLOBs extends BlockTemplate {
    private String template;

    private String templatedata;

    private String content;

    private String data;

    private String meta;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    public String getTemplatedata() {
        return templatedata;
    }

    public void setTemplatedata(String templatedata) {
        this.templatedata = templatedata == null ? null : templatedata.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta == null ? null : meta.trim();
    }
}