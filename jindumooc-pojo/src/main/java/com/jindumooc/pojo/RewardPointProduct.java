package com.jindumooc.pojo;

public class RewardPointProduct {
    private Integer id;

    private String title;

    private String img;

    private Float price;

    private Byte requireconsignee;

    private Byte requiretelephone;

    private Byte requireemail;

    private Byte requireaddress;

    private String status;

    private Integer createdtime;

    private Integer updatedtime;

    private String about;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Byte getRequireconsignee() {
        return requireconsignee;
    }

    public void setRequireconsignee(Byte requireconsignee) {
        this.requireconsignee = requireconsignee;
    }

    public Byte getRequiretelephone() {
        return requiretelephone;
    }

    public void setRequiretelephone(Byte requiretelephone) {
        this.requiretelephone = requiretelephone;
    }

    public Byte getRequireemail() {
        return requireemail;
    }

    public void setRequireemail(Byte requireemail) {
        this.requireemail = requireemail;
    }

    public Byte getRequireaddress() {
        return requireaddress;
    }

    public void setRequireaddress(Byte requireaddress) {
        this.requireaddress = requireaddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }
}