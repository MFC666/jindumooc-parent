package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserLearnStatisticsTotalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLearnStatisticsTotalExample() {
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

        public Criteria andJoinedclassroomnumIsNull() {
            addCriterion("joinedClassroomNum is null");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumIsNotNull() {
            addCriterion("joinedClassroomNum is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumEqualTo(Integer value) {
            addCriterion("joinedClassroomNum =", value, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumNotEqualTo(Integer value) {
            addCriterion("joinedClassroomNum <>", value, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumGreaterThan(Integer value) {
            addCriterion("joinedClassroomNum >", value, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinedClassroomNum >=", value, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumLessThan(Integer value) {
            addCriterion("joinedClassroomNum <", value, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumLessThanOrEqualTo(Integer value) {
            addCriterion("joinedClassroomNum <=", value, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumIn(List<Integer> values) {
            addCriterion("joinedClassroomNum in", values, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumNotIn(List<Integer> values) {
            addCriterion("joinedClassroomNum not in", values, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumBetween(Integer value1, Integer value2) {
            addCriterion("joinedClassroomNum between", value1, value2, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedclassroomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("joinedClassroomNum not between", value1, value2, "joinedclassroomnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumIsNull() {
            addCriterion("joinedCourseSetNum is null");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumIsNotNull() {
            addCriterion("joinedCourseSetNum is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumEqualTo(Integer value) {
            addCriterion("joinedCourseSetNum =", value, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumNotEqualTo(Integer value) {
            addCriterion("joinedCourseSetNum <>", value, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumGreaterThan(Integer value) {
            addCriterion("joinedCourseSetNum >", value, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinedCourseSetNum >=", value, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumLessThan(Integer value) {
            addCriterion("joinedCourseSetNum <", value, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumLessThanOrEqualTo(Integer value) {
            addCriterion("joinedCourseSetNum <=", value, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumIn(List<Integer> values) {
            addCriterion("joinedCourseSetNum in", values, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumNotIn(List<Integer> values) {
            addCriterion("joinedCourseSetNum not in", values, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumBetween(Integer value1, Integer value2) {
            addCriterion("joinedCourseSetNum between", value1, value2, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursesetnumNotBetween(Integer value1, Integer value2) {
            addCriterion("joinedCourseSetNum not between", value1, value2, "joinedcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumIsNull() {
            addCriterion("joinedCourseNum is null");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumIsNotNull() {
            addCriterion("joinedCourseNum is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumEqualTo(Integer value) {
            addCriterion("joinedCourseNum =", value, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumNotEqualTo(Integer value) {
            addCriterion("joinedCourseNum <>", value, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumGreaterThan(Integer value) {
            addCriterion("joinedCourseNum >", value, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinedCourseNum >=", value, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumLessThan(Integer value) {
            addCriterion("joinedCourseNum <", value, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumLessThanOrEqualTo(Integer value) {
            addCriterion("joinedCourseNum <=", value, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumIn(List<Integer> values) {
            addCriterion("joinedCourseNum in", values, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumNotIn(List<Integer> values) {
            addCriterion("joinedCourseNum not in", values, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumBetween(Integer value1, Integer value2) {
            addCriterion("joinedCourseNum between", value1, value2, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andJoinedcoursenumNotBetween(Integer value1, Integer value2) {
            addCriterion("joinedCourseNum not between", value1, value2, "joinedcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumIsNull() {
            addCriterion("exitClassroomNum is null");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumIsNotNull() {
            addCriterion("exitClassroomNum is not null");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumEqualTo(Integer value) {
            addCriterion("exitClassroomNum =", value, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumNotEqualTo(Integer value) {
            addCriterion("exitClassroomNum <>", value, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumGreaterThan(Integer value) {
            addCriterion("exitClassroomNum >", value, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exitClassroomNum >=", value, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumLessThan(Integer value) {
            addCriterion("exitClassroomNum <", value, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumLessThanOrEqualTo(Integer value) {
            addCriterion("exitClassroomNum <=", value, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumIn(List<Integer> values) {
            addCriterion("exitClassroomNum in", values, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumNotIn(List<Integer> values) {
            addCriterion("exitClassroomNum not in", values, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumBetween(Integer value1, Integer value2) {
            addCriterion("exitClassroomNum between", value1, value2, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitclassroomnumNotBetween(Integer value1, Integer value2) {
            addCriterion("exitClassroomNum not between", value1, value2, "exitclassroomnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumIsNull() {
            addCriterion("exitCourseSetNum is null");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumIsNotNull() {
            addCriterion("exitCourseSetNum is not null");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumEqualTo(Integer value) {
            addCriterion("exitCourseSetNum =", value, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumNotEqualTo(Integer value) {
            addCriterion("exitCourseSetNum <>", value, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumGreaterThan(Integer value) {
            addCriterion("exitCourseSetNum >", value, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exitCourseSetNum >=", value, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumLessThan(Integer value) {
            addCriterion("exitCourseSetNum <", value, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumLessThanOrEqualTo(Integer value) {
            addCriterion("exitCourseSetNum <=", value, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumIn(List<Integer> values) {
            addCriterion("exitCourseSetNum in", values, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumNotIn(List<Integer> values) {
            addCriterion("exitCourseSetNum not in", values, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumBetween(Integer value1, Integer value2) {
            addCriterion("exitCourseSetNum between", value1, value2, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursesetnumNotBetween(Integer value1, Integer value2) {
            addCriterion("exitCourseSetNum not between", value1, value2, "exitcoursesetnum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumIsNull() {
            addCriterion("exitCourseNum is null");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumIsNotNull() {
            addCriterion("exitCourseNum is not null");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumEqualTo(Integer value) {
            addCriterion("exitCourseNum =", value, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumNotEqualTo(Integer value) {
            addCriterion("exitCourseNum <>", value, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumGreaterThan(Integer value) {
            addCriterion("exitCourseNum >", value, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exitCourseNum >=", value, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumLessThan(Integer value) {
            addCriterion("exitCourseNum <", value, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumLessThanOrEqualTo(Integer value) {
            addCriterion("exitCourseNum <=", value, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumIn(List<Integer> values) {
            addCriterion("exitCourseNum in", values, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumNotIn(List<Integer> values) {
            addCriterion("exitCourseNum not in", values, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumBetween(Integer value1, Integer value2) {
            addCriterion("exitCourseNum between", value1, value2, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andExitcoursenumNotBetween(Integer value1, Integer value2) {
            addCriterion("exitCourseNum not between", value1, value2, "exitcoursenum");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsIsNull() {
            addCriterion("learnedSeconds is null");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsIsNotNull() {
            addCriterion("learnedSeconds is not null");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsEqualTo(Integer value) {
            addCriterion("learnedSeconds =", value, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsNotEqualTo(Integer value) {
            addCriterion("learnedSeconds <>", value, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsGreaterThan(Integer value) {
            addCriterion("learnedSeconds >", value, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnedSeconds >=", value, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsLessThan(Integer value) {
            addCriterion("learnedSeconds <", value, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsLessThanOrEqualTo(Integer value) {
            addCriterion("learnedSeconds <=", value, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsIn(List<Integer> values) {
            addCriterion("learnedSeconds in", values, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsNotIn(List<Integer> values) {
            addCriterion("learnedSeconds not in", values, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsBetween(Integer value1, Integer value2) {
            addCriterion("learnedSeconds between", value1, value2, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andLearnedsecondsNotBetween(Integer value1, Integer value2) {
            addCriterion("learnedSeconds not between", value1, value2, "learnedseconds");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumIsNull() {
            addCriterion("finishedTaskNum is null");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumIsNotNull() {
            addCriterion("finishedTaskNum is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumEqualTo(Integer value) {
            addCriterion("finishedTaskNum =", value, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumNotEqualTo(Integer value) {
            addCriterion("finishedTaskNum <>", value, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumGreaterThan(Integer value) {
            addCriterion("finishedTaskNum >", value, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("finishedTaskNum >=", value, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumLessThan(Integer value) {
            addCriterion("finishedTaskNum <", value, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumLessThanOrEqualTo(Integer value) {
            addCriterion("finishedTaskNum <=", value, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumIn(List<Integer> values) {
            addCriterion("finishedTaskNum in", values, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumNotIn(List<Integer> values) {
            addCriterion("finishedTaskNum not in", values, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumBetween(Integer value1, Integer value2) {
            addCriterion("finishedTaskNum between", value1, value2, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andFinishedtasknumNotBetween(Integer value1, Integer value2) {
            addCriterion("finishedTaskNum not between", value1, value2, "finishedtasknum");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNull() {
            addCriterion("paidAmount is null");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNotNull() {
            addCriterion("paidAmount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidamountEqualTo(Integer value) {
            addCriterion("paidAmount =", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotEqualTo(Integer value) {
            addCriterion("paidAmount <>", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThan(Integer value) {
            addCriterion("paidAmount >", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidAmount >=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThan(Integer value) {
            addCriterion("paidAmount <", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThanOrEqualTo(Integer value) {
            addCriterion("paidAmount <=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountIn(List<Integer> values) {
            addCriterion("paidAmount in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotIn(List<Integer> values) {
            addCriterion("paidAmount not in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountBetween(Integer value1, Integer value2) {
            addCriterion("paidAmount between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotBetween(Integer value1, Integer value2) {
            addCriterion("paidAmount not between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNull() {
            addCriterion("refundAmount is null");
            return (Criteria) this;
        }

        public Criteria andRefundamountIsNotNull() {
            addCriterion("refundAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundamountEqualTo(Integer value) {
            addCriterion("refundAmount =", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotEqualTo(Integer value) {
            addCriterion("refundAmount <>", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThan(Integer value) {
            addCriterion("refundAmount >", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundAmount >=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThan(Integer value) {
            addCriterion("refundAmount <", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountLessThanOrEqualTo(Integer value) {
            addCriterion("refundAmount <=", value, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountIn(List<Integer> values) {
            addCriterion("refundAmount in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotIn(List<Integer> values) {
            addCriterion("refundAmount not in", values, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountBetween(Integer value1, Integer value2) {
            addCriterion("refundAmount between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andRefundamountNotBetween(Integer value1, Integer value2) {
            addCriterion("refundAmount not between", value1, value2, "refundamount");
            return (Criteria) this;
        }

        public Criteria andActualamountIsNull() {
            addCriterion("actualAmount is null");
            return (Criteria) this;
        }

        public Criteria andActualamountIsNotNull() {
            addCriterion("actualAmount is not null");
            return (Criteria) this;
        }

        public Criteria andActualamountEqualTo(Integer value) {
            addCriterion("actualAmount =", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotEqualTo(Integer value) {
            addCriterion("actualAmount <>", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountGreaterThan(Integer value) {
            addCriterion("actualAmount >", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("actualAmount >=", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLessThan(Integer value) {
            addCriterion("actualAmount <", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountLessThanOrEqualTo(Integer value) {
            addCriterion("actualAmount <=", value, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountIn(List<Integer> values) {
            addCriterion("actualAmount in", values, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotIn(List<Integer> values) {
            addCriterion("actualAmount not in", values, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountBetween(Integer value1, Integer value2) {
            addCriterion("actualAmount between", value1, value2, "actualamount");
            return (Criteria) this;
        }

        public Criteria andActualamountNotBetween(Integer value1, Integer value2) {
            addCriterion("actualAmount not between", value1, value2, "actualamount");
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