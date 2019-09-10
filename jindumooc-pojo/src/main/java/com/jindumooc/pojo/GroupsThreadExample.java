package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupsThreadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupsThreadExample() {
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

        public Criteria andIseliteIsNull() {
            addCriterion("isElite is null");
            return (Criteria) this;
        }

        public Criteria andIseliteIsNotNull() {
            addCriterion("isElite is not null");
            return (Criteria) this;
        }

        public Criteria andIseliteEqualTo(Integer value) {
            addCriterion("isElite =", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteNotEqualTo(Integer value) {
            addCriterion("isElite <>", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteGreaterThan(Integer value) {
            addCriterion("isElite >", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteGreaterThanOrEqualTo(Integer value) {
            addCriterion("isElite >=", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteLessThan(Integer value) {
            addCriterion("isElite <", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteLessThanOrEqualTo(Integer value) {
            addCriterion("isElite <=", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteIn(List<Integer> values) {
            addCriterion("isElite in", values, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteNotIn(List<Integer> values) {
            addCriterion("isElite not in", values, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteBetween(Integer value1, Integer value2) {
            addCriterion("isElite between", value1, value2, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteNotBetween(Integer value1, Integer value2) {
            addCriterion("isElite not between", value1, value2, "iselite");
            return (Criteria) this;
        }

        public Criteria andIsstickIsNull() {
            addCriterion("isStick is null");
            return (Criteria) this;
        }

        public Criteria andIsstickIsNotNull() {
            addCriterion("isStick is not null");
            return (Criteria) this;
        }

        public Criteria andIsstickEqualTo(Integer value) {
            addCriterion("isStick =", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickNotEqualTo(Integer value) {
            addCriterion("isStick <>", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickGreaterThan(Integer value) {
            addCriterion("isStick >", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickGreaterThanOrEqualTo(Integer value) {
            addCriterion("isStick >=", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickLessThan(Integer value) {
            addCriterion("isStick <", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickLessThanOrEqualTo(Integer value) {
            addCriterion("isStick <=", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickIn(List<Integer> values) {
            addCriterion("isStick in", values, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickNotIn(List<Integer> values) {
            addCriterion("isStick not in", values, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickBetween(Integer value1, Integer value2) {
            addCriterion("isStick between", value1, value2, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickNotBetween(Integer value1, Integer value2) {
            addCriterion("isStick not between", value1, value2, "isstick");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidIsNull() {
            addCriterion("lastPostMemberId is null");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidIsNotNull() {
            addCriterion("lastPostMemberId is not null");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidEqualTo(Integer value) {
            addCriterion("lastPostMemberId =", value, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidNotEqualTo(Integer value) {
            addCriterion("lastPostMemberId <>", value, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidGreaterThan(Integer value) {
            addCriterion("lastPostMemberId >", value, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastPostMemberId >=", value, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidLessThan(Integer value) {
            addCriterion("lastPostMemberId <", value, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidLessThanOrEqualTo(Integer value) {
            addCriterion("lastPostMemberId <=", value, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidIn(List<Integer> values) {
            addCriterion("lastPostMemberId in", values, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidNotIn(List<Integer> values) {
            addCriterion("lastPostMemberId not in", values, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidBetween(Integer value1, Integer value2) {
            addCriterion("lastPostMemberId between", value1, value2, "lastpostmemberid");
            return (Criteria) this;
        }

        public Criteria andLastpostmemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("lastPostMemberId not between", value1, value2, "lastpostmemberid");
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

        public Criteria andGroupidIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
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

        public Criteria andRewardcoinIsNull() {
            addCriterion("rewardCoin is null");
            return (Criteria) this;
        }

        public Criteria andRewardcoinIsNotNull() {
            addCriterion("rewardCoin is not null");
            return (Criteria) this;
        }

        public Criteria andRewardcoinEqualTo(Integer value) {
            addCriterion("rewardCoin =", value, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinNotEqualTo(Integer value) {
            addCriterion("rewardCoin <>", value, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinGreaterThan(Integer value) {
            addCriterion("rewardCoin >", value, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("rewardCoin >=", value, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinLessThan(Integer value) {
            addCriterion("rewardCoin <", value, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinLessThanOrEqualTo(Integer value) {
            addCriterion("rewardCoin <=", value, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinIn(List<Integer> values) {
            addCriterion("rewardCoin in", values, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinNotIn(List<Integer> values) {
            addCriterion("rewardCoin not in", values, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinBetween(Integer value1, Integer value2) {
            addCriterion("rewardCoin between", value1, value2, "rewardcoin");
            return (Criteria) this;
        }

        public Criteria andRewardcoinNotBetween(Integer value1, Integer value2) {
            addCriterion("rewardCoin not between", value1, value2, "rewardcoin");
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