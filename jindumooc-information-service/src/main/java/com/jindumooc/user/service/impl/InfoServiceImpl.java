package com.jindumooc.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.jindumooc.dao.InfoMapper;
import com.jindumooc.information.service.InfoService;
import com.jindumooc.pojo.ArticleExample;
import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import com.jindumooc.vojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

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

    /*public List<Article> getArticleListByCondition(Integer page,Integer size, String keywords, Integer ArticleCategoryId,
                                                   String attribute, String status){
        int start = (page - 1) * size;
        //已发布-published，未发布-unpublished，回收站-recycled
        if(attribute.equals("头条")&&status.equals("已发布")){
            return infoMapper.getArticleListByCondition1(keywords,ArticleCategoryId,1,"published",start,size);
        }else if(attribute.equals("头条")&&status.equals("未发布")){
            return infoMapper.getArticleListByCondition1(keywords,ArticleCategoryId,1,"unpublished",start,size);
        }else if(attribute.equals("头条")&&status.equals("回收站")){
            return infoMapper.getArticleListByCondition1(keywords,ArticleCategoryId,1,"recycled",start,size);
        }else if(attribute.equals("推荐")&&status.equals("已发布")){
            return infoMapper.getArticleListByCondition2(keywords,ArticleCategoryId,1,"published",start,size);
        }else if(attribute.equals("推荐")&&status.equals("未发布")){
            return infoMapper.getArticleListByCondition2(keywords,ArticleCategoryId,1,"unpublished",start,size);
        }else if(attribute.equals("推荐")&&status.equals("回收站")){
            return infoMapper.getArticleListByCondition2(keywords,ArticleCategoryId,1,"recycled",start,size);
        }else if(attribute.equals("置顶")&&status.equals("已发布")){
            return infoMapper.getArticleListByCondition3(keywords,ArticleCategoryId,1,"published",start,size);
        }else if(attribute.equals("置顶")&&status.equals("未发布")){
            return infoMapper.getArticleListByCondition3(keywords,ArticleCategoryId,1,"unpublished",start,size);
        }else if(attribute.equals("置顶")&&status.equals("回收站")){
            return infoMapper.getArticleListByCondition3(keywords,ArticleCategoryId,1,"recycled",start,size);
        }
    }*/


}
