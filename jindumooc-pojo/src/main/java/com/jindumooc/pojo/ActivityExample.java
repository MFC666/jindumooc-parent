package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andMediaidIsNull() {
            addCriterion("mediaId is null");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNotNull() {
            addCriterion("mediaId is not null");
            return (Criteria) this;
        }

        public Criteria andMediaidEqualTo(Integer value) {
            addCriterion("mediaId =", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotEqualTo(Integer value) {
            addCriterion("mediaId <>", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThan(Integer value) {
            addCriterion("mediaId >", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mediaId >=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThan(Integer value) {
            addCriterion("mediaId <", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThanOrEqualTo(Integer value) {
            addCriterion("mediaId <=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidIn(List<Integer> values) {
            addCriterion("mediaId in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotIn(List<Integer> values) {
            addCriterion("mediaId not in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidBetween(Integer value1, Integer value2) {
            addCriterion("mediaId between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotBetween(Integer value1, Integer value2) {
            addCriterion("mediaId not between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediatypeIsNull() {
            addCriterion("mediaType is null");
            return (Criteria) this;
        }

        public Criteria andMediatypeIsNotNull() {
            addCriterion("mediaType is not null");
            return (Criteria) this;
        }

        public Criteria andMediatypeEqualTo(String value) {
            addCriterion("mediaType =", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotEqualTo(String value) {
            addCriterion("mediaType <>", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeGreaterThan(String value) {
            addCriterion("mediaType >", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeGreaterThanOrEqualTo(String value) {
            addCriterion("mediaType >=", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLessThan(String value) {
            addCriterion("mediaType <", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLessThanOrEqualTo(String value) {
            addCriterion("mediaType <=", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLike(String value) {
            addCriterion("mediaType like", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotLike(String value) {
            addCriterion("mediaType not like", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeIn(List<String> values) {
            addCriterion("mediaType in", values, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotIn(List<String> values) {
            addCriterion("mediaType not in", values, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeBetween(String value1, String value2) {
            addCriterion("mediaType between", value1, value2, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotBetween(String value1, String value2) {
            addCriterion("mediaType not between", value1, value2, "mediatype");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andFromcourseidIsNull() {
            addCriterion("fromCourseId is null");
            return (Criteria) this;
        }

        public Criteria andFromcourseidIsNotNull() {
            addCriterion("fromCourseId is not null");
            return (Criteria) this;
        }

        public Criteria andFromcourseidEqualTo(Integer value) {
            addCriterion("fromCourseId =", value, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidNotEqualTo(Integer value) {
            addCriterion("fromCourseId <>", value, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidGreaterThan(Integer value) {
            addCriterion("fromCourseId >", value, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromCourseId >=", value, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidLessThan(Integer value) {
            addCriterion("fromCourseId <", value, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidLessThanOrEqualTo(Integer value) {
            addCriterion("fromCourseId <=", value, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidIn(List<Integer> values) {
            addCriterion("fromCourseId in", values, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidNotIn(List<Integer> values) {
            addCriterion("fromCourseId not in", values, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidBetween(Integer value1, Integer value2) {
            addCriterion("fromCourseId between", value1, value2, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("fromCourseId not between", value1, value2, "fromcourseid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidIsNull() {
            addCriterion("fromCourseSetId is null");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidIsNotNull() {
            addCriterion("fromCourseSetId is not null");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidEqualTo(Integer value) {
            addCriterion("fromCourseSetId =", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidNotEqualTo(Integer value) {
            addCriterion("fromCourseSetId <>", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidGreaterThan(Integer value) {
            addCriterion("fromCourseSetId >", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromCourseSetId >=", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidLessThan(Integer value) {
            addCriterion("fromCourseSetId <", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidLessThanOrEqualTo(Integer value) {
            addCriterion("fromCourseSetId <=", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidIn(List<Integer> values) {
            addCriterion("fromCourseSetId in", values, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidNotIn(List<Integer> values) {
            addCriterion("fromCourseSetId not in", values, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidBetween(Integer value1, Integer value2) {
            addCriterion("fromCourseSetId between", value1, value2, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidNotBetween(Integer value1, Integer value2) {
            addCriterion("fromCourseSetId not between", value1, value2, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromuseridIsNull() {
            addCriterion("fromUserId is null");
            return (Criteria) this;
        }

        public Criteria andFromuseridIsNotNull() {
            addCriterion("fromUserId is not null");
            return (Criteria) this;
        }

        public Criteria andFromuseridEqualTo(Integer value) {
            addCriterion("fromUserId =", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotEqualTo(Integer value) {
            addCriterion("fromUserId <>", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridGreaterThan(Integer value) {
            addCriterion("fromUserId >", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromUserId >=", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridLessThan(Integer value) {
            addCriterion("fromUserId <", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridLessThanOrEqualTo(Integer value) {
            addCriterion("fromUserId <=", value, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridIn(List<Integer> values) {
            addCriterion("fromUserId in", values, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotIn(List<Integer> values) {
            addCriterion("fromUserId not in", values, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridBetween(Integer value1, Integer value2) {
            addCriterion("fromUserId between", value1, value2, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andFromuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fromUserId not between", value1, value2, "fromuserid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Integer value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Integer value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Integer value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Integer value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Integer> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Integer> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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

        public Criteria andCopyidIsNull() {
            addCriterion("copyId is null");
            return (Criteria) this;
        }

        public Criteria andCopyidIsNotNull() {
            addCriterion("copyId is not null");
            return (Criteria) this;
        }

        public Criteria andCopyidEqualTo(Integer value) {
            addCriterion("copyId =", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotEqualTo(Integer value) {
            addCriterion("copyId <>", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidGreaterThan(Integer value) {
            addCriterion("copyId >", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("copyId >=", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidLessThan(Integer value) {
            addCriterion("copyId <", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidLessThanOrEqualTo(Integer value) {
            addCriterion("copyId <=", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidIn(List<Integer> values) {
            addCriterion("copyId in", values, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotIn(List<Integer> values) {
            addCriterion("copyId not in", values, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidBetween(Integer value1, Integer value2) {
            addCriterion("copyId between", value1, value2, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotBetween(Integer value1, Integer value2) {
            addCriterion("copyId not between", value1, value2, "copyid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIsNull() {
            addCriterion("migrateLessonId is null");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIsNotNull() {
            addCriterion("migrateLessonId is not null");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidEqualTo(Integer value) {
            addCriterion("migrateLessonId =", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotEqualTo(Integer value) {
            addCriterion("migrateLessonId <>", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidGreaterThan(Integer value) {
            addCriterion("migrateLessonId >", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrateLessonId >=", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidLessThan(Integer value) {
            addCriterion("migrateLessonId <", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidLessThanOrEqualTo(Integer value) {
            addCriterion("migrateLessonId <=", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIn(List<Integer> values) {
            addCriterion("migrateLessonId in", values, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotIn(List<Integer> values) {
            addCriterion("migrateLessonId not in", values, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidBetween(Integer value1, Integer value2) {
            addCriterion("migrateLessonId between", value1, value2, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("migrateLessonId not between", value1, value2, "migratelessonid");
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