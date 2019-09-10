package com.jindumooc.information.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.jindumooc.dao.InfoBackMapper;
import com.jindumooc.dao.InfoMapper;
import com.jindumooc.information.service.Impl.InfoService;
import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import com.jindumooc.vojo.ArticleEdit;
import com.jindumooc.vojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private InfoBackMapper infoBackMapper;
    public List<Tag> getTags() {
        return infoMapper.getTags();
    }

    public List<Article> getArticlesByTagId(Integer page,Integer size,Integer id){
        int start = (page - 1) * size;
        return infoMapper.getArticlesByTagId(id,start,size);
    }

    public int getCountArticlesByTagId(Integer id){
        return infoMapper.getCountArticlesByTagId(id);
    }

    public List<ArticleCategory> getArticleCategories(){
        return infoMapper.getArticleCategories();
    }

    public List<Article> getArticles(Integer page,Integer size,Integer ArticleCategoryId){
        int start = (page - 1) * size;
        return infoMapper.getArticles(ArticleCategoryId,start,size);
    }

    public int getCountArticles(Integer ArticleCategoryId){
        return infoMapper.getCountArticles(ArticleCategoryId);
    }

    public Article getArticleById(Integer id){
        return infoMapper.getArticleById(id);
    }

    public List<Article> getPromotedList(){
        return infoMapper.getPromotedList();
    }

    public List<Article> getFeaturedList(){
        return infoMapper.getFeaturedList();
    }

    public List<Article> getArticleListByCondition(Integer page,Integer size, String keywords, Integer ArticleCategoryId,
                                                   String attribute, String status){
        int start = (page - 1) * size;
        //已发布-published，未发布-unpublished，回收站-recycled
        if(attribute.equals("头条")) {
            return infoBackMapper.getArticleListByCondition1(keywords, ArticleCategoryId, 1, status, start, size);
        }else if(attribute.equals("置顶")){
            return infoBackMapper.getArticleListByCondition2(keywords, ArticleCategoryId, 1, status, start, size);
        }
        //推荐
        return infoBackMapper.getArticleListByCondition3(keywords, ArticleCategoryId, 1, status, start, size);

    }

    public int getCountArticlesByCondition(String keywords,Integer ArticleCategoryId,String attribute,String status){
        if(attribute.equals("头条")) {
            return infoBackMapper.getCountArticlesByCondition1(keywords,ArticleCategoryId,1,status);
        }else if(attribute.equals("置顶")){
            return infoBackMapper.getCountArticlesByCondition2(keywords,ArticleCategoryId,1,status);
        }
        //推荐
        return infoBackMapper.getCountArticlesByCondition3(keywords,ArticleCategoryId,1,status);
    }

    public boolean delArticles(Integer[] idList){
        return infoBackMapper.delArticleById(idList)==idList.length;

    }

    public int updateArticle(com.jindumooc.vojo.ArticleEdit article){
        return infoBackMapper.updateArticle(article);
    }

    public int delTagsOfArticle(Integer id){
        return infoBackMapper.delTagsOfArticle(id);
    }

    public int insertTagsOfArticle(Integer id,Integer[] tagIds){
        return infoBackMapper.insertTagsOfArticle(id,tagIds);
    }

    public int insertArticle(com.jindumooc.vojo.ArticleEdit article){
        return infoBackMapper.insertArticle(article);

    }

    public int insertCategory(com.jindumooc.pojo.ArticleCategory articleCategory){
        return infoBackMapper.insertCategory(articleCategory);
    }

    public int updateCategory(com.jindumooc.pojo.ArticleCategory articleCategory){
        return infoBackMapper.updateCategory(articleCategory);
    }

    public int deleteCategory(Integer id){
        return infoBackMapper.deleteCategory(id);
    }

    public ArticleEdit getArticleEditByid(Integer id){
        return infoBackMapper.getArticleEditByid(id);
    }

    public int getMaxArticleId(){
        return infoBackMapper.getMaxArticleId();
    }
}
