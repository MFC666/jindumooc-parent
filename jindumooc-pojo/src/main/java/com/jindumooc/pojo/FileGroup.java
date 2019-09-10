package com.jindumooc.pojo;

public class FileGroup {
    private Integer id;

    private String name;

    private String code;

    private Byte open;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Byte getOpen() {
        return open;
    }

    public void setOpen(Byte open) {
        this.open = open;
    }
}