package com.jindumooc.pojo;

public class CourseWithBLOBs extends Course {
    private String tags;

    private String about;

    private String teacherids;

    private String goals;

    private String audiences;

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public String getTeacherids() {
        return teacherids;
    }

    public void setTeacherids(String teacherids) {
        this.teacherids = teacherids == null ? null : teacherids.trim();
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