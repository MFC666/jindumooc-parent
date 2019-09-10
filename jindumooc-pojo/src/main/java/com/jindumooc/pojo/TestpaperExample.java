package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestpaperExample() {
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

        public Criteria andLimitedtimeIsNull() {
            addCriterion("limitedTime is null");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeIsNotNull() {
            addCriterion("limitedTime is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeEqualTo(Integer value) {
            addCriterion("limitedTime =", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeNotEqualTo(Integer value) {
            addCriterion("limitedTime <>", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeGreaterThan(Integer value) {
            addCriterion("limitedTime >", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitedTime >=", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeLessThan(Integer value) {
            addCriterion("limitedTime <", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("limitedTime <=", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeIn(List<Integer> values) {
            addCriterion("limitedTime in", values, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeNotIn(List<Integer> values) {
            addCriterion("limitedTime not in", values, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeBetween(Integer value1, Integer value2) {
            addCriterion("limitedTime between", value1, value2, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("limitedTime not between", value1, value2, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andPatternIsNull() {
            addCriterion("pattern is null");
            return (Criteria) this;
        }

        public Criteria andPatternIsNotNull() {
            addCriterion("pattern is not null");
            return (Criteria) this;
        }

        public Criteria andPatternEqualTo(String value) {
            addCriterion("pattern =", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotEqualTo(String value) {
            addCriterion("pattern <>", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternGreaterThan(String value) {
            addCriterion("pattern >", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternGreaterThanOrEqualTo(String value) {
            addCriterion("pattern >=", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLessThan(String value) {
            addCriterion("pattern <", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLessThanOrEqualTo(String value) {
            addCriterion("pattern <=", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternLike(String value) {
            addCriterion("pattern like", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotLike(String value) {
            addCriterion("pattern not like", value, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternIn(List<String> values) {
            addCriterion("pattern in", values, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotIn(List<String> values) {
            addCriterion("pattern not in", values, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternBetween(String value1, String value2) {
            addCriterion("pattern between", value1, value2, "pattern");
            return (Criteria) this;
        }

        public Criteria andPatternNotBetween(String value1, String value2) {
            addCriterion("pattern not between", value1, value2, "pattern");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPassedscoreIsNull() {
            addCriterion("passedScore is null");
            return (Criteria) this;
        }

        public Criteria andPassedscoreIsNotNull() {
            addCriterion("passedScore is not null");
            return (Criteria) this;
        }

        public Criteria andPassedscoreEqualTo(Float value) {
            addCriterion("passedScore =", value, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreNotEqualTo(Float value) {
            addCriterion("passedScore <>", value, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreGreaterThan(Float value) {
            addCriterion("passedScore >", value, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("passedScore >=", value, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreLessThan(Float value) {
            addCriterion("passedScore <", value, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreLessThanOrEqualTo(Float value) {
            addCriterion("passedScore <=", value, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreIn(List<Float> values) {
            addCriterion("passedScore in", values, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreNotIn(List<Float> values) {
            addCriterion("passedScore not in", values, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreBetween(Float value1, Float value2) {
            addCriterion("passedScore between", value1, value2, "passedscore");
            return (Criteria) this;
        }

        public Criteria andPassedscoreNotBetween(Float value1, Float value2) {
            addCriterion("passedScore not between", value1, value2, "passedscore");
            return (Criteria) this;
        }

        public Criteria andItemcountIsNull() {
            addCriterion("itemCount is null");
            return (Criteria) this;
        }

        public Criteria andItemcountIsNotNull() {
            addCriterion("itemCount is not null");
            return (Criteria) this;
        }

        public Criteria andItemcountEqualTo(Integer value) {
            addCriterion("itemCount =", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotEqualTo(Integer value) {
            addCriterion("itemCount <>", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountGreaterThan(Integer value) {
            addCriterion("itemCount >", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemCount >=", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountLessThan(Integer value) {
            addCriterion("itemCount <", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountLessThanOrEqualTo(Integer value) {
            addCriterion("itemCount <=", value, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountIn(List<Integer> values) {
            addCriterion("itemCount in", values, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotIn(List<Integer> values) {
            addCriterion("itemCount not in", values, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountBetween(Integer value1, Integer value2) {
            addCriterion("itemCount between", value1, value2, "itemcount");
            return (Criteria) this;
        }

        public Criteria andItemcountNotBetween(Integer value1, Integer value2) {
            addCriterion("itemCount not between", value1, value2, "itemcount");
            return (Criteria) this;
        }

        public Criteria andCreateduseridIsNull() {
            addCriterion("createdUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateduseridIsNotNull() {
            addCriterion("createdUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateduseridEqualTo(Integer value) {
            addCriterion("createdUserId =", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridNotEqualTo(Integer value) {
            addCriterion("createdUserId <>", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridGreaterThan(Integer value) {
            addCriterion("createdUserId >", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createdUserId >=", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridLessThan(Integer value) {
            addCriterion("createdUserId <", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridLessThanOrEqualTo(Integer value) {
            addCriterion("createdUserId <=", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridIn(List<Integer> values) {
            addCriterion("createdUserId in", values, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridNotIn(List<Integer> values) {
            addCriterion("createdUserId not in", values, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridBetween(Integer value1, Integer value2) {
            addCriterion("createdUserId between", value1, value2, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("createdUserId not between", value1, value2, "createduserid");
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

        public Criteria andUpdateduseridIsNull() {
            addCriterion("updatedUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIsNotNull() {
            addCriterion("updatedUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridEqualTo(Integer value) {
            addCriterion("updatedUserId =", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotEqualTo(Integer value) {
            addCriterion("updatedUserId <>", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridGreaterThan(Integer value) {
            addCriterion("updatedUserId >", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatedUserId >=", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridLessThan(Integer value) {
            addCriterion("updatedUserId <", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridLessThanOrEqualTo(Integer value) {
            addCriterion("updatedUserId <=", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIn(List<Integer> values) {
            addCriterion("updatedUserId in", values, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotIn(List<Integer> values) {
            addCriterion("updatedUserId not in", values, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridBetween(Integer value1, Integer value2) {
            addCriterion("updatedUserId between", value1, value2, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("updatedUserId not between", value1, value2, "updateduserid");
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