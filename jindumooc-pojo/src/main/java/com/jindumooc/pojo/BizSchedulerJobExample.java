package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class BizSchedulerJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizSchedulerJobExample() {
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

        public Criteria andPoolIsNull() {
            addCriterion("pool is null");
            return (Criteria) this;
        }

        public Criteria andPoolIsNotNull() {
            addCriterion("pool is not null");
            return (Criteria) this;
        }

        public Criteria andPoolEqualTo(String value) {
            addCriterion("pool =", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotEqualTo(String value) {
            addCriterion("pool <>", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolGreaterThan(String value) {
            addCriterion("pool >", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolGreaterThanOrEqualTo(String value) {
            addCriterion("pool >=", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolLessThan(String value) {
            addCriterion("pool <", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolLessThanOrEqualTo(String value) {
            addCriterion("pool <=", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolLike(String value) {
            addCriterion("pool like", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotLike(String value) {
            addCriterion("pool not like", value, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolIn(List<String> values) {
            addCriterion("pool in", values, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotIn(List<String> values) {
            addCriterion("pool not in", values, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolBetween(String value1, String value2) {
            addCriterion("pool between", value1, value2, "pool");
            return (Criteria) this;
        }

        public Criteria andPoolNotBetween(String value1, String value2) {
            addCriterion("pool not between", value1, value2, "pool");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNull() {
            addCriterion("expression is null");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNotNull() {
            addCriterion("expression is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionEqualTo(String value) {
            addCriterion("expression =", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotEqualTo(String value) {
            addCriterion("expression <>", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThan(String value) {
            addCriterion("expression >", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("expression >=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThan(String value) {
            addCriterion("expression <", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThanOrEqualTo(String value) {
            addCriterion("expression <=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLike(String value) {
            addCriterion("expression like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotLike(String value) {
            addCriterion("expression not like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionIn(List<String> values) {
            addCriterion("expression in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotIn(List<String> values) {
            addCriterion("expression not in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionBetween(String value1, String value2) {
            addCriterion("expression between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotBetween(String value1, String value2) {
            addCriterion("expression not between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeIsNull() {
            addCriterion("pre_fire_time is null");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeIsNotNull() {
            addCriterion("pre_fire_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeEqualTo(Integer value) {
            addCriterion("pre_fire_time =", value, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeNotEqualTo(Integer value) {
            addCriterion("pre_fire_time <>", value, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeGreaterThan(Integer value) {
            addCriterion("pre_fire_time >", value, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_fire_time >=", value, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeLessThan(Integer value) {
            addCriterion("pre_fire_time <", value, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeLessThanOrEqualTo(Integer value) {
            addCriterion("pre_fire_time <=", value, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeIn(List<Integer> values) {
            addCriterion("pre_fire_time in", values, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeNotIn(List<Integer> values) {
            addCriterion("pre_fire_time not in", values, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeBetween(Integer value1, Integer value2) {
            addCriterion("pre_fire_time between", value1, value2, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andPreFireTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_fire_time not between", value1, value2, "preFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIsNull() {
            addCriterion("next_fire_time is null");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIsNotNull() {
            addCriterion("next_fire_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeEqualTo(Integer value) {
            addCriterion("next_fire_time =", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotEqualTo(Integer value) {
            addCriterion("next_fire_time <>", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeGreaterThan(Integer value) {
            addCriterion("next_fire_time >", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("next_fire_time >=", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeLessThan(Integer value) {
            addCriterion("next_fire_time <", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeLessThanOrEqualTo(Integer value) {
            addCriterion("next_fire_time <=", value, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeIn(List<Integer> values) {
            addCriterion("next_fire_time in", values, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotIn(List<Integer> values) {
            addCriterion("next_fire_time not in", values, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeBetween(Integer value1, Integer value2) {
            addCriterion("next_fire_time between", value1, value2, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andNextFireTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("next_fire_time not between", value1, value2, "nextFireTime");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdIsNull() {
            addCriterion("misfire_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdIsNotNull() {
            addCriterion("misfire_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdEqualTo(Integer value) {
            addCriterion("misfire_threshold =", value, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdNotEqualTo(Integer value) {
            addCriterion("misfire_threshold <>", value, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdGreaterThan(Integer value) {
            addCriterion("misfire_threshold >", value, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("misfire_threshold >=", value, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdLessThan(Integer value) {
            addCriterion("misfire_threshold <", value, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("misfire_threshold <=", value, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdIn(List<Integer> values) {
            addCriterion("misfire_threshold in", values, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdNotIn(List<Integer> values) {
            addCriterion("misfire_threshold not in", values, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdBetween(Integer value1, Integer value2) {
            addCriterion("misfire_threshold between", value1, value2, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfireThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("misfire_threshold not between", value1, value2, "misfireThreshold");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyIsNull() {
            addCriterion("misfire_policy is null");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyIsNotNull() {
            addCriterion("misfire_policy is not null");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyEqualTo(String value) {
            addCriterion("misfire_policy =", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyNotEqualTo(String value) {
            addCriterion("misfire_policy <>", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyGreaterThan(String value) {
            addCriterion("misfire_policy >", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyGreaterThanOrEqualTo(String value) {
            addCriterion("misfire_policy >=", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyLessThan(String value) {
            addCriterion("misfire_policy <", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyLessThanOrEqualTo(String value) {
            addCriterion("misfire_policy <=", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyLike(String value) {
            addCriterion("misfire_policy like", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyNotLike(String value) {
            addCriterion("misfire_policy not like", value, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyIn(List<String> values) {
            addCriterion("misfire_policy in", values, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyNotIn(List<String> values) {
            addCriterion("misfire_policy not in", values, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyBetween(String value1, String value2) {
            addCriterion("misfire_policy between", value1, value2, "misfirePolicy");
            return (Criteria) this;
        }

        public Criteria andMisfirePolicyNotBetween(String value1, String value2) {
            addCriterion("misfire_policy not between", value1, value2, "misfirePolicy");
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

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Integer value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Integer value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Integer value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Integer value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Integer> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Integer> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Integer value1, Integer value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Integer value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Integer value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Integer value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Integer value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Integer> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Integer> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Integer value1, Integer value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Integer value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Integer value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Integer value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Integer value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Integer> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Integer> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Integer value1, Integer value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
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