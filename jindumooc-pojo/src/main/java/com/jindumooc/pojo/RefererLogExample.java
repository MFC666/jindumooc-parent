package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class RefererLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefererLogExample() {
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

        public Criteria andTargetidIsNull() {
            addCriterion("targetId is null");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNotNull() {
            addCriterion("targetId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetidEqualTo(String value) {
            addCriterion("targetId =", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotEqualTo(String value) {
            addCriterion("targetId <>", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThan(String value) {
            addCriterion("targetId >", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThanOrEqualTo(String value) {
            addCriterion("targetId >=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThan(String value) {
            addCriterion("targetId <", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThanOrEqualTo(String value) {
            addCriterion("targetId <=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLike(String value) {
            addCriterion("targetId like", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotLike(String value) {
            addCriterion("targetId not like", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidIn(List<String> values) {
            addCriterion("targetId in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotIn(List<String> values) {
            addCriterion("targetId not in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidBetween(String value1, String value2) {
            addCriterion("targetId between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotBetween(String value1, String value2) {
            addCriterion("targetId not between", value1, value2, "targetid");
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

        public Criteria andTargetinnertypeIsNull() {
            addCriterion("targetInnerType is null");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeIsNotNull() {
            addCriterion("targetInnerType is not null");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeEqualTo(String value) {
            addCriterion("targetInnerType =", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeNotEqualTo(String value) {
            addCriterion("targetInnerType <>", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeGreaterThan(String value) {
            addCriterion("targetInnerType >", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeGreaterThanOrEqualTo(String value) {
            addCriterion("targetInnerType >=", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeLessThan(String value) {
            addCriterion("targetInnerType <", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeLessThanOrEqualTo(String value) {
            addCriterion("targetInnerType <=", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeLike(String value) {
            addCriterion("targetInnerType like", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeNotLike(String value) {
            addCriterion("targetInnerType not like", value, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeIn(List<String> values) {
            addCriterion("targetInnerType in", values, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeNotIn(List<String> values) {
            addCriterion("targetInnerType not in", values, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeBetween(String value1, String value2) {
            addCriterion("targetInnerType between", value1, value2, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andTargetinnertypeNotBetween(String value1, String value2) {
            addCriterion("targetInnerType not between", value1, value2, "targetinnertype");
            return (Criteria) this;
        }

        public Criteria andRefererurlIsNull() {
            addCriterion("refererUrl is null");
            return (Criteria) this;
        }

        public Criteria andRefererurlIsNotNull() {
            addCriterion("refererUrl is not null");
            return (Criteria) this;
        }

        public Criteria andRefererurlEqualTo(String value) {
            addCriterion("refererUrl =", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlNotEqualTo(String value) {
            addCriterion("refererUrl <>", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlGreaterThan(String value) {
            addCriterion("refererUrl >", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlGreaterThanOrEqualTo(String value) {
            addCriterion("refererUrl >=", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlLessThan(String value) {
            addCriterion("refererUrl <", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlLessThanOrEqualTo(String value) {
            addCriterion("refererUrl <=", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlLike(String value) {
            addCriterion("refererUrl like", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlNotLike(String value) {
            addCriterion("refererUrl not like", value, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlIn(List<String> values) {
            addCriterion("refererUrl in", values, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlNotIn(List<String> values) {
            addCriterion("refererUrl not in", values, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlBetween(String value1, String value2) {
            addCriterion("refererUrl between", value1, value2, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererurlNotBetween(String value1, String value2) {
            addCriterion("refererUrl not between", value1, value2, "refererurl");
            return (Criteria) this;
        }

        public Criteria andRefererhostIsNull() {
            addCriterion("refererHost is null");
            return (Criteria) this;
        }

        public Criteria andRefererhostIsNotNull() {
            addCriterion("refererHost is not null");
            return (Criteria) this;
        }

        public Criteria andRefererhostEqualTo(String value) {
            addCriterion("refererHost =", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostNotEqualTo(String value) {
            addCriterion("refererHost <>", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostGreaterThan(String value) {
            addCriterion("refererHost >", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostGreaterThanOrEqualTo(String value) {
            addCriterion("refererHost >=", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostLessThan(String value) {
            addCriterion("refererHost <", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostLessThanOrEqualTo(String value) {
            addCriterion("refererHost <=", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostLike(String value) {
            addCriterion("refererHost like", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostNotLike(String value) {
            addCriterion("refererHost not like", value, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostIn(List<String> values) {
            addCriterion("refererHost in", values, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostNotIn(List<String> values) {
            addCriterion("refererHost not in", values, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostBetween(String value1, String value2) {
            addCriterion("refererHost between", value1, value2, "refererhost");
            return (Criteria) this;
        }

        public Criteria andRefererhostNotBetween(String value1, String value2) {
            addCriterion("refererHost not between", value1, value2, "refererhost");
            return (Criteria) this;
        }

        public Criteria andReferernameIsNull() {
            addCriterion("refererName is null");
            return (Criteria) this;
        }

        public Criteria andReferernameIsNotNull() {
            addCriterion("refererName is not null");
            return (Criteria) this;
        }

        public Criteria andReferernameEqualTo(String value) {
            addCriterion("refererName =", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameNotEqualTo(String value) {
            addCriterion("refererName <>", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameGreaterThan(String value) {
            addCriterion("refererName >", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameGreaterThanOrEqualTo(String value) {
            addCriterion("refererName >=", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameLessThan(String value) {
            addCriterion("refererName <", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameLessThanOrEqualTo(String value) {
            addCriterion("refererName <=", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameLike(String value) {
            addCriterion("refererName like", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameNotLike(String value) {
            addCriterion("refererName not like", value, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameIn(List<String> values) {
            addCriterion("refererName in", values, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameNotIn(List<String> values) {
            addCriterion("refererName not in", values, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameBetween(String value1, String value2) {
            addCriterion("refererName between", value1, value2, "referername");
            return (Criteria) this;
        }

        public Criteria andReferernameNotBetween(String value1, String value2) {
            addCriterion("refererName not between", value1, value2, "referername");
            return (Criteria) this;
        }

        public Criteria andOrdercountIsNull() {
            addCriterion("orderCount is null");
            return (Criteria) this;
        }

        public Criteria andOrdercountIsNotNull() {
            addCriterion("orderCount is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercountEqualTo(Integer value) {
            addCriterion("orderCount =", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotEqualTo(Integer value) {
            addCriterion("orderCount <>", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountGreaterThan(Integer value) {
            addCriterion("orderCount >", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderCount >=", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountLessThan(Integer value) {
            addCriterion("orderCount <", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountLessThanOrEqualTo(Integer value) {
            addCriterion("orderCount <=", value, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountIn(List<Integer> values) {
            addCriterion("orderCount in", values, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotIn(List<Integer> values) {
            addCriterion("orderCount not in", values, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountBetween(Integer value1, Integer value2) {
            addCriterion("orderCount between", value1, value2, "ordercount");
            return (Criteria) this;
        }

        public Criteria andOrdercountNotBetween(Integer value1, Integer value2) {
            addCriterion("orderCount not between", value1, value2, "ordercount");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
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