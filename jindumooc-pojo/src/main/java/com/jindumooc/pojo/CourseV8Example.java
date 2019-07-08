package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseV8Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseV8Example() {
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

        public Criteria andCoursesetidIsNull() {
            addCriterion("courseSetId is null");
            return (Criteria) this;
        }

        public Criteria andCoursesetidIsNotNull() {
            addCriterion("courseSetId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesetidEqualTo(Integer value) {
            addCriterion("courseSetId =", value, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidNotEqualTo(Integer value) {
            addCriterion("courseSetId <>", value, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidGreaterThan(Integer value) {
            addCriterion("courseSetId >", value, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseSetId >=", value, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidLessThan(Integer value) {
            addCriterion("courseSetId <", value, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidLessThanOrEqualTo(Integer value) {
            addCriterion("courseSetId <=", value, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidIn(List<Integer> values) {
            addCriterion("courseSetId in", values, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidNotIn(List<Integer> values) {
            addCriterion("courseSetId not in", values, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidBetween(Integer value1, Integer value2) {
            addCriterion("courseSetId between", value1, value2, "coursesetid");
            return (Criteria) this;
        }

        public Criteria andCoursesetidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseSetId not between", value1, value2, "coursesetid");
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

        public Criteria andCoursesettitleIsNull() {
            addCriterion("courseSetTitle is null");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleIsNotNull() {
            addCriterion("courseSetTitle is not null");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleEqualTo(String value) {
            addCriterion("courseSetTitle =", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleNotEqualTo(String value) {
            addCriterion("courseSetTitle <>", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleGreaterThan(String value) {
            addCriterion("courseSetTitle >", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleGreaterThanOrEqualTo(String value) {
            addCriterion("courseSetTitle >=", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleLessThan(String value) {
            addCriterion("courseSetTitle <", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleLessThanOrEqualTo(String value) {
            addCriterion("courseSetTitle <=", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleLike(String value) {
            addCriterion("courseSetTitle like", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleNotLike(String value) {
            addCriterion("courseSetTitle not like", value, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleIn(List<String> values) {
            addCriterion("courseSetTitle in", values, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleNotIn(List<String> values) {
            addCriterion("courseSetTitle not in", values, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleBetween(String value1, String value2) {
            addCriterion("courseSetTitle between", value1, value2, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andCoursesettitleNotBetween(String value1, String value2) {
            addCriterion("courseSetTitle not between", value1, value2, "coursesettitle");
            return (Criteria) this;
        }

        public Criteria andLearnmodeIsNull() {
            addCriterion("learnMode is null");
            return (Criteria) this;
        }

        public Criteria andLearnmodeIsNotNull() {
            addCriterion("learnMode is not null");
            return (Criteria) this;
        }

        public Criteria andLearnmodeEqualTo(String value) {
            addCriterion("learnMode =", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeNotEqualTo(String value) {
            addCriterion("learnMode <>", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeGreaterThan(String value) {
            addCriterion("learnMode >", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeGreaterThanOrEqualTo(String value) {
            addCriterion("learnMode >=", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeLessThan(String value) {
            addCriterion("learnMode <", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeLessThanOrEqualTo(String value) {
            addCriterion("learnMode <=", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeLike(String value) {
            addCriterion("learnMode like", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeNotLike(String value) {
            addCriterion("learnMode not like", value, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeIn(List<String> values) {
            addCriterion("learnMode in", values, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeNotIn(List<String> values) {
            addCriterion("learnMode not in", values, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeBetween(String value1, String value2) {
            addCriterion("learnMode between", value1, value2, "learnmode");
            return (Criteria) this;
        }

        public Criteria andLearnmodeNotBetween(String value1, String value2) {
            addCriterion("learnMode not between", value1, value2, "learnmode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIsNull() {
            addCriterion("expiryMode is null");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIsNotNull() {
            addCriterion("expiryMode is not null");
            return (Criteria) this;
        }

        public Criteria andExpirymodeEqualTo(String value) {
            addCriterion("expiryMode =", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotEqualTo(String value) {
            addCriterion("expiryMode <>", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeGreaterThan(String value) {
            addCriterion("expiryMode >", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeGreaterThanOrEqualTo(String value) {
            addCriterion("expiryMode >=", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLessThan(String value) {
            addCriterion("expiryMode <", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLessThanOrEqualTo(String value) {
            addCriterion("expiryMode <=", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLike(String value) {
            addCriterion("expiryMode like", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotLike(String value) {
            addCriterion("expiryMode not like", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIn(List<String> values) {
            addCriterion("expiryMode in", values, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotIn(List<String> values) {
            addCriterion("expiryMode not in", values, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeBetween(String value1, String value2) {
            addCriterion("expiryMode between", value1, value2, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotBetween(String value1, String value2) {
            addCriterion("expiryMode not between", value1, value2, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirydaysIsNull() {
            addCriterion("expiryDays is null");
            return (Criteria) this;
        }

        public Criteria andExpirydaysIsNotNull() {
            addCriterion("expiryDays is not null");
            return (Criteria) this;
        }

        public Criteria andExpirydaysEqualTo(Integer value) {
            addCriterion("expiryDays =", value, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysNotEqualTo(Integer value) {
            addCriterion("expiryDays <>", value, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysGreaterThan(Integer value) {
            addCriterion("expiryDays >", value, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiryDays >=", value, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysLessThan(Integer value) {
            addCriterion("expiryDays <", value, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysLessThanOrEqualTo(Integer value) {
            addCriterion("expiryDays <=", value, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysIn(List<Integer> values) {
            addCriterion("expiryDays in", values, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysNotIn(List<Integer> values) {
            addCriterion("expiryDays not in", values, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysBetween(Integer value1, Integer value2) {
            addCriterion("expiryDays between", value1, value2, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirydaysNotBetween(Integer value1, Integer value2) {
            addCriterion("expiryDays not between", value1, value2, "expirydays");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateIsNull() {
            addCriterion("expiryStartDate is null");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateIsNotNull() {
            addCriterion("expiryStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateEqualTo(Integer value) {
            addCriterion("expiryStartDate =", value, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateNotEqualTo(Integer value) {
            addCriterion("expiryStartDate <>", value, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateGreaterThan(Integer value) {
            addCriterion("expiryStartDate >", value, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiryStartDate >=", value, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateLessThan(Integer value) {
            addCriterion("expiryStartDate <", value, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateLessThanOrEqualTo(Integer value) {
            addCriterion("expiryStartDate <=", value, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateIn(List<Integer> values) {
            addCriterion("expiryStartDate in", values, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateNotIn(List<Integer> values) {
            addCriterion("expiryStartDate not in", values, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateBetween(Integer value1, Integer value2) {
            addCriterion("expiryStartDate between", value1, value2, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpirystartdateNotBetween(Integer value1, Integer value2) {
            addCriterion("expiryStartDate not between", value1, value2, "expirystartdate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateIsNull() {
            addCriterion("expiryEndDate is null");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateIsNotNull() {
            addCriterion("expiryEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateEqualTo(Integer value) {
            addCriterion("expiryEndDate =", value, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateNotEqualTo(Integer value) {
            addCriterion("expiryEndDate <>", value, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateGreaterThan(Integer value) {
            addCriterion("expiryEndDate >", value, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiryEndDate >=", value, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateLessThan(Integer value) {
            addCriterion("expiryEndDate <", value, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateLessThanOrEqualTo(Integer value) {
            addCriterion("expiryEndDate <=", value, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateIn(List<Integer> values) {
            addCriterion("expiryEndDate in", values, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateNotIn(List<Integer> values) {
            addCriterion("expiryEndDate not in", values, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateBetween(Integer value1, Integer value2) {
            addCriterion("expiryEndDate between", value1, value2, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andExpiryenddateNotBetween(Integer value1, Integer value2) {
            addCriterion("expiryEndDate not between", value1, value2, "expiryenddate");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Boolean value) {
            addCriterion("isDefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Boolean value) {
            addCriterion("isDefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Boolean value) {
            addCriterion("isDefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Boolean value) {
            addCriterion("isDefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Boolean value) {
            addCriterion("isDefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Boolean> values) {
            addCriterion("isDefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Boolean> values) {
            addCriterion("isDefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Boolean value1, Boolean value2) {
            addCriterion("isDefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDefault not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumIsNull() {
            addCriterion("maxStudentNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumIsNotNull() {
            addCriterion("maxStudentNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumEqualTo(Integer value) {
            addCriterion("maxStudentNum =", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumNotEqualTo(Integer value) {
            addCriterion("maxStudentNum <>", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumGreaterThan(Integer value) {
            addCriterion("maxStudentNum >", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxStudentNum >=", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumLessThan(Integer value) {
            addCriterion("maxStudentNum <", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxStudentNum <=", value, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumIn(List<Integer> values) {
            addCriterion("maxStudentNum in", values, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumNotIn(List<Integer> values) {
            addCriterion("maxStudentNum not in", values, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumBetween(Integer value1, Integer value2) {
            addCriterion("maxStudentNum between", value1, value2, "maxstudentnum");
            return (Criteria) this;
        }

        public Criteria andMaxstudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxStudentNum not between", value1, value2, "maxstudentnum");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
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

        public Criteria andIsfreeEqualTo(Boolean value) {
            addCriterion("isFree =", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotEqualTo(Boolean value) {
            addCriterion("isFree <>", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThan(Boolean value) {
            addCriterion("isFree >", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isFree >=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThan(Boolean value) {
            addCriterion("isFree <", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThanOrEqualTo(Boolean value) {
            addCriterion("isFree <=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeIn(List<Boolean> values) {
            addCriterion("isFree in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotIn(List<Boolean> values) {
            addCriterion("isFree not in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeBetween(Boolean value1, Boolean value2) {
            addCriterion("isFree between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isFree not between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andViplevelidIsNull() {
            addCriterion("vipLevelId is null");
            return (Criteria) this;
        }

        public Criteria andViplevelidIsNotNull() {
            addCriterion("vipLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelidEqualTo(Integer value) {
            addCriterion("vipLevelId =", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotEqualTo(Integer value) {
            addCriterion("vipLevelId <>", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidGreaterThan(Integer value) {
            addCriterion("vipLevelId >", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipLevelId >=", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidLessThan(Integer value) {
            addCriterion("vipLevelId <", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidLessThanOrEqualTo(Integer value) {
            addCriterion("vipLevelId <=", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidIn(List<Integer> values) {
            addCriterion("vipLevelId in", values, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotIn(List<Integer> values) {
            addCriterion("vipLevelId not in", values, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidBetween(Integer value1, Integer value2) {
            addCriterion("vipLevelId between", value1, value2, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("vipLevelId not between", value1, value2, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andBuyableIsNull() {
            addCriterion("buyable is null");
            return (Criteria) this;
        }

        public Criteria andBuyableIsNotNull() {
            addCriterion("buyable is not null");
            return (Criteria) this;
        }

        public Criteria andBuyableEqualTo(Boolean value) {
            addCriterion("buyable =", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotEqualTo(Boolean value) {
            addCriterion("buyable <>", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableGreaterThan(Boolean value) {
            addCriterion("buyable >", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("buyable >=", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableLessThan(Boolean value) {
            addCriterion("buyable <", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableLessThanOrEqualTo(Boolean value) {
            addCriterion("buyable <=", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableIn(List<Boolean> values) {
            addCriterion("buyable in", values, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotIn(List<Boolean> values) {
            addCriterion("buyable not in", values, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableBetween(Boolean value1, Boolean value2) {
            addCriterion("buyable between", value1, value2, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("buyable not between", value1, value2, "buyable");
            return (Criteria) this;
        }

        public Criteria andTrylookableIsNull() {
            addCriterion("tryLookable is null");
            return (Criteria) this;
        }

        public Criteria andTrylookableIsNotNull() {
            addCriterion("tryLookable is not null");
            return (Criteria) this;
        }

        public Criteria andTrylookableEqualTo(Boolean value) {
            addCriterion("tryLookable =", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableNotEqualTo(Boolean value) {
            addCriterion("tryLookable <>", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableGreaterThan(Boolean value) {
            addCriterion("tryLookable >", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tryLookable >=", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableLessThan(Boolean value) {
            addCriterion("tryLookable <", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableLessThanOrEqualTo(Boolean value) {
            addCriterion("tryLookable <=", value, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableIn(List<Boolean> values) {
            addCriterion("tryLookable in", values, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableNotIn(List<Boolean> values) {
            addCriterion("tryLookable not in", values, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableBetween(Boolean value1, Boolean value2) {
            addCriterion("tryLookable between", value1, value2, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylookableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tryLookable not between", value1, value2, "trylookable");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthIsNull() {
            addCriterion("tryLookLength is null");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthIsNotNull() {
            addCriterion("tryLookLength is not null");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthEqualTo(Integer value) {
            addCriterion("tryLookLength =", value, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthNotEqualTo(Integer value) {
            addCriterion("tryLookLength <>", value, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthGreaterThan(Integer value) {
            addCriterion("tryLookLength >", value, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("tryLookLength >=", value, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthLessThan(Integer value) {
            addCriterion("tryLookLength <", value, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthLessThanOrEqualTo(Integer value) {
            addCriterion("tryLookLength <=", value, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthIn(List<Integer> values) {
            addCriterion("tryLookLength in", values, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthNotIn(List<Integer> values) {
            addCriterion("tryLookLength not in", values, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthBetween(Integer value1, Integer value2) {
            addCriterion("tryLookLength between", value1, value2, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andTrylooklengthNotBetween(Integer value1, Integer value2) {
            addCriterion("tryLookLength not between", value1, value2, "trylooklength");
            return (Criteria) this;
        }

        public Criteria andWatchlimitIsNull() {
            addCriterion("watchLimit is null");
            return (Criteria) this;
        }

        public Criteria andWatchlimitIsNotNull() {
            addCriterion("watchLimit is not null");
            return (Criteria) this;
        }

        public Criteria andWatchlimitEqualTo(Integer value) {
            addCriterion("watchLimit =", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitNotEqualTo(Integer value) {
            addCriterion("watchLimit <>", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitGreaterThan(Integer value) {
            addCriterion("watchLimit >", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchLimit >=", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitLessThan(Integer value) {
            addCriterion("watchLimit <", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitLessThanOrEqualTo(Integer value) {
            addCriterion("watchLimit <=", value, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitIn(List<Integer> values) {
            addCriterion("watchLimit in", values, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitNotIn(List<Integer> values) {
            addCriterion("watchLimit not in", values, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitBetween(Integer value1, Integer value2) {
            addCriterion("watchLimit between", value1, value2, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andWatchlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("watchLimit not between", value1, value2, "watchlimit");
            return (Criteria) this;
        }

        public Criteria andTasknumIsNull() {
            addCriterion("taskNum is null");
            return (Criteria) this;
        }

        public Criteria andTasknumIsNotNull() {
            addCriterion("taskNum is not null");
            return (Criteria) this;
        }

        public Criteria andTasknumEqualTo(Integer value) {
            addCriterion("taskNum =", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotEqualTo(Integer value) {
            addCriterion("taskNum <>", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThan(Integer value) {
            addCriterion("taskNum >", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskNum >=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThan(Integer value) {
            addCriterion("taskNum <", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumLessThanOrEqualTo(Integer value) {
            addCriterion("taskNum <=", value, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumIn(List<Integer> values) {
            addCriterion("taskNum in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotIn(List<Integer> values) {
            addCriterion("taskNum not in", values, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumBetween(Integer value1, Integer value2) {
            addCriterion("taskNum between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andTasknumNotBetween(Integer value1, Integer value2) {
            addCriterion("taskNum not between", value1, value2, "tasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumIsNull() {
            addCriterion("compulsoryTaskNum is null");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumIsNotNull() {
            addCriterion("compulsoryTaskNum is not null");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumEqualTo(Integer value) {
            addCriterion("compulsoryTaskNum =", value, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumNotEqualTo(Integer value) {
            addCriterion("compulsoryTaskNum <>", value, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumGreaterThan(Integer value) {
            addCriterion("compulsoryTaskNum >", value, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("compulsoryTaskNum >=", value, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumLessThan(Integer value) {
            addCriterion("compulsoryTaskNum <", value, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumLessThanOrEqualTo(Integer value) {
            addCriterion("compulsoryTaskNum <=", value, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumIn(List<Integer> values) {
            addCriterion("compulsoryTaskNum in", values, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumNotIn(List<Integer> values) {
            addCriterion("compulsoryTaskNum not in", values, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumBetween(Integer value1, Integer value2) {
            addCriterion("compulsoryTaskNum between", value1, value2, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCompulsorytasknumNotBetween(Integer value1, Integer value2) {
            addCriterion("compulsoryTaskNum not between", value1, value2, "compulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("studentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(Integer value) {
            addCriterion("studentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(Integer value) {
            addCriterion("studentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(Integer value) {
            addCriterion("studentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(Integer value) {
            addCriterion("studentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("studentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<Integer> values) {
            addCriterion("studentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<Integer> values) {
            addCriterion("studentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("studentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("studentNum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIsNull() {
            addCriterion("teacherIds is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIsNotNull() {
            addCriterion("teacherIds is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridsEqualTo(String value) {
            addCriterion("teacherIds =", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotEqualTo(String value) {
            addCriterion("teacherIds <>", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsGreaterThan(String value) {
            addCriterion("teacherIds >", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsGreaterThanOrEqualTo(String value) {
            addCriterion("teacherIds >=", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLessThan(String value) {
            addCriterion("teacherIds <", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLessThanOrEqualTo(String value) {
            addCriterion("teacherIds <=", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLike(String value) {
            addCriterion("teacherIds like", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotLike(String value) {
            addCriterion("teacherIds not like", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIn(List<String> values) {
            addCriterion("teacherIds in", values, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotIn(List<String> values) {
            addCriterion("teacherIds not in", values, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsBetween(String value1, String value2) {
            addCriterion("teacherIds between", value1, value2, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotBetween(String value1, String value2) {
            addCriterion("teacherIds not between", value1, value2, "teacherids");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("parentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("parentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("parentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("parentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("parentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("parentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("parentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("parentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentId not between", value1, value2, "parentid");
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

        public Criteria andRatingnumIsNull() {
            addCriterion("ratingNum is null");
            return (Criteria) this;
        }

        public Criteria andRatingnumIsNotNull() {
            addCriterion("ratingNum is not null");
            return (Criteria) this;
        }

        public Criteria andRatingnumEqualTo(Integer value) {
            addCriterion("ratingNum =", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotEqualTo(Integer value) {
            addCriterion("ratingNum <>", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumGreaterThan(Integer value) {
            addCriterion("ratingNum >", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratingNum >=", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumLessThan(Integer value) {
            addCriterion("ratingNum <", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumLessThanOrEqualTo(Integer value) {
            addCriterion("ratingNum <=", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumIn(List<Integer> values) {
            addCriterion("ratingNum in", values, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotIn(List<Integer> values) {
            addCriterion("ratingNum not in", values, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumBetween(Integer value1, Integer value2) {
            addCriterion("ratingNum between", value1, value2, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ratingNum not between", value1, value2, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Float value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Float value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Float value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Float value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Float value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Float value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Float> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Float> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Float value1, Float value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Float value1, Float value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andNotenumIsNull() {
            addCriterion("noteNum is null");
            return (Criteria) this;
        }

        public Criteria andNotenumIsNotNull() {
            addCriterion("noteNum is not null");
            return (Criteria) this;
        }

        public Criteria andNotenumEqualTo(Integer value) {
            addCriterion("noteNum =", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotEqualTo(Integer value) {
            addCriterion("noteNum <>", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumGreaterThan(Integer value) {
            addCriterion("noteNum >", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("noteNum >=", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumLessThan(Integer value) {
            addCriterion("noteNum <", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumLessThanOrEqualTo(Integer value) {
            addCriterion("noteNum <=", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumIn(List<Integer> values) {
            addCriterion("noteNum in", values, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotIn(List<Integer> values) {
            addCriterion("noteNum not in", values, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumBetween(Integer value1, Integer value2) {
            addCriterion("noteNum between", value1, value2, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotBetween(Integer value1, Integer value2) {
            addCriterion("noteNum not between", value1, value2, "notenum");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeIsNull() {
            addCriterion("buyExpiryTime is null");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeIsNotNull() {
            addCriterion("buyExpiryTime is not null");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeEqualTo(Integer value) {
            addCriterion("buyExpiryTime =", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeNotEqualTo(Integer value) {
            addCriterion("buyExpiryTime <>", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeGreaterThan(Integer value) {
            addCriterion("buyExpiryTime >", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("buyExpiryTime >=", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeLessThan(Integer value) {
            addCriterion("buyExpiryTime <", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeLessThanOrEqualTo(Integer value) {
            addCriterion("buyExpiryTime <=", value, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeIn(List<Integer> values) {
            addCriterion("buyExpiryTime in", values, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeNotIn(List<Integer> values) {
            addCriterion("buyExpiryTime not in", values, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeBetween(Integer value1, Integer value2) {
            addCriterion("buyExpiryTime between", value1, value2, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andBuyexpirytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("buyExpiryTime not between", value1, value2, "buyexpirytime");
            return (Criteria) this;
        }

        public Criteria andThreadnumIsNull() {
            addCriterion("threadNum is null");
            return (Criteria) this;
        }

        public Criteria andThreadnumIsNotNull() {
            addCriterion("threadNum is not null");
            return (Criteria) this;
        }

        public Criteria andThreadnumEqualTo(Integer value) {
            addCriterion("threadNum =", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumNotEqualTo(Integer value) {
            addCriterion("threadNum <>", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumGreaterThan(Integer value) {
            addCriterion("threadNum >", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("threadNum >=", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumLessThan(Integer value) {
            addCriterion("threadNum <", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumLessThanOrEqualTo(Integer value) {
            addCriterion("threadNum <=", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumIn(List<Integer> values) {
            addCriterion("threadNum in", values, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumNotIn(List<Integer> values) {
            addCriterion("threadNum not in", values, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumBetween(Integer value1, Integer value2) {
            addCriterion("threadNum between", value1, value2, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("threadNum not between", value1, value2, "threadnum");
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

        public Criteria andApprovalIsNull() {
            addCriterion("approval is null");
            return (Criteria) this;
        }

        public Criteria andApprovalIsNotNull() {
            addCriterion("approval is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalEqualTo(Boolean value) {
            addCriterion("approval =", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotEqualTo(Boolean value) {
            addCriterion("approval <>", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThan(Boolean value) {
            addCriterion("approval >", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("approval >=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThan(Boolean value) {
            addCriterion("approval <", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalLessThanOrEqualTo(Boolean value) {
            addCriterion("approval <=", value, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalIn(List<Boolean> values) {
            addCriterion("approval in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotIn(List<Boolean> values) {
            addCriterion("approval not in", values, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalBetween(Boolean value1, Boolean value2) {
            addCriterion("approval between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andApprovalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("approval not between", value1, value2, "approval");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Float value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Float value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Float value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Float value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Float value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Float> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Float> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Float value1, Float value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Float value1, Float value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andOriginpriceIsNull() {
            addCriterion("originPrice is null");
            return (Criteria) this;
        }

        public Criteria andOriginpriceIsNotNull() {
            addCriterion("originPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOriginpriceEqualTo(Float value) {
            addCriterion("originPrice =", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceNotEqualTo(Float value) {
            addCriterion("originPrice <>", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceGreaterThan(Float value) {
            addCriterion("originPrice >", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("originPrice >=", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceLessThan(Float value) {
            addCriterion("originPrice <", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceLessThanOrEqualTo(Float value) {
            addCriterion("originPrice <=", value, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceIn(List<Float> values) {
            addCriterion("originPrice in", values, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceNotIn(List<Float> values) {
            addCriterion("originPrice not in", values, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceBetween(Float value1, Float value2) {
            addCriterion("originPrice between", value1, value2, "originprice");
            return (Criteria) this;
        }

        public Criteria andOriginpriceNotBetween(Float value1, Float value2) {
            addCriterion("originPrice not between", value1, value2, "originprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceIsNull() {
            addCriterion("coinPrice is null");
            return (Criteria) this;
        }

        public Criteria andCoinpriceIsNotNull() {
            addCriterion("coinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCoinpriceEqualTo(Float value) {
            addCriterion("coinPrice =", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceNotEqualTo(Float value) {
            addCriterion("coinPrice <>", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceGreaterThan(Float value) {
            addCriterion("coinPrice >", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("coinPrice >=", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceLessThan(Float value) {
            addCriterion("coinPrice <", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceLessThanOrEqualTo(Float value) {
            addCriterion("coinPrice <=", value, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceIn(List<Float> values) {
            addCriterion("coinPrice in", values, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceNotIn(List<Float> values) {
            addCriterion("coinPrice not in", values, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceBetween(Float value1, Float value2) {
            addCriterion("coinPrice between", value1, value2, "coinprice");
            return (Criteria) this;
        }

        public Criteria andCoinpriceNotBetween(Float value1, Float value2) {
            addCriterion("coinPrice not between", value1, value2, "coinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceIsNull() {
            addCriterion("originCoinPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceIsNotNull() {
            addCriterion("originCoinPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceEqualTo(Float value) {
            addCriterion("originCoinPrice =", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceNotEqualTo(Float value) {
            addCriterion("originCoinPrice <>", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceGreaterThan(Float value) {
            addCriterion("originCoinPrice >", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("originCoinPrice >=", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceLessThan(Float value) {
            addCriterion("originCoinPrice <", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceLessThanOrEqualTo(Float value) {
            addCriterion("originCoinPrice <=", value, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceIn(List<Float> values) {
            addCriterion("originCoinPrice in", values, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceNotIn(List<Float> values) {
            addCriterion("originCoinPrice not in", values, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceBetween(Float value1, Float value2) {
            addCriterion("originCoinPrice between", value1, value2, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andOrigincoinpriceNotBetween(Float value1, Float value2) {
            addCriterion("originCoinPrice not between", value1, value2, "origincoinprice");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeIsNull() {
            addCriterion("showStudentNumType is null");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeIsNotNull() {
            addCriterion("showStudentNumType is not null");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeEqualTo(String value) {
            addCriterion("showStudentNumType =", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotEqualTo(String value) {
            addCriterion("showStudentNumType <>", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeGreaterThan(String value) {
            addCriterion("showStudentNumType >", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeGreaterThanOrEqualTo(String value) {
            addCriterion("showStudentNumType >=", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeLessThan(String value) {
            addCriterion("showStudentNumType <", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeLessThanOrEqualTo(String value) {
            addCriterion("showStudentNumType <=", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeLike(String value) {
            addCriterion("showStudentNumType like", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotLike(String value) {
            addCriterion("showStudentNumType not like", value, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeIn(List<String> values) {
            addCriterion("showStudentNumType in", values, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotIn(List<String> values) {
            addCriterion("showStudentNumType not in", values, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeBetween(String value1, String value2) {
            addCriterion("showStudentNumType between", value1, value2, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andShowstudentnumtypeNotBetween(String value1, String value2) {
            addCriterion("showStudentNumType not between", value1, value2, "showstudentnumtype");
            return (Criteria) this;
        }

        public Criteria andGivecreditIsNull() {
            addCriterion("giveCredit is null");
            return (Criteria) this;
        }

        public Criteria andGivecreditIsNotNull() {
            addCriterion("giveCredit is not null");
            return (Criteria) this;
        }

        public Criteria andGivecreditEqualTo(Integer value) {
            addCriterion("giveCredit =", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotEqualTo(Integer value) {
            addCriterion("giveCredit <>", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditGreaterThan(Integer value) {
            addCriterion("giveCredit >", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("giveCredit >=", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditLessThan(Integer value) {
            addCriterion("giveCredit <", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditLessThanOrEqualTo(Integer value) {
            addCriterion("giveCredit <=", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditIn(List<Integer> values) {
            addCriterion("giveCredit in", values, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotIn(List<Integer> values) {
            addCriterion("giveCredit not in", values, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditBetween(Integer value1, Integer value2) {
            addCriterion("giveCredit between", value1, value2, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotBetween(Integer value1, Integer value2) {
            addCriterion("giveCredit not between", value1, value2, "givecredit");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNull() {
            addCriterion("locationId is null");
            return (Criteria) this;
        }

        public Criteria andLocationidIsNotNull() {
            addCriterion("locationId is not null");
            return (Criteria) this;
        }

        public Criteria andLocationidEqualTo(Integer value) {
            addCriterion("locationId =", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotEqualTo(Integer value) {
            addCriterion("locationId <>", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThan(Integer value) {
            addCriterion("locationId >", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationId >=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThan(Integer value) {
            addCriterion("locationId <", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidLessThanOrEqualTo(Integer value) {
            addCriterion("locationId <=", value, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidIn(List<Integer> values) {
            addCriterion("locationId in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotIn(List<Integer> values) {
            addCriterion("locationId not in", values, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidBetween(Integer value1, Integer value2) {
            addCriterion("locationId between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andLocationidNotBetween(Integer value1, Integer value2) {
            addCriterion("locationId not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyIsNull() {
            addCriterion("deadlineNotify is null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyIsNotNull() {
            addCriterion("deadlineNotify is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyEqualTo(String value) {
            addCriterion("deadlineNotify =", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotEqualTo(String value) {
            addCriterion("deadlineNotify <>", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyGreaterThan(String value) {
            addCriterion("deadlineNotify >", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyGreaterThanOrEqualTo(String value) {
            addCriterion("deadlineNotify >=", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyLessThan(String value) {
            addCriterion("deadlineNotify <", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyLessThanOrEqualTo(String value) {
            addCriterion("deadlineNotify <=", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyLike(String value) {
            addCriterion("deadlineNotify like", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotLike(String value) {
            addCriterion("deadlineNotify not like", value, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyIn(List<String> values) {
            addCriterion("deadlineNotify in", values, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotIn(List<String> values) {
            addCriterion("deadlineNotify not in", values, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyBetween(String value1, String value2) {
            addCriterion("deadlineNotify between", value1, value2, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifyNotBetween(String value1, String value2) {
            addCriterion("deadlineNotify not between", value1, value2, "deadlinenotify");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineIsNull() {
            addCriterion("daysOfNotifyBeforeDeadline is null");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineIsNotNull() {
            addCriterion("daysOfNotifyBeforeDeadline is not null");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline =", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineNotEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline <>", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineGreaterThan(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline >", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline >=", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineLessThan(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline <", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("daysOfNotifyBeforeDeadline <=", value, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineIn(List<Integer> values) {
            addCriterion("daysOfNotifyBeforeDeadline in", values, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineNotIn(List<Integer> values) {
            addCriterion("daysOfNotifyBeforeDeadline not in", values, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineBetween(Integer value1, Integer value2) {
            addCriterion("daysOfNotifyBeforeDeadline between", value1, value2, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andDaysofnotifybeforedeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("daysOfNotifyBeforeDeadline not between", value1, value2, "daysofnotifybeforedeadline");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomIsNull() {
            addCriterion("useInClassroom is null");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomIsNotNull() {
            addCriterion("useInClassroom is not null");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomEqualTo(String value) {
            addCriterion("useInClassroom =", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotEqualTo(String value) {
            addCriterion("useInClassroom <>", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomGreaterThan(String value) {
            addCriterion("useInClassroom >", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomGreaterThanOrEqualTo(String value) {
            addCriterion("useInClassroom >=", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomLessThan(String value) {
            addCriterion("useInClassroom <", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomLessThanOrEqualTo(String value) {
            addCriterion("useInClassroom <=", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomLike(String value) {
            addCriterion("useInClassroom like", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotLike(String value) {
            addCriterion("useInClassroom not like", value, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomIn(List<String> values) {
            addCriterion("useInClassroom in", values, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotIn(List<String> values) {
            addCriterion("useInClassroom not in", values, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomBetween(String value1, String value2) {
            addCriterion("useInClassroom between", value1, value2, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andUseinclassroomNotBetween(String value1, String value2) {
            addCriterion("useInClassroom not between", value1, value2, "useinclassroom");
            return (Criteria) this;
        }

        public Criteria andSinglebuyIsNull() {
            addCriterion("singleBuy is null");
            return (Criteria) this;
        }

        public Criteria andSinglebuyIsNotNull() {
            addCriterion("singleBuy is not null");
            return (Criteria) this;
        }

        public Criteria andSinglebuyEqualTo(Integer value) {
            addCriterion("singleBuy =", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyNotEqualTo(Integer value) {
            addCriterion("singleBuy <>", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyGreaterThan(Integer value) {
            addCriterion("singleBuy >", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("singleBuy >=", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyLessThan(Integer value) {
            addCriterion("singleBuy <", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyLessThanOrEqualTo(Integer value) {
            addCriterion("singleBuy <=", value, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyIn(List<Integer> values) {
            addCriterion("singleBuy in", values, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyNotIn(List<Integer> values) {
            addCriterion("singleBuy not in", values, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyBetween(Integer value1, Integer value2) {
            addCriterion("singleBuy between", value1, value2, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andSinglebuyNotBetween(Integer value1, Integer value2) {
            addCriterion("singleBuy not between", value1, value2, "singlebuy");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeIsNull() {
            addCriterion("freeStartTime is null");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeIsNotNull() {
            addCriterion("freeStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeEqualTo(Integer value) {
            addCriterion("freeStartTime =", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeNotEqualTo(Integer value) {
            addCriterion("freeStartTime <>", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeGreaterThan(Integer value) {
            addCriterion("freeStartTime >", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeStartTime >=", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeLessThan(Integer value) {
            addCriterion("freeStartTime <", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("freeStartTime <=", value, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeIn(List<Integer> values) {
            addCriterion("freeStartTime in", values, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeNotIn(List<Integer> values) {
            addCriterion("freeStartTime not in", values, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeBetween(Integer value1, Integer value2) {
            addCriterion("freeStartTime between", value1, value2, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreestarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeStartTime not between", value1, value2, "freestarttime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeIsNull() {
            addCriterion("freeEndTime is null");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeIsNotNull() {
            addCriterion("freeEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeEqualTo(Integer value) {
            addCriterion("freeEndTime =", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeNotEqualTo(Integer value) {
            addCriterion("freeEndTime <>", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeGreaterThan(Integer value) {
            addCriterion("freeEndTime >", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeEndTime >=", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeLessThan(Integer value) {
            addCriterion("freeEndTime <", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("freeEndTime <=", value, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeIn(List<Integer> values) {
            addCriterion("freeEndTime in", values, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeNotIn(List<Integer> values) {
            addCriterion("freeEndTime not in", values, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeBetween(Integer value1, Integer value2) {
            addCriterion("freeEndTime between", value1, value2, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andFreeendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeEndTime not between", value1, value2, "freeendtime");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Integer value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Integer value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Integer value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Integer value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Integer value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Integer value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Integer> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Integer> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Integer value1, Integer value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Integer value1, Integer value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andEnablefinishIsNull() {
            addCriterion("enableFinish is null");
            return (Criteria) this;
        }

        public Criteria andEnablefinishIsNotNull() {
            addCriterion("enableFinish is not null");
            return (Criteria) this;
        }

        public Criteria andEnablefinishEqualTo(Integer value) {
            addCriterion("enableFinish =", value, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishNotEqualTo(Integer value) {
            addCriterion("enableFinish <>", value, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishGreaterThan(Integer value) {
            addCriterion("enableFinish >", value, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("enableFinish >=", value, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishLessThan(Integer value) {
            addCriterion("enableFinish <", value, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishLessThanOrEqualTo(Integer value) {
            addCriterion("enableFinish <=", value, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishIn(List<Integer> values) {
            addCriterion("enableFinish in", values, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishNotIn(List<Integer> values) {
            addCriterion("enableFinish not in", values, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishBetween(Integer value1, Integer value2) {
            addCriterion("enableFinish between", value1, value2, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andEnablefinishNotBetween(Integer value1, Integer value2) {
            addCriterion("enableFinish not between", value1, value2, "enablefinish");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNull() {
            addCriterion("materialNum is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNotNull() {
            addCriterion("materialNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumEqualTo(Integer value) {
            addCriterion("materialNum =", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotEqualTo(Integer value) {
            addCriterion("materialNum <>", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThan(Integer value) {
            addCriterion("materialNum >", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialNum >=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThan(Integer value) {
            addCriterion("materialNum <", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThanOrEqualTo(Integer value) {
            addCriterion("materialNum <=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIn(List<Integer> values) {
            addCriterion("materialNum in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotIn(List<Integer> values) {
            addCriterion("materialNum not in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumBetween(Integer value1, Integer value2) {
            addCriterion("materialNum between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotBetween(Integer value1, Integer value2) {
            addCriterion("materialNum not between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaxrateIsNull() {
            addCriterion("maxRate is null");
            return (Criteria) this;
        }

        public Criteria andMaxrateIsNotNull() {
            addCriterion("maxRate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrateEqualTo(Byte value) {
            addCriterion("maxRate =", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotEqualTo(Byte value) {
            addCriterion("maxRate <>", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateGreaterThan(Byte value) {
            addCriterion("maxRate >", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateGreaterThanOrEqualTo(Byte value) {
            addCriterion("maxRate >=", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateLessThan(Byte value) {
            addCriterion("maxRate <", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateLessThanOrEqualTo(Byte value) {
            addCriterion("maxRate <=", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateIn(List<Byte> values) {
            addCriterion("maxRate in", values, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotIn(List<Byte> values) {
            addCriterion("maxRate not in", values, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateBetween(Byte value1, Byte value2) {
            addCriterion("maxRate between", value1, value2, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotBetween(Byte value1, Byte value2) {
            addCriterion("maxRate not between", value1, value2, "maxrate");
            return (Criteria) this;
        }

        public Criteria andSerializemodeIsNull() {
            addCriterion("serializeMode is null");
            return (Criteria) this;
        }

        public Criteria andSerializemodeIsNotNull() {
            addCriterion("serializeMode is not null");
            return (Criteria) this;
        }

        public Criteria andSerializemodeEqualTo(String value) {
            addCriterion("serializeMode =", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotEqualTo(String value) {
            addCriterion("serializeMode <>", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeGreaterThan(String value) {
            addCriterion("serializeMode >", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeGreaterThanOrEqualTo(String value) {
            addCriterion("serializeMode >=", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeLessThan(String value) {
            addCriterion("serializeMode <", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeLessThanOrEqualTo(String value) {
            addCriterion("serializeMode <=", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeLike(String value) {
            addCriterion("serializeMode like", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotLike(String value) {
            addCriterion("serializeMode not like", value, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeIn(List<String> values) {
            addCriterion("serializeMode in", values, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotIn(List<String> values) {
            addCriterion("serializeMode not in", values, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeBetween(String value1, String value2) {
            addCriterion("serializeMode between", value1, value2, "serializemode");
            return (Criteria) this;
        }

        public Criteria andSerializemodeNotBetween(String value1, String value2) {
            addCriterion("serializeMode not between", value1, value2, "serializemode");
            return (Criteria) this;
        }

        public Criteria andShowservicesIsNull() {
            addCriterion("showServices is null");
            return (Criteria) this;
        }

        public Criteria andShowservicesIsNotNull() {
            addCriterion("showServices is not null");
            return (Criteria) this;
        }

        public Criteria andShowservicesEqualTo(Boolean value) {
            addCriterion("showServices =", value, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesNotEqualTo(Boolean value) {
            addCriterion("showServices <>", value, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesGreaterThan(Boolean value) {
            addCriterion("showServices >", value, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("showServices >=", value, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesLessThan(Boolean value) {
            addCriterion("showServices <", value, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesLessThanOrEqualTo(Boolean value) {
            addCriterion("showServices <=", value, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesIn(List<Boolean> values) {
            addCriterion("showServices in", values, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesNotIn(List<Boolean> values) {
            addCriterion("showServices not in", values, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesBetween(Boolean value1, Boolean value2) {
            addCriterion("showServices between", value1, value2, "showservices");
            return (Criteria) this;
        }

        public Criteria andShowservicesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("showServices not between", value1, value2, "showservices");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNull() {
            addCriterion("recommended is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNotNull() {
            addCriterion("recommended is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedEqualTo(Byte value) {
            addCriterion("recommended =", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotEqualTo(Byte value) {
            addCriterion("recommended <>", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThan(Byte value) {
            addCriterion("recommended >", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThanOrEqualTo(Byte value) {
            addCriterion("recommended >=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThan(Byte value) {
            addCriterion("recommended <", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThanOrEqualTo(Byte value) {
            addCriterion("recommended <=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedIn(List<Byte> values) {
            addCriterion("recommended in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotIn(List<Byte> values) {
            addCriterion("recommended not in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedBetween(Byte value1, Byte value2) {
            addCriterion("recommended between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotBetween(Byte value1, Byte value2) {
            addCriterion("recommended not between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIsNull() {
            addCriterion("recommendedSeq is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIsNotNull() {
            addCriterion("recommendedSeq is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqEqualTo(Integer value) {
            addCriterion("recommendedSeq =", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotEqualTo(Integer value) {
            addCriterion("recommendedSeq <>", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqGreaterThan(Integer value) {
            addCriterion("recommendedSeq >", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendedSeq >=", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqLessThan(Integer value) {
            addCriterion("recommendedSeq <", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqLessThanOrEqualTo(Integer value) {
            addCriterion("recommendedSeq <=", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIn(List<Integer> values) {
            addCriterion("recommendedSeq in", values, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotIn(List<Integer> values) {
            addCriterion("recommendedSeq not in", values, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqBetween(Integer value1, Integer value2) {
            addCriterion("recommendedSeq between", value1, value2, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendedSeq not between", value1, value2, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIsNull() {
            addCriterion("recommendedTime is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIsNotNull() {
            addCriterion("recommendedTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeEqualTo(Integer value) {
            addCriterion("recommendedTime =", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotEqualTo(Integer value) {
            addCriterion("recommendedTime <>", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeGreaterThan(Integer value) {
            addCriterion("recommendedTime >", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendedTime >=", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeLessThan(Integer value) {
            addCriterion("recommendedTime <", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("recommendedTime <=", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIn(List<Integer> values) {
            addCriterion("recommendedTime in", values, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotIn(List<Integer> values) {
            addCriterion("recommendedTime not in", values, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeBetween(Integer value1, Integer value2) {
            addCriterion("recommendedTime between", value1, value2, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendedTime not between", value1, value2, "recommendedtime");
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

        public Criteria andHitnumIsNull() {
            addCriterion("hitNum is null");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNotNull() {
            addCriterion("hitNum is not null");
            return (Criteria) this;
        }

        public Criteria andHitnumEqualTo(Integer value) {
            addCriterion("hitNum =", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotEqualTo(Integer value) {
            addCriterion("hitNum <>", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThan(Integer value) {
            addCriterion("hitNum >", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hitNum >=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThan(Integer value) {
            addCriterion("hitNum <", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThanOrEqualTo(Integer value) {
            addCriterion("hitNum <=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumIn(List<Integer> values) {
            addCriterion("hitNum in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotIn(List<Integer> values) {
            addCriterion("hitNum not in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumBetween(Integer value1, Integer value2) {
            addCriterion("hitNum between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("hitNum not between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("courseType is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("courseType is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("courseType =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("courseType <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("courseType >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("courseType >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("courseType <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("courseType <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("courseType like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("courseType not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("courseType in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("courseType not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("courseType between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("courseType not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andRewardpointIsNull() {
            addCriterion("rewardPoint is null");
            return (Criteria) this;
        }

        public Criteria andRewardpointIsNotNull() {
            addCriterion("rewardPoint is not null");
            return (Criteria) this;
        }

        public Criteria andRewardpointEqualTo(Integer value) {
            addCriterion("rewardPoint =", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointNotEqualTo(Integer value) {
            addCriterion("rewardPoint <>", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointGreaterThan(Integer value) {
            addCriterion("rewardPoint >", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("rewardPoint >=", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointLessThan(Integer value) {
            addCriterion("rewardPoint <", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointLessThanOrEqualTo(Integer value) {
            addCriterion("rewardPoint <=", value, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointIn(List<Integer> values) {
            addCriterion("rewardPoint in", values, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointNotIn(List<Integer> values) {
            addCriterion("rewardPoint not in", values, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointBetween(Integer value1, Integer value2) {
            addCriterion("rewardPoint between", value1, value2, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andRewardpointNotBetween(Integer value1, Integer value2) {
            addCriterion("rewardPoint not between", value1, value2, "rewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointIsNull() {
            addCriterion("taskRewardPoint is null");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointIsNotNull() {
            addCriterion("taskRewardPoint is not null");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointEqualTo(Integer value) {
            addCriterion("taskRewardPoint =", value, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointNotEqualTo(Integer value) {
            addCriterion("taskRewardPoint <>", value, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointGreaterThan(Integer value) {
            addCriterion("taskRewardPoint >", value, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskRewardPoint >=", value, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointLessThan(Integer value) {
            addCriterion("taskRewardPoint <", value, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointLessThanOrEqualTo(Integer value) {
            addCriterion("taskRewardPoint <=", value, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointIn(List<Integer> values) {
            addCriterion("taskRewardPoint in", values, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointNotIn(List<Integer> values) {
            addCriterion("taskRewardPoint not in", values, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointBetween(Integer value1, Integer value2) {
            addCriterion("taskRewardPoint between", value1, value2, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andTaskrewardpointNotBetween(Integer value1, Integer value2) {
            addCriterion("taskRewardPoint not between", value1, value2, "taskrewardpoint");
            return (Criteria) this;
        }

        public Criteria andEnableaudioIsNull() {
            addCriterion("enableAudio is null");
            return (Criteria) this;
        }

        public Criteria andEnableaudioIsNotNull() {
            addCriterion("enableAudio is not null");
            return (Criteria) this;
        }

        public Criteria andEnableaudioEqualTo(Integer value) {
            addCriterion("enableAudio =", value, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioNotEqualTo(Integer value) {
            addCriterion("enableAudio <>", value, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioGreaterThan(Integer value) {
            addCriterion("enableAudio >", value, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioGreaterThanOrEqualTo(Integer value) {
            addCriterion("enableAudio >=", value, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioLessThan(Integer value) {
            addCriterion("enableAudio <", value, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioLessThanOrEqualTo(Integer value) {
            addCriterion("enableAudio <=", value, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioIn(List<Integer> values) {
            addCriterion("enableAudio in", values, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioNotIn(List<Integer> values) {
            addCriterion("enableAudio not in", values, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioBetween(Integer value1, Integer value2) {
            addCriterion("enableAudio between", value1, value2, "enableaudio");
            return (Criteria) this;
        }

        public Criteria andEnableaudioNotBetween(Integer value1, Integer value2) {
            addCriterion("enableAudio not between", value1, value2, "enableaudio");
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