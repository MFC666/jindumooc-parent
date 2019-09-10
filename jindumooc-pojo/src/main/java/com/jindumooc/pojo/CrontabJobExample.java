package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CrontabJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrontabJobExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCycleIsNull() {
            addCriterion("cycle is null");
            return (Criteria) this;
        }

        public Criteria andCycleIsNotNull() {
            addCriterion("cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCycleEqualTo(String value) {
            addCriterion("cycle =", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotEqualTo(String value) {
            addCriterion("cycle <>", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThan(String value) {
            addCriterion("cycle >", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cycle >=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThan(String value) {
            addCriterion("cycle <", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLessThanOrEqualTo(String value) {
            addCriterion("cycle <=", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleLike(String value) {
            addCriterion("cycle like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotLike(String value) {
            addCriterion("cycle not like", value, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleIn(List<String> values) {
            addCriterion("cycle in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotIn(List<String> values) {
            addCriterion("cycle not in", values, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleBetween(String value1, String value2) {
            addCriterion("cycle between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycleNotBetween(String value1, String value2) {
            addCriterion("cycle not between", value1, value2, "cycle");
            return (Criteria) this;
        }

        public Criteria andCycletimeIsNull() {
            addCriterion("cycleTime is null");
            return (Criteria) this;
        }

        public Criteria andCycletimeIsNotNull() {
            addCriterion("cycleTime is not null");
            return (Criteria) this;
        }

        public Criteria andCycletimeEqualTo(String value) {
            addCriterion("cycleTime =", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeNotEqualTo(String value) {
            addCriterion("cycleTime <>", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeGreaterThan(String value) {
            addCriterion("cycleTime >", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeGreaterThanOrEqualTo(String value) {
            addCriterion("cycleTime >=", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeLessThan(String value) {
            addCriterion("cycleTime <", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeLessThanOrEqualTo(String value) {
            addCriterion("cycleTime <=", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeLike(String value) {
            addCriterion("cycleTime like", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeNotLike(String value) {
            addCriterion("cycleTime not like", value, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeIn(List<String> values) {
            addCriterion("cycleTime in", values, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeNotIn(List<String> values) {
            addCriterion("cycleTime not in", values, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeBetween(String value1, String value2) {
            addCriterion("cycleTime between", value1, value2, "cycletime");
            return (Criteria) this;
        }

        public Criteria andCycletimeNotBetween(String value1, String value2) {
            addCriterion("cycleTime not between", value1, value2, "cycletime");
            return (Criteria) this;
        }

        public Criteria andJobclassIsNull() {
            addCriterion("jobClass is null");
            return (Criteria) this;
        }

        public Criteria andJobclassIsNotNull() {
            addCriterion("jobClass is not null");
            return (Criteria) this;
        }

        public Criteria andJobclassEqualTo(String value) {
            addCriterion("jobClass =", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotEqualTo(String value) {
            addCriterion("jobClass <>", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassGreaterThan(String value) {
            addCriterion("jobClass >", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassGreaterThanOrEqualTo(String value) {
            addCriterion("jobClass >=", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassLessThan(String value) {
            addCriterion("jobClass <", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassLessThanOrEqualTo(String value) {
            addCriterion("jobClass <=", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassLike(String value) {
            addCriterion("jobClass like", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotLike(String value) {
            addCriterion("jobClass not like", value, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassIn(List<String> values) {
            addCriterion("jobClass in", values, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotIn(List<String> values) {
            addCriterion("jobClass not in", values, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassBetween(String value1, String value2) {
            addCriterion("jobClass between", value1, value2, "jobclass");
            return (Criteria) this;
        }

        public Criteria andJobclassNotBetween(String value1, String value2) {
            addCriterion("jobClass not between", value1, value2, "jobclass");
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

        public Criteria andExecutingIsNull() {
            addCriterion("executing is null");
            return (Criteria) this;
        }

        public Criteria andExecutingIsNotNull() {
            addCriterion("executing is not null");
            return (Criteria) this;
        }

        public Criteria andExecutingEqualTo(Byte value) {
            addCriterion("executing =", value, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingNotEqualTo(Byte value) {
            addCriterion("executing <>", value, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingGreaterThan(Byte value) {
            addCriterion("executing >", value, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingGreaterThanOrEqualTo(Byte value) {
            addCriterion("executing >=", value, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingLessThan(Byte value) {
            addCriterion("executing <", value, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingLessThanOrEqualTo(Byte value) {
            addCriterion("executing <=", value, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingIn(List<Byte> values) {
            addCriterion("executing in", values, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingNotIn(List<Byte> values) {
            addCriterion("executing not in", values, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingBetween(Byte value1, Byte value2) {
            addCriterion("executing between", value1, value2, "executing");
            return (Criteria) this;
        }

        public Criteria andExecutingNotBetween(Byte value1, Byte value2) {
            addCriterion("executing not between", value1, value2, "executing");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeIsNull() {
            addCriterion("nextExcutedTime is null");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeIsNotNull() {
            addCriterion("nextExcutedTime is not null");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeEqualTo(Integer value) {
            addCriterion("nextExcutedTime =", value, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeNotEqualTo(Integer value) {
            addCriterion("nextExcutedTime <>", value, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeGreaterThan(Integer value) {
            addCriterion("nextExcutedTime >", value, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nextExcutedTime >=", value, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeLessThan(Integer value) {
            addCriterion("nextExcutedTime <", value, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("nextExcutedTime <=", value, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeIn(List<Integer> values) {
            addCriterion("nextExcutedTime in", values, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeNotIn(List<Integer> values) {
            addCriterion("nextExcutedTime not in", values, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeBetween(Integer value1, Integer value2) {
            addCriterion("nextExcutedTime between", value1, value2, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andNextexcutedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("nextExcutedTime not between", value1, value2, "nextexcutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeIsNull() {
            addCriterion("latestExecutedTime is null");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeIsNotNull() {
            addCriterion("latestExecutedTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeEqualTo(Integer value) {
            addCriterion("latestExecutedTime =", value, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeNotEqualTo(Integer value) {
            addCriterion("latestExecutedTime <>", value, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeGreaterThan(Integer value) {
            addCriterion("latestExecutedTime >", value, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestExecutedTime >=", value, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeLessThan(Integer value) {
            addCriterion("latestExecutedTime <", value, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("latestExecutedTime <=", value, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeIn(List<Integer> values) {
            addCriterion("latestExecutedTime in", values, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeNotIn(List<Integer> values) {
            addCriterion("latestExecutedTime not in", values, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeBetween(Integer value1, Integer value2) {
            addCriterion("latestExecutedTime between", value1, value2, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andLatestexecutedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("latestExecutedTime not between", value1, value2, "latestexecutedtime");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("creatorId is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("creatorId is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(Integer value) {
            addCriterion("creatorId =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(Integer value) {
            addCriterion("creatorId <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(Integer value) {
            addCriterion("creatorId >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("creatorId >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(Integer value) {
            addCriterion("creatorId <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(Integer value) {
            addCriterion("creatorId <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<Integer> values) {
            addCriterion("creatorId in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<Integer> values) {
            addCriterion("creatorId not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(Integer value1, Integer value2) {
            addCriterion("creatorId between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(Integer value1, Integer value2) {
            addCriterion("creatorId not between", value1, value2, "creatorid");
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

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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