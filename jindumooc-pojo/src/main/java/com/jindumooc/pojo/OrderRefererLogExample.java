package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderRefererLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRefererLogExample() {
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

        public Criteria andRefererlogidIsNull() {
            addCriterion("refererLogId is null");
            return (Criteria) this;
        }

        public Criteria andRefererlogidIsNotNull() {
            addCriterion("refererLogId is not null");
            return (Criteria) this;
        }

        public Criteria andRefererlogidEqualTo(Integer value) {
            addCriterion("refererLogId =", value, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidNotEqualTo(Integer value) {
            addCriterion("refererLogId <>", value, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidGreaterThan(Integer value) {
            addCriterion("refererLogId >", value, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("refererLogId >=", value, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidLessThan(Integer value) {
            addCriterion("refererLogId <", value, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidLessThanOrEqualTo(Integer value) {
            addCriterion("refererLogId <=", value, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidIn(List<Integer> values) {
            addCriterion("refererLogId in", values, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidNotIn(List<Integer> values) {
            addCriterion("refererLogId not in", values, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidBetween(Integer value1, Integer value2) {
            addCriterion("refererLogId between", value1, value2, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andRefererlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("refererLogId not between", value1, value2, "refererlogid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidIsNull() {
            addCriterion("sourceTargetId is null");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidIsNotNull() {
            addCriterion("sourceTargetId is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidEqualTo(Integer value) {
            addCriterion("sourceTargetId =", value, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidNotEqualTo(Integer value) {
            addCriterion("sourceTargetId <>", value, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidGreaterThan(Integer value) {
            addCriterion("sourceTargetId >", value, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceTargetId >=", value, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidLessThan(Integer value) {
            addCriterion("sourceTargetId <", value, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidLessThanOrEqualTo(Integer value) {
            addCriterion("sourceTargetId <=", value, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidIn(List<Integer> values) {
            addCriterion("sourceTargetId in", values, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidNotIn(List<Integer> values) {
            addCriterion("sourceTargetId not in", values, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidBetween(Integer value1, Integer value2) {
            addCriterion("sourceTargetId between", value1, value2, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargetidNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceTargetId not between", value1, value2, "sourcetargetid");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeIsNull() {
            addCriterion("sourceTargetType is null");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeIsNotNull() {
            addCriterion("sourceTargetType is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeEqualTo(String value) {
            addCriterion("sourceTargetType =", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeNotEqualTo(String value) {
            addCriterion("sourceTargetType <>", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeGreaterThan(String value) {
            addCriterion("sourceTargetType >", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeGreaterThanOrEqualTo(String value) {
            addCriterion("sourceTargetType >=", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeLessThan(String value) {
            addCriterion("sourceTargetType <", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeLessThanOrEqualTo(String value) {
            addCriterion("sourceTargetType <=", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeLike(String value) {
            addCriterion("sourceTargetType like", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeNotLike(String value) {
            addCriterion("sourceTargetType not like", value, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeIn(List<String> values) {
            addCriterion("sourceTargetType in", values, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeNotIn(List<String> values) {
            addCriterion("sourceTargetType not in", values, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeBetween(String value1, String value2) {
            addCriterion("sourceTargetType between", value1, value2, "sourcetargettype");
            return (Criteria) this;
        }

        public Criteria andSourcetargettypeNotBetween(String value1, String value2) {
            addCriterion("sourceTargetType not between", value1, value2, "sourcetargettype");
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