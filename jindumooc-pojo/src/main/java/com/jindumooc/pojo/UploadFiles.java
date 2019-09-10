package com.jindumooc.pojo;

public class UploadFiles {
    private Integer id;

    private String globalid;

    private String status;

    private String hashid;

    private Integer targetid;

    private String targettype;

    private String usetype;

    private String filename;

    private String ext;

    private Long filesize;

    private String etag;

    private Integer length;

    private String converthash;

    private String convertstatus;

    private String type;

    private String storage;

    private Byte ispublic;

    private Byte candownload;

    private Integer usedcount;

    private Integer updateduserid;

    private Integer updatedtime;

    private Integer createduserid;

    private Integer createdtime;

    private String audioconvertstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGlobalid() {
        return globalid;
    }

    public void setGlobalid(String globalid) {
        this.globalid = globalid == null ? null : globalid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getHashid() {
        return hashid;
    }

    public void setHashid(String hashid) {
        this.hashid = hashid == null ? null : hashid.trim();
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype == null ? null : usetype.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag == null ? null : etag.trim();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getConverthash() {
        return converthash;
    }

    public void setConverthash(String converthash) {
        this.converthash = converthash == null ? null : converthash.trim();
    }

    public String getConvertstatus() {
        return convertstatus;
    }

    public void setConvertstatus(String convertstatus) {
        this.convertstatus = convertstatus == null ? null : convertstatus.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage == null ? null : storage.trim();
    }

    public Byte getIspublic() {
        return ispublic;
    }

    public void setIspublic(Byte ispublic) {
        this.ispublic = ispublic;
    }

    public Byte getCandownload() {
        return candownload;
    }

    public void setCandownload(Byte candownload) {
        this.candownload = candownload;
    }

    public Integer getUsedcount() {
        return usedcount;
    }

    public void setUsedcount(Integer usedcount) {
        this.usedcount = usedcount;
    }

    public Integer getUpdateduserid() {
        return updateduserid;
    }

    public void setUpdateduserid(Integer updateduserid) {
        this.updateduserid = updateduserid;
    }

    public Integer getUpdatedtime() {
        return updatedtime;
    }

    public void setUpdatedtime(Integer updatedtime) {
        this.updatedtime = updatedtime;
    }

    public Integer getCreateduserid() {
        return createduserid;
    }

    public void setCreateduserid(Integer createduserid) {
        this.createduserid = createduserid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public String getAudioconvertstatus() {
        return audioconvertstatus;
    }

    public void setAudioconvertstatus(String audioconvertstatus) {
        this.audioconvertstatus = audioconvertstatus == null ? null : audioconvertstatus.trim();
    }
}