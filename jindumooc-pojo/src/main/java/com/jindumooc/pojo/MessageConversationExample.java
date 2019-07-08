package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageConversationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageConversationExample() {
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

        public Criteria andFromidIsNull() {
            addCriterion("fromId is null");
            return (Criteria) this;
        }

        public Criteria andFromidIsNotNull() {
            addCriterion("fromId is not null");
            return (Criteria) this;
        }

        public Criteria andFromidEqualTo(Integer value) {
            addCriterion("fromId =", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotEqualTo(Integer value) {
            addCriterion("fromId <>", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThan(Integer value) {
            addCriterion("fromId >", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fromId >=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThan(Integer value) {
            addCriterion("fromId <", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidLessThanOrEqualTo(Integer value) {
            addCriterion("fromId <=", value, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidIn(List<Integer> values) {
            addCriterion("fromId in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotIn(List<Integer> values) {
            addCriterion("fromId not in", values, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidBetween(Integer value1, Integer value2) {
            addCriterion("fromId between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andFromidNotBetween(Integer value1, Integer value2) {
            addCriterion("fromId not between", value1, value2, "fromid");
            return (Criteria) this;
        }

        public Criteria andToidIsNull() {
            addCriterion("toId is null");
            return (Criteria) this;
        }

        public Criteria andToidIsNotNull() {
            addCriterion("toId is not null");
            return (Criteria) this;
        }

        public Criteria andToidEqualTo(Integer value) {
            addCriterion("toId =", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotEqualTo(Integer value) {
            addCriterion("toId <>", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThan(Integer value) {
            addCriterion("toId >", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidGreaterThanOrEqualTo(Integer value) {
            addCriterion("toId >=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThan(Integer value) {
            addCriterion("toId <", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidLessThanOrEqualTo(Integer value) {
            addCriterion("toId <=", value, "toid");
            return (Criteria) this;
        }

        public Criteria andToidIn(List<Integer> values) {
            addCriterion("toId in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotIn(List<Integer> values) {
            addCriterion("toId not in", values, "toid");
            return (Criteria) this;
        }

        public Criteria andToidBetween(Integer value1, Integer value2) {
            addCriterion("toId between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andToidNotBetween(Integer value1, Integer value2) {
            addCriterion("toId not between", value1, value2, "toid");
            return (Criteria) this;
        }

        public Criteria andMessagenumIsNull() {
            addCriterion("messageNum is null");
            return (Criteria) this;
        }

        public Criteria andMessagenumIsNotNull() {
            addCriterion("messageNum is not null");
            return (Criteria) this;
        }

        public Criteria andMessagenumEqualTo(Integer value) {
            addCriterion("messageNum =", value, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumNotEqualTo(Integer value) {
            addCriterion("messageNum <>", value, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumGreaterThan(Integer value) {
            addCriterion("messageNum >", value, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("messageNum >=", value, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumLessThan(Integer value) {
            addCriterion("messageNum <", value, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumLessThanOrEqualTo(Integer value) {
            addCriterion("messageNum <=", value, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumIn(List<Integer> values) {
            addCriterion("messageNum in", values, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumNotIn(List<Integer> values) {
            addCriterion("messageNum not in", values, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumBetween(Integer value1, Integer value2) {
            addCriterion("messageNum between", value1, value2, "messagenum");
            return (Criteria) this;
        }

        public Criteria andMessagenumNotBetween(Integer value1, Integer value2) {
            addCriterion("messageNum not between", value1, value2, "messagenum");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridIsNull() {
            addCriterion("latestMessageUserId is null");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridIsNotNull() {
            addCriterion("latestMessageUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridEqualTo(Integer value) {
            addCriterion("latestMessageUserId =", value, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridNotEqualTo(Integer value) {
            addCriterion("latestMessageUserId <>", value, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridGreaterThan(Integer value) {
            addCriterion("latestMessageUserId >", value, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestMessageUserId >=", value, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridLessThan(Integer value) {
            addCriterion("latestMessageUserId <", value, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridLessThanOrEqualTo(Integer value) {
            addCriterion("latestMessageUserId <=", value, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridIn(List<Integer> values) {
            addCriterion("latestMessageUserId in", values, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridNotIn(List<Integer> values) {
            addCriterion("latestMessageUserId not in", values, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridBetween(Integer value1, Integer value2) {
            addCriterion("latestMessageUserId between", value1, value2, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessageuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("latestMessageUserId not between", value1, value2, "latestmessageuserid");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeIsNull() {
            addCriterion("latestMessageTime is null");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeIsNotNull() {
            addCriterion("latestMessageTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeEqualTo(Integer value) {
            addCriterion("latestMessageTime =", value, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeNotEqualTo(Integer value) {
            addCriterion("latestMessageTime <>", value, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeGreaterThan(Integer value) {
            addCriterion("latestMessageTime >", value, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("latestMessageTime >=", value, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeLessThan(Integer value) {
            addCriterion("latestMessageTime <", value, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeLessThanOrEqualTo(Integer value) {
            addCriterion("latestMessageTime <=", value, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeIn(List<Integer> values) {
            addCriterion("latestMessageTime in", values, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeNotIn(List<Integer> values) {
            addCriterion("latestMessageTime not in", values, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeBetween(Integer value1, Integer value2) {
            addCriterion("latestMessageTime between", value1, value2, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("latestMessageTime not between", value1, value2, "latestmessagetime");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeIsNull() {
            addCriterion("latestMessageType is null");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeIsNotNull() {
            addCriterion("latestMessageType is not null");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeEqualTo(String value) {
            addCriterion("latestMessageType =", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeNotEqualTo(String value) {
            addCriterion("latestMessageType <>", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeGreaterThan(String value) {
            addCriterion("latestMessageType >", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("latestMessageType >=", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeLessThan(String value) {
            addCriterion("latestMessageType <", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeLessThanOrEqualTo(String value) {
            addCriterion("latestMessageType <=", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeLike(String value) {
            addCriterion("latestMessageType like", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeNotLike(String value) {
            addCriterion("latestMessageType not like", value, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeIn(List<String> values) {
            addCriterion("latestMessageType in", values, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeNotIn(List<String> values) {
            addCriterion("latestMessageType not in", values, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeBetween(String value1, String value2) {
            addCriterion("latestMessageType between", value1, value2, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andLatestmessagetypeNotBetween(String value1, String value2) {
            addCriterion("latestMessageType not between", value1, value2, "latestmessagetype");
            return (Criteria) this;
        }

        public Criteria andUnreadnumIsNull() {
            addCriterion("unreadNum is null");
            return (Criteria) this;
        }

        public Criteria andUnreadnumIsNotNull() {
            addCriterion("unreadNum is not null");
            return (Criteria) this;
        }

        public Criteria andUnreadnumEqualTo(Integer value) {
            addCriterion("unreadNum =", value, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumNotEqualTo(Integer value) {
            addCriterion("unreadNum <>", value, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumGreaterThan(Integer value) {
            addCriterion("unreadNum >", value, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("unreadNum >=", value, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumLessThan(Integer value) {
            addCriterion("unreadNum <", value, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumLessThanOrEqualTo(Integer value) {
            addCriterion("unreadNum <=", value, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumIn(List<Integer> values) {
            addCriterion("unreadNum in", values, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumNotIn(List<Integer> values) {
            addCriterion("unreadNum not in", values, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumBetween(Integer value1, Integer value2) {
            addCriterion("unreadNum between", value1, value2, "unreadnum");
            return (Criteria) this;
        }

        public Criteria andUnreadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("unreadNum not between", value1, value2, "unreadnum");
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