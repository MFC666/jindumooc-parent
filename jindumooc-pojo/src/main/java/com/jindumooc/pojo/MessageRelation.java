package com.jindumooc.pojo;

public class MessageRelation {
    private Integer id;

    private Integer conversationid;

    private Integer messageid;

    private String isread;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getConversationid() {
        return conversationid;
    }

    public void setConversationid(Integer conversationid) {
        this.conversationid = conversationid;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getIsread() {
        return isread;
    }

    public void setIsread(String isread) {
        this.isread = isread == null ? null : isread.trim();
    }
}