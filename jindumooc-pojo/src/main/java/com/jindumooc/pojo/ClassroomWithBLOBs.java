package com.jindumooc.pojo;

public class ClassroomWithBLOBs extends Classroom {
    private String about;

    private String description;

    private String assistantids;

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about == null ? null : about.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAssistantids() {
        return assistantids;
    }

    public void setAssistantids(String assistantids) {
        this.assistantids = assistantids == null ? null : assistantids.trim();
    }
}