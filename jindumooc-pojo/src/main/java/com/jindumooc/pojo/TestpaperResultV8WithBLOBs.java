package com.jindumooc.pojo;

public class TestpaperResultV8WithBLOBs extends TestpaperResultV8 {
    private String teachersay;

    private String metas;

    public String getTeachersay() {
        return teachersay;
    }

    public void setTeachersay(String teachersay) {
        this.teachersay = teachersay == null ? null : teachersay.trim();
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas == null ? null : metas.trim();
    }
}