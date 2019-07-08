package com.jindumooc.pojo;

public class MobileDevice {
    private Integer id;

    private String imei;

    private String platform;

    private String version;

    private String screenresolution;

    private String kernel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getScreenresolution() {
        return screenresolution;
    }

    public void setScreenresolution(String screenresolution) {
        this.screenresolution = screenresolution == null ? null : screenresolution.trim();
    }

    public String getKernel() {
        return kernel;
    }

    public void setKernel(String kernel) {
        this.kernel = kernel == null ? null : kernel.trim();
    }
}