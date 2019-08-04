package com.jindumooc.information.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.information.service.InfoService;
import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.jindumooc.vojo.Tag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Reference
    private InfoService infoService;



    //置顶目前只在文章列表中每篇文章返回了sticky的属性值







    //获取标签列表
    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    public List<Tag> getTags() {
        return infoService.getTags();
    }
    //后台直接传时间戳就行
    //根据标签得到文章列表
    //Article(id,发布日期(时间戳形式)，所属分类Id，所属分类名称,标题，文章主体)
    @RequestMapping(value="/artTag",method = RequestMethod.GET)
    public Map<String, Object> getArticlesByTagId(@RequestParam(defaultValue = "1") Integer page,//有默认值不输入也行
                                                  @RequestParam(defaultValue = "5") Integer size,
                                                  @RequestParam Integer id){//必须传入值
        Map<String, Object> map = new HashMap<>();
        List<Article> articleList=infoService.getArticlesByTagId(page,size,id);
        int count=infoService.getCountArticlesByTagId(id);
        map.put("articleList",articleList);//articleList和count和下面的相同应该不影响前端吧
        map.put("count",count);
        return map;
    }

    //获取文章栏目列表
    @RequestMapping(value="/categories",method = RequestMethod.GET)
    public List<ArticleCategory> getArticleCategories(){
        return infoService.getArticleCategories();
    }

    //获取所有文章列表
    @RequestMapping(value="/articles",method = RequestMethod.GET)
    public Map<String, Object> getArticles(@RequestParam(defaultValue = "1") Integer page,//必须传入值
                                           @RequestParam(defaultValue = "5") Integer size,//必须传入值
                                           Integer ArticleCategoryId){//允许空值,空值代表所有的文章
        Map<String, Object> map = new HashMap<>();
        List<Article> articleList=infoService.getArticles(page,size,ArticleCategoryId);
        int count=infoService.getCountArticles(ArticleCategoryId);
        map.put("articleList",articleList);
        map.put("count",count);
        return map;
    }

    //根据文章ID获取文章详细内容
    @RequestMapping(value="/articlebyid",method = RequestMethod.GET)
    public Article getArticleById(@RequestParam Integer id){//必须传入值
        return infoService.getArticleById(id);
    }

    //获取编辑推荐列表，图片地址，文章id,文章标题
    @RequestMapping(value="/promotedlist",method = RequestMethod.GET)
    public List<Article> getPromotedList(){
        return infoService.getPromotedList();
    }

    //获取头条列表
    @RequestMapping(value="/featuredlist",method = RequestMethod.GET)
    public List<Article> getFeaturedList(){
        return infoService.getFeaturedList();
    }



    /*@RequestMapping(value="/admin/articlelist",method = RequestMethod.GET)
    //attribute 头条，推荐，置顶
    //status中有个移到回收站是什么意思
    public Map<String,Object> getArticleListByCondition(@RequestParam(defaultValue = "1") Integer page,
                                                        @RequestParam(defaultValue = "6") Integer size,
                                                        @RequestParam(defaultValue = "") String keywords,
                                                        Integer ArticleCategoryId,//允许空值
                                                        String attribute,//允许空值
                                                        String status){//允许空值
        Map<String, Object> map = new HashMap<>();
        List<Article> articleList=infoService.getArticleListByCondition(page,size,keywords,ArticleCategoryId,attribute,status);
        int count=infoService.getCountArticlesByCondition(keywords,ArticleCategoryId,attribute,status);
        map.put("articleList",articleList);
        map.put("count",count);
        return map;
    }*/



























}
