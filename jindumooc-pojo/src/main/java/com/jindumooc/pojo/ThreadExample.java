package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreadExample() {
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

        public Criteria andTargettypeIsNull() {
            addCriterion("targetType is null");
            return (Criteria) this;
        }

        public Criteria andTargettypeIsNotNull() {
            addCriterion("targetType is not null");
            return (Criteria) this;
        }

        public Criteria andTargettypeEqualTo(String value) {
            addCriterion("targetType =", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotEqualTo(String value) {
            addCriterion("targetType <>", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeGreaterThan(String value) {
            addCriterion("targetType >", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeGreaterThanOrEqualTo(String value) {
            addCriterion("targetType >=", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeLessThan(String value) {
            addCriterion("targetType <", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeLessThanOrEqualTo(String value) {
            addCriterion("targetType <=", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeLike(String value) {
            addCriterion("targetType like", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotLike(String value) {
            addCriterion("targetType not like", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeIn(List<String> values) {
            addCriterion("targetType in", values, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotIn(List<String> values) {
            addCriterion("targetType not in", values, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeBetween(String value1, String value2) {
            addCriterion("targetType between", value1, value2, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotBetween(String value1, String value2) {
            addCriterion("targetType not between", value1, value2, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNull() {
            addCriterion("targetId is null");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNotNull() {
            addCriterion("targetId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetidEqualTo(Integer value) {
            addCriterion("targetId =", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotEqualTo(Integer value) {
            addCriterion("targetId <>", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThan(Integer value) {
            addCriterion("targetId >", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("targetId >=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThan(Integer value) {
            addCriterion("targetId <", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThanOrEqualTo(Integer value) {
            addCriterion("targetId <=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidIn(List<Integer> values) {
            addCriterion("targetId in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotIn(List<Integer> values) {
            addCriterion("targetId not in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidBetween(Integer value1, Integer value2) {
            addCriterion("targetId between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotBetween(Integer value1, Integer value2) {
            addCriterion("targetId not between", value1, value2, "targetid");
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

        public Criteria andNiceIsNull() {
            addCriterion("nice is null");
            return (Criteria) this;
        }

        public Criteria andNiceIsNotNull() {
            addCriterion("nice is not null");
            return (Criteria) this;
        }

        public Criteria andNiceEqualTo(Integer value) {
            addCriterion("nice =", value, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceNotEqualTo(Integer value) {
            addCriterion("nice <>", value, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceGreaterThan(Integer value) {
            addCriterion("nice >", value, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("nice >=", value, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceLessThan(Integer value) {
            addCriterion("nice <", value, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceLessThanOrEqualTo(Integer value) {
            addCriterion("nice <=", value, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceIn(List<Integer> values) {
            addCriterion("nice in", values, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceNotIn(List<Integer> values) {
            addCriterion("nice not in", values, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceBetween(Integer value1, Integer value2) {
            addCriterion("nice between", value1, value2, "nice");
            return (Criteria) this;
        }

        public Criteria andNiceNotBetween(Integer value1, Integer value2) {
            addCriterion("nice not between", value1, value2, "nice");
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

        public Criteria andStickyEqualTo(Integer value) {
            addCriterion("sticky =", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyNotEqualTo(Integer value) {
            addCriterion("sticky <>", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyGreaterThan(Integer value) {
            addCriterion("sticky >", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyGreaterThanOrEqualTo(Integer value) {
            addCriterion("sticky >=", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyLessThan(Integer value) {
            addCriterion("sticky <", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyLessThanOrEqualTo(Integer value) {
            addCriterion("sticky <=", value, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyIn(List<Integer> values) {
            addCriterion("sticky in", values, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyNotIn(List<Integer> values) {
            addCriterion("sticky not in", values, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyBetween(Integer value1, Integer value2) {
            addCriterion("sticky between", value1, value2, "sticky");
            return (Criteria) this;
        }

        public Criteria andStickyNotBetween(Integer value1, Integer value2) {
            addCriterion("sticky not between", value1, value2, "sticky");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNull() {
            addCriterion("solved is null");
            return (Criteria) this;
        }

        public Criteria andSolvedIsNotNull() {
            addCriterion("solved is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedEqualTo(Byte value) {
            addCriterion("solved =", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotEqualTo(Byte value) {
            addCriterion("solved <>", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThan(Byte value) {
            addCriterion("solved >", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedGreaterThanOrEqualTo(Byte value) {
            addCriterion("solved >=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThan(Byte value) {
            addCriterion("solved <", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedLessThanOrEqualTo(Byte value) {
            addCriterion("solved <=", value, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedIn(List<Byte> values) {
            addCriterion("solved in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotIn(List<Byte> values) {
            addCriterion("solved not in", values, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedBetween(Byte value1, Byte value2) {
            addCriterion("solved between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andSolvedNotBetween(Byte value1, Byte value2) {
            addCriterion("solved not between", value1, value2, "solved");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridIsNull() {
            addCriterion("lastPostUserId is null");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridIsNotNull() {
            addCriterion("lastPostUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridEqualTo(Integer value) {
            addCriterion("lastPostUserId =", value, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridNotEqualTo(Integer value) {
            addCriterion("lastPostUserId <>", value, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridGreaterThan(Integer value) {
            addCriterion("lastPostUserId >", value, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastPostUserId >=", value, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridLessThan(Integer value) {
            addCriterion("lastPostUserId <", value, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridLessThanOrEqualTo(Integer value) {
            addCriterion("lastPostUserId <=", value, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridIn(List<Integer> values) {
            addCriterion("lastPostUserId in", values, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridNotIn(List<Integer> values) {
            addCriterion("lastPostUserId not in", values, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridBetween(Integer value1, Integer value2) {
            addCriterion("lastPostUserId between", value1, value2, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastpostuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("lastPostUserId not between", value1, value2, "lastpostuserid");
            return (Criteria) this;
        }

        public Criteria andLastposttimeIsNull() {
            addCriterion("lastPostTime is null");
            return (Criteria) this;
        }

        public Criteria andLastposttimeIsNotNull() {
            addCriterion("lastPostTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastposttimeEqualTo(Integer value) {
            addCriterion("lastPostTime =", value, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeNotEqualTo(Integer value) {
            addCriterion("lastPostTime <>", value, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeGreaterThan(Integer value) {
            addCriterion("lastPostTime >", value, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastPostTime >=", value, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeLessThan(Integer value) {
            addCriterion("lastPostTime <", value, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastPostTime <=", value, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeIn(List<Integer> values) {
            addCriterion("lastPostTime in", values, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeNotIn(List<Integer> values) {
            addCriterion("lastPostTime not in", values, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeBetween(Integer value1, Integer value2) {
            addCriterion("lastPostTime between", value1, value2, "lastposttime");
            return (Criteria) this;
        }

        public Criteria andLastposttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastPostTime not between", value1, value2, "lastposttime");
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

        public Criteria andMembernumIsNull() {
            addCriterion("memberNum is null");
            return (Criteria) this;
        }

        public Criteria andMembernumIsNotNull() {
            addCriterion("memberNum is not null");
            return (Criteria) this;
        }

        public Criteria andMembernumEqualTo(Integer value) {
            addCriterion("memberNum =", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumNotEqualTo(Integer value) {
            addCriterion("memberNum <>", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumGreaterThan(Integer value) {
            addCriterion("memberNum >", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberNum >=", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumLessThan(Integer value) {
            addCriterion("memberNum <", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumLessThanOrEqualTo(Integer value) {
            addCriterion("memberNum <=", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumIn(List<Integer> values) {
            addCriterion("memberNum in", values, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumNotIn(List<Integer> values) {
            addCriterion("memberNum not in", values, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumBetween(Integer value1, Integer value2) {
            addCriterion("memberNum between", value1, value2, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumNotBetween(Integer value1, Integer value2) {
            addCriterion("memberNum not between", value1, value2, "membernum");
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

        public Criteria andMaxusersIsNull() {
            addCriterion("maxUsers is null");
            return (Criteria) this;
        }

        public Criteria andMaxusersIsNotNull() {
            addCriterion("maxUsers is not null");
            return (Criteria) this;
        }

        public Criteria andMaxusersEqualTo(Integer value) {
            addCriterion("maxUsers =", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersNotEqualTo(Integer value) {
            addCriterion("maxUsers <>", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersGreaterThan(Integer value) {
            addCriterion("maxUsers >", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxUsers >=", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersLessThan(Integer value) {
            addCriterion("maxUsers <", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersLessThanOrEqualTo(Integer value) {
            addCriterion("maxUsers <=", value, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersIn(List<Integer> values) {
            addCriterion("maxUsers in", values, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersNotIn(List<Integer> values) {
            addCriterion("maxUsers not in", values, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersBetween(Integer value1, Integer value2) {
            addCriterion("maxUsers between", value1, value2, "maxusers");
            return (Criteria) this;
        }

        public Criteria andMaxusersNotBetween(Integer value1, Integer value2) {
            addCriterion("maxUsers not between", value1, value2, "maxusers");
            return (Criteria) this;
        }

        public Criteria andActvitypictureIsNull() {
            addCriterion("actvityPicture is null");
            return (Criteria) this;
        }

        public Criteria andActvitypictureIsNotNull() {
            addCriterion("actvityPicture is not null");
            return (Criteria) this;
        }

        public Criteria andActvitypictureEqualTo(String value) {
            addCriterion("actvityPicture =", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureNotEqualTo(String value) {
            addCriterion("actvityPicture <>", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureGreaterThan(String value) {
            addCriterion("actvityPicture >", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureGreaterThanOrEqualTo(String value) {
            addCriterion("actvityPicture >=", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureLessThan(String value) {
            addCriterion("actvityPicture <", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureLessThanOrEqualTo(String value) {
            addCriterion("actvityPicture <=", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureLike(String value) {
            addCriterion("actvityPicture like", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureNotLike(String value) {
            addCriterion("actvityPicture not like", value, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureIn(List<String> values) {
            addCriterion("actvityPicture in", values, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureNotIn(List<String> values) {
            addCriterion("actvityPicture not in", values, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureBetween(String value1, String value2) {
            addCriterion("actvityPicture between", value1, value2, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andActvitypictureNotBetween(String value1, String value2) {
            addCriterion("actvityPicture not between", value1, value2, "actvitypicture");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNull() {
            addCriterion("relationId is null");
            return (Criteria) this;
        }

        public Criteria andRelationidIsNotNull() {
            addCriterion("relationId is not null");
            return (Criteria) this;
        }

        public Criteria andRelationidEqualTo(Integer value) {
            addCriterion("relationId =", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotEqualTo(Integer value) {
            addCriterion("relationId <>", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThan(Integer value) {
            addCriterion("relationId >", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("relationId >=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThan(Integer value) {
            addCriterion("relationId <", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidLessThanOrEqualTo(Integer value) {
            addCriterion("relationId <=", value, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidIn(List<Integer> values) {
            addCriterion("relationId in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotIn(List<Integer> values) {
            addCriterion("relationId not in", values, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidBetween(Integer value1, Integer value2) {
            addCriterion("relationId between", value1, value2, "relationid");
            return (Criteria) this;
        }

        public Criteria andRelationidNotBetween(Integer value1, Integer value2) {
            addCriterion("relationId not between", value1, value2, "relationid");
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

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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