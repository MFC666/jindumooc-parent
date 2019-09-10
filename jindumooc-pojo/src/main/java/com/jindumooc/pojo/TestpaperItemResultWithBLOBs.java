package com.jindumooc.pojo;

public class TestpaperItemResultWithBLOBs extends TestpaperItemResult {
    private String answer;

    private String teachersay;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getTeachersay() {
        return teachersay;
    }

    public void setTeachersay(String teachersay) {
        this.teachersay = teachersay == null ? null : teachersay.trim();
    }
}