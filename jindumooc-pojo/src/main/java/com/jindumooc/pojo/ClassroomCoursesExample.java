package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassroomCoursesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomCoursesExample() {
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

        public Criteria andClassroomidIsNull() {
            addCriterion("classroomId is null");
            return (Criteria) this;
        }

        public Criteria andClassroomidIsNotNull() {
            addCriterion("classroomId is not null");
            return (Criteria) this;
        }

        public Criteria andClassroomidEqualTo(Integer value) {
            addCriterion("classroomId =", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotEqualTo(Integer value) {
            addCriterion("classroomId <>", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidGreaterThan(Integer value) {
            addCriterion("classroomId >", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classroomId >=", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidLessThan(Integer value) {
            addCriterion("classroomId <", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidLessThanOrEqualTo(Integer value) {
            addCriterion("classroomId <=", value, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidIn(List<Integer> values) {
            addCriterion("classroomId in", values, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotIn(List<Integer> values) {
            addCriterion("classroomId not in", values, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidBetween(Integer value1, Integer value2) {
            addCriterion("classroomId between", value1, value2, "classroomid");
            return (Criteria) this;
        }

        public Criteria andClassroomidNotBetween(Integer value1, Integer value2) {
            addCriterion("classroomId not between", value1, value2, "classroomid");
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

        public Criteria andParentcourseidIsNull() {
            addCriterion("parentCourseId is null");
            return (Criteria) this;
        }

        public Criteria andParentcourseidIsNotNull() {
            addCriterion("parentCourseId is not null");
            return (Criteria) this;
        }

        public Criteria andParentcourseidEqualTo(Integer value) {
            addCriterion("parentCourseId =", value, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidNotEqualTo(Integer value) {
            addCriterion("parentCourseId <>", value, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidGreaterThan(Integer value) {
            addCriterion("parentCourseId >", value, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentCourseId >=", value, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidLessThan(Integer value) {
            addCriterion("parentCourseId <", value, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidLessThanOrEqualTo(Integer value) {
            addCriterion("parentCourseId <=", value, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidIn(List<Integer> values) {
            addCriterion("parentCourseId in", values, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidNotIn(List<Integer> values) {
            addCriterion("parentCourseId not in", values, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidBetween(Integer value1, Integer value2) {
            addCriterion("parentCourseId between", value1, value2, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andParentcourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("parentCourseId not between", value1, value2, "parentcourseid");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(Boolean value) {
            addCriterion("disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(Boolean value) {
            addCriterion("disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(Boolean value) {
            addCriterion("disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(Boolean value) {
            addCriterion("disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(Boolean value) {
            addCriterion("disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<Boolean> values) {
            addCriterion("disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<Boolean> values) {
            addCriterion("disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(Boolean value1, Boolean value2) {
            addCriterion("disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("disabled not between", value1, value2, "disabled");
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