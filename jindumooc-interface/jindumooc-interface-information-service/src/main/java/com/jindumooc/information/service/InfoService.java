package com.jindumooc.information.service;

import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import com.jindumooc.vojo.Tag;

import java.util.List;

public interface InfoService {
    List<Tag> getTags();
    List<Article> getArticlesByTagId(Integer page,Integer size,Integer id);
    int getCountArticlesByTagId(Integer id);
    List<ArticleCategory> getArticleCategories();
    List<Article> getArticles(Integer page,Integer size,Integer ArticleCategoryId);
    int getCountArticles(Integer ArticleCategoryId);
    Article getArticleById(Integer id);
    List<Article> getPromotedList();
    List<Article> getFeaturedList();
    /*List<Article> getArticleListByCondition(Integer page,Integer size, String keywords, Integer ArticleCategoryId,
                                             String attribute, String status);*/

}
