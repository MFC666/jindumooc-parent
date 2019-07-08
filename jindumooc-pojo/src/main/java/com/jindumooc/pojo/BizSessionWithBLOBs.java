package com.jindumooc.pojo;

public class BizSessionWithBLOBs extends BizSession {
    private byte[] sessId;

    private byte[] sessData;

    public byte[] getSessId() {
        return sessId;
    }

    public void setSessId(byte[] sessId) {
        this.sessId = sessId;
    }

    public byte[] getSessData() {
        return sessData;
    }

    public void setSessData(byte[] sessData) {
        this.sessData = sessData;
    }
}