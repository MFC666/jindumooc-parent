package com.jindumooc.pojo;

public class ThemeConfigWithBLOBs extends ThemeConfig {
    private String config;

    private String confirmconfig;

    private String allconfig;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config == null ? null : config.trim();
    }

    public String getConfirmconfig() {
        return confirmconfig;
    }

    public void setConfirmconfig(String confirmconfig) {
        this.confirmconfig = confirmconfig == null ? null : confirmconfig.trim();
    }

    public String getAllconfig() {
        return allconfig;
    }

    public void setAllconfig(String allconfig) {
        this.allconfig = allconfig == null ? null : allconfig.trim();
    }
}