package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionAnalysisExample() {
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

        public Criteria andQuestionidIsNull() {
            addCriterion("questionId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("questionId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Integer value) {
            addCriterion("questionId =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Integer value) {
            addCriterion("questionId <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Integer value) {
            addCriterion("questionId >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionId >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Integer value) {
            addCriterion("questionId <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("questionId <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Integer> values) {
            addCriterion("questionId in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Integer> values) {
            addCriterion("questionId not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("questionId between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionId not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andChoiceindexIsNull() {
            addCriterion("choiceIndex is null");
            return (Criteria) this;
        }

        public Criteria andChoiceindexIsNotNull() {
            addCriterion("choiceIndex is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceindexEqualTo(Integer value) {
            addCriterion("choiceIndex =", value, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexNotEqualTo(Integer value) {
            addCriterion("choiceIndex <>", value, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexGreaterThan(Integer value) {
            addCriterion("choiceIndex >", value, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("choiceIndex >=", value, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexLessThan(Integer value) {
            addCriterion("choiceIndex <", value, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexLessThanOrEqualTo(Integer value) {
            addCriterion("choiceIndex <=", value, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexIn(List<Integer> values) {
            addCriterion("choiceIndex in", values, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexNotIn(List<Integer> values) {
            addCriterion("choiceIndex not in", values, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexBetween(Integer value1, Integer value2) {
            addCriterion("choiceIndex between", value1, value2, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andChoiceindexNotBetween(Integer value1, Integer value2) {
            addCriterion("choiceIndex not between", value1, value2, "choiceindex");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountIsNull() {
            addCriterion("firstAnswerCount is null");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountIsNotNull() {
            addCriterion("firstAnswerCount is not null");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountEqualTo(Integer value) {
            addCriterion("firstAnswerCount =", value, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountNotEqualTo(Integer value) {
            addCriterion("firstAnswerCount <>", value, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountGreaterThan(Integer value) {
            addCriterion("firstAnswerCount >", value, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstAnswerCount >=", value, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountLessThan(Integer value) {
            addCriterion("firstAnswerCount <", value, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountLessThanOrEqualTo(Integer value) {
            addCriterion("firstAnswerCount <=", value, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountIn(List<Integer> values) {
            addCriterion("firstAnswerCount in", values, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountNotIn(List<Integer> values) {
            addCriterion("firstAnswerCount not in", values, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountBetween(Integer value1, Integer value2) {
            addCriterion("firstAnswerCount between", value1, value2, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andFirstanswercountNotBetween(Integer value1, Integer value2) {
            addCriterion("firstAnswerCount not between", value1, value2, "firstanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountIsNull() {
            addCriterion("totalAnswerCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountIsNotNull() {
            addCriterion("totalAnswerCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountEqualTo(Integer value) {
            addCriterion("totalAnswerCount =", value, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountNotEqualTo(Integer value) {
            addCriterion("totalAnswerCount <>", value, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountGreaterThan(Integer value) {
            addCriterion("totalAnswerCount >", value, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalAnswerCount >=", value, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountLessThan(Integer value) {
            addCriterion("totalAnswerCount <", value, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountLessThanOrEqualTo(Integer value) {
            addCriterion("totalAnswerCount <=", value, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountIn(List<Integer> values) {
            addCriterion("totalAnswerCount in", values, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountNotIn(List<Integer> values) {
            addCriterion("totalAnswerCount not in", values, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountBetween(Integer value1, Integer value2) {
            addCriterion("totalAnswerCount between", value1, value2, "totalanswercount");
            return (Criteria) this;
        }

        public Criteria andTotalanswercountNotBetween(Integer value1, Integer value2) {
            addCriterion("totalAnswerCount not between", value1, value2, "totalanswercount");
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