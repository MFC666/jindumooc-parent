package com.jindumooc.information.web;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jindumooc.information.service.Impl.InfoService;
import com.jindumooc.vojo.Article;
import com.jindumooc.vojo.ArticleCategory;
import com.jindumooc.vojo.ArticleEdit;
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
    //后台直接传时间戳就行

    /**
     * 获取标签列表
     * @return
     */
    @RequestMapping(value = "/tags", method = RequestMethod.GET)
    public List<Tag> getTags() {
        return infoService.getTags();
    }



    /**
     * 根据标签得到文章列表(分页)
     * @param page
     * @param size
     * @param id
     * @return
     */
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


    /**
     * 获取文章栏目列表
     * @return
     */
    @RequestMapping(value="/categories",method = RequestMethod.GET)
    public List<ArticleCategory> getArticleCategories(){
        return infoService.getArticleCategories();
    }


    /**
     * 获取所有文章(分页)
     * @param page
     * @param size
     * @param ArticleCategoryId
     * @return
     */
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


    /**
     * 根据文章ID获取文章详细内容
     * @param id
     * @return
     */
    @RequestMapping(value="/articlebyid",method = RequestMethod.GET)
    public Article getArticleById(@RequestParam Integer id){//必须传入值
        return infoService.getArticleById(id);
    }


    /**
     * 获取编辑推荐文章列表
     * @return
     */
    @RequestMapping(value="/promotedlist",method = RequestMethod.GET)
    public List<Article> getPromotedList(){
        return infoService.getPromotedList();
    }


    /**
     * 获取头条列表
     * @return
     */
    @RequestMapping(value="/featuredlist",method = RequestMethod.GET)
    public List<Article> getFeaturedList(){
        return infoService.getFeaturedList();
    }


    /**
     * 后台管理根据条件查询文章列表
     * @param page
     * @param size
     * @param keywords
     * @param ArticleCategoryId
     * @param attribute
     * @param status
     * @return
     */
    @RequestMapping(value="/infoback/articlelist",method = RequestMethod.GET)
    //attribute 头条，推荐，置顶
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
    }


    //@RequestBody将json字符串转为java对象

    /**
     * 后台管理根据传入的文章id数组,批量删除文章
     * @param idList
     * @return
     */
    @RequestMapping(value="/infoback/delarticles",method = RequestMethod.DELETE)
    public boolean delArticles(@RequestParam Integer[] idList){

        return infoService.delArticles(idList);
    }

    /**
     * 后台管理更新文章
     * @param article
     * @return
     */
    @RequestMapping(value="/infoback/updatearticle")//,method = RequestMethod.PUT是这样写吗
    public boolean updateArticle(com.jindumooc.vojo.ArticleEdit article){
        /*com.jindumooc.vojo.ArticleEdit article=new com.jindumooc.vojo.ArticleEdit();
        article.setId(100);
        article.setSource("aaa");
        article.setTitle("bbb");
        Integer[] tagIds={8};
        article.setTagIds(tagIds);*/
        //上面是测试代码
        if(infoService.updateArticle(article)==1) {
            Integer[] tagIds=article.getTagIds();
            infoService.delTagsOfArticle(article.getId());
            infoService.insertTagsOfArticle(article.getId(),tagIds);//这种是给出文章id的插入标签
            return true;
        }
        return false;
    }


    /**
     * 后台管理插入文章
     * @return
     */
    @RequestMapping(value="/infoback/insertarticle",method = RequestMethod.POST)
    public boolean insertArticle(com.jindumooc.vojo.ArticleEdit article){//com.jindumooc.vojo.ArticleEdit article
        /*com.jindumooc.vojo.ArticleEdit article=new com.jindumooc.vojo.ArticleEdit();
        article.setTitle("测试标题");
        article.setCategoryId(1);
        article.setPublishedTime(11111);
        article.setThumb("插入测试");
        article.setStatus("published");
        article.setFeatured(1);
        article.setPromoted(1);
        article.setSticky(1);
        article.setUpdatedTime(22222);
        Integer[] tagIds={6,8};
        article.setTagIds(tagIds);*/
        //这是测试代码
        infoService.insertArticle(article);
        Integer articleId=infoService.getMaxArticleId();
        Integer[] tagIds=article.getTagIds();
        infoService.insertTagsOfArticle(articleId,tagIds);//这种是需要获取文章的id再进行插入标签的操作
        return true;
    }


    /**
     * 后台管理根据文章id获取编辑文章的详情
     * @param id
     * @return
     */
    @RequestMapping(value="/infoback/articlebyid",method = RequestMethod.GET)
    public ArticleEdit getArticleEditByid(@RequestParam Integer id){
        return infoService.getArticleEditByid(id);
    }



    /**
     * 后台管理添加栏目
     * @param articleCategory
     * @return
     */
    @RequestMapping(value="/infoback/insertCategory",method = RequestMethod.POST)
    public boolean insertCategory(com.jindumooc.pojo.ArticleCategory articleCategory){
        if(infoService.insertCategory(articleCategory)==1){
            return true;
        }
        return false;
    }


    /**
     * 后台管理更新栏目
     * @param articleCategory
     * @return
     */
    @RequestMapping(value="/infoback/updateCategory",method = RequestMethod.PUT)
    public boolean updateCategory(com.jindumooc.pojo.ArticleCategory articleCategory){
        if(infoService.updateCategory(articleCategory)==1){
            return true;
        }
        return false;
    }


    /**
     * 后台管理删除栏目
     * @param id
     * @return
     */
    @RequestMapping(value="/infoback/deleteCategory",method = RequestMethod.DELETE)
    public boolean deleteCategory(@RequestParam("CategoryId") Integer id){
        if(infoService.deleteCategory(id)==1){
            return true;
        }
        return false;
    }




























}
