package com.jindumooc.pojo;

public class ClassroomCourses {
    private Integer id;

    private Integer classroomid;

    private Integer courseid;

    private Integer parentcourseid;

    private Boolean disabled;

    private Integer seq;

    private Integer coursesetid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassroomid() {
        return classroomid;
    }

    public void setClassroomid(Integer classroomid) {
        this.classroomid = classroomid;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public Integer getParentcourseid() {
        return parentcourseid;
    }

    public void setParentcourseid(Integer parentcourseid) {
        this.parentcourseid = parentcourseid;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getCoursesetid() {
        return coursesetid;
    }

    public void setCoursesetid(Integer coursesetid) {
        this.coursesetid = coursesetid;
    }
}