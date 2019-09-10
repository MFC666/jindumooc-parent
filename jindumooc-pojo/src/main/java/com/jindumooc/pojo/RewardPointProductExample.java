package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class RewardPointProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardPointProductExample() {
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

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeIsNull() {
            addCriterion("requireConsignee is null");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeIsNotNull() {
            addCriterion("requireConsignee is not null");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeEqualTo(Byte value) {
            addCriterion("requireConsignee =", value, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeNotEqualTo(Byte value) {
            addCriterion("requireConsignee <>", value, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeGreaterThan(Byte value) {
            addCriterion("requireConsignee >", value, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeGreaterThanOrEqualTo(Byte value) {
            addCriterion("requireConsignee >=", value, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeLessThan(Byte value) {
            addCriterion("requireConsignee <", value, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeLessThanOrEqualTo(Byte value) {
            addCriterion("requireConsignee <=", value, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeIn(List<Byte> values) {
            addCriterion("requireConsignee in", values, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeNotIn(List<Byte> values) {
            addCriterion("requireConsignee not in", values, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeBetween(Byte value1, Byte value2) {
            addCriterion("requireConsignee between", value1, value2, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequireconsigneeNotBetween(Byte value1, Byte value2) {
            addCriterion("requireConsignee not between", value1, value2, "requireconsignee");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneIsNull() {
            addCriterion("requireTelephone is null");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneIsNotNull() {
            addCriterion("requireTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneEqualTo(Byte value) {
            addCriterion("requireTelephone =", value, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneNotEqualTo(Byte value) {
            addCriterion("requireTelephone <>", value, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneGreaterThan(Byte value) {
            addCriterion("requireTelephone >", value, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneGreaterThanOrEqualTo(Byte value) {
            addCriterion("requireTelephone >=", value, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneLessThan(Byte value) {
            addCriterion("requireTelephone <", value, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneLessThanOrEqualTo(Byte value) {
            addCriterion("requireTelephone <=", value, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneIn(List<Byte> values) {
            addCriterion("requireTelephone in", values, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneNotIn(List<Byte> values) {
            addCriterion("requireTelephone not in", values, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneBetween(Byte value1, Byte value2) {
            addCriterion("requireTelephone between", value1, value2, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequiretelephoneNotBetween(Byte value1, Byte value2) {
            addCriterion("requireTelephone not between", value1, value2, "requiretelephone");
            return (Criteria) this;
        }

        public Criteria andRequireemailIsNull() {
            addCriterion("requireEmail is null");
            return (Criteria) this;
        }

        public Criteria andRequireemailIsNotNull() {
            addCriterion("requireEmail is not null");
            return (Criteria) this;
        }

        public Criteria andRequireemailEqualTo(Byte value) {
            addCriterion("requireEmail =", value, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailNotEqualTo(Byte value) {
            addCriterion("requireEmail <>", value, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailGreaterThan(Byte value) {
            addCriterion("requireEmail >", value, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailGreaterThanOrEqualTo(Byte value) {
            addCriterion("requireEmail >=", value, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailLessThan(Byte value) {
            addCriterion("requireEmail <", value, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailLessThanOrEqualTo(Byte value) {
            addCriterion("requireEmail <=", value, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailIn(List<Byte> values) {
            addCriterion("requireEmail in", values, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailNotIn(List<Byte> values) {
            addCriterion("requireEmail not in", values, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailBetween(Byte value1, Byte value2) {
            addCriterion("requireEmail between", value1, value2, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireemailNotBetween(Byte value1, Byte value2) {
            addCriterion("requireEmail not between", value1, value2, "requireemail");
            return (Criteria) this;
        }

        public Criteria andRequireaddressIsNull() {
            addCriterion("requireAddress is null");
            return (Criteria) this;
        }

        public Criteria andRequireaddressIsNotNull() {
            addCriterion("requireAddress is not null");
            return (Criteria) this;
        }

        public Criteria andRequireaddressEqualTo(Byte value) {
            addCriterion("requireAddress =", value, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressNotEqualTo(Byte value) {
            addCriterion("requireAddress <>", value, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressGreaterThan(Byte value) {
            addCriterion("requireAddress >", value, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressGreaterThanOrEqualTo(Byte value) {
            addCriterion("requireAddress >=", value, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressLessThan(Byte value) {
            addCriterion("requireAddress <", value, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressLessThanOrEqualTo(Byte value) {
            addCriterion("requireAddress <=", value, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressIn(List<Byte> values) {
            addCriterion("requireAddress in", values, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressNotIn(List<Byte> values) {
            addCriterion("requireAddress not in", values, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressBetween(Byte value1, Byte value2) {
            addCriterion("requireAddress between", value1, value2, "requireaddress");
            return (Criteria) this;
        }

        public Criteria andRequireaddressNotBetween(Byte value1, Byte value2) {
            addCriterion("requireAddress not between", value1, value2, "requireaddress");
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