package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseTask8022BackupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseTask8022BackupExample() {
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

        public Criteria andFromcoursesetidIsNull() {
            addCriterion("fromCourseSetId is null");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidIsNotNull() {
            addCriterion("fromCourseSetId is not null");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidEqualTo(Integer value) {
            addCriterion("fromCourseSetId =", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidNotEqualTo(Integer value) {
            addCriterion("fromCourseSetId <>", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidGreaterThan(Integer value) {
            addCriterion("fromCourseSetId >", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromCourseSetId >=", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidLessThan(Integer value) {
            addCriterion("fromCourseSetId <", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidLessThanOrEqualTo(Integer value) {
            addCriterion("fromCourseSetId <=", value, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidIn(List<Integer> values) {
            addCriterion("fromCourseSetId in", values, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidNotIn(List<Integer> values) {
            addCriterion("fromCourseSetId not in", values, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidBetween(Integer value1, Integer value2) {
            addCriterion("fromCourseSetId between", value1, value2, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andFromcoursesetidNotBetween(Integer value1, Integer value2) {
            addCriterion("fromCourseSetId not between", value1, value2, "fromcoursesetid");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNull() {
            addCriterion("isFree is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNotNull() {
            addCriterion("isFree is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeEqualTo(Integer value) {
            addCriterion("isFree =", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotEqualTo(Integer value) {
            addCriterion("isFree <>", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThan(Integer value) {
            addCriterion("isFree >", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isFree >=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThan(Integer value) {
            addCriterion("isFree <", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThanOrEqualTo(Integer value) {
            addCriterion("isFree <=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeIn(List<Integer> values) {
            addCriterion("isFree in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotIn(List<Integer> values) {
            addCriterion("isFree not in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeBetween(Integer value1, Integer value2) {
            addCriterion("isFree between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotBetween(Integer value1, Integer value2) {
            addCriterion("isFree not between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsoptionalIsNull() {
            addCriterion("isOptional is null");
            return (Criteria) this;
        }

        public Criteria andIsoptionalIsNotNull() {
            addCriterion("isOptional is not null");
            return (Criteria) this;
        }

        public Criteria andIsoptionalEqualTo(Integer value) {
            addCriterion("isOptional =", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotEqualTo(Integer value) {
            addCriterion("isOptional <>", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalGreaterThan(Integer value) {
            addCriterion("isOptional >", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalGreaterThanOrEqualTo(Integer value) {
            addCriterion("isOptional >=", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalLessThan(Integer value) {
            addCriterion("isOptional <", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalLessThanOrEqualTo(Integer value) {
            addCriterion("isOptional <=", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalIn(List<Integer> values) {
            addCriterion("isOptional in", values, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotIn(List<Integer> values) {
            addCriterion("isOptional not in", values, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalBetween(Integer value1, Integer value2) {
            addCriterion("isOptional between", value1, value2, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotBetween(Integer value1, Integer value2) {
            addCriterion("isOptional not between", value1, value2, "isoptional");
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

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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

        public Criteria andModeIsNull() {
            addCriterion("mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(String value) {
            addCriterion("mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(String value) {
            addCriterion("mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(String value) {
            addCriterion("mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(String value) {
            addCriterion("mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(String value) {
            addCriterion("mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(String value) {
            addCriterion("mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLike(String value) {
            addCriterion("mode like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotLike(String value) {
            addCriterion("mode not like", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<String> values) {
            addCriterion("mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<String> values) {
            addCriterion("mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(String value1, String value2) {
            addCriterion("mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(String value1, String value2) {
            addCriterion("mode not between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andMediasourceIsNull() {
            addCriterion("mediaSource is null");
            return (Criteria) this;
        }

        public Criteria andMediasourceIsNotNull() {
            addCriterion("mediaSource is not null");
            return (Criteria) this;
        }

        public Criteria andMediasourceEqualTo(String value) {
            addCriterion("mediaSource =", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotEqualTo(String value) {
            addCriterion("mediaSource <>", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceGreaterThan(String value) {
            addCriterion("mediaSource >", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceGreaterThanOrEqualTo(String value) {
            addCriterion("mediaSource >=", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceLessThan(String value) {
            addCriterion("mediaSource <", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceLessThanOrEqualTo(String value) {
            addCriterion("mediaSource <=", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceLike(String value) {
            addCriterion("mediaSource like", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotLike(String value) {
            addCriterion("mediaSource not like", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceIn(List<String> values) {
            addCriterion("mediaSource in", values, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotIn(List<String> values) {
            addCriterion("mediaSource not in", values, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceBetween(String value1, String value2) {
            addCriterion("mediaSource between", value1, value2, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotBetween(String value1, String value2) {
            addCriterion("mediaSource not between", value1, value2, "mediasource");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumIsNull() {
            addCriterion("maxOnlineNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumIsNotNull() {
            addCriterion("maxOnlineNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumEqualTo(Integer value) {
            addCriterion("maxOnlineNum =", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumNotEqualTo(Integer value) {
            addCriterion("maxOnlineNum <>", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumGreaterThan(Integer value) {
            addCriterion("maxOnlineNum >", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxOnlineNum >=", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumLessThan(Integer value) {
            addCriterion("maxOnlineNum <", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumLessThanOrEqualTo(Integer value) {
            addCriterion("maxOnlineNum <=", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumIn(List<Integer> values) {
            addCriterion("maxOnlineNum in", values, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumNotIn(List<Integer> values) {
            addCriterion("maxOnlineNum not in", values, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumBetween(Integer value1, Integer value2) {
            addCriterion("maxOnlineNum between", value1, value2, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxOnlineNum not between", value1, value2, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andCopyidIsNull() {
            addCriterion("copyId is null");
            return (Criteria) this;
        }

        public Criteria andCopyidIsNotNull() {
            addCriterion("copyId is not null");
            return (Criteria) this;
        }

        public Criteria andCopyidEqualTo(Integer value) {
            addCriterion("copyId =", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotEqualTo(Integer value) {
            addCriterion("copyId <>", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidGreaterThan(Integer value) {
            addCriterion("copyId >", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("copyId >=", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidLessThan(Integer value) {
            addCriterion("copyId <", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidLessThanOrEqualTo(Integer value) {
            addCriterion("copyId <=", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidIn(List<Integer> values) {
            addCriterion("copyId in", values, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotIn(List<Integer> values) {
            addCriterion("copyId not in", values, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidBetween(Integer value1, Integer value2) {
            addCriterion("copyId between", value1, value2, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotBetween(Integer value1, Integer value2) {
            addCriterion("copyId not between", value1, value2, "copyid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIsNull() {
            addCriterion("migrateLessonId is null");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIsNotNull() {
            addCriterion("migrateLessonId is not null");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidEqualTo(Integer value) {
            addCriterion("migrateLessonId =", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotEqualTo(Integer value) {
            addCriterion("migrateLessonId <>", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidGreaterThan(Integer value) {
            addCriterion("migrateLessonId >", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrateLessonId >=", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidLessThan(Integer value) {
            addCriterion("migrateLessonId <", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidLessThanOrEqualTo(Integer value) {
            addCriterion("migrateLessonId <=", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIn(List<Integer> values) {
            addCriterion("migrateLessonId in", values, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotIn(List<Integer> values) {
            addCriterion("migrateLessonId not in", values, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidBetween(Integer value1, Integer value2) {
            addCriterion("migrateLessonId between", value1, value2, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("migrateLessonId not between", value1, value2, "migratelessonid");
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