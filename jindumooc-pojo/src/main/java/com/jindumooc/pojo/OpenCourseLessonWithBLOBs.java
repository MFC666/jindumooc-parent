package com.jindumooc.pojo;

public class OpenCourseLessonWithBLOBs extends OpenCourseLesson {
    private String summary;

    private String tags;

    private String content;

    private String mediauri;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMediauri() {
        return mediauri;
    }

    public void setMediauri(String mediauri) {
        this.mediauri = mediauri == null ? null : mediauri.trim();
    }
}