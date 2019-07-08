package com.jindumooc.pojo;

public class UploadFilesShare {
    private Integer id;

    private Integer sourceuserid;

    private Integer targetuserid;

    private Byte isactive;

    private Integer createdtime;

    private Integer updatedtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSourceuserid() {
        return sourceuserid;
    }

    public void setSourceuserid(Integer sourceuserid) {
        this.sourceuserid = sourceuserid;
    }

    public Integer getTargetuserid() {
        return targetuserid;
    }

    public void setTargetuserid(Integer targetuserid) {
        this.targetuserid = targetuserid;
    }

    public Byte getIsactive() {
        return isactive;
    }

    public void setIsactive(Byte isactive) {
        this.isactive = isactive;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }
}