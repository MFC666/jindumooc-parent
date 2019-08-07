package com.jindumooc.information.service;

import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import com.jindumooc.vojo.ArticleEdit;
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

    List<Article> getArticleListByCondition(Integer page,Integer size, String keywords, Integer ArticleCategoryId,
                                             String attribute, String status);

    boolean delArticles(Integer[] idList);
    int updateArticle(com.jindumooc.vojo.ArticleEdit article);
    int delTagsOfArticle(Integer id);
    int insertTagsOfArticle(Integer id,Integer[] tagIds);

    int insertArticle(com.jindumooc.vojo.ArticleEdit article);
    int getMaxArticleId();
    ArticleEdit getArticleEditByid(Integer id);
    int insertCategory(com.jindumooc.pojo.ArticleCategory articleCategory);
    int updateCategory(com.jindumooc.pojo.ArticleCategory articleCategory);
    int getCountArticlesByCondition(String keywords,Integer ArticleCategoryId,String attribute,String status);
    int deleteCategory(Integer id);
}
