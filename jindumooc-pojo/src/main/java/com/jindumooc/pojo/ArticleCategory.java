package com.jindumooc.pojo;

public class ArticleCategory {
    private Integer id;

    private String name;

    private String code;

    private Integer weight;

    private Byte publisharticle;

    private String seotitle;

    private String seokeyword;

    private String seodesc;

    private Byte published;

    private Integer parentid;

    private Integer createdtime;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Byte getPublisharticle() {
        return publisharticle;
    }

    public void setPublisharticle(Byte publisharticle) {
        this.publisharticle = publisharticle;
    }

    public String getSeotitle() {
        return seotitle;
    }

    public void setSeotitle(String seotitle) {
        this.seotitle = seotitle == null ? null : seotitle.trim();
    }

    public String getSeokeyword() {
        return seokeyword;
    }

    public void setSeokeyword(String seokeyword) {
        this.seokeyword = seokeyword == null ? null : seokeyword.trim();
    }

    public String getSeodesc() {
        return seodesc;
    }

    public void setSeodesc(String seodesc) {
        this.seodesc = seodesc == null ? null : seodesc.trim();
    }

    public Byte getPublished() {
        return published;
    }

    public void setPublished(Byte published) {
        this.published = published;
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
}