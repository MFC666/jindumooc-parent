package com.jindumooc.pojo;

public class Cache {
    private Integer id;

    private String name;

    private Byte serialized;

    private Integer expiredtime;

    private Integer createdtime;

    private byte[] data;

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

    public Byte getSerialized() {
        return serialized;
    }

    public void setSerialized(Byte serialized) {
        this.serialized = serialized;
    }

    public Integer getExpiredtime() {
        return expiredtime;
    }

    public void setExpiredtime(Integer expiredtime) {
        this.expiredtime = expiredtime;
    }

    public Integer getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Integer createdtime) {
        this.createdtime = createdtime;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}