package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andTagidsIsNull() {
            addCriterion("tagIds is null");
            return (Criteria) this;
        }

        public Criteria andTagidsIsNotNull() {
            addCriterion("tagIds is not null");
            return (Criteria) this;
        }

        public Criteria andTagidsEqualTo(String value) {
            addCriterion("tagIds =", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotEqualTo(String value) {
            addCriterion("tagIds <>", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsGreaterThan(String value) {
            addCriterion("tagIds >", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsGreaterThanOrEqualTo(String value) {
            addCriterion("tagIds >=", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLessThan(String value) {
            addCriterion("tagIds <", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLessThanOrEqualTo(String value) {
            addCriterion("tagIds <=", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsLike(String value) {
            addCriterion("tagIds like", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotLike(String value) {
            addCriterion("tagIds not like", value, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsIn(List<String> values) {
            addCriterion("tagIds in", values, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotIn(List<String> values) {
            addCriterion("tagIds not in", values, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsBetween(String value1, String value2) {
            addCriterion("tagIds between", value1, value2, "tagids");
            return (Criteria) this;
        }

        public Criteria andTagidsNotBetween(String value1, String value2) {
            addCriterion("tagIds not between", value1, value2, "tagids");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceurlIsNull() {
            addCriterion("sourceUrl is null");
            return (Criteria) this;
        }

        public Criteria andSourceurlIsNotNull() {
            addCriterion("sourceUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSourceurlEqualTo(String value) {
            addCriterion("sourceUrl =", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotEqualTo(String value) {
            addCriterion("sourceUrl <>", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlGreaterThan(String value) {
            addCriterion("sourceUrl >", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlGreaterThanOrEqualTo(String value) {
            addCriterion("sourceUrl >=", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlLessThan(String value) {
            addCriterion("sourceUrl <", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlLessThanOrEqualTo(String value) {
            addCriterion("sourceUrl <=", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlLike(String value) {
            addCriterion("sourceUrl like", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotLike(String value) {
            addCriterion("sourceUrl not like", value, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlIn(List<String> values) {
            addCriterion("sourceUrl in", values, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotIn(List<String> values) {
            addCriterion("sourceUrl not in", values, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlBetween(String value1, String value2) {
            addCriterion("sourceUrl between", value1, value2, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andSourceurlNotBetween(String value1, String value2) {
            addCriterion("sourceUrl not between", value1, value2, "sourceurl");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeIsNull() {
            addCriterion("publishedTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeIsNotNull() {
            addCriterion("publishedTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeEqualTo(Integer value) {
            addCriterion("publishedTime =", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotEqualTo(Integer value) {
            addCriterion("publishedTime <>", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeGreaterThan(Integer value) {
            addCriterion("publishedTime >", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("publishedTime >=", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeLessThan(Integer value) {
            addCriterion("publishedTime <", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("publishedTime <=", value, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeIn(List<Integer> values) {
            addCriterion("publishedTime in", values, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotIn(List<Integer> values) {
            addCriterion("publishedTime not in", values, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeBetween(Integer value1, Integer value2) {
            addCriterion("publishedTime between", value1, value2, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andPublishedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("publishedTime not between", value1, value2, "publishedtime");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("thumb is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("thumb is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("thumb =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("thumb <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("thumb >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("thumb >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("thumb <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("thumb <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("thumb like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("thumb not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("thumb in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("thumb not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("thumb between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("thumb not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbIsNull() {
            addCriterion("originalThumb is null");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbIsNotNull() {
            addCriterion("originalThumb is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbEqualTo(String value) {
            addCriterion("originalThumb =", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbNotEqualTo(String value) {
            addCriterion("originalThumb <>", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbGreaterThan(String value) {
            addCriterion("originalThumb >", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbGreaterThanOrEqualTo(String value) {
            addCriterion("originalThumb >=", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbLessThan(String value) {
            addCriterion("originalThumb <", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbLessThanOrEqualTo(String value) {
            addCriterion("originalThumb <=", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbLike(String value) {
            addCriterion("originalThumb like", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbNotLike(String value) {
            addCriterion("originalThumb not like", value, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbIn(List<String> values) {
            addCriterion("originalThumb in", values, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbNotIn(List<String> values) {
            addCriterion("originalThumb not in", values, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbBetween(String value1, String value2) {
            addCriterion("originalThumb between", value1, value2, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andOriginalthumbNotBetween(String value1, String value2) {
            addCriterion("originalThumb not between", value1, value2, "originalthumb");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andFeaturedIsNull() {
            addCriterion("featured is null");
            return (Criteria) this;
        }

        public Criteria andFeaturedIsNotNull() {
            addCriterion("featured is not null");
            return (Criteria) this;
        }

        public Criteria andFeaturedEqualTo(Byte value) {
            addCriterion("featured =", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotEqualTo(Byte value) {
            addCriterion("featured <>", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedGreaterThan(Byte value) {
            addCriterion("featured >", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedGreaterThanOrEqualTo(Byte value) {
            addCriterion("featured >=", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedLessThan(Byte value) {
            addCriterion("featured <", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedLessThanOrEqualTo(Byte value) {
            addCriterion("featured <=", value, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedIn(List<Byte> values) {
            addCriterion("featured in", values, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotIn(List<Byte> values) {
            addCriterion("featured not in", values, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedBetween(Byte value1, Byte value2) {
            addCriterion("featured between", value1, value2, "featured");
            return (Criteria) this;
        }

        public Criteria andFeaturedNotBetween(Byte value1, Byte value2) {
            addCriterion("featured not between", value1, value2, "featured");
            return (Criteria) this;
        }

        public Criteria andPromotedIsNull() {
            addCriterion("promoted is null");
            return (Criteria) this;
        }

        public Criteria andPromotedIsNotNull() {
            addCriterion("promoted is not null");
            return (Criteria) this;
        }

        public Criteria andPromotedEqualTo(Byte value) {
            addCriterion("promoted =", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedNotEqualTo(Byte value) {
            addCriterion("promoted <>", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedGreaterThan(Byte value) {
            addCriterion("promoted >", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedGreaterThanOrEqualTo(Byte value) {
            addCriterion("promoted >=", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedLessThan(Byte value) {
            addCriterion("promoted <", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedLessThanOrEqualTo(Byte value) {
            addCriterion("promoted <=", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedIn(List<Byte> values) {
            addCriterion("promoted in", values, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedNotIn(List<Byte> values) {
            addCriterion("promoted not in", values, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedBetween(Byte value1, Byte value2) {
            addCriterion("promoted between", value1, value2, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedNotBetween(Byte value1, Byte value2) {
            addCriterion("promoted not between", value1, value2, "promoted");
            return (Criteria) this;
        }

        public Criteria andStickyIsNull() {
            addCriterion("sticky is null");
            return (Criteria) this;
        }

        public Criteria andStickyIsNotNull() {
            addCriterion("sticky is not null");
            return (Criteria) this;
        }

        public Criteria andStickyEqualTo(Byte value) {
            addCriterion("sticky =", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyNotEqualTo(Byte value) {
            addCriterion("sticky <>", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyGreaterThan(Byte value) {
            addCriterion("sticky >", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyGreaterThanOrEqualTo(Byte value) {
            addCriterion("sticky >=", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyLessThan(Byte value) {
            addCriterion("sticky <", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyLessThanOrEqualTo(Byte value) {
            addCriterion("sticky <=", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyIn(List<Byte> values) {
            addCriterion("sticky in", values, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyNotIn(List<Byte> values) {
            addCriterion("sticky not in", values, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyBetween(Byte value1, Byte value2) {
            addCriterion("sticky between", value1, value2, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyNotBetween(Byte value1, Byte value2) {
            addCriterion("sticky not between", value1, value2, "sticky");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNull() {
            addCriterion("postNum is null");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNotNull() {
            addCriterion("postNum is not null");
            return (Criteria) this;
        }

        public Criteria andPostnumEqualTo(Integer value) {
            addCriterion("postNum =", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotEqualTo(Integer value) {
            addCriterion("postNum <>", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThan(Integer value) {
            addCriterion("postNum >", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postNum >=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThan(Integer value) {
            addCriterion("postNum <", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThanOrEqualTo(Integer value) {
            addCriterion("postNum <=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumIn(List<Integer> values) {
            addCriterion("postNum in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotIn(List<Integer> values) {
            addCriterion("postNum not in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumBetween(Integer value1, Integer value2) {
            addCriterion("postNum between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotBetween(Integer value1, Integer value2) {
            addCriterion("postNum not between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumIsNull() {
            addCriterion("upsNum is null");
            return (Criteria) this;
        }

        public Criteria andUpsnumIsNotNull() {
            addCriterion("upsNum is not null");
            return (Criteria) this;
        }

        public Criteria andUpsnumEqualTo(Integer value) {
            addCriterion("upsNum =", value, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumNotEqualTo(Integer value) {
            addCriterion("upsNum <>", value, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumGreaterThan(Integer value) {
            addCriterion("upsNum >", value, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("upsNum >=", value, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumLessThan(Integer value) {
            addCriterion("upsNum <", value, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumLessThanOrEqualTo(Integer value) {
            addCriterion("upsNum <=", value, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumIn(List<Integer> values) {
            addCriterion("upsNum in", values, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumNotIn(List<Integer> values) {
            addCriterion("upsNum not in", values, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumBetween(Integer value1, Integer value2) {
            addCriterion("upsNum between", value1, value2, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUpsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("upsNum not between", value1, value2, "upsnum");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("orgId =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("orgId <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("orgId >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgId >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("orgId <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("orgId <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("orgId in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("orgId not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("orgId between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("orgId not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("orgCode is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("orgCode =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("orgCode <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("orgCode >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgCode >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("orgCode <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("orgCode <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("orgCode like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("orgCode not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("orgCode in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("orgCode not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("orgCode between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("orgCode not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Integer value) {
            addCriterion("createdTime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Integer value) {
            addCriterion("createdTime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Integer value) {
            addCriterion("createdTime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createdTime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Integer value) {
            addCriterion("createdTime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("createdTime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Integer> values) {
            addCriterion("createdTime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Integer> values) {
            addCriterion("createdTime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Integer value1, Integer value2) {
            addCriterion("createdTime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createdTime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeIsNull() {
            addCriterion("updatedTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeIsNotNull() {
            addCriterion("updatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeEqualTo(Integer value) {
            addCriterion("updatedTime =", value, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeNotEqualTo(Integer value) {
            addCriterion("updatedTime <>", value, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeGreaterThan(Integer value) {
            addCriterion("updatedTime >", value, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatedTime >=", value, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeLessThan(Integer value) {
            addCriterion("updatedTime <", value, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatedTime <=", value, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeIn(List<Integer> values) {
            addCriterion("updatedTime in", values, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeNotIn(List<Integer> values) {
            addCriterion("updatedTime not in", values, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeBetween(Integer value1, Integer value2) {
            addCriterion("updatedTime between", value1, value2, "updatedtime");
            return (Criteria) this;
        }

        public Criteria andUpdatedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatedTime not between", value1, value2, "updatedtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}