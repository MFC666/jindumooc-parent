package com.jindumooc.pojo;

public class XapiStatementWithBLOBs extends XapiStatement {
    private String context;

    private String data;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}