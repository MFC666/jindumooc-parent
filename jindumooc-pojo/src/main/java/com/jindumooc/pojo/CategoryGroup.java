package com.jindumooc.pojo;

public class CategoryGroup {
    private Integer id;

    private String code;

    private String name;

    private Byte depth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getDepth() {
        return depth;
    }

    public void setDepth(Byte depth) {
        this.depth = depth;
    }
}