package com.jindumooc.pojo;

public class OrderRefererWithBLOBs extends OrderReferer {
    private String data;

    private String orderids;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    public String getOrderids() {
        return orderids;
    }

    public void setOrderids(String orderids) {
        this.orderids = orderids == null ? null : orderids.trim();
    }
}