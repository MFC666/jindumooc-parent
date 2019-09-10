package com.jindumooc.dao;

import com.jindumooc.pojo.ArticleCategory;
import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleEdit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InfoBackMapper {
    int delArticleById(@Param("idList") Integer[] idList);
    int updateArticle(@Param("article") com.jindumooc.vojo.ArticleEdit article);
    int delTagsOfArticle(@Param("id") Integer id);
    int insertTagsOfArticle(@Param("id")Integer id,@Param("tagIds")Integer[] tagIds);
    int insertArticle(@Param("article")com.jindumooc.vojo.ArticleEdit article);
    int getMaxArticleId();
    int insertCategory(@Param("articleCategory")ArticleCategory articleCategory);
    int updateCategory(@Param("articleCategory")ArticleCategory articleCategory);
    int deleteCategory(@Param("id")Integer id);
    //头条
    List<Article> getArticleListByCondition1(@Param("keywords")String keywords,@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("featured")Integer featured,@Param("status")String status,@Param("start")Integer start,@Param("size")Integer size);
    //置顶
    List<Article> getArticleListByCondition2(@Param("keywords")String keywords,@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("sticky")Integer sticky,@Param("status")String status,@Param("start")Integer start,@Param("size")Integer size);
    //推荐
    List<Article> getArticleListByCondition3(@Param("keywords")String keywords,@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("promoted")Integer promoted,@Param("status")String status,@Param("start")Integer start,@Param("size")Integer size);

    int getCountArticlesByCondition1(@Param("keywords")String keywords,@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("featured")Integer featured,@Param("status")String status);
    int getCountArticlesByCondition2(@Param("keywords")String keywords,@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("sticky")Integer sticky,@Param("status")String status);
    int getCountArticlesByCondition3(@Param("keywords")String keywords,@Param("ArticleCategoryId")Integer ArticleCategoryId,@Param("promoted")Integer promoted,@Param("status")String status);
    ArticleEdit getArticleEditByid(@Param("id")Integer id);

}
