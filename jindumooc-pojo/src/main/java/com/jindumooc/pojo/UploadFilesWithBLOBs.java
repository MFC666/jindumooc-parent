package com.jindumooc.pojo;

public class UploadFilesWithBLOBs extends UploadFiles {
    private String description;

    private String convertparams;

    private String metas;

    private String metas2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getConvertparams() {
        return convertparams;
    }

    public void setConvertparams(String convertparams) {
        this.convertparams = convertparams == null ? null : convertparams.trim();
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas == null ? null : metas.trim();
    }

    public String getMetas2() {
        return metas2;
    }

    public void setMetas2(String metas2) {
        this.metas2 = metas2 == null ? null : metas2.trim();
    }
}