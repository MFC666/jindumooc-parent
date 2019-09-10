package com.jindumooc.pojo;

public class ActivityTestpaper {
    private Integer id;

    private Integer mediaid;

    private Short dotimes;

    private Float redointerval;

    private Integer limitedtime;

    private Integer requirecredit;

    private String testmode;

    private Integer migratelessonid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMediaid() {
        return mediaid;
    }

    public void setMediaid(Integer mediaid) {
        this.mediaid = mediaid;
    }

    public Short getDotimes() {
        return dotimes;
    }

    public void setDotimes(Short dotimes) {
        this.dotimes = dotimes;
    }

    public Float getRedointerval() {
        return redointerval;
    }

    public void setRedointerval(Float redointerval) {
        this.redointerval = redointerval;
    }

    public Integer getLimitedtime() {
        return limitedtime;
    }

    public void setLimitedtime(Integer limitedtime) {
        this.limitedtime = limitedtime;
    }

    public Integer getRequirecredit() {
        return requirecredit;
    }

    public void setRequirecredit(Integer requirecredit) {
        this.requirecredit = requirecredit;
    }

    public String getTestmode() {
        return testmode;
    }

    public void setTestmode(String testmode) {
        this.testmode = testmode == null ? null : testmode.trim();
    }

    public Integer getMigratelessonid() {
        return migratelessonid;
    }

    public void setMigratelessonid(Integer migratelessonid) {
        this.migratelessonid = migratelessonid;
    }
}