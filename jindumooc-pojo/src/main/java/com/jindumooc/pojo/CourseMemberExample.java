package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseMemberExample() {
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

        public Criteria andJoinedtypeIsNull() {
            addCriterion("joinedType is null");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeIsNotNull() {
            addCriterion("joinedType is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeEqualTo(String value) {
            addCriterion("joinedType =", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeNotEqualTo(String value) {
            addCriterion("joinedType <>", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeGreaterThan(String value) {
            addCriterion("joinedType >", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeGreaterThanOrEqualTo(String value) {
            addCriterion("joinedType >=", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeLessThan(String value) {
            addCriterion("joinedType <", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeLessThanOrEqualTo(String value) {
            addCriterion("joinedType <=", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeLike(String value) {
            addCriterion("joinedType like", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeNotLike(String value) {
            addCriterion("joinedType not like", value, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeIn(List<String> values) {
            addCriterion("joinedType in", values, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeNotIn(List<String> values) {
            addCriterion("joinedType not in", values, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeBetween(String value1, String value2) {
            addCriterion("joinedType between", value1, value2, "joinedtype");
            return (Criteria) this;
        }

        public Criteria andJoinedtypeNotBetween(String value1, String value2) {
            addCriterion("joinedType not between", value1, value2, "joinedtype");
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Integer value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Integer value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Integer value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Integer value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Integer> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Integer> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineIsNull() {
            addCriterion("refundDeadline is null");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineIsNotNull() {
            addCriterion("refundDeadline is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineEqualTo(Integer value) {
            addCriterion("refundDeadline =", value, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineNotEqualTo(Integer value) {
            addCriterion("refundDeadline <>", value, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineGreaterThan(Integer value) {
            addCriterion("refundDeadline >", value, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundDeadline >=", value, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineLessThan(Integer value) {
            addCriterion("refundDeadline <", value, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("refundDeadline <=", value, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineIn(List<Integer> values) {
            addCriterion("refundDeadline in", values, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineNotIn(List<Integer> values) {
            addCriterion("refundDeadline not in", values, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineBetween(Integer value1, Integer value2) {
            addCriterion("refundDeadline between", value1, value2, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andRefunddeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("refundDeadline not between", value1, value2, "refunddeadline");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNull() {
            addCriterion("levelId is null");
            return (Criteria) this;
        }

        public Criteria andLevelidIsNotNull() {
            addCriterion("levelId is not null");
            return (Criteria) this;
        }

        public Criteria andLevelidEqualTo(Integer value) {
            addCriterion("levelId =", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotEqualTo(Integer value) {
            addCriterion("levelId <>", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThan(Integer value) {
            addCriterion("levelId >", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelId >=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThan(Integer value) {
            addCriterion("levelId <", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidLessThanOrEqualTo(Integer value) {
            addCriterion("levelId <=", value, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidIn(List<Integer> values) {
            addCriterion("levelId in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotIn(List<Integer> values) {
            addCriterion("levelId not in", values, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidBetween(Integer value1, Integer value2) {
            addCriterion("levelId between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("levelId not between", value1, value2, "levelid");
            return (Criteria) this;
        }

        public Criteria andLearnednumIsNull() {
            addCriterion("learnedNum is null");
            return (Criteria) this;
        }

        public Criteria andLearnednumIsNotNull() {
            addCriterion("learnedNum is not null");
            return (Criteria) this;
        }

        public Criteria andLearnednumEqualTo(Integer value) {
            addCriterion("learnedNum =", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumNotEqualTo(Integer value) {
            addCriterion("learnedNum <>", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumGreaterThan(Integer value) {
            addCriterion("learnedNum >", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnedNum >=", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumLessThan(Integer value) {
            addCriterion("learnedNum <", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumLessThanOrEqualTo(Integer value) {
            addCriterion("learnedNum <=", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumIn(List<Integer> values) {
            addCriterion("learnedNum in", values, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumNotIn(List<Integer> values) {
            addCriterion("learnedNum not in", values, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumBetween(Integer value1, Integer value2) {
            addCriterion("learnedNum between", value1, value2, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumNotBetween(Integer value1, Integer value2) {
            addCriterion("learnedNum not between", value1, value2, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumIsNull() {
            addCriterion("learnedCompulsoryTaskNum is null");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumIsNotNull() {
            addCriterion("learnedCompulsoryTaskNum is not null");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumEqualTo(Integer value) {
            addCriterion("learnedCompulsoryTaskNum =", value, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumNotEqualTo(Integer value) {
            addCriterion("learnedCompulsoryTaskNum <>", value, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumGreaterThan(Integer value) {
            addCriterion("learnedCompulsoryTaskNum >", value, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnedCompulsoryTaskNum >=", value, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumLessThan(Integer value) {
            addCriterion("learnedCompulsoryTaskNum <", value, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumLessThanOrEqualTo(Integer value) {
            addCriterion("learnedCompulsoryTaskNum <=", value, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumIn(List<Integer> values) {
            addCriterion("learnedCompulsoryTaskNum in", values, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumNotIn(List<Integer> values) {
            addCriterion("learnedCompulsoryTaskNum not in", values, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumBetween(Integer value1, Integer value2) {
            addCriterion("learnedCompulsoryTaskNum between", value1, value2, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andLearnedcompulsorytasknumNotBetween(Integer value1, Integer value2) {
            addCriterion("learnedCompulsoryTaskNum not between", value1, value2, "learnedcompulsorytasknum");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Integer value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Integer value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Integer value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Integer value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Integer value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Integer> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Integer> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Integer value1, Integer value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("credit not between", value1, value2, "credit");
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

        public Criteria andNotelastupdatetimeIsNull() {
            addCriterion("noteLastUpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeIsNotNull() {
            addCriterion("noteLastUpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeEqualTo(Integer value) {
            addCriterion("noteLastUpdateTime =", value, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeNotEqualTo(Integer value) {
            addCriterion("noteLastUpdateTime <>", value, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeGreaterThan(Integer value) {
            addCriterion("noteLastUpdateTime >", value, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("noteLastUpdateTime >=", value, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeLessThan(Integer value) {
            addCriterion("noteLastUpdateTime <", value, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("noteLastUpdateTime <=", value, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeIn(List<Integer> values) {
            addCriterion("noteLastUpdateTime in", values, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeNotIn(List<Integer> values) {
            addCriterion("noteLastUpdateTime not in", values, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("noteLastUpdateTime between", value1, value2, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andNotelastupdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("noteLastUpdateTime not between", value1, value2, "notelastupdatetime");
            return (Criteria) this;
        }

        public Criteria andIslearnedIsNull() {
            addCriterion("isLearned is null");
            return (Criteria) this;
        }

        public Criteria andIslearnedIsNotNull() {
            addCriterion("isLearned is not null");
            return (Criteria) this;
        }

        public Criteria andIslearnedEqualTo(Byte value) {
            addCriterion("isLearned =", value, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedNotEqualTo(Byte value) {
            addCriterion("isLearned <>", value, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedGreaterThan(Byte value) {
            addCriterion("isLearned >", value, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedGreaterThanOrEqualTo(Byte value) {
            addCriterion("isLearned >=", value, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedLessThan(Byte value) {
            addCriterion("isLearned <", value, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedLessThanOrEqualTo(Byte value) {
            addCriterion("isLearned <=", value, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedIn(List<Byte> values) {
            addCriterion("isLearned in", values, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedNotIn(List<Byte> values) {
            addCriterion("isLearned not in", values, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedBetween(Byte value1, Byte value2) {
            addCriterion("isLearned between", value1, value2, "islearned");
            return (Criteria) this;
        }

        public Criteria andIslearnedNotBetween(Byte value1, Byte value2) {
            addCriterion("isLearned not between", value1, value2, "islearned");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsvisibleIsNull() {
            addCriterion("isVisible is null");
            return (Criteria) this;
        }

        public Criteria andIsvisibleIsNotNull() {
            addCriterion("isVisible is not null");
            return (Criteria) this;
        }

        public Criteria andIsvisibleEqualTo(Byte value) {
            addCriterion("isVisible =", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleNotEqualTo(Byte value) {
            addCriterion("isVisible <>", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleGreaterThan(Byte value) {
            addCriterion("isVisible >", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleGreaterThanOrEqualTo(Byte value) {
            addCriterion("isVisible >=", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleLessThan(Byte value) {
            addCriterion("isVisible <", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleLessThanOrEqualTo(Byte value) {
            addCriterion("isVisible <=", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleIn(List<Byte> values) {
            addCriterion("isVisible in", values, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleNotIn(List<Byte> values) {
            addCriterion("isVisible not in", values, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleBetween(Byte value1, Byte value2) {
            addCriterion("isVisible between", value1, value2, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleNotBetween(Byte value1, Byte value2) {
            addCriterion("isVisible not between", value1, value2, "isvisible");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
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

        public Criteria andLockedEqualTo(Byte value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Byte value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Byte value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Byte value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Byte value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Byte> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Byte> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Byte value1, Byte value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedIsNull() {
            addCriterion("deadlineNotified is null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedIsNotNull() {
            addCriterion("deadlineNotified is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedEqualTo(Integer value) {
            addCriterion("deadlineNotified =", value, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedNotEqualTo(Integer value) {
            addCriterion("deadlineNotified <>", value, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedGreaterThan(Integer value) {
            addCriterion("deadlineNotified >", value, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deadlineNotified >=", value, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedLessThan(Integer value) {
            addCriterion("deadlineNotified <", value, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedLessThanOrEqualTo(Integer value) {
            addCriterion("deadlineNotified <=", value, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedIn(List<Integer> values) {
            addCriterion("deadlineNotified in", values, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedNotIn(List<Integer> values) {
            addCriterion("deadlineNotified not in", values, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedBetween(Integer value1, Integer value2) {
            addCriterion("deadlineNotified between", value1, value2, "deadlinenotified");
            return (Criteria) this;
        }

        public Criteria andDeadlinenotifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("deadlineNotified not between", value1, value2, "deadlinenotified");
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

        public Criteria andLastlearntimeIsNull() {
            addCriterion("lastLearnTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeIsNotNull() {
            addCriterion("lastLearnTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeEqualTo(Integer value) {
            addCriterion("lastLearnTime =", value, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeNotEqualTo(Integer value) {
            addCriterion("lastLearnTime <>", value, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeGreaterThan(Integer value) {
            addCriterion("lastLearnTime >", value, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastLearnTime >=", value, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeLessThan(Integer value) {
            addCriterion("lastLearnTime <", value, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastLearnTime <=", value, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeIn(List<Integer> values) {
            addCriterion("lastLearnTime in", values, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeNotIn(List<Integer> values) {
            addCriterion("lastLearnTime not in", values, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeBetween(Integer value1, Integer value2) {
            addCriterion("lastLearnTime between", value1, value2, "lastlearntime");
            return (Criteria) this;
        }

        public Criteria andLastlearntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastLearnTime not between", value1, value2, "lastlearntime");
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

        public Criteria andLastviewtimeIsNull() {
            addCriterion("lastViewTime is null");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeIsNotNull() {
            addCriterion("lastViewTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeEqualTo(Integer value) {
            addCriterion("lastViewTime =", value, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeNotEqualTo(Integer value) {
            addCriterion("lastViewTime <>", value, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeGreaterThan(Integer value) {
            addCriterion("lastViewTime >", value, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastViewTime >=", value, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeLessThan(Integer value) {
            addCriterion("lastViewTime <", value, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastViewTime <=", value, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeIn(List<Integer> values) {
            addCriterion("lastViewTime in", values, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeNotIn(List<Integer> values) {
            addCriterion("lastViewTime not in", values, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeBetween(Integer value1, Integer value2) {
            addCriterion("lastViewTime between", value1, value2, "lastviewtime");
            return (Criteria) this;
        }

        public Criteria andLastviewtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastViewTime not between", value1, value2, "lastviewtime");
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