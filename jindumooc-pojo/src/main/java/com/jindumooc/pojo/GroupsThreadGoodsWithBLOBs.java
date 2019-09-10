package com.jindumooc.pojo;

public class GroupsThreadGoodsWithBLOBs extends GroupsThreadGoods {
    private String title;

    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}