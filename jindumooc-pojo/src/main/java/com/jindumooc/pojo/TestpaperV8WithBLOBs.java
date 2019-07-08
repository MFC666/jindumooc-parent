package com.jindumooc.pojo;

public class TestpaperV8WithBLOBs extends TestpaperV8 {
    private String description;

    private String passedcondition;

    private String metas;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPassedcondition() {
        return passedcondition;
    }

    public void setPassedcondition(String passedcondition) {
        this.passedcondition = passedcondition == null ? null : passedcondition.trim();
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas == null ? null : metas.trim();
    }
}