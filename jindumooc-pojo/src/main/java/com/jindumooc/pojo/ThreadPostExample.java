package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ThreadPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreadPostExample() {
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

        public Criteria andThreadidIsNull() {
            addCriterion("threadId is null");
            return (Criteria) this;
        }

        public Criteria andThreadidIsNotNull() {
            addCriterion("threadId is not null");
            return (Criteria) this;
        }

        public Criteria andThreadidEqualTo(Integer value) {
            addCriterion("threadId =", value, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidNotEqualTo(Integer value) {
            addCriterion("threadId <>", value, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidGreaterThan(Integer value) {
            addCriterion("threadId >", value, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidGreaterThanOrEqualTo(Integer value) {
            addCriterion("threadId >=", value, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidLessThan(Integer value) {
            addCriterion("threadId <", value, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidLessThanOrEqualTo(Integer value) {
            addCriterion("threadId <=", value, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidIn(List<Integer> values) {
            addCriterion("threadId in", values, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidNotIn(List<Integer> values) {
            addCriterion("threadId not in", values, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidBetween(Integer value1, Integer value2) {
            addCriterion("threadId between", value1, value2, "threadid");
            return (Criteria) this;
        }

        public Criteria andThreadidNotBetween(Integer value1, Integer value2) {
            addCriterion("threadId not between", value1, value2, "threadid");
            return (Criteria) this;
        }

        public Criteria andAdoptedIsNull() {
            addCriterion("adopted is null");
            return (Criteria) this;
        }

        public Criteria andAdoptedIsNotNull() {
            addCriterion("adopted is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptedEqualTo(Byte value) {
            addCriterion("adopted =", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedNotEqualTo(Byte value) {
            addCriterion("adopted <>", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedGreaterThan(Byte value) {
            addCriterion("adopted >", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedGreaterThanOrEqualTo(Byte value) {
            addCriterion("adopted >=", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedLessThan(Byte value) {
            addCriterion("adopted <", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedLessThanOrEqualTo(Byte value) {
            addCriterion("adopted <=", value, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedIn(List<Byte> values) {
            addCriterion("adopted in", values, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedNotIn(List<Byte> values) {
            addCriterion("adopted not in", values, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedBetween(Byte value1, Byte value2) {
            addCriterion("adopted between", value1, value2, "adopted");
            return (Criteria) this;
        }

        public Criteria andAdoptedNotBetween(Byte value1, Byte value2) {
            addCriterion("adopted not between", value1, value2, "adopted");
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

        public Criteria andSubpostsIsNull() {
            addCriterion("subposts is null");
            return (Criteria) this;
        }

        public Criteria andSubpostsIsNotNull() {
            addCriterion("subposts is not null");
            return (Criteria) this;
        }

        public Criteria andSubpostsEqualTo(Integer value) {
            addCriterion("subposts =", value, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsNotEqualTo(Integer value) {
            addCriterion("subposts <>", value, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsGreaterThan(Integer value) {
            addCriterion("subposts >", value, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsGreaterThanOrEqualTo(Integer value) {
            addCriterion("subposts >=", value, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsLessThan(Integer value) {
            addCriterion("subposts <", value, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsLessThanOrEqualTo(Integer value) {
            addCriterion("subposts <=", value, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsIn(List<Integer> values) {
            addCriterion("subposts in", values, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsNotIn(List<Integer> values) {
            addCriterion("subposts not in", values, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsBetween(Integer value1, Integer value2) {
            addCriterion("subposts between", value1, value2, "subposts");
            return (Criteria) this;
        }

        public Criteria andSubpostsNotBetween(Integer value1, Integer value2) {
            addCriterion("subposts not between", value1, value2, "subposts");
            return (Criteria) this;
        }

        public Criteria andUpsIsNull() {
            addCriterion("ups is null");
            return (Criteria) this;
        }

        public Criteria andUpsIsNotNull() {
            addCriterion("ups is not null");
            return (Criteria) this;
        }

        public Criteria andUpsEqualTo(Integer value) {
            addCriterion("ups =", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotEqualTo(Integer value) {
            addCriterion("ups <>", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsGreaterThan(Integer value) {
            addCriterion("ups >", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ups >=", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsLessThan(Integer value) {
            addCriterion("ups <", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsLessThanOrEqualTo(Integer value) {
            addCriterion("ups <=", value, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsIn(List<Integer> values) {
            addCriterion("ups in", values, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotIn(List<Integer> values) {
            addCriterion("ups not in", values, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsBetween(Integer value1, Integer value2) {
            addCriterion("ups between", value1, value2, "ups");
            return (Criteria) this;
        }

        public Criteria andUpsNotBetween(Integer value1, Integer value2) {
            addCriterion("ups not between", value1, value2, "ups");
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