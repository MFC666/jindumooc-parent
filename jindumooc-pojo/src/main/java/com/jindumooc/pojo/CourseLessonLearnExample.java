package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseLessonLearnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseLessonLearnExample() {
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

        public Criteria andLessonidIsNull() {
            addCriterion("lessonId is null");
            return (Criteria) this;
        }

        public Criteria andLessonidIsNotNull() {
            addCriterion("lessonId is not null");
            return (Criteria) this;
        }

        public Criteria andLessonidEqualTo(Integer value) {
            addCriterion("lessonId =", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotEqualTo(Integer value) {
            addCriterion("lessonId <>", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThan(Integer value) {
            addCriterion("lessonId >", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonId >=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThan(Integer value) {
            addCriterion("lessonId <", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidLessThanOrEqualTo(Integer value) {
            addCriterion("lessonId <=", value, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidIn(List<Integer> values) {
            addCriterion("lessonId in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotIn(List<Integer> values) {
            addCriterion("lessonId not in", values, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidBetween(Integer value1, Integer value2) {
            addCriterion("lessonId between", value1, value2, "lessonid");
            return (Criteria) this;
        }

        public Criteria andLessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonId not between", value1, value2, "lessonid");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Integer value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Integer value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Integer value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Integer value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Integer> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Integer> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIsNull() {
            addCriterion("finishedTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIsNotNull() {
            addCriterion("finishedTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeEqualTo(Integer value) {
            addCriterion("finishedTime =", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotEqualTo(Integer value) {
            addCriterion("finishedTime <>", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeGreaterThan(Integer value) {
            addCriterion("finishedTime >", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishedTime >=", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeLessThan(Integer value) {
            addCriterion("finishedTime <", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("finishedTime <=", value, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeIn(List<Integer> values) {
            addCriterion("finishedTime in", values, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotIn(List<Integer> values) {
            addCriterion("finishedTime not in", values, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeBetween(Integer value1, Integer value2) {
            addCriterion("finishedTime between", value1, value2, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andFinishedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("finishedTime not between", value1, value2, "finishedtime");
            return (Criteria) this;
        }

        public Criteria andLearntimeIsNull() {
            addCriterion("learnTime is null");
            return (Criteria) this;
        }

        public Criteria andLearntimeIsNotNull() {
            addCriterion("learnTime is not null");
            return (Criteria) this;
        }

        public Criteria andLearntimeEqualTo(Integer value) {
            addCriterion("learnTime =", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeNotEqualTo(Integer value) {
            addCriterion("learnTime <>", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeGreaterThan(Integer value) {
            addCriterion("learnTime >", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnTime >=", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeLessThan(Integer value) {
            addCriterion("learnTime <", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeLessThanOrEqualTo(Integer value) {
            addCriterion("learnTime <=", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeIn(List<Integer> values) {
            addCriterion("learnTime in", values, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeNotIn(List<Integer> values) {
            addCriterion("learnTime not in", values, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeBetween(Integer value1, Integer value2) {
            addCriterion("learnTime between", value1, value2, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("learnTime not between", value1, value2, "learntime");
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

        public Criteria andWatchnumIsNull() {
            addCriterion("watchNum is null");
            return (Criteria) this;
        }

        public Criteria andWatchnumIsNotNull() {
            addCriterion("watchNum is not null");
            return (Criteria) this;
        }

        public Criteria andWatchnumEqualTo(Integer value) {
            addCriterion("watchNum =", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotEqualTo(Integer value) {
            addCriterion("watchNum <>", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumGreaterThan(Integer value) {
            addCriterion("watchNum >", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchNum >=", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumLessThan(Integer value) {
            addCriterion("watchNum <", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumLessThanOrEqualTo(Integer value) {
            addCriterion("watchNum <=", value, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumIn(List<Integer> values) {
            addCriterion("watchNum in", values, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotIn(List<Integer> values) {
            addCriterion("watchNum not in", values, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumBetween(Integer value1, Integer value2) {
            addCriterion("watchNum between", value1, value2, "watchnum");
            return (Criteria) this;
        }

        public Criteria andWatchnumNotBetween(Integer value1, Integer value2) {
            addCriterion("watchNum not between", value1, value2, "watchnum");
            return (Criteria) this;
        }

        public Criteria andVideostatusIsNull() {
            addCriterion("videoStatus is null");
            return (Criteria) this;
        }

        public Criteria andVideostatusIsNotNull() {
            addCriterion("videoStatus is not null");
            return (Criteria) this;
        }

        public Criteria andVideostatusEqualTo(String value) {
            addCriterion("videoStatus =", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotEqualTo(String value) {
            addCriterion("videoStatus <>", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusGreaterThan(String value) {
            addCriterion("videoStatus >", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusGreaterThanOrEqualTo(String value) {
            addCriterion("videoStatus >=", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusLessThan(String value) {
            addCriterion("videoStatus <", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusLessThanOrEqualTo(String value) {
            addCriterion("videoStatus <=", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusLike(String value) {
            addCriterion("videoStatus like", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotLike(String value) {
            addCriterion("videoStatus not like", value, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusIn(List<String> values) {
            addCriterion("videoStatus in", values, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotIn(List<String> values) {
            addCriterion("videoStatus not in", values, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusBetween(String value1, String value2) {
            addCriterion("videoStatus between", value1, value2, "videostatus");
            return (Criteria) this;
        }

        public Criteria andVideostatusNotBetween(String value1, String value2) {
            addCriterion("videoStatus not between", value1, value2, "videostatus");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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