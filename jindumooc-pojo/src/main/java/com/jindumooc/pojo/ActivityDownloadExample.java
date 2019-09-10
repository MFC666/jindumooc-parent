package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityDownloadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityDownloadExample() {
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

        public Criteria andMediacountIsNull() {
            addCriterion("mediaCount is null");
            return (Criteria) this;
        }

        public Criteria andMediacountIsNotNull() {
            addCriterion("mediaCount is not null");
            return (Criteria) this;
        }

        public Criteria andMediacountEqualTo(Integer value) {
            addCriterion("mediaCount =", value, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountNotEqualTo(Integer value) {
            addCriterion("mediaCount <>", value, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountGreaterThan(Integer value) {
            addCriterion("mediaCount >", value, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountGreaterThanOrEqualTo(Integer value) {
            addCriterion("mediaCount >=", value, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountLessThan(Integer value) {
            addCriterion("mediaCount <", value, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountLessThanOrEqualTo(Integer value) {
            addCriterion("mediaCount <=", value, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountIn(List<Integer> values) {
            addCriterion("mediaCount in", values, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountNotIn(List<Integer> values) {
            addCriterion("mediaCount not in", values, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountBetween(Integer value1, Integer value2) {
            addCriterion("mediaCount between", value1, value2, "mediacount");
            return (Criteria) this;
        }

        public Criteria andMediacountNotBetween(Integer value1, Integer value2) {
            addCriterion("mediaCount not between", value1, value2, "mediacount");
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

        public Criteria andFileidsIsNull() {
            addCriterion("fileIds is null");
            return (Criteria) this;
        }

        public Criteria andFileidsIsNotNull() {
            addCriterion("fileIds is not null");
            return (Criteria) this;
        }

        public Criteria andFileidsEqualTo(String value) {
            addCriterion("fileIds =", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsNotEqualTo(String value) {
            addCriterion("fileIds <>", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsGreaterThan(String value) {
            addCriterion("fileIds >", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsGreaterThanOrEqualTo(String value) {
            addCriterion("fileIds >=", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsLessThan(String value) {
            addCriterion("fileIds <", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsLessThanOrEqualTo(String value) {
            addCriterion("fileIds <=", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsLike(String value) {
            addCriterion("fileIds like", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsNotLike(String value) {
            addCriterion("fileIds not like", value, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsIn(List<String> values) {
            addCriterion("fileIds in", values, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsNotIn(List<String> values) {
            addCriterion("fileIds not in", values, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsBetween(String value1, String value2) {
            addCriterion("fileIds between", value1, value2, "fileids");
            return (Criteria) this;
        }

        public Criteria andFileidsNotBetween(String value1, String value2) {
            addCriterion("fileIds not between", value1, value2, "fileids");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIsNull() {
            addCriterion("migrateLessonId is null");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIsNotNull() {
            addCriterion("migrateLessonId is not null");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidEqualTo(Integer value) {
            addCriterion("migrateLessonId =", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotEqualTo(Integer value) {
            addCriterion("migrateLessonId <>", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidGreaterThan(Integer value) {
            addCriterion("migrateLessonId >", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("migrateLessonId >=", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidLessThan(Integer value) {
            addCriterion("migrateLessonId <", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidLessThanOrEqualTo(Integer value) {
            addCriterion("migrateLessonId <=", value, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidIn(List<Integer> values) {
            addCriterion("migrateLessonId in", values, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotIn(List<Integer> values) {
            addCriterion("migrateLessonId not in", values, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidBetween(Integer value1, Integer value2) {
            addCriterion("migrateLessonId between", value1, value2, "migratelessonid");
            return (Criteria) this;
        }

        public Criteria andMigratelessonidNotBetween(Integer value1, Integer value2) {
            addCriterion("migrateLessonId not between", value1, value2, "migratelessonid");
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