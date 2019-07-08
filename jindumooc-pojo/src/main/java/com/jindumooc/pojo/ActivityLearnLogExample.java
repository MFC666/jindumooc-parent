package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityLearnLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityLearnLogExample() {
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

        public Criteria andActivityidIsNull() {
            addCriterion("activityId is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityId is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityId =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityId <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityId >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityId >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityId <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityId <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityId in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityId not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityId between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityId not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidIsNull() {
            addCriterion("courseTaskId is null");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidIsNotNull() {
            addCriterion("courseTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidEqualTo(Integer value) {
            addCriterion("courseTaskId =", value, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidNotEqualTo(Integer value) {
            addCriterion("courseTaskId <>", value, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidGreaterThan(Integer value) {
            addCriterion("courseTaskId >", value, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseTaskId >=", value, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidLessThan(Integer value) {
            addCriterion("courseTaskId <", value, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidLessThanOrEqualTo(Integer value) {
            addCriterion("courseTaskId <=", value, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidIn(List<Integer> values) {
            addCriterion("courseTaskId in", values, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidNotIn(List<Integer> values) {
            addCriterion("courseTaskId not in", values, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidBetween(Integer value1, Integer value2) {
            addCriterion("courseTaskId between", value1, value2, "coursetaskid");
            return (Criteria) this;
        }

        public Criteria andCoursetaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseTaskId not between", value1, value2, "coursetaskid");
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

        public Criteria andEventIsNull() {
            addCriterion("event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(String value) {
            addCriterion("event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(String value) {
            addCriterion("event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(String value) {
            addCriterion("event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(String value) {
            addCriterion("event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(String value) {
            addCriterion("event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(String value) {
            addCriterion("event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLike(String value) {
            addCriterion("event like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotLike(String value) {
            addCriterion("event not like", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<String> values) {
            addCriterion("event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<String> values) {
            addCriterion("event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(String value1, String value2) {
            addCriterion("event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(String value1, String value2) {
            addCriterion("event not between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andWatchtimeIsNull() {
            addCriterion("watchTime is null");
            return (Criteria) this;
        }

        public Criteria andWatchtimeIsNotNull() {
            addCriterion("watchTime is not null");
            return (Criteria) this;
        }

        public Criteria andWatchtimeEqualTo(Integer value) {
            addCriterion("watchTime =", value, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeNotEqualTo(Integer value) {
            addCriterion("watchTime <>", value, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeGreaterThan(Integer value) {
            addCriterion("watchTime >", value, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchTime >=", value, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeLessThan(Integer value) {
            addCriterion("watchTime <", value, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeLessThanOrEqualTo(Integer value) {
            addCriterion("watchTime <=", value, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeIn(List<Integer> values) {
            addCriterion("watchTime in", values, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeNotIn(List<Integer> values) {
            addCriterion("watchTime not in", values, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeBetween(Integer value1, Integer value2) {
            addCriterion("watchTime between", value1, value2, "watchtime");
            return (Criteria) this;
        }

        public Criteria andWatchtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("watchTime not between", value1, value2, "watchtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeIsNull() {
            addCriterion("learnedTime is null");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeIsNotNull() {
            addCriterion("learnedTime is not null");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeEqualTo(Integer value) {
            addCriterion("learnedTime =", value, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeNotEqualTo(Integer value) {
            addCriterion("learnedTime <>", value, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeGreaterThan(Integer value) {
            addCriterion("learnedTime >", value, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnedTime >=", value, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeLessThan(Integer value) {
            addCriterion("learnedTime <", value, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("learnedTime <=", value, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeIn(List<Integer> values) {
            addCriterion("learnedTime in", values, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeNotIn(List<Integer> values) {
            addCriterion("learnedTime not in", values, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeBetween(Integer value1, Integer value2) {
            addCriterion("learnedTime between", value1, value2, "learnedtime");
            return (Criteria) this;
        }

        public Criteria andLearnedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("learnedTime not between", value1, value2, "learnedtime");
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

        public Criteria andMigratetaskresultidIsNull() {
            addCriterion("migrateTaskResultId is null");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidIsNotNull() {
            addCriterion("migrateTaskResultId is not null");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidEqualTo(Integer value) {
            addCriterion("migrateTaskResultId =", value, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidNotEqualTo(Integer value) {
            addCriterion("migrateTaskResultId <>", value, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidGreaterThan(Integer value) {
            addCriterion("migrateTaskResultId >", value, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrateTaskResultId >=", value, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidLessThan(Integer value) {
            addCriterion("migrateTaskResultId <", value, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidLessThanOrEqualTo(Integer value) {
            addCriterion("migrateTaskResultId <=", value, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidIn(List<Integer> values) {
            addCriterion("migrateTaskResultId in", values, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidNotIn(List<Integer> values) {
            addCriterion("migrateTaskResultId not in", values, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidBetween(Integer value1, Integer value2) {
            addCriterion("migrateTaskResultId between", value1, value2, "migratetaskresultid");
            return (Criteria) this;
        }

        public Criteria andMigratetaskresultidNotBetween(Integer value1, Integer value2) {
            addCriterion("migrateTaskResultId not between", value1, value2, "migratetaskresultid");
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