package com.jindumooc.vojo;

import java.io.Serializable;

public class SearchMessage implements Serializable {

    private String searchType;
    private String searchParameter;

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchParameter() {
        return searchParameter;
    }

    public void setSearchParameter(String searchParameter) {
        this.searchParameter = searchParameter;
    }
}
