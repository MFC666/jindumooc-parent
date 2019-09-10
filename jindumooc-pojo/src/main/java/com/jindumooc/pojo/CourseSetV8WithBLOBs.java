package com.jindumooc.pojo;

public class CourseSetV8WithBLOBs extends CourseSetV8 {
    private String tags;

    private String summary;

    private String goals;

    private String audiences;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

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
}