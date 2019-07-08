package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ArticleCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleCategoryExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPublisharticleIsNull() {
            addCriterion("publishArticle is null");
            return (Criteria) this;
        }

        public Criteria andPublisharticleIsNotNull() {
            addCriterion("publishArticle is not null");
            return (Criteria) this;
        }

        public Criteria andPublisharticleEqualTo(Byte value) {
            addCriterion("publishArticle =", value, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleNotEqualTo(Byte value) {
            addCriterion("publishArticle <>", value, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleGreaterThan(Byte value) {
            addCriterion("publishArticle >", value, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleGreaterThanOrEqualTo(Byte value) {
            addCriterion("publishArticle >=", value, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleLessThan(Byte value) {
            addCriterion("publishArticle <", value, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleLessThanOrEqualTo(Byte value) {
            addCriterion("publishArticle <=", value, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleIn(List<Byte> values) {
            addCriterion("publishArticle in", values, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleNotIn(List<Byte> values) {
            addCriterion("publishArticle not in", values, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleBetween(Byte value1, Byte value2) {
            addCriterion("publishArticle between", value1, value2, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andPublisharticleNotBetween(Byte value1, Byte value2) {
            addCriterion("publishArticle not between", value1, value2, "publisharticle");
            return (Criteria) this;
        }

        public Criteria andSeotitleIsNull() {
            addCriterion("seoTitle is null");
            return (Criteria) this;
        }

        public Criteria andSeotitleIsNotNull() {
            addCriterion("seoTitle is not null");
            return (Criteria) this;
        }

        public Criteria andSeotitleEqualTo(String value) {
            addCriterion("seoTitle =", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotEqualTo(String value) {
            addCriterion("seoTitle <>", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleGreaterThan(String value) {
            addCriterion("seoTitle >", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleGreaterThanOrEqualTo(String value) {
            addCriterion("seoTitle >=", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleLessThan(String value) {
            addCriterion("seoTitle <", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleLessThanOrEqualTo(String value) {
            addCriterion("seoTitle <=", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleLike(String value) {
            addCriterion("seoTitle like", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotLike(String value) {
            addCriterion("seoTitle not like", value, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleIn(List<String> values) {
            addCriterion("seoTitle in", values, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotIn(List<String> values) {
            addCriterion("seoTitle not in", values, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleBetween(String value1, String value2) {
            addCriterion("seoTitle between", value1, value2, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeotitleNotBetween(String value1, String value2) {
            addCriterion("seoTitle not between", value1, value2, "seotitle");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIsNull() {
            addCriterion("seoKeyword is null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIsNotNull() {
            addCriterion("seoKeyword is not null");
            return (Criteria) this;
        }

        public Criteria andSeokeywordEqualTo(String value) {
            addCriterion("seoKeyword =", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotEqualTo(String value) {
            addCriterion("seoKeyword <>", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThan(String value) {
            addCriterion("seoKeyword >", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordGreaterThanOrEqualTo(String value) {
            addCriterion("seoKeyword >=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThan(String value) {
            addCriterion("seoKeyword <", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLessThanOrEqualTo(String value) {
            addCriterion("seoKeyword <=", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordLike(String value) {
            addCriterion("seoKeyword like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotLike(String value) {
            addCriterion("seoKeyword not like", value, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordIn(List<String> values) {
            addCriterion("seoKeyword in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotIn(List<String> values) {
            addCriterion("seoKeyword not in", values, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordBetween(String value1, String value2) {
            addCriterion("seoKeyword between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeokeywordNotBetween(String value1, String value2) {
            addCriterion("seoKeyword not between", value1, value2, "seokeyword");
            return (Criteria) this;
        }

        public Criteria andSeodescIsNull() {
            addCriterion("seoDesc is null");
            return (Criteria) this;
        }

        public Criteria andSeodescIsNotNull() {
            addCriterion("seoDesc is not null");
            return (Criteria) this;
        }

        public Criteria andSeodescEqualTo(String value) {
            addCriterion("seoDesc =", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescNotEqualTo(String value) {
            addCriterion("seoDesc <>", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescGreaterThan(String value) {
            addCriterion("seoDesc >", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescGreaterThanOrEqualTo(String value) {
            addCriterion("seoDesc >=", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescLessThan(String value) {
            addCriterion("seoDesc <", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescLessThanOrEqualTo(String value) {
            addCriterion("seoDesc <=", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescLike(String value) {
            addCriterion("seoDesc like", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescNotLike(String value) {
            addCriterion("seoDesc not like", value, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescIn(List<String> values) {
            addCriterion("seoDesc in", values, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescNotIn(List<String> values) {
            addCriterion("seoDesc not in", values, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescBetween(String value1, String value2) {
            addCriterion("seoDesc between", value1, value2, "seodesc");
            return (Criteria) this;
        }

        public Criteria andSeodescNotBetween(String value1, String value2) {
            addCriterion("seoDesc not between", value1, value2, "seodesc");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(Byte value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(Byte value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(Byte value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(Byte value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(Byte value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(Byte value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<Byte> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<Byte> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(Byte value1, Byte value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(Byte value1, Byte value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
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