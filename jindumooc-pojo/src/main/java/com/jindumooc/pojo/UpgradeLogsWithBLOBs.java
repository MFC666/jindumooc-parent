package com.jindumooc.pojo;

public class UpgradeLogsWithBLOBs extends UpgradeLogs {
    private String dbbackpath;

    private String srcbackpath;

    private String reason;

    public String getDbbackpath() {
        return dbbackpath;
    }

    public void setDbbackpath(String dbbackpath) {
        this.dbbackpath = dbbackpath == null ? null : dbbackpath.trim();
    }

    public String getSrcbackpath() {
        return srcbackpath;
    }

    public void setSrcbackpath(String srcbackpath) {
        this.srcbackpath = srcbackpath == null ? null : srcbackpath.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}