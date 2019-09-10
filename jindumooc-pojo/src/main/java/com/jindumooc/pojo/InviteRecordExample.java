package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class InviteRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InviteRecordExample() {
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

        public Criteria andInviteuseridIsNull() {
            addCriterion("inviteUserId is null");
            return (Criteria) this;
        }

        public Criteria andInviteuseridIsNotNull() {
            addCriterion("inviteUserId is not null");
            return (Criteria) this;
        }

        public Criteria andInviteuseridEqualTo(Integer value) {
            addCriterion("inviteUserId =", value, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridNotEqualTo(Integer value) {
            addCriterion("inviteUserId <>", value, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridGreaterThan(Integer value) {
            addCriterion("inviteUserId >", value, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("inviteUserId >=", value, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridLessThan(Integer value) {
            addCriterion("inviteUserId <", value, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridLessThanOrEqualTo(Integer value) {
            addCriterion("inviteUserId <=", value, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridIn(List<Integer> values) {
            addCriterion("inviteUserId in", values, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridNotIn(List<Integer> values) {
            addCriterion("inviteUserId not in", values, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridBetween(Integer value1, Integer value2) {
            addCriterion("inviteUserId between", value1, value2, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("inviteUserId not between", value1, value2, "inviteuserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridIsNull() {
            addCriterion("invitedUserId is null");
            return (Criteria) this;
        }

        public Criteria andInviteduseridIsNotNull() {
            addCriterion("invitedUserId is not null");
            return (Criteria) this;
        }

        public Criteria andInviteduseridEqualTo(Integer value) {
            addCriterion("invitedUserId =", value, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridNotEqualTo(Integer value) {
            addCriterion("invitedUserId <>", value, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridGreaterThan(Integer value) {
            addCriterion("invitedUserId >", value, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitedUserId >=", value, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridLessThan(Integer value) {
            addCriterion("invitedUserId <", value, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridLessThanOrEqualTo(Integer value) {
            addCriterion("invitedUserId <=", value, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridIn(List<Integer> values) {
            addCriterion("invitedUserId in", values, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridNotIn(List<Integer> values) {
            addCriterion("invitedUserId not in", values, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridBetween(Integer value1, Integer value2) {
            addCriterion("invitedUserId between", value1, value2, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInviteduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("invitedUserId not between", value1, value2, "inviteduserid");
            return (Criteria) this;
        }

        public Criteria andInvitetimeIsNull() {
            addCriterion("inviteTime is null");
            return (Criteria) this;
        }

        public Criteria andInvitetimeIsNotNull() {
            addCriterion("inviteTime is not null");
            return (Criteria) this;
        }

        public Criteria andInvitetimeEqualTo(Integer value) {
            addCriterion("inviteTime =", value, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeNotEqualTo(Integer value) {
            addCriterion("inviteTime <>", value, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeGreaterThan(Integer value) {
            addCriterion("inviteTime >", value, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("inviteTime >=", value, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeLessThan(Integer value) {
            addCriterion("inviteTime <", value, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeLessThanOrEqualTo(Integer value) {
            addCriterion("inviteTime <=", value, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeIn(List<Integer> values) {
            addCriterion("inviteTime in", values, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeNotIn(List<Integer> values) {
            addCriterion("inviteTime not in", values, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeBetween(Integer value1, Integer value2) {
            addCriterion("inviteTime between", value1, value2, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInvitetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("inviteTime not between", value1, value2, "invitetime");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidIsNull() {
            addCriterion("inviteUserCardId is null");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidIsNotNull() {
            addCriterion("inviteUserCardId is not null");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidEqualTo(Integer value) {
            addCriterion("inviteUserCardId =", value, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidNotEqualTo(Integer value) {
            addCriterion("inviteUserCardId <>", value, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidGreaterThan(Integer value) {
            addCriterion("inviteUserCardId >", value, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("inviteUserCardId >=", value, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidLessThan(Integer value) {
            addCriterion("inviteUserCardId <", value, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidLessThanOrEqualTo(Integer value) {
            addCriterion("inviteUserCardId <=", value, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidIn(List<Integer> values) {
            addCriterion("inviteUserCardId in", values, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidNotIn(List<Integer> values) {
            addCriterion("inviteUserCardId not in", values, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidBetween(Integer value1, Integer value2) {
            addCriterion("inviteUserCardId between", value1, value2, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInviteusercardidNotBetween(Integer value1, Integer value2) {
            addCriterion("inviteUserCardId not between", value1, value2, "inviteusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidIsNull() {
            addCriterion("invitedUserCardId is null");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidIsNotNull() {
            addCriterion("invitedUserCardId is not null");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidEqualTo(Integer value) {
            addCriterion("invitedUserCardId =", value, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidNotEqualTo(Integer value) {
            addCriterion("invitedUserCardId <>", value, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidGreaterThan(Integer value) {
            addCriterion("invitedUserCardId >", value, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invitedUserCardId >=", value, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidLessThan(Integer value) {
            addCriterion("invitedUserCardId <", value, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidLessThanOrEqualTo(Integer value) {
            addCriterion("invitedUserCardId <=", value, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidIn(List<Integer> values) {
            addCriterion("invitedUserCardId in", values, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidNotIn(List<Integer> values) {
            addCriterion("invitedUserCardId not in", values, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidBetween(Integer value1, Integer value2) {
            addCriterion("invitedUserCardId between", value1, value2, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andInvitedusercardidNotBetween(Integer value1, Integer value2) {
            addCriterion("invitedUserCardId not between", value1, value2, "invitedusercardid");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Float value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Float value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Float value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Float value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Float value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Float> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Float> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Float value1, Float value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Float value1, Float value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCashamountIsNull() {
            addCriterion("cashAmount is null");
            return (Criteria) this;
        }

        public Criteria andCashamountIsNotNull() {
            addCriterion("cashAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCashamountEqualTo(Float value) {
            addCriterion("cashAmount =", value, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountNotEqualTo(Float value) {
            addCriterion("cashAmount <>", value, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountGreaterThan(Float value) {
            addCriterion("cashAmount >", value, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountGreaterThanOrEqualTo(Float value) {
            addCriterion("cashAmount >=", value, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountLessThan(Float value) {
            addCriterion("cashAmount <", value, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountLessThanOrEqualTo(Float value) {
            addCriterion("cashAmount <=", value, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountIn(List<Float> values) {
            addCriterion("cashAmount in", values, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountNotIn(List<Float> values) {
            addCriterion("cashAmount not in", values, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountBetween(Float value1, Float value2) {
            addCriterion("cashAmount between", value1, value2, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCashamountNotBetween(Float value1, Float value2) {
            addCriterion("cashAmount not between", value1, value2, "cashamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountIsNull() {
            addCriterion("coinAmount is null");
            return (Criteria) this;
        }

        public Criteria andCoinamountIsNotNull() {
            addCriterion("coinAmount is not null");
            return (Criteria) this;
        }

        public Criteria andCoinamountEqualTo(Float value) {
            addCriterion("coinAmount =", value, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountNotEqualTo(Float value) {
            addCriterion("coinAmount <>", value, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountGreaterThan(Float value) {
            addCriterion("coinAmount >", value, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountGreaterThanOrEqualTo(Float value) {
            addCriterion("coinAmount >=", value, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountLessThan(Float value) {
            addCriterion("coinAmount <", value, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountLessThanOrEqualTo(Float value) {
            addCriterion("coinAmount <=", value, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountIn(List<Float> values) {
            addCriterion("coinAmount in", values, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountNotIn(List<Float> values) {
            addCriterion("coinAmount not in", values, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountBetween(Float value1, Float value2) {
            addCriterion("coinAmount between", value1, value2, "coinamount");
            return (Criteria) this;
        }

        public Criteria andCoinamountNotBetween(Float value1, Float value2) {
            addCriterion("coinAmount not between", value1, value2, "coinamount");
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