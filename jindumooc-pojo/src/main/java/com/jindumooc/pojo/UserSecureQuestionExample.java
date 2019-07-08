package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserSecureQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSecureQuestionExample() {
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

        public Criteria andSecurityquestioncodeIsNull() {
            addCriterion("securityQuestionCode is null");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeIsNotNull() {
            addCriterion("securityQuestionCode is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeEqualTo(String value) {
            addCriterion("securityQuestionCode =", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeNotEqualTo(String value) {
            addCriterion("securityQuestionCode <>", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeGreaterThan(String value) {
            addCriterion("securityQuestionCode >", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("securityQuestionCode >=", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeLessThan(String value) {
            addCriterion("securityQuestionCode <", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeLessThanOrEqualTo(String value) {
            addCriterion("securityQuestionCode <=", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeLike(String value) {
            addCriterion("securityQuestionCode like", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeNotLike(String value) {
            addCriterion("securityQuestionCode not like", value, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeIn(List<String> values) {
            addCriterion("securityQuestionCode in", values, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeNotIn(List<String> values) {
            addCriterion("securityQuestionCode not in", values, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeBetween(String value1, String value2) {
            addCriterion("securityQuestionCode between", value1, value2, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityquestioncodeNotBetween(String value1, String value2) {
            addCriterion("securityQuestionCode not between", value1, value2, "securityquestioncode");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerIsNull() {
            addCriterion("securityAnswer is null");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerIsNotNull() {
            addCriterion("securityAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerEqualTo(String value) {
            addCriterion("securityAnswer =", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotEqualTo(String value) {
            addCriterion("securityAnswer <>", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerGreaterThan(String value) {
            addCriterion("securityAnswer >", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerGreaterThanOrEqualTo(String value) {
            addCriterion("securityAnswer >=", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerLessThan(String value) {
            addCriterion("securityAnswer <", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerLessThanOrEqualTo(String value) {
            addCriterion("securityAnswer <=", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerLike(String value) {
            addCriterion("securityAnswer like", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotLike(String value) {
            addCriterion("securityAnswer not like", value, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerIn(List<String> values) {
            addCriterion("securityAnswer in", values, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotIn(List<String> values) {
            addCriterion("securityAnswer not in", values, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerBetween(String value1, String value2) {
            addCriterion("securityAnswer between", value1, value2, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswerNotBetween(String value1, String value2) {
            addCriterion("securityAnswer not between", value1, value2, "securityanswer");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltIsNull() {
            addCriterion("securityAnswerSalt is null");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltIsNotNull() {
            addCriterion("securityAnswerSalt is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltEqualTo(String value) {
            addCriterion("securityAnswerSalt =", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltNotEqualTo(String value) {
            addCriterion("securityAnswerSalt <>", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltGreaterThan(String value) {
            addCriterion("securityAnswerSalt >", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltGreaterThanOrEqualTo(String value) {
            addCriterion("securityAnswerSalt >=", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltLessThan(String value) {
            addCriterion("securityAnswerSalt <", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltLessThanOrEqualTo(String value) {
            addCriterion("securityAnswerSalt <=", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltLike(String value) {
            addCriterion("securityAnswerSalt like", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltNotLike(String value) {
            addCriterion("securityAnswerSalt not like", value, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltIn(List<String> values) {
            addCriterion("securityAnswerSalt in", values, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltNotIn(List<String> values) {
            addCriterion("securityAnswerSalt not in", values, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltBetween(String value1, String value2) {
            addCriterion("securityAnswerSalt between", value1, value2, "securityanswersalt");
            return (Criteria) this;
        }

        public Criteria andSecurityanswersaltNotBetween(String value1, String value2) {
            addCriterion("securityAnswerSalt not between", value1, value2, "securityanswersalt");
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