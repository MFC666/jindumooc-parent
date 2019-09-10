package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumIsNull() {
            addCriterion("maxStudentNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumIsNotNull() {
            addCriterion("maxStudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumEqualTo(Integer value) {
            addCriterion("maxStudentNum =", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumNotEqualTo(Integer value) {
            addCriterion("maxStudentNum <>", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumGreaterThan(Integer value) {
            addCriterion("maxStudentNum >", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxStudentNum >=", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumLessThan(Integer value) {
            addCriterion("maxStudentNum <", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxStudentNum <=", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumIn(List<Integer> values) {
            addCriterion("maxStudentNum in", values, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumNotIn(List<Integer> values) {
            addCriterion("maxStudentNum not in", values, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumBetween(Integer value1, Integer value2) {
            addCriterion("maxStudentNum between", value1, value2, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxStudentNum not between", value1, value2, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andOriginpriceIsNull() {
            addCriterion("originPrice is null");
            return (Criteria) this;
        }

        public Criteria andOriginpriceIsNotNull() {
            addCriterion("originPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginpriceEqualTo(Float value) {
            addCriterion("originPrice =", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceNotEqualTo(Float value) {
            addCriterion("originPrice <>", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceGreaterThan(Float value) {
            addCriterion("originPrice >", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("originPrice >=", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceLessThan(Float value) {
            addCriterion("originPrice <", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceLessThanOrEqualTo(Float value) {
            addCriterion("originPrice <=", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceIn(List<Float> values) {
            addCriterion("originPrice in", values, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceNotIn(List<Float> values) {
            addCriterion("originPrice not in", values, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceBetween(Float value1, Float value2) {
            addCriterion("originPrice between", value1, value2, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceNotBetween(Float value1, Float value2) {
            addCriterion("originPrice not between", value1, value2, "originprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceIsNull() {
            addCriterion("coinPrice is null");
            return (Criteria) this;
        }

        public Criteria andCoinpriceIsNotNull() {
            addCriterion("coinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCoinpriceEqualTo(Float value) {
            addCriterion("coinPrice =", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceNotEqualTo(Float value) {
            addCriterion("coinPrice <>", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceGreaterThan(Float value) {
            addCriterion("coinPrice >", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("coinPrice >=", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceLessThan(Float value) {
            addCriterion("coinPrice <", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceLessThanOrEqualTo(Float value) {
            addCriterion("coinPrice <=", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceIn(List<Float> values) {
            addCriterion("coinPrice in", values, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceNotIn(List<Float> values) {
            addCriterion("coinPrice not in", values, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceBetween(Float value1, Float value2) {
            addCriterion("coinPrice between", value1, value2, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceNotBetween(Float value1, Float value2) {
            addCriterion("coinPrice not between", value1, value2, "coinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceIsNull() {
            addCriterion("originCoinPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceIsNotNull() {
            addCriterion("originCoinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceEqualTo(Float value) {
            addCriterion("originCoinPrice =", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceNotEqualTo(Float value) {
            addCriterion("originCoinPrice <>", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceGreaterThan(Float value) {
            addCriterion("originCoinPrice >", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("originCoinPrice >=", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceLessThan(Float value) {
            addCriterion("originCoinPrice <", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceLessThanOrEqualTo(Float value) {
            addCriterion("originCoinPrice <=", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceIn(List<Float> values) {
            addCriterion("originCoinPrice in", values, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceNotIn(List<Float> values) {
            addCriterion("originCoinPrice not in", values, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceBetween(Float value1, Float value2) {
            addCriterion("originCoinPrice between", value1, value2, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceNotBetween(Float value1, Float value2) {
            addCriterion("originCoinPrice not between", value1, value2, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIsNull() {
            addCriterion("expiryMode is null");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIsNotNull() {
            addCriterion("expiryMode is not null");
            return (Criteria) this;
        }

        public Criteria andExpirymodeEqualTo(String value) {
            addCriterion("expiryMode =", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotEqualTo(String value) {
            addCriterion("expiryMode <>", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeGreaterThan(String value) {
            addCriterion("expiryMode >", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeGreaterThanOrEqualTo(String value) {
            addCriterion("expiryMode >=", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLessThan(String value) {
            addCriterion("expiryMode <", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLessThanOrEqualTo(String value) {
            addCriterion("expiryMode <=", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLike(String value) {
            addCriterion("expiryMode like", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotLike(String value) {
            addCriterion("expiryMode not like", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIn(List<String> values) {
            addCriterion("expiryMode in", values, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotIn(List<String> values) {
            addCriterion("expiryMode not in", values, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeBetween(String value1, String value2) {
            addCriterion("expiryMode between", value1, value2, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotBetween(String value1, String value2) {
            addCriterion("expiryMode not between", value1, value2, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirydayIsNull() {
            addCriterion("expiryDay is null");
            return (Criteria) this;
        }

        public Criteria andExpirydayIsNotNull() {
            addCriterion("expiryDay is not null");
            return (Criteria) this;
        }

        public Criteria andExpirydayEqualTo(Integer value) {
            addCriterion("expiryDay =", value, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayNotEqualTo(Integer value) {
            addCriterion("expiryDay <>", value, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayGreaterThan(Integer value) {
            addCriterion("expiryDay >", value, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiryDay >=", value, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayLessThan(Integer value) {
            addCriterion("expiryDay <", value, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayLessThanOrEqualTo(Integer value) {
            addCriterion("expiryDay <=", value, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayIn(List<Integer> values) {
            addCriterion("expiryDay in", values, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayNotIn(List<Integer> values) {
            addCriterion("expiryDay not in", values, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayBetween(Integer value1, Integer value2) {
            addCriterion("expiryDay between", value1, value2, "expiryday");
            return (Criteria) this;
        }

        public Criteria andExpirydayNotBetween(Integer value1, Integer value2) {
            addCriterion("expiryDay not between", value1, value2, "expiryday");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeIsNull() {
            addCriterion("showStudentNumType is null");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeIsNotNull() {
            addCriterion("showStudentNumType is not null");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeEqualTo(String value) {
            addCriterion("showStudentNumType =", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotEqualTo(String value) {
            addCriterion("showStudentNumType <>", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeGreaterThan(String value) {
            addCriterion("showStudentNumType >", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeGreaterThanOrEqualTo(String value) {
            addCriterion("showStudentNumType >=", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeLessThan(String value) {
            addCriterion("showStudentNumType <", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeLessThanOrEqualTo(String value) {
            addCriterion("showStudentNumType <=", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeLike(String value) {
            addCriterion("showStudentNumType like", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotLike(String value) {
            addCriterion("showStudentNumType not like", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeIn(List<String> values) {
            addCriterion("showStudentNumType in", values, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotIn(List<String> values) {
            addCriterion("showStudentNumType not in", values, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeBetween(String value1, String value2) {
            addCriterion("showStudentNumType between", value1, value2, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotBetween(String value1, String value2) {
            addCriterion("showStudentNumType not between", value1, value2, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andSerializemodeIsNull() {
            addCriterion("serializeMode is null");
            return (Criteria) this;
        }

        public Criteria andSerializemodeIsNotNull() {
            addCriterion("serializeMode is not null");
            return (Criteria) this;
        }

        public Criteria andSerializemodeEqualTo(String value) {
            addCriterion("serializeMode =", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotEqualTo(String value) {
            addCriterion("serializeMode <>", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeGreaterThan(String value) {
            addCriterion("serializeMode >", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeGreaterThanOrEqualTo(String value) {
            addCriterion("serializeMode >=", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeLessThan(String value) {
            addCriterion("serializeMode <", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeLessThanOrEqualTo(String value) {
            addCriterion("serializeMode <=", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeLike(String value) {
            addCriterion("serializeMode like", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotLike(String value) {
            addCriterion("serializeMode not like", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeIn(List<String> values) {
            addCriterion("serializeMode in", values, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotIn(List<String> values) {
            addCriterion("serializeMode not in", values, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeBetween(String value1, String value2) {
            addCriterion("serializeMode between", value1, value2, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotBetween(String value1, String value2) {
            addCriterion("serializeMode not between", value1, value2, "serializemode");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Float value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Float value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Float value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Float value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Float value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Float> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Float> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Float value1, Float value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Float value1, Float value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andLessonnumIsNull() {
            addCriterion("lessonNum is null");
            return (Criteria) this;
        }

        public Criteria andLessonnumIsNotNull() {
            addCriterion("lessonNum is not null");
            return (Criteria) this;
        }

        public Criteria andLessonnumEqualTo(Integer value) {
            addCriterion("lessonNum =", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumNotEqualTo(Integer value) {
            addCriterion("lessonNum <>", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumGreaterThan(Integer value) {
            addCriterion("lessonNum >", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonNum >=", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumLessThan(Integer value) {
            addCriterion("lessonNum <", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumLessThanOrEqualTo(Integer value) {
            addCriterion("lessonNum <=", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumIn(List<Integer> values) {
            addCriterion("lessonNum in", values, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumNotIn(List<Integer> values) {
            addCriterion("lessonNum not in", values, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumBetween(Integer value1, Integer value2) {
            addCriterion("lessonNum between", value1, value2, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonNum not between", value1, value2, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andGivecreditIsNull() {
            addCriterion("giveCredit is null");
            return (Criteria) this;
        }

        public Criteria andGivecreditIsNotNull() {
            addCriterion("giveCredit is not null");
            return (Criteria) this;
        }

        public Criteria andGivecreditEqualTo(Integer value) {
            addCriterion("giveCredit =", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotEqualTo(Integer value) {
            addCriterion("giveCredit <>", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditGreaterThan(Integer value) {
            addCriterion("giveCredit >", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("giveCredit >=", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditLessThan(Integer value) {
            addCriterion("giveCredit <", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditLessThanOrEqualTo(Integer value) {
            addCriterion("giveCredit <=", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditIn(List<Integer> values) {
            addCriterion("giveCredit in", values, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotIn(List<Integer> values) {
            addCriterion("giveCredit not in", values, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditBetween(Integer value1, Integer value2) {
            addCriterion("giveCredit between", value1, value2, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotBetween(Integer value1, Integer value2) {
            addCriterion("giveCredit not between", value1, value2, "givecredit");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Integer value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Integer value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Integer value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Integer value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Integer value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Integer value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Integer> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Integer> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Integer value1, Integer value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Integer value1, Integer value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingnumIsNull() {
            addCriterion("ratingNum is null");
            return (Criteria) this;
        }

        public Criteria andRatingnumIsNotNull() {
            addCriterion("ratingNum is not null");
            return (Criteria) this;
        }

        public Criteria andRatingnumEqualTo(Integer value) {
            addCriterion("ratingNum =", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotEqualTo(Integer value) {
            addCriterion("ratingNum <>", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumGreaterThan(Integer value) {
            addCriterion("ratingNum >", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratingNum >=", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumLessThan(Integer value) {
            addCriterion("ratingNum <", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumLessThanOrEqualTo(Integer value) {
            addCriterion("ratingNum <=", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumIn(List<Integer> values) {
            addCriterion("ratingNum in", values, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotIn(List<Integer> values) {
            addCriterion("ratingNum not in", values, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumBetween(Integer value1, Integer value2) {
            addCriterion("ratingNum between", value1, value2, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ratingNum not between", value1, value2, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andViplevelidIsNull() {
            addCriterion("vipLevelId is null");
            return (Criteria) this;
        }

        public Criteria andViplevelidIsNotNull() {
            addCriterion("vipLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelidEqualTo(Integer value) {
            addCriterion("vipLevelId =", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotEqualTo(Integer value) {
            addCriterion("vipLevelId <>", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidGreaterThan(Integer value) {
            addCriterion("vipLevelId >", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipLevelId >=", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidLessThan(Integer value) {
            addCriterion("vipLevelId <", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidLessThanOrEqualTo(Integer value) {
            addCriterion("vipLevelId <=", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidIn(List<Integer> values) {
            addCriterion("vipLevelId in", values, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotIn(List<Integer> values) {
            addCriterion("vipLevelId not in", values, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidBetween(Integer value1, Integer value2) {
            addCriterion("vipLevelId between", value1, value2, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("vipLevelId not between", value1, value2, "viplevelid");
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

        public Criteria andSmallpictureIsNull() {
            addCriterion("smallPicture is null");
            return (Criteria) this;
        }

        public Criteria andSmallpictureIsNotNull() {
            addCriterion("smallPicture is not null");
            return (Criteria) this;
        }

        public Criteria andSmallpictureEqualTo(String value) {
            addCriterion("smallPicture =", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotEqualTo(String value) {
            addCriterion("smallPicture <>", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureGreaterThan(String value) {
            addCriterion("smallPicture >", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureGreaterThanOrEqualTo(String value) {
            addCriterion("smallPicture >=", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureLessThan(String value) {
            addCriterion("smallPicture <", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureLessThanOrEqualTo(String value) {
            addCriterion("smallPicture <=", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureLike(String value) {
            addCriterion("smallPicture like", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotLike(String value) {
            addCriterion("smallPicture not like", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureIn(List<String> values) {
            addCriterion("smallPicture in", values, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotIn(List<String> values) {
            addCriterion("smallPicture not in", values, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureBetween(String value1, String value2) {
            addCriterion("smallPicture between", value1, value2, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotBetween(String value1, String value2) {
            addCriterion("smallPicture not between", value1, value2, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureIsNull() {
            addCriterion("middlePicture is null");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureIsNotNull() {
            addCriterion("middlePicture is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureEqualTo(String value) {
            addCriterion("middlePicture =", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotEqualTo(String value) {
            addCriterion("middlePicture <>", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureGreaterThan(String value) {
            addCriterion("middlePicture >", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureGreaterThanOrEqualTo(String value) {
            addCriterion("middlePicture >=", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureLessThan(String value) {
            addCriterion("middlePicture <", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureLessThanOrEqualTo(String value) {
            addCriterion("middlePicture <=", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureLike(String value) {
            addCriterion("middlePicture like", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotLike(String value) {
            addCriterion("middlePicture not like", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureIn(List<String> values) {
            addCriterion("middlePicture in", values, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotIn(List<String> values) {
            addCriterion("middlePicture not in", values, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureBetween(String value1, String value2) {
            addCriterion("middlePicture between", value1, value2, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotBetween(String value1, String value2) {
            addCriterion("middlePicture not between", value1, value2, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureIsNull() {
            addCriterion("largePicture is null");
            return (Criteria) this;
        }

        public Criteria andLargepictureIsNotNull() {
            addCriterion("largePicture is not null");
            return (Criteria) this;
        }

        public Criteria andLargepictureEqualTo(String value) {
            addCriterion("largePicture =", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotEqualTo(String value) {
            addCriterion("largePicture <>", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureGreaterThan(String value) {
            addCriterion("largePicture >", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureGreaterThanOrEqualTo(String value) {
            addCriterion("largePicture >=", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureLessThan(String value) {
            addCriterion("largePicture <", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureLessThanOrEqualTo(String value) {
            addCriterion("largePicture <=", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureLike(String value) {
            addCriterion("largePicture like", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotLike(String value) {
            addCriterion("largePicture not like", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureIn(List<String> values) {
            addCriterion("largePicture in", values, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotIn(List<String> values) {
            addCriterion("largePicture not in", values, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureBetween(String value1, String value2) {
            addCriterion("largePicture between", value1, value2, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotBetween(String value1, String value2) {
            addCriterion("largePicture not between", value1, value2, "largepicture");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNull() {
            addCriterion("recommended is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNotNull() {
            addCriterion("recommended is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedEqualTo(Byte value) {
            addCriterion("recommended =", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotEqualTo(Byte value) {
            addCriterion("recommended <>", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThan(Byte value) {
            addCriterion("recommended >", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThanOrEqualTo(Byte value) {
            addCriterion("recommended >=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThan(Byte value) {
            addCriterion("recommended <", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThanOrEqualTo(Byte value) {
            addCriterion("recommended <=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedIn(List<Byte> values) {
            addCriterion("recommended in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotIn(List<Byte> values) {
            addCriterion("recommended not in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedBetween(Byte value1, Byte value2) {
            addCriterion("recommended between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotBetween(Byte value1, Byte value2) {
            addCriterion("recommended not between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIsNull() {
            addCriterion("recommendedSeq is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIsNotNull() {
            addCriterion("recommendedSeq is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqEqualTo(Integer value) {
            addCriterion("recommendedSeq =", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotEqualTo(Integer value) {
            addCriterion("recommendedSeq <>", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqGreaterThan(Integer value) {
            addCriterion("recommendedSeq >", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendedSeq >=", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqLessThan(Integer value) {
            addCriterion("recommendedSeq <", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqLessThanOrEqualTo(Integer value) {
            addCriterion("recommendedSeq <=", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIn(List<Integer> values) {
            addCriterion("recommendedSeq in", values, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotIn(List<Integer> values) {
            addCriterion("recommendedSeq not in", values, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqBetween(Integer value1, Integer value2) {
            addCriterion("recommendedSeq between", value1, value2, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendedSeq not between", value1, value2, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIsNull() {
            addCriterion("recommendedTime is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIsNotNull() {
            addCriterion("recommendedTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeEqualTo(Integer value) {
            addCriterion("recommendedTime =", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotEqualTo(Integer value) {
            addCriterion("recommendedTime <>", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeGreaterThan(Integer value) {
            addCriterion("recommendedTime >", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendedTime >=", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeLessThan(Integer value) {
            addCriterion("recommendedTime <", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("recommendedTime <=", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIn(List<Integer> values) {
            addCriterion("recommendedTime in", values, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotIn(List<Integer> values) {
            addCriterion("recommendedTime not in", values, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeBetween(Integer value1, Integer value2) {
            addCriterion("recommendedTime between", value1, value2, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendedTime not between", value1, value2, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationId is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationId is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(Integer value) {
            addCriterion("locationId =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(Integer value) {
            addCriterion("locationId <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(Integer value) {
            addCriterion("locationId >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationId >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(Integer value) {
            addCriterion("locationId <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(Integer value) {
            addCriterion("locationId <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<Integer> values) {
            addCriterion("locationId in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<Integer> values) {
            addCriterion("locationId not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(Integer value1, Integer value2) {
            addCriterion("locationId between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(Integer value1, Integer value2) {
            addCriterion("locationId not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("studentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(Integer value) {
            addCriterion("studentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(Integer value) {
            addCriterion("studentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(Integer value) {
            addCriterion("studentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(Integer value) {
            addCriterion("studentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("studentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<Integer> values) {
            addCriterion("studentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<Integer> values) {
            addCriterion("studentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("studentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("studentNum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNull() {
            addCriterion("hitNum is null");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNotNull() {
            addCriterion("hitNum is not null");
            return (Criteria) this;
        }

        public Criteria andHitnumEqualTo(Integer value) {
            addCriterion("hitNum =", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotEqualTo(Integer value) {
            addCriterion("hitNum <>", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThan(Integer value) {
            addCriterion("hitNum >", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hitNum >=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThan(Integer value) {
            addCriterion("hitNum <", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThanOrEqualTo(Integer value) {
            addCriterion("hitNum <=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumIn(List<Integer> values) {
            addCriterion("hitNum in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotIn(List<Integer> values) {
            addCriterion("hitNum not in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumBetween(Integer value1, Integer value2) {
            addCriterion("hitNum between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("hitNum not between", value1, value2, "hitnum");
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

        public Criteria andDiscountidIsNull() {
            addCriterion("discountId is null");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNotNull() {
            addCriterion("discountId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountidEqualTo(Integer value) {
            addCriterion("discountId =", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotEqualTo(Integer value) {
            addCriterion("discountId <>", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThan(Integer value) {
            addCriterion("discountId >", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("discountId >=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThan(Integer value) {
            addCriterion("discountId <", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThanOrEqualTo(Integer value) {
            addCriterion("discountId <=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidIn(List<Integer> values) {
            addCriterion("discountId in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotIn(List<Integer> values) {
            addCriterion("discountId not in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidBetween(Integer value1, Integer value2) {
            addCriterion("discountId between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotBetween(Integer value1, Integer value2) {
            addCriterion("discountId not between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Float value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Float value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Float value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Float value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Float value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Float> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Float> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Float value1, Float value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Float value1, Float value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyIsNull() {
            addCriterion("deadlineNotify is null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyIsNotNull() {
            addCriterion("deadlineNotify is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyEqualTo(String value) {
            addCriterion("deadlineNotify =", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotEqualTo(String value) {
            addCriterion("deadlineNotify <>", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyGreaterThan(String value) {
            addCriterion("deadlineNotify >", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyGreaterThanOrEqualTo(String value) {
            addCriterion("deadlineNotify >=", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyLessThan(String value) {
            addCriterion("deadlineNotify <", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyLessThanOrEqualTo(String value) {
            addCriterion("deadlineNotify <=", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyLike(String value) {
            addCriterion("deadlineNotify like", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotLike(String value) {
            addCriterion("deadlineNotify not like", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyIn(List<String> values) {
            addCriterion("deadlineNotify in", values, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotIn(List<String> values) {
            addCriterion("deadlineNotify not in", values, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyBetween(String value1, String value2) {
            addCriterion("deadlineNotify between", value1, value2, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotBetween(String value1, String value2) {
            addCriterion("deadlineNotify not between", value1, value2, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineIsNull() {
            addCriterion("daysOfNotifyBeforeDeadline is null");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineIsNotNull() {
            addCriterion("daysOfNotifyBeforeDeadline is not null");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline =", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineNotEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline <>", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineGreaterThan(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline >", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline >=", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineLessThan(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline <", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline <=", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineIn(List<Integer> values) {
            addCriterion("daysOfNotifyBeforeDeadline in", values, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineNotIn(List<Integer> values) {
            addCriterion("daysOfNotifyBeforeDeadline not in", values, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineBetween(Integer value1, Integer value2) {
            addCriterion("daysOfNotifyBeforeDeadline between", value1, value2, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("daysOfNotifyBeforeDeadline not between", value1, value2, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomIsNull() {
            addCriterion("useInClassroom is null");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomIsNotNull() {
            addCriterion("useInClassroom is not null");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomEqualTo(String value) {
            addCriterion("useInClassroom =", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotEqualTo(String value) {
            addCriterion("useInClassroom <>", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomGreaterThan(String value) {
            addCriterion("useInClassroom >", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomGreaterThanOrEqualTo(String value) {
            addCriterion("useInClassroom >=", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomLessThan(String value) {
            addCriterion("useInClassroom <", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomLessThanOrEqualTo(String value) {
            addCriterion("useInClassroom <=", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomLike(String value) {
            addCriterion("useInClassroom like", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotLike(String value) {
            addCriterion("useInClassroom not like", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomIn(List<String> values) {
            addCriterion("useInClassroom in", values, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotIn(List<String> values) {
            addCriterion("useInClassroom not in", values, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomBetween(String value1, String value2) {
            addCriterion("useInClassroom between", value1, value2, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotBetween(String value1, String value2) {
            addCriterion("useInClassroom not between", value1, value2, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andWatchlimitIsNull() {
            addCriterion("watchLimit is null");
            return (Criteria) this;
        }

        public Criteria andWatchlimitIsNotNull() {
            addCriterion("watchLimit is not null");
            return (Criteria) this;
        }

        public Criteria andWatchlimitEqualTo(Integer value) {
            addCriterion("watchLimit =", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitNotEqualTo(Integer value) {
            addCriterion("watchLimit <>", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitGreaterThan(Integer value) {
            addCriterion("watchLimit >", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchLimit >=", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitLessThan(Integer value) {
            addCriterion("watchLimit <", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitLessThanOrEqualTo(Integer value) {
            addCriterion("watchLimit <=", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitIn(List<Integer> values) {
            addCriterion("watchLimit in", values, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitNotIn(List<Integer> values) {
            addCriterion("watchLimit not in", values, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitBetween(Integer value1, Integer value2) {
            addCriterion("watchLimit between", value1, value2, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("watchLimit not between", value1, value2, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andSinglebuyIsNull() {
            addCriterion("singleBuy is null");
            return (Criteria) this;
        }

        public Criteria andSinglebuyIsNotNull() {
            addCriterion("singleBuy is not null");
            return (Criteria) this;
        }

        public Criteria andSinglebuyEqualTo(Integer value) {
            addCriterion("singleBuy =", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyNotEqualTo(Integer value) {
            addCriterion("singleBuy <>", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyGreaterThan(Integer value) {
            addCriterion("singleBuy >", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("singleBuy >=", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyLessThan(Integer value) {
            addCriterion("singleBuy <", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyLessThanOrEqualTo(Integer value) {
            addCriterion("singleBuy <=", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyIn(List<Integer> values) {
            addCriterion("singleBuy in", values, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyNotIn(List<Integer> values) {
            addCriterion("singleBuy not in", values, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyBetween(Integer value1, Integer value2) {
            addCriterion("singleBuy between", value1, value2, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyNotBetween(Integer value1, Integer value2) {
            addCriterion("singleBuy not between", value1, value2, "singlebuy");
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

        public Criteria andFreestarttimeIsNull() {
            addCriterion("freeStartTime is null");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeIsNotNull() {
            addCriterion("freeStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeEqualTo(Integer value) {
            addCriterion("freeStartTime =", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeNotEqualTo(Integer value) {
            addCriterion("freeStartTime <>", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeGreaterThan(Integer value) {
            addCriterion("freeStartTime >", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeStartTime >=", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeLessThan(Integer value) {
            addCriterion("freeStartTime <", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("freeStartTime <=", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeIn(List<Integer> values) {
            addCriterion("freeStartTime in", values, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeNotIn(List<Integer> values) {
            addCriterion("freeStartTime not in", values, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeBetween(Integer value1, Integer value2) {
            addCriterion("freeStartTime between", value1, value2, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeStartTime not between", value1, value2, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeIsNull() {
            addCriterion("freeEndTime is null");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeIsNotNull() {
            addCriterion("freeEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeEqualTo(Integer value) {
            addCriterion("freeEndTime =", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeNotEqualTo(Integer value) {
            addCriterion("freeEndTime <>", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeGreaterThan(Integer value) {
            addCriterion("freeEndTime >", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeEndTime >=", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeLessThan(Integer value) {
            addCriterion("freeEndTime <", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("freeEndTime <=", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeIn(List<Integer> values) {
            addCriterion("freeEndTime in", values, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeNotIn(List<Integer> values) {
            addCriterion("freeEndTime not in", values, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeBetween(Integer value1, Integer value2) {
            addCriterion("freeEndTime between", value1, value2, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeEndTime not between", value1, value2, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNull() {
            addCriterion("approval is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNotNull() {
            addCriterion("approval is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalEqualTo(Boolean value) {
            addCriterion("approval =", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotEqualTo(Boolean value) {
            addCriterion("approval <>", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThan(Boolean value) {
            addCriterion("approval >", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("approval >=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThan(Boolean value) {
            addCriterion("approval <", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThanOrEqualTo(Boolean value) {
            addCriterion("approval <=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalIn(List<Boolean> values) {
            addCriterion("approval in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotIn(List<Boolean> values) {
            addCriterion("approval not in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalBetween(Boolean value1, Boolean value2) {
            addCriterion("approval between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("approval not between", value1, value2, "approval");
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

        public Criteria andNotenumIsNull() {
            addCriterion("noteNum is null");
            return (Criteria) this;
        }

        public Criteria andNotenumIsNotNull() {
            addCriterion("noteNum is not null");
            return (Criteria) this;
        }

        public Criteria andNotenumEqualTo(Integer value) {
            addCriterion("noteNum =", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotEqualTo(Integer value) {
            addCriterion("noteNum <>", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumGreaterThan(Integer value) {
            addCriterion("noteNum >", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("noteNum >=", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumLessThan(Integer value) {
            addCriterion("noteNum <", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumLessThanOrEqualTo(Integer value) {
            addCriterion("noteNum <=", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumIn(List<Integer> values) {
            addCriterion("noteNum in", values, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotIn(List<Integer> values) {
            addCriterion("noteNum not in", values, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumBetween(Integer value1, Integer value2) {
            addCriterion("noteNum between", value1, value2, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotBetween(Integer value1, Integer value2) {
            addCriterion("noteNum not between", value1, value2, "notenum");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Integer value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Integer value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Integer value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Integer value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Integer value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Integer> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Integer> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Integer value1, Integer value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Integer value1, Integer value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andMaxrateIsNull() {
            addCriterion("maxRate is null");
            return (Criteria) this;
        }

        public Criteria andMaxrateIsNotNull() {
            addCriterion("maxRate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrateEqualTo(Byte value) {
            addCriterion("maxRate =", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotEqualTo(Byte value) {
            addCriterion("maxRate <>", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateGreaterThan(Byte value) {
            addCriterion("maxRate >", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateGreaterThanOrEqualTo(Byte value) {
            addCriterion("maxRate >=", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateLessThan(Byte value) {
            addCriterion("maxRate <", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateLessThanOrEqualTo(Byte value) {
            addCriterion("maxRate <=", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateIn(List<Byte> values) {
            addCriterion("maxRate in", values, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotIn(List<Byte> values) {
            addCriterion("maxRate not in", values, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateBetween(Byte value1, Byte value2) {
            addCriterion("maxRate between", value1, value2, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotBetween(Byte value1, Byte value2) {
            addCriterion("maxRate not between", value1, value2, "maxrate");
            return (Criteria) this;
        }

        public Criteria andBuyableIsNull() {
            addCriterion("buyable is null");
            return (Criteria) this;
        }

        public Criteria andBuyableIsNotNull() {
            addCriterion("buyable is not null");
            return (Criteria) this;
        }

        public Criteria andBuyableEqualTo(Boolean value) {
            addCriterion("buyable =", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotEqualTo(Boolean value) {
            addCriterion("buyable <>", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableGreaterThan(Boolean value) {
            addCriterion("buyable >", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("buyable >=", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableLessThan(Boolean value) {
            addCriterion("buyable <", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableLessThanOrEqualTo(Boolean value) {
            addCriterion("buyable <=", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableIn(List<Boolean> values) {
            addCriterion("buyable in", values, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotIn(List<Boolean> values) {
            addCriterion("buyable not in", values, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableBetween(Boolean value1, Boolean value2) {
            addCriterion("buyable between", value1, value2, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("buyable not between", value1, value2, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeIsNull() {
            addCriterion("buyExpiryTime is null");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeIsNotNull() {
            addCriterion("buyExpiryTime is not null");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeEqualTo(Integer value) {
            addCriterion("buyExpiryTime =", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeNotEqualTo(Integer value) {
            addCriterion("buyExpiryTime <>", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeGreaterThan(Integer value) {
            addCriterion("buyExpiryTime >", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyExpiryTime >=", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeLessThan(Integer value) {
            addCriterion("buyExpiryTime <", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeLessThanOrEqualTo(Integer value) {
            addCriterion("buyExpiryTime <=", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeIn(List<Integer> values) {
            addCriterion("buyExpiryTime in", values, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeNotIn(List<Integer> values) {
            addCriterion("buyExpiryTime not in", values, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeBetween(Integer value1, Integer value2) {
            addCriterion("buyExpiryTime between", value1, value2, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("buyExpiryTime not between", value1, value2, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andTrylookableIsNull() {
            addCriterion("tryLookable is null");
            return (Criteria) this;
        }

        public Criteria andTrylookableIsNotNull() {
            addCriterion("tryLookable is not null");
            return (Criteria) this;
        }

        public Criteria andTrylookableEqualTo(Byte value) {
            addCriterion("tryLookable =", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableNotEqualTo(Byte value) {
            addCriterion("tryLookable <>", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableGreaterThan(Byte value) {
            addCriterion("tryLookable >", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableGreaterThanOrEqualTo(Byte value) {
            addCriterion("tryLookable >=", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableLessThan(Byte value) {
            addCriterion("tryLookable <", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableLessThanOrEqualTo(Byte value) {
            addCriterion("tryLookable <=", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableIn(List<Byte> values) {
            addCriterion("tryLookable in", values, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableNotIn(List<Byte> values) {
            addCriterion("tryLookable not in", values, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableBetween(Byte value1, Byte value2) {
            addCriterion("tryLookable between", value1, value2, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableNotBetween(Byte value1, Byte value2) {
            addCriterion("tryLookable not between", value1, value2, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeIsNull() {
            addCriterion("tryLookTime is null");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeIsNotNull() {
            addCriterion("tryLookTime is not null");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeEqualTo(Integer value) {
            addCriterion("tryLookTime =", value, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeNotEqualTo(Integer value) {
            addCriterion("tryLookTime <>", value, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeGreaterThan(Integer value) {
            addCriterion("tryLookTime >", value, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tryLookTime >=", value, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeLessThan(Integer value) {
            addCriterion("tryLookTime <", value, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeLessThanOrEqualTo(Integer value) {
            addCriterion("tryLookTime <=", value, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeIn(List<Integer> values) {
            addCriterion("tryLookTime in", values, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeNotIn(List<Integer> values) {
            addCriterion("tryLookTime not in", values, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeBetween(Integer value1, Integer value2) {
            addCriterion("tryLookTime between", value1, value2, "trylooktime");
            return (Criteria) this;
        }

        public Criteria andTrylooktimeNotBetween(Integer value1, Integer value2) {
            addCriterion("tryLookTime not between", value1, value2, "trylooktime");
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