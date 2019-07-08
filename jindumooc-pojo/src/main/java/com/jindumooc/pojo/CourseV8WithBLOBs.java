package com.jindumooc.pojo;

public class CourseV8WithBLOBs extends CourseV8 {
    private String summary;

    private String goals;

    private String audiences;

    private String services;

    private String about;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals == null ? null : goals.trim();
    }

    public String getAudiences() {
        return audiences;
    }

    public void setAudiences(String audiences) {
        this.audiences = audiences == null ? null : audiences.trim();
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services == null ? null : services.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }
}