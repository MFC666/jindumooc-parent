package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseChapterExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andMigratecopycourseidIsNull() {
            addCriterion("migrateCopyCourseId is null");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidIsNotNull() {
            addCriterion("migrateCopyCourseId is not null");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidEqualTo(Integer value) {
            addCriterion("migrateCopyCourseId =", value, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidNotEqualTo(Integer value) {
            addCriterion("migrateCopyCourseId <>", value, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidGreaterThan(Integer value) {
            addCriterion("migrateCopyCourseId >", value, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrateCopyCourseId >=", value, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidLessThan(Integer value) {
            addCriterion("migrateCopyCourseId <", value, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidLessThanOrEqualTo(Integer value) {
            addCriterion("migrateCopyCourseId <=", value, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidIn(List<Integer> values) {
            addCriterion("migrateCopyCourseId in", values, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidNotIn(List<Integer> values) {
            addCriterion("migrateCopyCourseId not in", values, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidBetween(Integer value1, Integer value2) {
            addCriterion("migrateCopyCourseId between", value1, value2, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratecopycourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("migrateCopyCourseId not between", value1, value2, "migratecopycourseid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidIsNull() {
            addCriterion("migrateRefTaskId is null");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidIsNotNull() {
            addCriterion("migrateRefTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidEqualTo(Integer value) {
            addCriterion("migrateRefTaskId =", value, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidNotEqualTo(Integer value) {
            addCriterion("migrateRefTaskId <>", value, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidGreaterThan(Integer value) {
            addCriterion("migrateRefTaskId >", value, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrateRefTaskId >=", value, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidLessThan(Integer value) {
            addCriterion("migrateRefTaskId <", value, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidLessThanOrEqualTo(Integer value) {
            addCriterion("migrateRefTaskId <=", value, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidIn(List<Integer> values) {
            addCriterion("migrateRefTaskId in", values, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidNotIn(List<Integer> values) {
            addCriterion("migrateRefTaskId not in", values, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidBetween(Integer value1, Integer value2) {
            addCriterion("migrateRefTaskId between", value1, value2, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMigratereftaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("migrateRefTaskId not between", value1, value2, "migratereftaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidIsNull() {
            addCriterion("mgrateCopyTaskId is null");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidIsNotNull() {
            addCriterion("mgrateCopyTaskId is not null");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidEqualTo(Integer value) {
            addCriterion("mgrateCopyTaskId =", value, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidNotEqualTo(Integer value) {
            addCriterion("mgrateCopyTaskId <>", value, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidGreaterThan(Integer value) {
            addCriterion("mgrateCopyTaskId >", value, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mgrateCopyTaskId >=", value, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidLessThan(Integer value) {
            addCriterion("mgrateCopyTaskId <", value, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidLessThanOrEqualTo(Integer value) {
            addCriterion("mgrateCopyTaskId <=", value, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidIn(List<Integer> values) {
            addCriterion("mgrateCopyTaskId in", values, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidNotIn(List<Integer> values) {
            addCriterion("mgrateCopyTaskId not in", values, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidBetween(Integer value1, Integer value2) {
            addCriterion("mgrateCopyTaskId between", value1, value2, "mgratecopytaskid");
            return (Criteria) this;
        }

        public Criteria andMgratecopytaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("mgrateCopyTaskId not between", value1, value2, "mgratecopytaskid");
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