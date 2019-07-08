package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class BizQueueJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizQueueJobExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQueueIsNull() {
            addCriterion("queue is null");
            return (Criteria) this;
        }

        public Criteria andQueueIsNotNull() {
            addCriterion("queue is not null");
            return (Criteria) this;
        }

        public Criteria andQueueEqualTo(String value) {
            addCriterion("queue =", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotEqualTo(String value) {
            addCriterion("queue <>", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueGreaterThan(String value) {
            addCriterion("queue >", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueGreaterThanOrEqualTo(String value) {
            addCriterion("queue >=", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueLessThan(String value) {
            addCriterion("queue <", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueLessThanOrEqualTo(String value) {
            addCriterion("queue <=", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueLike(String value) {
            addCriterion("queue like", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotLike(String value) {
            addCriterion("queue not like", value, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueIn(List<String> values) {
            addCriterion("queue in", values, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotIn(List<String> values) {
            addCriterion("queue not in", values, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueBetween(String value1, String value2) {
            addCriterion("queue between", value1, value2, "queue");
            return (Criteria) this;
        }

        public Criteria andQueueNotBetween(String value1, String value2) {
            addCriterion("queue not between", value1, value2, "queue");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNull() {
            addCriterion("timeout is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIsNotNull() {
            addCriterion("timeout is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutEqualTo(Integer value) {
            addCriterion("timeout =", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotEqualTo(Integer value) {
            addCriterion("timeout <>", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThan(Integer value) {
            addCriterion("timeout >", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeout >=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThan(Integer value) {
            addCriterion("timeout <", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("timeout <=", value, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutIn(List<Integer> values) {
            addCriterion("timeout in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotIn(List<Integer> values) {
            addCriterion("timeout not in", values, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("timeout between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("timeout not between", value1, value2, "timeout");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andExecutionsIsNull() {
            addCriterion("executions is null");
            return (Criteria) this;
        }

        public Criteria andExecutionsIsNotNull() {
            addCriterion("executions is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionsEqualTo(Integer value) {
            addCriterion("executions =", value, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsNotEqualTo(Integer value) {
            addCriterion("executions <>", value, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsGreaterThan(Integer value) {
            addCriterion("executions >", value, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("executions >=", value, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsLessThan(Integer value) {
            addCriterion("executions <", value, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsLessThanOrEqualTo(Integer value) {
            addCriterion("executions <=", value, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsIn(List<Integer> values) {
            addCriterion("executions in", values, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsNotIn(List<Integer> values) {
            addCriterion("executions not in", values, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsBetween(Integer value1, Integer value2) {
            addCriterion("executions between", value1, value2, "executions");
            return (Criteria) this;
        }

        public Criteria andExecutionsNotBetween(Integer value1, Integer value2) {
            addCriterion("executions not between", value1, value2, "executions");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeIsNull() {
            addCriterion("available_time is null");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeIsNotNull() {
            addCriterion("available_time is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeEqualTo(Integer value) {
            addCriterion("available_time =", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeNotEqualTo(Integer value) {
            addCriterion("available_time <>", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeGreaterThan(Integer value) {
            addCriterion("available_time >", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("available_time >=", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeLessThan(Integer value) {
            addCriterion("available_time <", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeLessThanOrEqualTo(Integer value) {
            addCriterion("available_time <=", value, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeIn(List<Integer> values) {
            addCriterion("available_time in", values, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeNotIn(List<Integer> values) {
            addCriterion("available_time not in", values, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeBetween(Integer value1, Integer value2) {
            addCriterion("available_time between", value1, value2, "availableTime");
            return (Criteria) this;
        }

        public Criteria andAvailableTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("available_time not between", value1, value2, "availableTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeIsNull() {
            addCriterion("reserved_time is null");
            return (Criteria) this;
        }

        public Criteria andReservedTimeIsNotNull() {
            addCriterion("reserved_time is not null");
            return (Criteria) this;
        }

        public Criteria andReservedTimeEqualTo(Integer value) {
            addCriterion("reserved_time =", value, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeNotEqualTo(Integer value) {
            addCriterion("reserved_time <>", value, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeGreaterThan(Integer value) {
            addCriterion("reserved_time >", value, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserved_time >=", value, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeLessThan(Integer value) {
            addCriterion("reserved_time <", value, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reserved_time <=", value, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeIn(List<Integer> values) {
            addCriterion("reserved_time in", values, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeNotIn(List<Integer> values) {
            addCriterion("reserved_time not in", values, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeBetween(Integer value1, Integer value2) {
            addCriterion("reserved_time between", value1, value2, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andReservedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reserved_time not between", value1, value2, "reservedTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNull() {
            addCriterion("expired_time is null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIsNotNull() {
            addCriterion("expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeEqualTo(Integer value) {
            addCriterion("expired_time =", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotEqualTo(Integer value) {
            addCriterion("expired_time <>", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThan(Integer value) {
            addCriterion("expired_time >", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("expired_time >=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThan(Integer value) {
            addCriterion("expired_time <", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeLessThanOrEqualTo(Integer value) {
            addCriterion("expired_time <=", value, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeIn(List<Integer> values) {
            addCriterion("expired_time in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotIn(List<Integer> values) {
            addCriterion("expired_time not in", values, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeBetween(Integer value1, Integer value2) {
            addCriterion("expired_time between", value1, value2, "expiredTime");
            return (Criteria) this;
        }

        public Criteria andExpiredTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("expired_time not between", value1, value2, "expiredTime");
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