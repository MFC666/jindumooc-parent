package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseLessonExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseLessonExtendExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andDotimesIsNull() {
            addCriterion("doTimes is null");
            return (Criteria) this;
        }

        public Criteria andDotimesIsNotNull() {
            addCriterion("doTimes is not null");
            return (Criteria) this;
        }

        public Criteria andDotimesEqualTo(Integer value) {
            addCriterion("doTimes =", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesNotEqualTo(Integer value) {
            addCriterion("doTimes <>", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesGreaterThan(Integer value) {
            addCriterion("doTimes >", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("doTimes >=", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesLessThan(Integer value) {
            addCriterion("doTimes <", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesLessThanOrEqualTo(Integer value) {
            addCriterion("doTimes <=", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesIn(List<Integer> values) {
            addCriterion("doTimes in", values, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesNotIn(List<Integer> values) {
            addCriterion("doTimes not in", values, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesBetween(Integer value1, Integer value2) {
            addCriterion("doTimes between", value1, value2, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesNotBetween(Integer value1, Integer value2) {
            addCriterion("doTimes not between", value1, value2, "dotimes");
            return (Criteria) this;
        }

        public Criteria andRedointervalIsNull() {
            addCriterion("redoInterval is null");
            return (Criteria) this;
        }

        public Criteria andRedointervalIsNotNull() {
            addCriterion("redoInterval is not null");
            return (Criteria) this;
        }

        public Criteria andRedointervalEqualTo(Float value) {
            addCriterion("redoInterval =", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalNotEqualTo(Float value) {
            addCriterion("redoInterval <>", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalGreaterThan(Float value) {
            addCriterion("redoInterval >", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalGreaterThanOrEqualTo(Float value) {
            addCriterion("redoInterval >=", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalLessThan(Float value) {
            addCriterion("redoInterval <", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalLessThanOrEqualTo(Float value) {
            addCriterion("redoInterval <=", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalIn(List<Float> values) {
            addCriterion("redoInterval in", values, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalNotIn(List<Float> values) {
            addCriterion("redoInterval not in", values, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalBetween(Float value1, Float value2) {
            addCriterion("redoInterval between", value1, value2, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalNotBetween(Float value1, Float value2) {
            addCriterion("redoInterval not between", value1, value2, "redointerval");
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