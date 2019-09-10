package com.jindumooc.pojo;

public class TestpaperWithBLOBs extends Testpaper {
    private String description;

    private String metas;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas == null ? null : metas.trim();
    }
}