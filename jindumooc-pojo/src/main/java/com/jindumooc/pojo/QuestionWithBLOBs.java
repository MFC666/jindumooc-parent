package com.jindumooc.pojo;

public class QuestionWithBLOBs extends Question {
    private String stem;

    private String answer;

    private String analysis;

    private String metas;

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem == null ? null : stem.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis == null ? null : analysis.trim();
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas == null ? null : metas.trim();
    }
}