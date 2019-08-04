package com.jindumooc.vojo;

import java.io.Serializable;
import java.util.List;

import com.jindumooc.vojo.ArticleCategory;





public class Article implements Serializable {
    private Integer id;
    private String title;
    private String picture;
    private Integer publishedtime;
    private String body;
    private Byte sticky;
    private Integer hits;//点击量
    private Integer postnum;//回复数
    private Integer upsnum;//点赞数
    private List<Tag> tagList;//标签列表
    private ArticleCategory articlecategory;//文章所属的栏目和它的名称

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


    public Byte getSticky() {
        return sticky;
    }

    public void setSticky(Byte sticky) {
        this.sticky = sticky;
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


    public Integer getPublishedtime() {
        return publishedtime;
    }

    public void setPublishedtime(Integer publishedtime) {
        this.publishedtime = publishedtime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
