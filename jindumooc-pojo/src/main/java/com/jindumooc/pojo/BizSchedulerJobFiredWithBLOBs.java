package com.jindumooc.pojo;

public class BizSchedulerJobFiredWithBLOBs extends BizSchedulerJobFired {
    private String failureMsg;

    private String jobDetail;

    public String getFailureMsg() {
        return failureMsg;
    }

    public void setFailureMsg(String failureMsg) {
        this.failureMsg = failureMsg == null ? null : failureMsg.trim();
    }

    public String getJobDetail() {
        return jobDetail;
    }

    public void setJobDetail(String jobDetail) {
        this.jobDetail = jobDetail == null ? null : jobDetail.trim();
    }
}