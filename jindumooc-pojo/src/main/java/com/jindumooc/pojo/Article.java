package com.jindumooc.pojo;

public class Article {
    private Integer id;

    private String title;

    private Integer categoryid;

    private String tagids;

    private String source;

    private String sourceurl;

    private Integer publishedtime;

    private String thumb;

    private String originalthumb;

    private String picture;

    private String status;

    private Integer hits;

    private Byte featured;

    private Byte promoted;

    private Byte sticky;

    private Integer postnum;

    private Integer upsnum;

    private Integer userid;

    private Integer orgid;

    private String orgcode;

    private Integer createdtime;

    private Integer updatedtime;

    private String body;

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
        this.title = title == null ? null : title.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getTagids() {
        return tagids;
    }

    public void setTagids(String tagids) {
        this.tagids = tagids == null ? null : tagids.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSourceurl() {
        return sourceurl;
    }

    public void setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl == null ? null : sourceurl.trim();
    }

    public Integer getPublishedtime() {
        return publishedtime;
    }

    public void setPublishedtime(Integer publishedtime) {
        this.publishedtime = publishedtime;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    public String getOriginalthumb() {
        return originalthumb;
    }

    public void setOriginalthumb(String originalthumb) {
        this.originalthumb = originalthumb == null ? null : originalthumb.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Byte getFeatured() {
        return featured;
    }

    public void setFeatured(Byte featured) {
        this.featured = featured;
    }

    public Byte getPromoted() {
        return promoted;
    }

    public void setPromoted(Byte promoted) {
        this.promoted = promoted;
    }

    public Byte getSticky() {
        return sticky;
    }

    public void setSticky(Byte sticky) {
        this.sticky = sticky;
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}