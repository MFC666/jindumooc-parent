package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UploadFilesShareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadFilesShareExample() {
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

        public Criteria andSourceuseridIsNull() {
            addCriterion("sourceUserId is null");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIsNotNull() {
            addCriterion("sourceUserId is not null");
            return (Criteria) this;
        }

        public Criteria andSourceuseridEqualTo(Integer value) {
            addCriterion("sourceUserId =", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotEqualTo(Integer value) {
            addCriterion("sourceUserId <>", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridGreaterThan(Integer value) {
            addCriterion("sourceUserId >", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sourceUserId >=", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLessThan(Integer value) {
            addCriterion("sourceUserId <", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridLessThanOrEqualTo(Integer value) {
            addCriterion("sourceUserId <=", value, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridIn(List<Integer> values) {
            addCriterion("sourceUserId in", values, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotIn(List<Integer> values) {
            addCriterion("sourceUserId not in", values, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridBetween(Integer value1, Integer value2) {
            addCriterion("sourceUserId between", value1, value2, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andSourceuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("sourceUserId not between", value1, value2, "sourceuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNull() {
            addCriterion("targetUserId is null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIsNotNull() {
            addCriterion("targetUserId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetuseridEqualTo(Integer value) {
            addCriterion("targetUserId =", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotEqualTo(Integer value) {
            addCriterion("targetUserId <>", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThan(Integer value) {
            addCriterion("targetUserId >", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("targetUserId >=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThan(Integer value) {
            addCriterion("targetUserId <", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridLessThanOrEqualTo(Integer value) {
            addCriterion("targetUserId <=", value, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridIn(List<Integer> values) {
            addCriterion("targetUserId in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotIn(List<Integer> values) {
            addCriterion("targetUserId not in", values, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridBetween(Integer value1, Integer value2) {
            addCriterion("targetUserId between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andTargetuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("targetUserId not between", value1, value2, "targetuserid");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("isActive is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("isActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Byte value) {
            addCriterion("isActive =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Byte value) {
            addCriterion("isActive <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Byte value) {
            addCriterion("isActive >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("isActive >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Byte value) {
            addCriterion("isActive <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Byte value) {
            addCriterion("isActive <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Byte> values) {
            addCriterion("isActive in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Byte> values) {
            addCriterion("isActive not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Byte value1, Byte value2) {
            addCriterion("isActive between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Byte value1, Byte value2) {
            addCriterion("isActive not between", value1, value2, "isactive");
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