package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
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

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalPrice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Float value) {
            addCriterion("totalPrice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Float value) {
            addCriterion("totalPrice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Float value) {
            addCriterion("totalPrice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("totalPrice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Float value) {
            addCriterion("totalPrice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Float value) {
            addCriterion("totalPrice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Float> values) {
            addCriterion("totalPrice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Float> values) {
            addCriterion("totalPrice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Float value1, Float value2) {
            addCriterion("totalPrice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Float value1, Float value2) {
            addCriterion("totalPrice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andIsgiftIsNull() {
            addCriterion("isGift is null");
            return (Criteria) this;
        }

        public Criteria andIsgiftIsNotNull() {
            addCriterion("isGift is not null");
            return (Criteria) this;
        }

        public Criteria andIsgiftEqualTo(Byte value) {
            addCriterion("isGift =", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotEqualTo(Byte value) {
            addCriterion("isGift <>", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftGreaterThan(Byte value) {
            addCriterion("isGift >", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftGreaterThanOrEqualTo(Byte value) {
            addCriterion("isGift >=", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLessThan(Byte value) {
            addCriterion("isGift <", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLessThanOrEqualTo(Byte value) {
            addCriterion("isGift <=", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftIn(List<Byte> values) {
            addCriterion("isGift in", values, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotIn(List<Byte> values) {
            addCriterion("isGift not in", values, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftBetween(Byte value1, Byte value2) {
            addCriterion("isGift between", value1, value2, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotBetween(Byte value1, Byte value2) {
            addCriterion("isGift not between", value1, value2, "isgift");
            return (Criteria) this;
        }

        public Criteria andGifttoIsNull() {
            addCriterion("giftTo is null");
            return (Criteria) this;
        }

        public Criteria andGifttoIsNotNull() {
            addCriterion("giftTo is not null");
            return (Criteria) this;
        }

        public Criteria andGifttoEqualTo(String value) {
            addCriterion("giftTo =", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoNotEqualTo(String value) {
            addCriterion("giftTo <>", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoGreaterThan(String value) {
            addCriterion("giftTo >", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoGreaterThanOrEqualTo(String value) {
            addCriterion("giftTo >=", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoLessThan(String value) {
            addCriterion("giftTo <", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoLessThanOrEqualTo(String value) {
            addCriterion("giftTo <=", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoLike(String value) {
            addCriterion("giftTo like", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoNotLike(String value) {
            addCriterion("giftTo not like", value, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoIn(List<String> values) {
            addCriterion("giftTo in", values, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoNotIn(List<String> values) {
            addCriterion("giftTo not in", values, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoBetween(String value1, String value2) {
            addCriterion("giftTo between", value1, value2, "giftto");
            return (Criteria) this;
        }

        public Criteria andGifttoNotBetween(String value1, String value2) {
            addCriterion("giftTo not between", value1, value2, "giftto");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNull() {
            addCriterion("discountId is null");
            return (Criteria) this;
        }

        public Criteria andDiscountidIsNotNull() {
            addCriterion("discountId is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountidEqualTo(Integer value) {
            addCriterion("discountId =", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotEqualTo(Integer value) {
            addCriterion("discountId <>", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThan(Integer value) {
            addCriterion("discountId >", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("discountId >=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThan(Integer value) {
            addCriterion("discountId <", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidLessThanOrEqualTo(Integer value) {
            addCriterion("discountId <=", value, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidIn(List<Integer> values) {
            addCriterion("discountId in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotIn(List<Integer> values) {
            addCriterion("discountId not in", values, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidBetween(Integer value1, Integer value2) {
            addCriterion("discountId between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountidNotBetween(Integer value1, Integer value2) {
            addCriterion("discountId not between", value1, value2, "discountid");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Float value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Float value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Float value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Float value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Float value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Float> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Float> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Float value1, Float value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Float value1, Float value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNull() {
            addCriterion("refundId is null");
            return (Criteria) this;
        }

        public Criteria andRefundidIsNotNull() {
            addCriterion("refundId is not null");
            return (Criteria) this;
        }

        public Criteria andRefundidEqualTo(Integer value) {
            addCriterion("refundId =", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotEqualTo(Integer value) {
            addCriterion("refundId <>", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThan(Integer value) {
            addCriterion("refundId >", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundId >=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThan(Integer value) {
            addCriterion("refundId <", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidLessThanOrEqualTo(Integer value) {
            addCriterion("refundId <=", value, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidIn(List<Integer> values) {
            addCriterion("refundId in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotIn(List<Integer> values) {
            addCriterion("refundId not in", values, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidBetween(Integer value1, Integer value2) {
            addCriterion("refundId between", value1, value2, "refundid");
            return (Criteria) this;
        }

        public Criteria andRefundidNotBetween(Integer value1, Integer value2) {
            addCriterion("refundId not between", value1, value2, "refundid");
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

        public Criteria andCouponIsNull() {
            addCriterion("coupon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsNotNull() {
            addCriterion("coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEqualTo(String value) {
            addCriterion("coupon =", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotEqualTo(String value) {
            addCriterion("coupon <>", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThan(String value) {
            addCriterion("coupon >", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThanOrEqualTo(String value) {
            addCriterion("coupon >=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThan(String value) {
            addCriterion("coupon <", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThanOrEqualTo(String value) {
            addCriterion("coupon <=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLike(String value) {
            addCriterion("coupon like", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotLike(String value) {
            addCriterion("coupon not like", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponIn(List<String> values) {
            addCriterion("coupon in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotIn(List<String> values) {
            addCriterion("coupon not in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponBetween(String value1, String value2) {
            addCriterion("coupon between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotBetween(String value1, String value2) {
            addCriterion("coupon not between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountIsNull() {
            addCriterion("couponDiscount is null");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountIsNotNull() {
            addCriterion("couponDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountEqualTo(Float value) {
            addCriterion("couponDiscount =", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountNotEqualTo(Float value) {
            addCriterion("couponDiscount <>", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountGreaterThan(Float value) {
            addCriterion("couponDiscount >", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountGreaterThanOrEqualTo(Float value) {
            addCriterion("couponDiscount >=", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountLessThan(Float value) {
            addCriterion("couponDiscount <", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountLessThanOrEqualTo(Float value) {
            addCriterion("couponDiscount <=", value, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountIn(List<Float> values) {
            addCriterion("couponDiscount in", values, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountNotIn(List<Float> values) {
            addCriterion("couponDiscount not in", values, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountBetween(Float value1, Float value2) {
            addCriterion("couponDiscount between", value1, value2, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andCoupondiscountNotBetween(Float value1, Float value2) {
            addCriterion("couponDiscount not between", value1, value2, "coupondiscount");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
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

        public Criteria andCoinrateIsNull() {
            addCriterion("coinRate is null");
            return (Criteria) this;
        }

        public Criteria andCoinrateIsNotNull() {
            addCriterion("coinRate is not null");
            return (Criteria) this;
        }

        public Criteria andCoinrateEqualTo(Float value) {
            addCriterion("coinRate =", value, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateNotEqualTo(Float value) {
            addCriterion("coinRate <>", value, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateGreaterThan(Float value) {
            addCriterion("coinRate >", value, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateGreaterThanOrEqualTo(Float value) {
            addCriterion("coinRate >=", value, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateLessThan(Float value) {
            addCriterion("coinRate <", value, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateLessThanOrEqualTo(Float value) {
            addCriterion("coinRate <=", value, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateIn(List<Float> values) {
            addCriterion("coinRate in", values, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateNotIn(List<Float> values) {
            addCriterion("coinRate not in", values, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateBetween(Float value1, Float value2) {
            addCriterion("coinRate between", value1, value2, "coinrate");
            return (Criteria) this;
        }

        public Criteria andCoinrateNotBetween(Float value1, Float value2) {
            addCriterion("coinRate not between", value1, value2, "coinrate");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNull() {
            addCriterion("priceType is null");
            return (Criteria) this;
        }

        public Criteria andPricetypeIsNotNull() {
            addCriterion("priceType is not null");
            return (Criteria) this;
        }

        public Criteria andPricetypeEqualTo(String value) {
            addCriterion("priceType =", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotEqualTo(String value) {
            addCriterion("priceType <>", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThan(String value) {
            addCriterion("priceType >", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeGreaterThanOrEqualTo(String value) {
            addCriterion("priceType >=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThan(String value) {
            addCriterion("priceType <", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLessThanOrEqualTo(String value) {
            addCriterion("priceType <=", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeLike(String value) {
            addCriterion("priceType like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotLike(String value) {
            addCriterion("priceType not like", value, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeIn(List<String> values) {
            addCriterion("priceType in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotIn(List<String> values) {
            addCriterion("priceType not in", values, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeBetween(String value1, String value2) {
            addCriterion("priceType between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andPricetypeNotBetween(String value1, String value2) {
            addCriterion("priceType not between", value1, value2, "pricetype");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNull() {
            addCriterion("paidTime is null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIsNotNull() {
            addCriterion("paidTime is not null");
            return (Criteria) this;
        }

        public Criteria andPaidtimeEqualTo(Integer value) {
            addCriterion("paidTime =", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotEqualTo(Integer value) {
            addCriterion("paidTime <>", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThan(Integer value) {
            addCriterion("paidTime >", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paidTime >=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThan(Integer value) {
            addCriterion("paidTime <", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeLessThanOrEqualTo(Integer value) {
            addCriterion("paidTime <=", value, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeIn(List<Integer> values) {
            addCriterion("paidTime in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotIn(List<Integer> values) {
            addCriterion("paidTime not in", values, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeBetween(Integer value1, Integer value2) {
            addCriterion("paidTime between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andPaidtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("paidTime not between", value1, value2, "paidtime");
            return (Criteria) this;
        }

        public Criteria andCashsnIsNull() {
            addCriterion("cashSn is null");
            return (Criteria) this;
        }

        public Criteria andCashsnIsNotNull() {
            addCriterion("cashSn is not null");
            return (Criteria) this;
        }

        public Criteria andCashsnEqualTo(Long value) {
            addCriterion("cashSn =", value, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnNotEqualTo(Long value) {
            addCriterion("cashSn <>", value, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnGreaterThan(Long value) {
            addCriterion("cashSn >", value, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnGreaterThanOrEqualTo(Long value) {
            addCriterion("cashSn >=", value, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnLessThan(Long value) {
            addCriterion("cashSn <", value, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnLessThanOrEqualTo(Long value) {
            addCriterion("cashSn <=", value, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnIn(List<Long> values) {
            addCriterion("cashSn in", values, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnNotIn(List<Long> values) {
            addCriterion("cashSn not in", values, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnBetween(Long value1, Long value2) {
            addCriterion("cashSn between", value1, value2, "cashsn");
            return (Criteria) this;
        }

        public Criteria andCashsnNotBetween(Long value1, Long value2) {
            addCriterion("cashSn not between", value1, value2, "cashsn");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeIsNull() {
            addCriterion("refundEndTime is null");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeIsNotNull() {
            addCriterion("refundEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeEqualTo(Integer value) {
            addCriterion("refundEndTime =", value, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeNotEqualTo(Integer value) {
            addCriterion("refundEndTime <>", value, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeGreaterThan(Integer value) {
            addCriterion("refundEndTime >", value, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundEndTime >=", value, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeLessThan(Integer value) {
            addCriterion("refundEndTime <", value, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeLessThanOrEqualTo(Integer value) {
            addCriterion("refundEndTime <=", value, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeIn(List<Integer> values) {
            addCriterion("refundEndTime in", values, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeNotIn(List<Integer> values) {
            addCriterion("refundEndTime not in", values, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeBetween(Integer value1, Integer value2) {
            addCriterion("refundEndTime between", value1, value2, "refundendtime");
            return (Criteria) this;
        }

        public Criteria andRefundendtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("refundEndTime not between", value1, value2, "refundendtime");
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