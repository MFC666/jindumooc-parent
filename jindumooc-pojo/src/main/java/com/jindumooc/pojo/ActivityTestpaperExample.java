package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityTestpaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityTestpaperExample() {
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

        public Criteria andMediaidIsNull() {
            addCriterion("mediaId is null");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNotNull() {
            addCriterion("mediaId is not null");
            return (Criteria) this;
        }

        public Criteria andMediaidEqualTo(Integer value) {
            addCriterion("mediaId =", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotEqualTo(Integer value) {
            addCriterion("mediaId <>", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThan(Integer value) {
            addCriterion("mediaId >", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mediaId >=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThan(Integer value) {
            addCriterion("mediaId <", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThanOrEqualTo(Integer value) {
            addCriterion("mediaId <=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidIn(List<Integer> values) {
            addCriterion("mediaId in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotIn(List<Integer> values) {
            addCriterion("mediaId not in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidBetween(Integer value1, Integer value2) {
            addCriterion("mediaId between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotBetween(Integer value1, Integer value2) {
            addCriterion("mediaId not between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andDotimesIsNull() {
            addCriterion("doTimes is null");
            return (Criteria) this;
        }

        public Criteria andDotimesIsNotNull() {
            addCriterion("doTimes is not null");
            return (Criteria) this;
        }

        public Criteria andDotimesEqualTo(Short value) {
            addCriterion("doTimes =", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesNotEqualTo(Short value) {
            addCriterion("doTimes <>", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesGreaterThan(Short value) {
            addCriterion("doTimes >", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesGreaterThanOrEqualTo(Short value) {
            addCriterion("doTimes >=", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesLessThan(Short value) {
            addCriterion("doTimes <", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesLessThanOrEqualTo(Short value) {
            addCriterion("doTimes <=", value, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesIn(List<Short> values) {
            addCriterion("doTimes in", values, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesNotIn(List<Short> values) {
            addCriterion("doTimes not in", values, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesBetween(Short value1, Short value2) {
            addCriterion("doTimes between", value1, value2, "dotimes");
            return (Criteria) this;
        }

        public Criteria andDotimesNotBetween(Short value1, Short value2) {
            addCriterion("doTimes not between", value1, value2, "dotimes");
            return (Criteria) this;
        }

        public Criteria andRedointervalIsNull() {
            addCriterion("redoInterval is null");
            return (Criteria) this;
        }

        public Criteria andRedointervalIsNotNull() {
            addCriterion("redoInterval is not null");
            return (Criteria) this;
        }

        public Criteria andRedointervalEqualTo(Float value) {
            addCriterion("redoInterval =", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalNotEqualTo(Float value) {
            addCriterion("redoInterval <>", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalGreaterThan(Float value) {
            addCriterion("redoInterval >", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalGreaterThanOrEqualTo(Float value) {
            addCriterion("redoInterval >=", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalLessThan(Float value) {
            addCriterion("redoInterval <", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalLessThanOrEqualTo(Float value) {
            addCriterion("redoInterval <=", value, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalIn(List<Float> values) {
            addCriterion("redoInterval in", values, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalNotIn(List<Float> values) {
            addCriterion("redoInterval not in", values, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalBetween(Float value1, Float value2) {
            addCriterion("redoInterval between", value1, value2, "redointerval");
            return (Criteria) this;
        }

        public Criteria andRedointervalNotBetween(Float value1, Float value2) {
            addCriterion("redoInterval not between", value1, value2, "redointerval");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeIsNull() {
            addCriterion("limitedTime is null");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeIsNotNull() {
            addCriterion("limitedTime is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeEqualTo(Integer value) {
            addCriterion("limitedTime =", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeNotEqualTo(Integer value) {
            addCriterion("limitedTime <>", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeGreaterThan(Integer value) {
            addCriterion("limitedTime >", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitedTime >=", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeLessThan(Integer value) {
            addCriterion("limitedTime <", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("limitedTime <=", value, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeIn(List<Integer> values) {
            addCriterion("limitedTime in", values, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeNotIn(List<Integer> values) {
            addCriterion("limitedTime not in", values, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeBetween(Integer value1, Integer value2) {
            addCriterion("limitedTime between", value1, value2, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andLimitedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("limitedTime not between", value1, value2, "limitedtime");
            return (Criteria) this;
        }

        public Criteria andRequirecreditIsNull() {
            addCriterion("requireCredit is null");
            return (Criteria) this;
        }

        public Criteria andRequirecreditIsNotNull() {
            addCriterion("requireCredit is not null");
            return (Criteria) this;
        }

        public Criteria andRequirecreditEqualTo(Integer value) {
            addCriterion("requireCredit =", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditNotEqualTo(Integer value) {
            addCriterion("requireCredit <>", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditGreaterThan(Integer value) {
            addCriterion("requireCredit >", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("requireCredit >=", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditLessThan(Integer value) {
            addCriterion("requireCredit <", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditLessThanOrEqualTo(Integer value) {
            addCriterion("requireCredit <=", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditIn(List<Integer> values) {
            addCriterion("requireCredit in", values, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditNotIn(List<Integer> values) {
            addCriterion("requireCredit not in", values, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditBetween(Integer value1, Integer value2) {
            addCriterion("requireCredit between", value1, value2, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditNotBetween(Integer value1, Integer value2) {
            addCriterion("requireCredit not between", value1, value2, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andTestmodeIsNull() {
            addCriterion("testMode is null");
            return (Criteria) this;
        }

        public Criteria andTestmodeIsNotNull() {
            addCriterion("testMode is not null");
            return (Criteria) this;
        }

        public Criteria andTestmodeEqualTo(String value) {
            addCriterion("testMode =", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotEqualTo(String value) {
            addCriterion("testMode <>", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeGreaterThan(String value) {
            addCriterion("testMode >", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeGreaterThanOrEqualTo(String value) {
            addCriterion("testMode >=", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeLessThan(String value) {
            addCriterion("testMode <", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeLessThanOrEqualTo(String value) {
            addCriterion("testMode <=", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeLike(String value) {
            addCriterion("testMode like", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotLike(String value) {
            addCriterion("testMode not like", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeIn(List<String> values) {
            addCriterion("testMode in", values, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotIn(List<String> values) {
            addCriterion("testMode not in", values, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeBetween(String value1, String value2) {
            addCriterion("testMode between", value1, value2, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotBetween(String value1, String value2) {
            addCriterion("testMode not between", value1, value2, "testmode");
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