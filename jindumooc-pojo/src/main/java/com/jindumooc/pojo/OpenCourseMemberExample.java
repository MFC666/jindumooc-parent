package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class OpenCourseMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpenCourseMemberExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseId is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseId is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseId =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseId <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseId >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseId >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseId <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseId <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseId in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseId not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseId between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseId not between", value1, value2, "courseid");
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLearnednumIsNull() {
            addCriterion("learnedNum is null");
            return (Criteria) this;
        }

        public Criteria andLearnednumIsNotNull() {
            addCriterion("learnedNum is not null");
            return (Criteria) this;
        }

        public Criteria andLearnednumEqualTo(Integer value) {
            addCriterion("learnedNum =", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumNotEqualTo(Integer value) {
            addCriterion("learnedNum <>", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumGreaterThan(Integer value) {
            addCriterion("learnedNum >", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnedNum >=", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumLessThan(Integer value) {
            addCriterion("learnedNum <", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumLessThanOrEqualTo(Integer value) {
            addCriterion("learnedNum <=", value, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumIn(List<Integer> values) {
            addCriterion("learnedNum in", values, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumNotIn(List<Integer> values) {
            addCriterion("learnedNum not in", values, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumBetween(Integer value1, Integer value2) {
            addCriterion("learnedNum between", value1, value2, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearnednumNotBetween(Integer value1, Integer value2) {
            addCriterion("learnedNum not between", value1, value2, "learnednum");
            return (Criteria) this;
        }

        public Criteria andLearntimeIsNull() {
            addCriterion("learnTime is null");
            return (Criteria) this;
        }

        public Criteria andLearntimeIsNotNull() {
            addCriterion("learnTime is not null");
            return (Criteria) this;
        }

        public Criteria andLearntimeEqualTo(Integer value) {
            addCriterion("learnTime =", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeNotEqualTo(Integer value) {
            addCriterion("learnTime <>", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeGreaterThan(Integer value) {
            addCriterion("learnTime >", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("learnTime >=", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeLessThan(Integer value) {
            addCriterion("learnTime <", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeLessThanOrEqualTo(Integer value) {
            addCriterion("learnTime <=", value, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeIn(List<Integer> values) {
            addCriterion("learnTime in", values, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeNotIn(List<Integer> values) {
            addCriterion("learnTime not in", values, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeBetween(Integer value1, Integer value2) {
            addCriterion("learnTime between", value1, value2, "learntime");
            return (Criteria) this;
        }

        public Criteria andLearntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("learnTime not between", value1, value2, "learntime");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("seq is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("seq is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(Integer value) {
            addCriterion("seq =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(Integer value) {
            addCriterion("seq <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(Integer value) {
            addCriterion("seq >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("seq >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(Integer value) {
            addCriterion("seq <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(Integer value) {
            addCriterion("seq <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<Integer> values) {
            addCriterion("seq in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<Integer> values) {
            addCriterion("seq not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(Integer value1, Integer value2) {
            addCriterion("seq between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("seq not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andIsvisibleIsNull() {
            addCriterion("isVisible is null");
            return (Criteria) this;
        }

        public Criteria andIsvisibleIsNotNull() {
            addCriterion("isVisible is not null");
            return (Criteria) this;
        }

        public Criteria andIsvisibleEqualTo(Byte value) {
            addCriterion("isVisible =", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleNotEqualTo(Byte value) {
            addCriterion("isVisible <>", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleGreaterThan(Byte value) {
            addCriterion("isVisible >", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleGreaterThanOrEqualTo(Byte value) {
            addCriterion("isVisible >=", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleLessThan(Byte value) {
            addCriterion("isVisible <", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleLessThanOrEqualTo(Byte value) {
            addCriterion("isVisible <=", value, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleIn(List<Byte> values) {
            addCriterion("isVisible in", values, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleNotIn(List<Byte> values) {
            addCriterion("isVisible not in", values, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleBetween(Byte value1, Byte value2) {
            addCriterion("isVisible between", value1, value2, "isvisible");
            return (Criteria) this;
        }

        public Criteria andIsvisibleNotBetween(Byte value1, Byte value2) {
            addCriterion("isVisible not between", value1, value2, "isvisible");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andLastentertimeIsNull() {
            addCriterion("lastEnterTime is null");
            return (Criteria) this;
        }

        public Criteria andLastentertimeIsNotNull() {
            addCriterion("lastEnterTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastentertimeEqualTo(Integer value) {
            addCriterion("lastEnterTime =", value, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeNotEqualTo(Integer value) {
            addCriterion("lastEnterTime <>", value, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeGreaterThan(Integer value) {
            addCriterion("lastEnterTime >", value, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastEnterTime >=", value, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeLessThan(Integer value) {
            addCriterion("lastEnterTime <", value, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastEnterTime <=", value, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeIn(List<Integer> values) {
            addCriterion("lastEnterTime in", values, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeNotIn(List<Integer> values) {
            addCriterion("lastEnterTime not in", values, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeBetween(Integer value1, Integer value2) {
            addCriterion("lastEnterTime between", value1, value2, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andLastentertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastEnterTime not between", value1, value2, "lastentertime");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedIsNull() {
            addCriterion("isNotified is null");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedIsNotNull() {
            addCriterion("isNotified is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedEqualTo(Integer value) {
            addCriterion("isNotified =", value, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedNotEqualTo(Integer value) {
            addCriterion("isNotified <>", value, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedGreaterThan(Integer value) {
            addCriterion("isNotified >", value, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isNotified >=", value, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedLessThan(Integer value) {
            addCriterion("isNotified <", value, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedLessThanOrEqualTo(Integer value) {
            addCriterion("isNotified <=", value, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedIn(List<Integer> values) {
            addCriterion("isNotified in", values, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedNotIn(List<Integer> values) {
            addCriterion("isNotified not in", values, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedBetween(Integer value1, Integer value2) {
            addCriterion("isNotified between", value1, value2, "isnotified");
            return (Criteria) this;
        }

        public Criteria andIsnotifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("isNotified not between", value1, value2, "isnotified");
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