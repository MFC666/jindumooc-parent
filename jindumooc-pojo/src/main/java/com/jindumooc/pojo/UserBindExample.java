package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserBindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBindExample() {
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

        public Criteria andFromidIsNull() {
            addCriterion("fromId is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromId is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(String value) {
            addCriterion("fromId =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(String value) {
            addCriterion("fromId <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(String value) {
            addCriterion("fromId >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(String value) {
            addCriterion("fromId >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(String value) {
            addCriterion("fromId <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(String value) {
            addCriterion("fromId <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLike(String value) {
            addCriterion("fromId like", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotLike(String value) {
            addCriterion("fromId not like", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<String> values) {
            addCriterion("fromId in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<String> values) {
            addCriterion("fromId not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(String value1, String value2) {
            addCriterion("fromId between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(String value1, String value2) {
            addCriterion("fromId not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andToidIsNull() {
            addCriterion("toId is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("toId is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(Integer value) {
            addCriterion("toId =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(Integer value) {
            addCriterion("toId <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(Integer value) {
            addCriterion("toId >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(Integer value) {
            addCriterion("toId >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(Integer value) {
            addCriterion("toId <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(Integer value) {
            addCriterion("toId <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<Integer> values) {
            addCriterion("toId in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<Integer> values) {
            addCriterion("toId not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(Integer value1, Integer value2) {
            addCriterion("toId between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(Integer value1, Integer value2) {
            addCriterion("toId not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenIsNull() {
            addCriterion("refreshToken is null");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenIsNotNull() {
            addCriterion("refreshToken is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenEqualTo(String value) {
            addCriterion("refreshToken =", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenNotEqualTo(String value) {
            addCriterion("refreshToken <>", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenGreaterThan(String value) {
            addCriterion("refreshToken >", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenGreaterThanOrEqualTo(String value) {
            addCriterion("refreshToken >=", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenLessThan(String value) {
            addCriterion("refreshToken <", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenLessThanOrEqualTo(String value) {
            addCriterion("refreshToken <=", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenLike(String value) {
            addCriterion("refreshToken like", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenNotLike(String value) {
            addCriterion("refreshToken not like", value, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenIn(List<String> values) {
            addCriterion("refreshToken in", values, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenNotIn(List<String> values) {
            addCriterion("refreshToken not in", values, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenBetween(String value1, String value2) {
            addCriterion("refreshToken between", value1, value2, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andRefreshtokenNotBetween(String value1, String value2) {
            addCriterion("refreshToken not between", value1, value2, "refreshtoken");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeIsNull() {
            addCriterion("expiredTime is null");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeIsNotNull() {
            addCriterion("expiredTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeEqualTo(Integer value) {
            addCriterion("expiredTime =", value, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeNotEqualTo(Integer value) {
            addCriterion("expiredTime <>", value, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeGreaterThan(Integer value) {
            addCriterion("expiredTime >", value, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiredTime >=", value, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeLessThan(Integer value) {
            addCriterion("expiredTime <", value, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeLessThanOrEqualTo(Integer value) {
            addCriterion("expiredTime <=", value, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeIn(List<Integer> values) {
            addCriterion("expiredTime in", values, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeNotIn(List<Integer> values) {
            addCriterion("expiredTime not in", values, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeBetween(Integer value1, Integer value2) {
            addCriterion("expiredTime between", value1, value2, "expiredtime");
            return (Criteria) this;
        }

        public Criteria andExpiredtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expiredTime not between", value1, value2, "expiredtime");
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