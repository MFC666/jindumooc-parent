package com.jindumooc.pojo;

public class Orders {
    private Integer id;

    private String sn;

    private String status;

    private String title;

    private String targettype;

    private Integer targetid;

    private Float amount;

    private Float totalprice;

    private Byte isgift;

    private String giftto;

    private Integer discountid;

    private Float discount;

    private String token;

    private Integer refundid;

    private Integer userid;

    private String coupon;

    private Float coupondiscount;

    private String payment;

    private Float coinamount;

    private Float coinrate;

    private String pricetype;

    private String bank;

    private Integer paidtime;

    private Long cashsn;

    private String note;

    private Integer refundendtime;

    private Integer createdtime;

    private Integer updatedtime;

    private String data;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTargettype() {
        return targettype;
    }

    public void setTargettype(String targettype) {
        this.targettype = targettype == null ? null : targettype.trim();
    }

    public Integer getTargetid() {
        return targetid;
    }

    public void setTargetid(Integer targetid) {
        this.targetid = targetid;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public Byte getIsgift() {
        return isgift;
    }

    public void setIsgift(Byte isgift) {
        this.isgift = isgift;
    }

    public String getGiftto() {
        return giftto;
    }

    public void setGiftto(String giftto) {
        this.giftto = giftto == null ? null : giftto.trim();
    }

    public Integer getDiscountid() {
        return discountid;
    }

    public void setDiscountid(Integer discountid) {
        this.discountid = discountid;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Integer getRefundid() {
        return refundid;
    }

    public void setRefundid(Integer refundid) {
        this.refundid = refundid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon == null ? null : coupon.trim();
    }

    public Float getCoupondiscount() {
        return coupondiscount;
    }

    public void setCoupondiscount(Float coupondiscount) {
        this.coupondiscount = coupondiscount;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Float getCoinamount() {
        return coinamount;
    }

    public void setCoinamount(Float coinamount) {
        this.coinamount = coinamount;
    }

    public Float getCoinrate() {
        return coinrate;
    }

    public void setCoinrate(Float coinrate) {
        this.coinrate = coinrate;
    }

    public String getPricetype() {
        return pricetype;
    }

    public void setPricetype(String pricetype) {
        this.pricetype = pricetype == null ? null : pricetype.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Integer getPaidtime() {
        return paidtime;
    }

    public void setPaidtime(Integer paidtime) {
        this.paidtime = paidtime;
    }

    public Long getCashsn() {
        return cashsn;
    }

    public void setCashsn(Long cashsn) {
        this.cashsn = cashsn;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getRefundendtime() {
        return refundendtime;
    }

    public void setRefundendtime(Integer refundendtime) {
        this.refundendtime = refundendtime;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}