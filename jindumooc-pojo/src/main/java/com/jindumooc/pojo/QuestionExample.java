package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
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

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(String value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(String value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(String value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(String value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(String value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLike(String value) {
            addCriterion("difficulty like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotLike(String value) {
            addCriterion("difficulty not like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<String> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<String> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(String value1, String value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(String value1, String value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
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

        public Criteria andSubcountIsNull() {
            addCriterion("subCount is null");
            return (Criteria) this;
        }

        public Criteria andSubcountIsNotNull() {
            addCriterion("subCount is not null");
            return (Criteria) this;
        }

        public Criteria andSubcountEqualTo(Integer value) {
            addCriterion("subCount =", value, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountNotEqualTo(Integer value) {
            addCriterion("subCount <>", value, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountGreaterThan(Integer value) {
            addCriterion("subCount >", value, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("subCount >=", value, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountLessThan(Integer value) {
            addCriterion("subCount <", value, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountLessThanOrEqualTo(Integer value) {
            addCriterion("subCount <=", value, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountIn(List<Integer> values) {
            addCriterion("subCount in", values, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountNotIn(List<Integer> values) {
            addCriterion("subCount not in", values, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountBetween(Integer value1, Integer value2) {
            addCriterion("subCount between", value1, value2, "subcount");
            return (Criteria) this;
        }

        public Criteria andSubcountNotBetween(Integer value1, Integer value2) {
            addCriterion("subCount not between", value1, value2, "subcount");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesIsNull() {
            addCriterion("finishedTimes is null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesIsNotNull() {
            addCriterion("finishedTimes is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesEqualTo(Integer value) {
            addCriterion("finishedTimes =", value, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesNotEqualTo(Integer value) {
            addCriterion("finishedTimes <>", value, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesGreaterThan(Integer value) {
            addCriterion("finishedTimes >", value, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishedTimes >=", value, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesLessThan(Integer value) {
            addCriterion("finishedTimes <", value, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesLessThanOrEqualTo(Integer value) {
            addCriterion("finishedTimes <=", value, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesIn(List<Integer> values) {
            addCriterion("finishedTimes in", values, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesNotIn(List<Integer> values) {
            addCriterion("finishedTimes not in", values, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesBetween(Integer value1, Integer value2) {
            addCriterion("finishedTimes between", value1, value2, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andFinishedtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("finishedTimes not between", value1, value2, "finishedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesIsNull() {
            addCriterion("passedTimes is null");
            return (Criteria) this;
        }

        public Criteria andPassedtimesIsNotNull() {
            addCriterion("passedTimes is not null");
            return (Criteria) this;
        }

        public Criteria andPassedtimesEqualTo(Integer value) {
            addCriterion("passedTimes =", value, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesNotEqualTo(Integer value) {
            addCriterion("passedTimes <>", value, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesGreaterThan(Integer value) {
            addCriterion("passedTimes >", value, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("passedTimes >=", value, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesLessThan(Integer value) {
            addCriterion("passedTimes <", value, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesLessThanOrEqualTo(Integer value) {
            addCriterion("passedTimes <=", value, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesIn(List<Integer> values) {
            addCriterion("passedTimes in", values, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesNotIn(List<Integer> values) {
            addCriterion("passedTimes not in", values, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesBetween(Integer value1, Integer value2) {
            addCriterion("passedTimes between", value1, value2, "passedtimes");
            return (Criteria) this;
        }

        public Criteria andPassedtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("passedTimes not between", value1, value2, "passedtimes");
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

        public Criteria andUpdateduseridIsNull() {
            addCriterion("updatedUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIsNotNull() {
            addCriterion("updatedUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridEqualTo(Integer value) {
            addCriterion("updatedUserId =", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotEqualTo(Integer value) {
            addCriterion("updatedUserId <>", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridGreaterThan(Integer value) {
            addCriterion("updatedUserId >", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatedUserId >=", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridLessThan(Integer value) {
            addCriterion("updatedUserId <", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridLessThanOrEqualTo(Integer value) {
            addCriterion("updatedUserId <=", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIn(List<Integer> values) {
            addCriterion("updatedUserId in", values, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotIn(List<Integer> values) {
            addCriterion("updatedUserId not in", values, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridBetween(Integer value1, Integer value2) {
            addCriterion("updatedUserId between", value1, value2, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("updatedUserId not between", value1, value2, "updateduserid");
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