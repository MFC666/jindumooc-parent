package com.jindumooc.pojo;

public class MigrationVersions {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }
}