package com.jindumooc.vojo;

import java.io.Serializable;
import java.util.List;

import com.jindumooc.vojo.ArticleCategory;





public class Article implements Serializable {
    private Integer id;
    private String title;
    private String source;
    private String sourceUrl;
    private Integer publishedTime;
    private Integer updatedTime;
    private String status;
    private Integer thumb;
    private Integer featured;
    private Integer promoted;
    private String picture;
    private String body;
    private Integer sticky;
    private Integer hits;//点击量
    private Integer postnum;//回复数
    private Integer upsnum;//点赞数
    private List<Tag> tagList;//标签列表
    private ArticleCategory articlecategory;//文章所属的栏目id和它的名称

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    public ArticleCategory getArticlecategory() {
        return articlecategory;
    }

    public void setArticlecategory(ArticleCategory articlecategory) {
        this.articlecategory = articlecategory;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getPostnum() {
        return postnum;
    }

    public void setPostnum(Integer postnum) {
        this.postnum = postnum;
    }

    public Integer getUpsnum() {
        return upsnum;
    }

    public void setUpsnum(Integer upsnum) {
        this.upsnum = upsnum;
    }


    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Integer getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Integer publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getThumb() {
        return thumb;
    }

    public void setThumb(Integer thumb) {
        this.thumb = thumb;
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

    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
