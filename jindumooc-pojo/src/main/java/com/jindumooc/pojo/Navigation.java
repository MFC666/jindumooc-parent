package com.jindumooc.pojo;

public class Navigation {
    private Integer id;

    private String name;

    private String url;

    private Byte sequence;

    private Integer parentid;

    private Integer createdtime;

    private Integer updatetime;

    private String type;

    private Byte isopen;

    private Byte isnewwin;

    private Integer orgid;

    private String orgcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getSequence() {
        return sequence;
    }

    public void setSequence(Byte sequence) {
        this.sequence = sequence;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Byte getIsopen() {
        return isopen;
    }

    public void setIsopen(Byte isopen) {
        this.isopen = isopen;
    }

    public Byte getIsnewwin() {
        return isnewwin;
    }

    public void setIsnewwin(Byte isnewwin) {
        this.isnewwin = isnewwin;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }
}