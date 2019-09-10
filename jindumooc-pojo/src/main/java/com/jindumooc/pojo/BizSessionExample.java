package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class BizSessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizSessionExample() {
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

        public Criteria andSessTimeIsNull() {
            addCriterion("sess_time is null");
            return (Criteria) this;
        }

        public Criteria andSessTimeIsNotNull() {
            addCriterion("sess_time is not null");
            return (Criteria) this;
        }

        public Criteria andSessTimeEqualTo(Integer value) {
            addCriterion("sess_time =", value, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeNotEqualTo(Integer value) {
            addCriterion("sess_time <>", value, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeGreaterThan(Integer value) {
            addCriterion("sess_time >", value, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sess_time >=", value, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeLessThan(Integer value) {
            addCriterion("sess_time <", value, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sess_time <=", value, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeIn(List<Integer> values) {
            addCriterion("sess_time in", values, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeNotIn(List<Integer> values) {
            addCriterion("sess_time not in", values, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeBetween(Integer value1, Integer value2) {
            addCriterion("sess_time between", value1, value2, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sess_time not between", value1, value2, "sessTime");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineIsNull() {
            addCriterion("sess_deadline is null");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineIsNotNull() {
            addCriterion("sess_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineEqualTo(Integer value) {
            addCriterion("sess_deadline =", value, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineNotEqualTo(Integer value) {
            addCriterion("sess_deadline <>", value, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineGreaterThan(Integer value) {
            addCriterion("sess_deadline >", value, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("sess_deadline >=", value, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineLessThan(Integer value) {
            addCriterion("sess_deadline <", value, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("sess_deadline <=", value, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineIn(List<Integer> values) {
            addCriterion("sess_deadline in", values, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineNotIn(List<Integer> values) {
            addCriterion("sess_deadline not in", values, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("sess_deadline between", value1, value2, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andSessDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("sess_deadline not between", value1, value2, "sessDeadline");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Integer value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Integer value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Integer value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Integer value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Integer> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Integer> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Integer value1, Integer value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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