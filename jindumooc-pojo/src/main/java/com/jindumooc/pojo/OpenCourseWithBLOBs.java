package com.jindumooc.pojo;

public class OpenCourseWithBLOBs extends OpenCourse {
    private String tags;

    private String about;

    private String teacherids;

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
}