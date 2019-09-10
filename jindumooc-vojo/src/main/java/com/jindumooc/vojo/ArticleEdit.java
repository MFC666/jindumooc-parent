package com.jindumooc.vojo;

import java.io.Serializable;

public class ArticleEdit implements Serializable {
    private Integer id;
    private String title;
    private Integer categoryId;
    private String categoryName;
    private String body;
    private Integer featured;
    private Integer promoted;
    private Integer sticky;
    private String source;
    private String sourceUrl;
    private String thumb;
    private Integer publishedTime;
    private Integer updatedTime;
    private String status;
    private Integer[] tagIds;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getFeatured() {
        return featured;
    }

    public void setFeatured(Integer featured) {
        this.featured = featured;
    }

    public Integer getPromoted() {
        return promoted;
    }

    public void setPromoted(Integer promoted) {
        this.promoted = promoted;
    }

    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Integer getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Integer publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer[] getTagIds() {
        return tagIds;
    }

    public void setTagIds(Integer[] tagIds) {
        this.tagIds = tagIds;
    }
}
