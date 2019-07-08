package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseThreadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseThreadExample() {
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

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Integer value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Integer value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Integer value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Integer value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Integer value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Integer> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Integer> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Integer value1, Integer value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Integer value1, Integer value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
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

        public Criteria andIsstickIsNull() {
            addCriterion("isStick is null");
            return (Criteria) this;
        }

        public Criteria andIsstickIsNotNull() {
            addCriterion("isStick is not null");
            return (Criteria) this;
        }

        public Criteria andIsstickEqualTo(Byte value) {
            addCriterion("isStick =", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickNotEqualTo(Byte value) {
            addCriterion("isStick <>", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickGreaterThan(Byte value) {
            addCriterion("isStick >", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickGreaterThanOrEqualTo(Byte value) {
            addCriterion("isStick >=", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickLessThan(Byte value) {
            addCriterion("isStick <", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickLessThanOrEqualTo(Byte value) {
            addCriterion("isStick <=", value, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickIn(List<Byte> values) {
            addCriterion("isStick in", values, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickNotIn(List<Byte> values) {
            addCriterion("isStick not in", values, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickBetween(Byte value1, Byte value2) {
            addCriterion("isStick between", value1, value2, "isstick");
            return (Criteria) this;
        }

        public Criteria andIsstickNotBetween(Byte value1, Byte value2) {
            addCriterion("isStick not between", value1, value2, "isstick");
            return (Criteria) this;
        }

        public Criteria andIseliteIsNull() {
            addCriterion("isElite is null");
            return (Criteria) this;
        }

        public Criteria andIseliteIsNotNull() {
            addCriterion("isElite is not null");
            return (Criteria) this;
        }

        public Criteria andIseliteEqualTo(Byte value) {
            addCriterion("isElite =", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteNotEqualTo(Byte value) {
            addCriterion("isElite <>", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteGreaterThan(Byte value) {
            addCriterion("isElite >", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteGreaterThanOrEqualTo(Byte value) {
            addCriterion("isElite >=", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteLessThan(Byte value) {
            addCriterion("isElite <", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteLessThanOrEqualTo(Byte value) {
            addCriterion("isElite <=", value, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteIn(List<Byte> values) {
            addCriterion("isElite in", values, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteNotIn(List<Byte> values) {
            addCriterion("isElite not in", values, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteBetween(Byte value1, Byte value2) {
            addCriterion("isElite between", value1, value2, "iselite");
            return (Criteria) this;
        }

        public Criteria andIseliteNotBetween(Byte value1, Byte value2) {
            addCriterion("isElite not between", value1, value2, "iselite");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNull() {
            addCriterion("isClosed is null");
            return (Criteria) this;
        }

        public Criteria andIsclosedIsNotNull() {
            addCriterion("isClosed is not null");
            return (Criteria) this;
        }

        public Criteria andIsclosedEqualTo(Integer value) {
            addCriterion("isClosed =", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotEqualTo(Integer value) {
            addCriterion("isClosed <>", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThan(Integer value) {
            addCriterion("isClosed >", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isClosed >=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThan(Integer value) {
            addCriterion("isClosed <", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedLessThanOrEqualTo(Integer value) {
            addCriterion("isClosed <=", value, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedIn(List<Integer> values) {
            addCriterion("isClosed in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotIn(List<Integer> values) {
            addCriterion("isClosed not in", values, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedBetween(Integer value1, Integer value2) {
            addCriterion("isClosed between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andIsclosedNotBetween(Integer value1, Integer value2) {
            addCriterion("isClosed not between", value1, value2, "isclosed");
            return (Criteria) this;
        }

        public Criteria andHideIsNull() {
            addCriterion("hide is null");
            return (Criteria) this;
        }

        public Criteria andHideIsNotNull() {
            addCriterion("hide is not null");
            return (Criteria) this;
        }

        public Criteria andHideEqualTo(Boolean value) {
            addCriterion("hide =", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotEqualTo(Boolean value) {
            addCriterion("hide <>", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThan(Boolean value) {
            addCriterion("hide >", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hide >=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThan(Boolean value) {
            addCriterion("hide <", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThanOrEqualTo(Boolean value) {
            addCriterion("hide <=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideIn(List<Boolean> values) {
            addCriterion("hide in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotIn(List<Boolean> values) {
            addCriterion("hide not in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideBetween(Boolean value1, Boolean value2) {
            addCriterion("hide between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hide not between", value1, value2, "hide");
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

        public Criteria andPostnumIsNull() {
            addCriterion("postNum is null");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNotNull() {
            addCriterion("postNum is not null");
            return (Criteria) this;
        }

        public Criteria andPostnumEqualTo(Integer value) {
            addCriterion("postNum =", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotEqualTo(Integer value) {
            addCriterion("postNum <>", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThan(Integer value) {
            addCriterion("postNum >", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postNum >=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThan(Integer value) {
            addCriterion("postNum <", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThanOrEqualTo(Integer value) {
            addCriterion("postNum <=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumIn(List<Integer> values) {
            addCriterion("postNum in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotIn(List<Integer> values) {
            addCriterion("postNum not in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumBetween(Integer value1, Integer value2) {
            addCriterion("postNum between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotBetween(Integer value1, Integer value2) {
            addCriterion("postNum not between", value1, value2, "postnum");
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

        public Criteria andFollownumIsNull() {
            addCriterion("followNum is null");
            return (Criteria) this;
        }

        public Criteria andFollownumIsNotNull() {
            addCriterion("followNum is not null");
            return (Criteria) this;
        }

        public Criteria andFollownumEqualTo(Integer value) {
            addCriterion("followNum =", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotEqualTo(Integer value) {
            addCriterion("followNum <>", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumGreaterThan(Integer value) {
            addCriterion("followNum >", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("followNum >=", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumLessThan(Integer value) {
            addCriterion("followNum <", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumLessThanOrEqualTo(Integer value) {
            addCriterion("followNum <=", value, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumIn(List<Integer> values) {
            addCriterion("followNum in", values, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotIn(List<Integer> values) {
            addCriterion("followNum not in", values, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumBetween(Integer value1, Integer value2) {
            addCriterion("followNum between", value1, value2, "follownum");
            return (Criteria) this;
        }

        public Criteria andFollownumNotBetween(Integer value1, Integer value2) {
            addCriterion("followNum not between", value1, value2, "follownum");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridIsNull() {
            addCriterion("latestPostUserId is null");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridIsNotNull() {
            addCriterion("latestPostUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridEqualTo(Integer value) {
            addCriterion("latestPostUserId =", value, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridNotEqualTo(Integer value) {
            addCriterion("latestPostUserId <>", value, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridGreaterThan(Integer value) {
            addCriterion("latestPostUserId >", value, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestPostUserId >=", value, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridLessThan(Integer value) {
            addCriterion("latestPostUserId <", value, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridLessThanOrEqualTo(Integer value) {
            addCriterion("latestPostUserId <=", value, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridIn(List<Integer> values) {
            addCriterion("latestPostUserId in", values, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridNotIn(List<Integer> values) {
            addCriterion("latestPostUserId not in", values, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridBetween(Integer value1, Integer value2) {
            addCriterion("latestPostUserId between", value1, value2, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestpostuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("latestPostUserId not between", value1, value2, "latestpostuserid");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeIsNull() {
            addCriterion("latestPostTime is null");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeIsNotNull() {
            addCriterion("latestPostTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeEqualTo(Integer value) {
            addCriterion("latestPostTime =", value, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeNotEqualTo(Integer value) {
            addCriterion("latestPostTime <>", value, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeGreaterThan(Integer value) {
            addCriterion("latestPostTime >", value, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestPostTime >=", value, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeLessThan(Integer value) {
            addCriterion("latestPostTime <", value, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeLessThanOrEqualTo(Integer value) {
            addCriterion("latestPostTime <=", value, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeIn(List<Integer> values) {
            addCriterion("latestPostTime in", values, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeNotIn(List<Integer> values) {
            addCriterion("latestPostTime not in", values, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeBetween(Integer value1, Integer value2) {
            addCriterion("latestPostTime between", value1, value2, "latestposttime");
            return (Criteria) this;
        }

        public Criteria andLatestposttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("latestPostTime not between", value1, value2, "latestposttime");
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