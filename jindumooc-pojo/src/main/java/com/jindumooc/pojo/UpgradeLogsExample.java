package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UpgradeLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UpgradeLogsExample() {
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

        public Criteria andRemoteidIsNull() {
            addCriterion("remoteId is null");
            return (Criteria) this;
        }

        public Criteria andRemoteidIsNotNull() {
            addCriterion("remoteId is not null");
            return (Criteria) this;
        }

        public Criteria andRemoteidEqualTo(Integer value) {
            addCriterion("remoteId =", value, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidNotEqualTo(Integer value) {
            addCriterion("remoteId <>", value, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidGreaterThan(Integer value) {
            addCriterion("remoteId >", value, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("remoteId >=", value, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidLessThan(Integer value) {
            addCriterion("remoteId <", value, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidLessThanOrEqualTo(Integer value) {
            addCriterion("remoteId <=", value, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidIn(List<Integer> values) {
            addCriterion("remoteId in", values, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidNotIn(List<Integer> values) {
            addCriterion("remoteId not in", values, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidBetween(Integer value1, Integer value2) {
            addCriterion("remoteId between", value1, value2, "remoteid");
            return (Criteria) this;
        }

        public Criteria andRemoteidNotBetween(Integer value1, Integer value2) {
            addCriterion("remoteId not between", value1, value2, "remoteid");
            return (Criteria) this;
        }

        public Criteria andInstalledidIsNull() {
            addCriterion("installedId is null");
            return (Criteria) this;
        }

        public Criteria andInstalledidIsNotNull() {
            addCriterion("installedId is not null");
            return (Criteria) this;
        }

        public Criteria andInstalledidEqualTo(Integer value) {
            addCriterion("installedId =", value, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidNotEqualTo(Integer value) {
            addCriterion("installedId <>", value, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidGreaterThan(Integer value) {
            addCriterion("installedId >", value, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidGreaterThanOrEqualTo(Integer value) {
            addCriterion("installedId >=", value, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidLessThan(Integer value) {
            addCriterion("installedId <", value, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidLessThanOrEqualTo(Integer value) {
            addCriterion("installedId <=", value, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidIn(List<Integer> values) {
            addCriterion("installedId in", values, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidNotIn(List<Integer> values) {
            addCriterion("installedId not in", values, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidBetween(Integer value1, Integer value2) {
            addCriterion("installedId between", value1, value2, "installedid");
            return (Criteria) this;
        }

        public Criteria andInstalledidNotBetween(Integer value1, Integer value2) {
            addCriterion("installedId not between", value1, value2, "installedid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andFromvIsNull() {
            addCriterion("fromv is null");
            return (Criteria) this;
        }

        public Criteria andFromvIsNotNull() {
            addCriterion("fromv is not null");
            return (Criteria) this;
        }

        public Criteria andFromvEqualTo(String value) {
            addCriterion("fromv =", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvNotEqualTo(String value) {
            addCriterion("fromv <>", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvGreaterThan(String value) {
            addCriterion("fromv >", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvGreaterThanOrEqualTo(String value) {
            addCriterion("fromv >=", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvLessThan(String value) {
            addCriterion("fromv <", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvLessThanOrEqualTo(String value) {
            addCriterion("fromv <=", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvLike(String value) {
            addCriterion("fromv like", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvNotLike(String value) {
            addCriterion("fromv not like", value, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvIn(List<String> values) {
            addCriterion("fromv in", values, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvNotIn(List<String> values) {
            addCriterion("fromv not in", values, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvBetween(String value1, String value2) {
            addCriterion("fromv between", value1, value2, "fromv");
            return (Criteria) this;
        }

        public Criteria andFromvNotBetween(String value1, String value2) {
            addCriterion("fromv not between", value1, value2, "fromv");
            return (Criteria) this;
        }

        public Criteria andTovIsNull() {
            addCriterion("tov is null");
            return (Criteria) this;
        }

        public Criteria andTovIsNotNull() {
            addCriterion("tov is not null");
            return (Criteria) this;
        }

        public Criteria andTovEqualTo(String value) {
            addCriterion("tov =", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovNotEqualTo(String value) {
            addCriterion("tov <>", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovGreaterThan(String value) {
            addCriterion("tov >", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovGreaterThanOrEqualTo(String value) {
            addCriterion("tov >=", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovLessThan(String value) {
            addCriterion("tov <", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovLessThanOrEqualTo(String value) {
            addCriterion("tov <=", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovLike(String value) {
            addCriterion("tov like", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovNotLike(String value) {
            addCriterion("tov not like", value, "tov");
            return (Criteria) this;
        }

        public Criteria andTovIn(List<String> values) {
            addCriterion("tov in", values, "tov");
            return (Criteria) this;
        }

        public Criteria andTovNotIn(List<String> values) {
            addCriterion("tov not in", values, "tov");
            return (Criteria) this;
        }

        public Criteria andTovBetween(String value1, String value2) {
            addCriterion("tov between", value1, value2, "tov");
            return (Criteria) this;
        }

        public Criteria andTovNotBetween(String value1, String value2) {
            addCriterion("tov not between", value1, value2, "tov");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andLogtimeIsNull() {
            addCriterion("logtime is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("logtime is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(Integer value) {
            addCriterion("logtime =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(Integer value) {
            addCriterion("logtime <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(Integer value) {
            addCriterion("logtime >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("logtime >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(Integer value) {
            addCriterion("logtime <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(Integer value) {
            addCriterion("logtime <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<Integer> values) {
            addCriterion("logtime in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<Integer> values) {
            addCriterion("logtime not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(Integer value1, Integer value2) {
            addCriterion("logtime between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("logtime not between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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