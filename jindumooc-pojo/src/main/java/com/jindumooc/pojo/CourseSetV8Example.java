package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseSetV8Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseSetV8Example() {
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

        public Criteria andIsvipIsNull() {
            addCriterion("isVip is null");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNotNull() {
            addCriterion("isVip is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipEqualTo(Boolean value) {
            addCriterion("isVip =", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotEqualTo(Boolean value) {
            addCriterion("isVip <>", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThan(Boolean value) {
            addCriterion("isVip >", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isVip >=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThan(Boolean value) {
            addCriterion("isVip <", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThanOrEqualTo(Boolean value) {
            addCriterion("isVip <=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipIn(List<Boolean> values) {
            addCriterion("isVip in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotIn(List<Boolean> values) {
            addCriterion("isVip not in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipBetween(Boolean value1, Boolean value2) {
            addCriterion("isVip between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isVip not between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
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

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Float value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Float value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Float value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Float value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Float value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Float value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Float> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Float> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Float value1, Float value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Float value1, Float value2) {
            addCriterion("rating not between", value1, value2, "rating");
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

        public Criteria andHotseqIsNull() {
            addCriterion("hotSeq is null");
            return (Criteria) this;
        }

        public Criteria andHotseqIsNotNull() {
            addCriterion("hotSeq is not null");
            return (Criteria) this;
        }

        public Criteria andHotseqEqualTo(Integer value) {
            addCriterion("hotSeq =", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqNotEqualTo(Integer value) {
            addCriterion("hotSeq <>", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqGreaterThan(Integer value) {
            addCriterion("hotSeq >", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotSeq >=", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqLessThan(Integer value) {
            addCriterion("hotSeq <", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqLessThanOrEqualTo(Integer value) {
            addCriterion("hotSeq <=", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqIn(List<Integer> values) {
            addCriterion("hotSeq in", values, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqNotIn(List<Integer> values) {
            addCriterion("hotSeq not in", values, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqBetween(Integer value1, Integer value2) {
            addCriterion("hotSeq between", value1, value2, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqNotBetween(Integer value1, Integer value2) {
            addCriterion("hotSeq not between", value1, value2, "hotseq");
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

        public Criteria andMaterialnumIsNull() {
            addCriterion("materialNum is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNotNull() {
            addCriterion("materialNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumEqualTo(Integer value) {
            addCriterion("materialNum =", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotEqualTo(Integer value) {
            addCriterion("materialNum <>", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThan(Integer value) {
            addCriterion("materialNum >", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialNum >=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThan(Integer value) {
            addCriterion("materialNum <", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThanOrEqualTo(Integer value) {
            addCriterion("materialNum <=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIn(List<Integer> values) {
            addCriterion("materialNum in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotIn(List<Integer> values) {
            addCriterion("materialNum not in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumBetween(Integer value1, Integer value2) {
            addCriterion("materialNum between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotBetween(Integer value1, Integer value2) {
            addCriterion("materialNum not between", value1, value2, "materialnum");
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

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Boolean value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Boolean value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Boolean value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Boolean value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Boolean value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Boolean> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Boolean> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Boolean value1, Boolean value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceIsNull() {
            addCriterion("minCoursePrice is null");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceIsNotNull() {
            addCriterion("minCoursePrice is not null");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceEqualTo(Float value) {
            addCriterion("minCoursePrice =", value, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceNotEqualTo(Float value) {
            addCriterion("minCoursePrice <>", value, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceGreaterThan(Float value) {
            addCriterion("minCoursePrice >", value, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("minCoursePrice >=", value, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceLessThan(Float value) {
            addCriterion("minCoursePrice <", value, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceLessThanOrEqualTo(Float value) {
            addCriterion("minCoursePrice <=", value, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceIn(List<Float> values) {
            addCriterion("minCoursePrice in", values, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceNotIn(List<Float> values) {
            addCriterion("minCoursePrice not in", values, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceBetween(Float value1, Float value2) {
            addCriterion("minCoursePrice between", value1, value2, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMincoursepriceNotBetween(Float value1, Float value2) {
            addCriterion("minCoursePrice not between", value1, value2, "mincourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceIsNull() {
            addCriterion("maxCoursePrice is null");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceIsNotNull() {
            addCriterion("maxCoursePrice is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceEqualTo(Float value) {
            addCriterion("maxCoursePrice =", value, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceNotEqualTo(Float value) {
            addCriterion("maxCoursePrice <>", value, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceGreaterThan(Float value) {
            addCriterion("maxCoursePrice >", value, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceGreaterThanOrEqualTo(Float value) {
            addCriterion("maxCoursePrice >=", value, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceLessThan(Float value) {
            addCriterion("maxCoursePrice <", value, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceLessThanOrEqualTo(Float value) {
            addCriterion("maxCoursePrice <=", value, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceIn(List<Float> values) {
            addCriterion("maxCoursePrice in", values, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceNotIn(List<Float> values) {
            addCriterion("maxCoursePrice not in", values, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceBetween(Float value1, Float value2) {
            addCriterion("maxCoursePrice between", value1, value2, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andMaxcoursepriceNotBetween(Float value1, Float value2) {
            addCriterion("maxCoursePrice not between", value1, value2, "maxcourseprice");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIsNull() {
            addCriterion("teacherIds is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIsNotNull() {
            addCriterion("teacherIds is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridsEqualTo(String value) {
            addCriterion("teacherIds =", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotEqualTo(String value) {
            addCriterion("teacherIds <>", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsGreaterThan(String value) {
            addCriterion("teacherIds >", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsGreaterThanOrEqualTo(String value) {
            addCriterion("teacherIds >=", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLessThan(String value) {
            addCriterion("teacherIds <", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLessThanOrEqualTo(String value) {
            addCriterion("teacherIds <=", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLike(String value) {
            addCriterion("teacherIds like", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotLike(String value) {
            addCriterion("teacherIds not like", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIn(List<String> values) {
            addCriterion("teacherIds in", values, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotIn(List<String> values) {
            addCriterion("teacherIds not in", values, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsBetween(String value1, String value2) {
            addCriterion("teacherIds between", value1, value2, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotBetween(String value1, String value2) {
            addCriterion("teacherIds not between", value1, value2, "teacherids");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidIsNull() {
            addCriterion("defaultCourseId is null");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidIsNotNull() {
            addCriterion("defaultCourseId is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidEqualTo(Integer value) {
            addCriterion("defaultCourseId =", value, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidNotEqualTo(Integer value) {
            addCriterion("defaultCourseId <>", value, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidGreaterThan(Integer value) {
            addCriterion("defaultCourseId >", value, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("defaultCourseId >=", value, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidLessThan(Integer value) {
            addCriterion("defaultCourseId <", value, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidLessThanOrEqualTo(Integer value) {
            addCriterion("defaultCourseId <=", value, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidIn(List<Integer> values) {
            addCriterion("defaultCourseId in", values, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidNotIn(List<Integer> values) {
            addCriterion("defaultCourseId not in", values, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidBetween(Integer value1, Integer value2) {
            addCriterion("defaultCourseId between", value1, value2, "defaultcourseid");
            return (Criteria) this;
        }

        public Criteria andDefaultcourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("defaultCourseId not between", value1, value2, "defaultcourseid");
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