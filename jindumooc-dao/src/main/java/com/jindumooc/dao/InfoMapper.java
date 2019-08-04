package com.jindumooc.dao;

import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import com.jindumooc.vojo.Tag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoMapper {
    List<Tag> getTags();
    List<Article> getArticlesByTagId(@Param("id") Integer id,@Param("start")Integer start,@Param("size")Integer size);//使用@Param,mybatis自动封装成map
    int getCountArticlesByTagId(@Param("id") Integer id);
    List<ArticleCategory> getArticleCategories();
    List<Article> getArticles(@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("start")Integer start,@Param("size")Integer size);
    int getCountArticles(@Param("ArticleCategoryId")Integer ArticleCategoryId);
    Article getArticleById(@Param("id")Integer id);
    List<Article> getPromotedList();
    List<Article> getFeaturedList();
    List<Article> getArticleListByCondition1(String keywords,Integer ArticleCategoryId,
                                             Integer featured,String status,Integer start,Integer size);

    List<Article> getArticleListByCondition2(String keywords,Integer ArticleCategoryId,
                                             Integer promoted,String status,Integer start,Integer size);
    List<Article> getArticleListByCondition3(String keywords,Integer ArticleCategoryId,
                                             Integer sticky,String status,Integer start,Integer size);




























}
