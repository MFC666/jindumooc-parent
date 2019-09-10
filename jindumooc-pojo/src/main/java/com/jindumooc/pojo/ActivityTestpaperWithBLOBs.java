package com.jindumooc.pojo;

public class ActivityTestpaperWithBLOBs extends ActivityTestpaper {
    private String checktype;

    private String finishcondition;

    public String getChecktype() {
        return checktype;
    }

    public void setChecktype(String checktype) {
        this.checktype = checktype == null ? null : checktype.trim();
    }

    public String getFinishcondition() {
        return finishcondition;
    }

    public void setFinishcondition(String finishcondition) {
        this.finishcondition = finishcondition == null ? null : finishcondition.trim();
    }
}