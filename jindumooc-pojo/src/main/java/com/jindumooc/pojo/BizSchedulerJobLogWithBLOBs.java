package com.jindumooc.pojo;

public class BizSchedulerJobLogWithBLOBs extends BizSchedulerJobLog {
    private String args;

    private String message;

    private String trace;

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args == null ? null : args.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace == null ? null : trace.trim();
    }
}