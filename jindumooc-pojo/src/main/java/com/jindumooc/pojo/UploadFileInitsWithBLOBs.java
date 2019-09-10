package com.jindumooc.pojo;

public class UploadFileInitsWithBLOBs extends UploadFileInits {
    private String metas;

    private String metas2;

    private String convertparams;

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

    public String getConvertparams() {
        return convertparams;
    }

    public void setConvertparams(String convertparams) {
        this.convertparams = convertparams == null ? null : convertparams.trim();
    }
}