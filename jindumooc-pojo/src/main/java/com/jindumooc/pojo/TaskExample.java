package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTasktypeIsNull() {
            addCriterion("taskType is null");
            return (Criteria) this;
        }

        public Criteria andTasktypeIsNotNull() {
            addCriterion("taskType is not null");
            return (Criteria) this;
        }

        public Criteria andTasktypeEqualTo(String value) {
            addCriterion("taskType =", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotEqualTo(String value) {
            addCriterion("taskType <>", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThan(String value) {
            addCriterion("taskType >", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeGreaterThanOrEqualTo(String value) {
            addCriterion("taskType >=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThan(String value) {
            addCriterion("taskType <", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLessThanOrEqualTo(String value) {
            addCriterion("taskType <=", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeLike(String value) {
            addCriterion("taskType like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotLike(String value) {
            addCriterion("taskType not like", value, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeIn(List<String> values) {
            addCriterion("taskType in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotIn(List<String> values) {
            addCriterion("taskType not in", values, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeBetween(String value1, String value2) {
            addCriterion("taskType between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andTasktypeNotBetween(String value1, String value2) {
            addCriterion("taskType not between", value1, value2, "tasktype");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNull() {
            addCriterion("batchId is null");
            return (Criteria) this;
        }

        public Criteria andBatchidIsNotNull() {
            addCriterion("batchId is not null");
            return (Criteria) this;
        }

        public Criteria andBatchidEqualTo(Integer value) {
            addCriterion("batchId =", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotEqualTo(Integer value) {
            addCriterion("batchId <>", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThan(Integer value) {
            addCriterion("batchId >", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("batchId >=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThan(Integer value) {
            addCriterion("batchId <", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidLessThanOrEqualTo(Integer value) {
            addCriterion("batchId <=", value, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidIn(List<Integer> values) {
            addCriterion("batchId in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotIn(List<Integer> values) {
            addCriterion("batchId not in", values, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidBetween(Integer value1, Integer value2) {
            addCriterion("batchId between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andBatchidNotBetween(Integer value1, Integer value2) {
            addCriterion("batchId not between", value1, value2, "batchid");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNull() {
            addCriterion("targetId is null");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNotNull() {
            addCriterion("targetId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetidEqualTo(Integer value) {
            addCriterion("targetId =", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotEqualTo(Integer value) {
            addCriterion("targetId <>", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThan(Integer value) {
            addCriterion("targetId >", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("targetId >=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThan(Integer value) {
            addCriterion("targetId <", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThanOrEqualTo(Integer value) {
            addCriterion("targetId <=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidIn(List<Integer> values) {
            addCriterion("targetId in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotIn(List<Integer> values) {
            addCriterion("targetId not in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidBetween(Integer value1, Integer value2) {
            addCriterion("targetId between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotBetween(Integer value1, Integer value2) {
            addCriterion("targetId not between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargettypeIsNull() {
            addCriterion("targetType is null");
            return (Criteria) this;
        }

        public Criteria andTargettypeIsNotNull() {
            addCriterion("targetType is not null");
            return (Criteria) this;
        }

        public Criteria andTargettypeEqualTo(String value) {
            addCriterion("targetType =", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotEqualTo(String value) {
            addCriterion("targetType <>", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeGreaterThan(String value) {
            addCriterion("targetType >", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeGreaterThanOrEqualTo(String value) {
            addCriterion("targetType >=", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeLessThan(String value) {
            addCriterion("targetType <", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeLessThanOrEqualTo(String value) {
            addCriterion("targetType <=", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeLike(String value) {
            addCriterion("targetType like", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotLike(String value) {
            addCriterion("targetType not like", value, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeIn(List<String> values) {
            addCriterion("targetType in", values, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotIn(List<String> values) {
            addCriterion("targetType not in", values, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeBetween(String value1, String value2) {
            addCriterion("targetType between", value1, value2, "targettype");
            return (Criteria) this;
        }

        public Criteria andTargettypeNotBetween(String value1, String value2) {
            addCriterion("targetType not between", value1, value2, "targettype");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeIsNull() {
            addCriterion("taskStartTime is null");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeIsNotNull() {
            addCriterion("taskStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeEqualTo(Integer value) {
            addCriterion("taskStartTime =", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeNotEqualTo(Integer value) {
            addCriterion("taskStartTime <>", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeGreaterThan(Integer value) {
            addCriterion("taskStartTime >", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskStartTime >=", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeLessThan(Integer value) {
            addCriterion("taskStartTime <", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("taskStartTime <=", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeIn(List<Integer> values) {
            addCriterion("taskStartTime in", values, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeNotIn(List<Integer> values) {
            addCriterion("taskStartTime not in", values, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeBetween(Integer value1, Integer value2) {
            addCriterion("taskStartTime between", value1, value2, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("taskStartTime not between", value1, value2, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeIsNull() {
            addCriterion("taskEndTime is null");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeIsNotNull() {
            addCriterion("taskEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeEqualTo(Integer value) {
            addCriterion("taskEndTime =", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeNotEqualTo(Integer value) {
            addCriterion("taskEndTime <>", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeGreaterThan(Integer value) {
            addCriterion("taskEndTime >", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("taskEndTime >=", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeLessThan(Integer value) {
            addCriterion("taskEndTime <", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("taskEndTime <=", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeIn(List<Integer> values) {
            addCriterion("taskEndTime in", values, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeNotIn(List<Integer> values) {
            addCriterion("taskEndTime not in", values, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeBetween(Integer value1, Integer value2) {
            addCriterion("taskEndTime between", value1, value2, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("taskEndTime not between", value1, value2, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andIntervaldateIsNull() {
            addCriterion("intervalDate is null");
            return (Criteria) this;
        }

        public Criteria andIntervaldateIsNotNull() {
            addCriterion("intervalDate is not null");
            return (Criteria) this;
        }

        public Criteria andIntervaldateEqualTo(Short value) {
            addCriterion("intervalDate =", value, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateNotEqualTo(Short value) {
            addCriterion("intervalDate <>", value, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateGreaterThan(Short value) {
            addCriterion("intervalDate >", value, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateGreaterThanOrEqualTo(Short value) {
            addCriterion("intervalDate >=", value, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateLessThan(Short value) {
            addCriterion("intervalDate <", value, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateLessThanOrEqualTo(Short value) {
            addCriterion("intervalDate <=", value, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateIn(List<Short> values) {
            addCriterion("intervalDate in", values, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateNotIn(List<Short> values) {
            addCriterion("intervalDate not in", values, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateBetween(Short value1, Short value2) {
            addCriterion("intervalDate between", value1, value2, "intervaldate");
            return (Criteria) this;
        }

        public Criteria andIntervaldateNotBetween(Short value1, Short value2) {
            addCriterion("intervalDate not between", value1, value2, "intervaldate");
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

        public Criteria andRequiredIsNull() {
            addCriterion("required is null");
            return (Criteria) this;
        }

        public Criteria andRequiredIsNotNull() {
            addCriterion("required is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredEqualTo(Boolean value) {
            addCriterion("required =", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotEqualTo(Boolean value) {
            addCriterion("required <>", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredGreaterThan(Boolean value) {
            addCriterion("required >", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("required >=", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLessThan(Boolean value) {
            addCriterion("required <", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredLessThanOrEqualTo(Boolean value) {
            addCriterion("required <=", value, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredIn(List<Boolean> values) {
            addCriterion("required in", values, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotIn(List<Boolean> values) {
            addCriterion("required not in", values, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredBetween(Boolean value1, Boolean value2) {
            addCriterion("required between", value1, value2, "required");
            return (Criteria) this;
        }

        public Criteria andRequiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("required not between", value1, value2, "required");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeIsNull() {
            addCriterion("completedTime is null");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeIsNotNull() {
            addCriterion("completedTime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeEqualTo(Integer value) {
            addCriterion("completedTime =", value, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeNotEqualTo(Integer value) {
            addCriterion("completedTime <>", value, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeGreaterThan(Integer value) {
            addCriterion("completedTime >", value, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("completedTime >=", value, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeLessThan(Integer value) {
            addCriterion("completedTime <", value, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("completedTime <=", value, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeIn(List<Integer> values) {
            addCriterion("completedTime in", values, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeNotIn(List<Integer> values) {
            addCriterion("completedTime not in", values, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeBetween(Integer value1, Integer value2) {
            addCriterion("completedTime between", value1, value2, "completedtime");
            return (Criteria) this;
        }

        public Criteria andCompletedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("completedTime not between", value1, value2, "completedtime");
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