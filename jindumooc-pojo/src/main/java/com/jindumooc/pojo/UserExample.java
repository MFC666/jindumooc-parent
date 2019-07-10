package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileIsNull() {
            addCriterion("verifiedMobile is null");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileIsNotNull() {
            addCriterion("verifiedMobile is not null");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileEqualTo(String value) {
            addCriterion("verifiedMobile =", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileNotEqualTo(String value) {
            addCriterion("verifiedMobile <>", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileGreaterThan(String value) {
            addCriterion("verifiedMobile >", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileGreaterThanOrEqualTo(String value) {
            addCriterion("verifiedMobile >=", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileLessThan(String value) {
            addCriterion("verifiedMobile <", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileLessThanOrEqualTo(String value) {
            addCriterion("verifiedMobile <=", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileLike(String value) {
            addCriterion("verifiedMobile like", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileNotLike(String value) {
            addCriterion("verifiedMobile not like", value, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileIn(List<String> values) {
            addCriterion("verifiedMobile in", values, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileNotIn(List<String> values) {
            addCriterion("verifiedMobile not in", values, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileBetween(String value1, String value2) {
            addCriterion("verifiedMobile between", value1, value2, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andVerifiedmobileNotBetween(String value1, String value2) {
            addCriterion("verifiedMobile not between", value1, value2, "verifiedmobile");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNull() {
            addCriterion("payPassword is null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIsNotNull() {
            addCriterion("payPassword is not null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordEqualTo(String value) {
            addCriterion("payPassword =", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotEqualTo(String value) {
            addCriterion("payPassword <>", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThan(String value) {
            addCriterion("payPassword >", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("payPassword >=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThan(String value) {
            addCriterion("payPassword <", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLessThanOrEqualTo(String value) {
            addCriterion("payPassword <=", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordLike(String value) {
            addCriterion("payPassword like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotLike(String value) {
            addCriterion("payPassword not like", value, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordIn(List<String> values) {
            addCriterion("payPassword in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotIn(List<String> values) {
            addCriterion("payPassword not in", values, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordBetween(String value1, String value2) {
            addCriterion("payPassword between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordNotBetween(String value1, String value2) {
            addCriterion("payPassword not between", value1, value2, "paypassword");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltIsNull() {
            addCriterion("payPasswordSalt is null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltIsNotNull() {
            addCriterion("payPasswordSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltEqualTo(String value) {
            addCriterion("payPasswordSalt =", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltNotEqualTo(String value) {
            addCriterion("payPasswordSalt <>", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltGreaterThan(String value) {
            addCriterion("payPasswordSalt >", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltGreaterThanOrEqualTo(String value) {
            addCriterion("payPasswordSalt >=", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltLessThan(String value) {
            addCriterion("payPasswordSalt <", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltLessThanOrEqualTo(String value) {
            addCriterion("payPasswordSalt <=", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltLike(String value) {
            addCriterion("payPasswordSalt like", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltNotLike(String value) {
            addCriterion("payPasswordSalt not like", value, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltIn(List<String> values) {
            addCriterion("payPasswordSalt in", values, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltNotIn(List<String> values) {
            addCriterion("payPasswordSalt not in", values, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltBetween(String value1, String value2) {
            addCriterion("payPasswordSalt between", value1, value2, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andPaypasswordsaltNotBetween(String value1, String value2) {
            addCriterion("payPasswordSalt not between", value1, value2, "paypasswordsalt");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNull() {
            addCriterion("locale is null");
            return (Criteria) this;
        }

        public Criteria andLocaleIsNotNull() {
            addCriterion("locale is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleEqualTo(String value) {
            addCriterion("locale =", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotEqualTo(String value) {
            addCriterion("locale <>", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThan(String value) {
            addCriterion("locale >", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("locale >=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThan(String value) {
            addCriterion("locale <", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLessThanOrEqualTo(String value) {
            addCriterion("locale <=", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleLike(String value) {
            addCriterion("locale like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotLike(String value) {
            addCriterion("locale not like", value, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleIn(List<String> values) {
            addCriterion("locale in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotIn(List<String> values) {
            addCriterion("locale not in", values, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleBetween(String value1, String value2) {
            addCriterion("locale between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andLocaleNotBetween(String value1, String value2) {
            addCriterion("locale not between", value1, value2, "locale");
            return (Criteria) this;
        }

        public Criteria andUriIsNull() {
            addCriterion("uri is null");
            return (Criteria) this;
        }

        public Criteria andUriIsNotNull() {
            addCriterion("uri is not null");
            return (Criteria) this;
        }

        public Criteria andUriEqualTo(String value) {
            addCriterion("uri =", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotEqualTo(String value) {
            addCriterion("uri <>", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThan(String value) {
            addCriterion("uri >", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriGreaterThanOrEqualTo(String value) {
            addCriterion("uri >=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThan(String value) {
            addCriterion("uri <", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLessThanOrEqualTo(String value) {
            addCriterion("uri <=", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriLike(String value) {
            addCriterion("uri like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotLike(String value) {
            addCriterion("uri not like", value, "uri");
            return (Criteria) this;
        }

        public Criteria andUriIn(List<String> values) {
            addCriterion("uri in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotIn(List<String> values) {
            addCriterion("uri not in", values, "uri");
            return (Criteria) this;
        }

        public Criteria andUriBetween(String value1, String value2) {
            addCriterion("uri between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andUriNotBetween(String value1, String value2) {
            addCriterion("uri not between", value1, value2, "uri");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andCoinIsNull() {
            addCriterion("coin is null");
            return (Criteria) this;
        }

        public Criteria andCoinIsNotNull() {
            addCriterion("coin is not null");
            return (Criteria) this;
        }

        public Criteria andCoinEqualTo(Integer value) {
            addCriterion("coin =", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotEqualTo(Integer value) {
            addCriterion("coin <>", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThan(Integer value) {
            addCriterion("coin >", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("coin >=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThan(Integer value) {
            addCriterion("coin <", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinLessThanOrEqualTo(Integer value) {
            addCriterion("coin <=", value, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinIn(List<Integer> values) {
            addCriterion("coin in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotIn(List<Integer> values) {
            addCriterion("coin not in", values, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinBetween(Integer value1, Integer value2) {
            addCriterion("coin between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("coin not between", value1, value2, "coin");
            return (Criteria) this;
        }

        public Criteria andSmallavatarIsNull() {
            addCriterion("smallAvatar is null");
            return (Criteria) this;
        }

        public Criteria andSmallavatarIsNotNull() {
            addCriterion("smallAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andSmallavatarEqualTo(String value) {
            addCriterion("smallAvatar =", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarNotEqualTo(String value) {
            addCriterion("smallAvatar <>", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarGreaterThan(String value) {
            addCriterion("smallAvatar >", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarGreaterThanOrEqualTo(String value) {
            addCriterion("smallAvatar >=", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarLessThan(String value) {
            addCriterion("smallAvatar <", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarLessThanOrEqualTo(String value) {
            addCriterion("smallAvatar <=", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarLike(String value) {
            addCriterion("smallAvatar like", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarNotLike(String value) {
            addCriterion("smallAvatar not like", value, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarIn(List<String> values) {
            addCriterion("smallAvatar in", values, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarNotIn(List<String> values) {
            addCriterion("smallAvatar not in", values, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarBetween(String value1, String value2) {
            addCriterion("smallAvatar between", value1, value2, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andSmallavatarNotBetween(String value1, String value2) {
            addCriterion("smallAvatar not between", value1, value2, "smallavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarIsNull() {
            addCriterion("mediumAvatar is null");
            return (Criteria) this;
        }

        public Criteria andMediumavatarIsNotNull() {
            addCriterion("mediumAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andMediumavatarEqualTo(String value) {
            addCriterion("mediumAvatar =", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarNotEqualTo(String value) {
            addCriterion("mediumAvatar <>", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarGreaterThan(String value) {
            addCriterion("mediumAvatar >", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarGreaterThanOrEqualTo(String value) {
            addCriterion("mediumAvatar >=", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarLessThan(String value) {
            addCriterion("mediumAvatar <", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarLessThanOrEqualTo(String value) {
            addCriterion("mediumAvatar <=", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarLike(String value) {
            addCriterion("mediumAvatar like", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarNotLike(String value) {
            addCriterion("mediumAvatar not like", value, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarIn(List<String> values) {
            addCriterion("mediumAvatar in", values, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarNotIn(List<String> values) {
            addCriterion("mediumAvatar not in", values, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarBetween(String value1, String value2) {
            addCriterion("mediumAvatar between", value1, value2, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andMediumavatarNotBetween(String value1, String value2) {
            addCriterion("mediumAvatar not between", value1, value2, "mediumavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarIsNull() {
            addCriterion("largeAvatar is null");
            return (Criteria) this;
        }

        public Criteria andLargeavatarIsNotNull() {
            addCriterion("largeAvatar is not null");
            return (Criteria) this;
        }

        public Criteria andLargeavatarEqualTo(String value) {
            addCriterion("largeAvatar =", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarNotEqualTo(String value) {
            addCriterion("largeAvatar <>", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarGreaterThan(String value) {
            addCriterion("largeAvatar >", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarGreaterThanOrEqualTo(String value) {
            addCriterion("largeAvatar >=", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarLessThan(String value) {
            addCriterion("largeAvatar <", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarLessThanOrEqualTo(String value) {
            addCriterion("largeAvatar <=", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarLike(String value) {
            addCriterion("largeAvatar like", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarNotLike(String value) {
            addCriterion("largeAvatar not like", value, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarIn(List<String> values) {
            addCriterion("largeAvatar in", values, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarNotIn(List<String> values) {
            addCriterion("largeAvatar not in", values, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarBetween(String value1, String value2) {
            addCriterion("largeAvatar between", value1, value2, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andLargeavatarNotBetween(String value1, String value2) {
            addCriterion("largeAvatar not between", value1, value2, "largeavatar");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedIsNull() {
            addCriterion("emailVerified is null");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedIsNotNull() {
            addCriterion("emailVerified is not null");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedEqualTo(Boolean value) {
            addCriterion("emailVerified =", value, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedNotEqualTo(Boolean value) {
            addCriterion("emailVerified <>", value, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedGreaterThan(Boolean value) {
            addCriterion("emailVerified >", value, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("emailVerified >=", value, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedLessThan(Boolean value) {
            addCriterion("emailVerified <", value, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("emailVerified <=", value, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedIn(List<Boolean> values) {
            addCriterion("emailVerified in", values, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedNotIn(List<Boolean> values) {
            addCriterion("emailVerified not in", values, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("emailVerified between", value1, value2, "emailverified");
            return (Criteria) this;
        }

        public Criteria andEmailverifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("emailVerified not between", value1, value2, "emailverified");
            return (Criteria) this;
        }

        public Criteria andSetupIsNull() {
            addCriterion("setup is null");
            return (Criteria) this;
        }

        public Criteria andSetupIsNotNull() {
            addCriterion("setup is not null");
            return (Criteria) this;
        }

        public Criteria andSetupEqualTo(Byte value) {
            addCriterion("setup =", value, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupNotEqualTo(Byte value) {
            addCriterion("setup <>", value, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupGreaterThan(Byte value) {
            addCriterion("setup >", value, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupGreaterThanOrEqualTo(Byte value) {
            addCriterion("setup >=", value, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupLessThan(Byte value) {
            addCriterion("setup <", value, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupLessThanOrEqualTo(Byte value) {
            addCriterion("setup <=", value, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupIn(List<Byte> values) {
            addCriterion("setup in", values, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupNotIn(List<Byte> values) {
            addCriterion("setup not in", values, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupBetween(Byte value1, Byte value2) {
            addCriterion("setup between", value1, value2, "setup");
            return (Criteria) this;
        }

        public Criteria andSetupNotBetween(Byte value1, Byte value2) {
            addCriterion("setup not between", value1, value2, "setup");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("roles is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("roles is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(String value) {
            addCriterion("roles =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(String value) {
            addCriterion("roles <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(String value) {
            addCriterion("roles >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(String value) {
            addCriterion("roles >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(String value) {
            addCriterion("roles <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(String value) {
            addCriterion("roles <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLike(String value) {
            addCriterion("roles like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotLike(String value) {
            addCriterion("roles not like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<String> values) {
            addCriterion("roles in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<String> values) {
            addCriterion("roles not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(String value1, String value2) {
            addCriterion("roles between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(String value1, String value2) {
            addCriterion("roles not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andPromotedIsNull() {
            addCriterion("promoted is null");
            return (Criteria) this;
        }

        public Criteria andPromotedIsNotNull() {
            addCriterion("promoted is not null");
            return (Criteria) this;
        }

        public Criteria andPromotedEqualTo(Byte value) {
            addCriterion("promoted =", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedNotEqualTo(Byte value) {
            addCriterion("promoted <>", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedGreaterThan(Byte value) {
            addCriterion("promoted >", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedGreaterThanOrEqualTo(Byte value) {
            addCriterion("promoted >=", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedLessThan(Byte value) {
            addCriterion("promoted <", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedLessThanOrEqualTo(Byte value) {
            addCriterion("promoted <=", value, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedIn(List<Byte> values) {
            addCriterion("promoted in", values, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedNotIn(List<Byte> values) {
            addCriterion("promoted not in", values, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedBetween(Byte value1, Byte value2) {
            addCriterion("promoted between", value1, value2, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedNotBetween(Byte value1, Byte value2) {
            addCriterion("promoted not between", value1, value2, "promoted");
            return (Criteria) this;
        }

        public Criteria andPromotedseqIsNull() {
            addCriterion("promotedSeq is null");
            return (Criteria) this;
        }

        public Criteria andPromotedseqIsNotNull() {
            addCriterion("promotedSeq is not null");
            return (Criteria) this;
        }

        public Criteria andPromotedseqEqualTo(Integer value) {
            addCriterion("promotedSeq =", value, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqNotEqualTo(Integer value) {
            addCriterion("promotedSeq <>", value, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqGreaterThan(Integer value) {
            addCriterion("promotedSeq >", value, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotedSeq >=", value, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqLessThan(Integer value) {
            addCriterion("promotedSeq <", value, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqLessThanOrEqualTo(Integer value) {
            addCriterion("promotedSeq <=", value, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqIn(List<Integer> values) {
            addCriterion("promotedSeq in", values, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqNotIn(List<Integer> values) {
            addCriterion("promotedSeq not in", values, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqBetween(Integer value1, Integer value2) {
            addCriterion("promotedSeq between", value1, value2, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedseqNotBetween(Integer value1, Integer value2) {
            addCriterion("promotedSeq not between", value1, value2, "promotedseq");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeIsNull() {
            addCriterion("promotedTime is null");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeIsNotNull() {
            addCriterion("promotedTime is not null");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeEqualTo(Integer value) {
            addCriterion("promotedTime =", value, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeNotEqualTo(Integer value) {
            addCriterion("promotedTime <>", value, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeGreaterThan(Integer value) {
            addCriterion("promotedTime >", value, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotedTime >=", value, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeLessThan(Integer value) {
            addCriterion("promotedTime <", value, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("promotedTime <=", value, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeIn(List<Integer> values) {
            addCriterion("promotedTime in", values, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeNotIn(List<Integer> values) {
            addCriterion("promotedTime not in", values, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeBetween(Integer value1, Integer value2) {
            addCriterion("promotedTime between", value1, value2, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andPromotedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("promotedTime not between", value1, value2, "promotedtime");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Byte value) {
            addCriterion("locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Byte value) {
            addCriterion("locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Byte value) {
            addCriterion("locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Byte value) {
            addCriterion("locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Byte value) {
            addCriterion("locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Byte> values) {
            addCriterion("locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Byte> values) {
            addCriterion("locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Byte value1, Byte value2) {
            addCriterion("locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineIsNull() {
            addCriterion("lockDeadline is null");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineIsNotNull() {
            addCriterion("lockDeadline is not null");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineEqualTo(Integer value) {
            addCriterion("lockDeadline =", value, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineNotEqualTo(Integer value) {
            addCriterion("lockDeadline <>", value, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineGreaterThan(Integer value) {
            addCriterion("lockDeadline >", value, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockDeadline >=", value, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineLessThan(Integer value) {
            addCriterion("lockDeadline <", value, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("lockDeadline <=", value, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineIn(List<Integer> values) {
            addCriterion("lockDeadline in", values, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineNotIn(List<Integer> values) {
            addCriterion("lockDeadline not in", values, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineBetween(Integer value1, Integer value2) {
            addCriterion("lockDeadline between", value1, value2, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andLockdeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("lockDeadline not between", value1, value2, "lockdeadline");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesIsNull() {
            addCriterion("consecutivePasswordErrorTimes is null");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesIsNotNull() {
            addCriterion("consecutivePasswordErrorTimes is not null");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesEqualTo(Integer value) {
            addCriterion("consecutivePasswordErrorTimes =", value, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesNotEqualTo(Integer value) {
            addCriterion("consecutivePasswordErrorTimes <>", value, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesGreaterThan(Integer value) {
            addCriterion("consecutivePasswordErrorTimes >", value, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("consecutivePasswordErrorTimes >=", value, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesLessThan(Integer value) {
            addCriterion("consecutivePasswordErrorTimes <", value, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesLessThanOrEqualTo(Integer value) {
            addCriterion("consecutivePasswordErrorTimes <=", value, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesIn(List<Integer> values) {
            addCriterion("consecutivePasswordErrorTimes in", values, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesNotIn(List<Integer> values) {
            addCriterion("consecutivePasswordErrorTimes not in", values, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesBetween(Integer value1, Integer value2) {
            addCriterion("consecutivePasswordErrorTimes between", value1, value2, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andConsecutivepassworderrortimesNotBetween(Integer value1, Integer value2) {
            addCriterion("consecutivePasswordErrorTimes not between", value1, value2, "consecutivepassworderrortimes");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeIsNull() {
            addCriterion("lastPasswordFailTime is null");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeIsNotNull() {
            addCriterion("lastPasswordFailTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeEqualTo(Integer value) {
            addCriterion("lastPasswordFailTime =", value, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeNotEqualTo(Integer value) {
            addCriterion("lastPasswordFailTime <>", value, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeGreaterThan(Integer value) {
            addCriterion("lastPasswordFailTime >", value, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastPasswordFailTime >=", value, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeLessThan(Integer value) {
            addCriterion("lastPasswordFailTime <", value, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeLessThanOrEqualTo(Integer value) {
            addCriterion("lastPasswordFailTime <=", value, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeIn(List<Integer> values) {
            addCriterion("lastPasswordFailTime in", values, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeNotIn(List<Integer> values) {
            addCriterion("lastPasswordFailTime not in", values, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeBetween(Integer value1, Integer value2) {
            addCriterion("lastPasswordFailTime between", value1, value2, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLastpasswordfailtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("lastPasswordFailTime not between", value1, value2, "lastpasswordfailtime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Integer value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Integer value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Integer value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Integer value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Integer value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Integer> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Integer> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Integer value1, Integer value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNull() {
            addCriterion("loginIp is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIp is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIp =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIp <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIp >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIp >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIp <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIp <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIp like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIp not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIp in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIp not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIp between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIp not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidIsNull() {
            addCriterion("loginSessionId is null");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidIsNotNull() {
            addCriterion("loginSessionId is not null");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidEqualTo(String value) {
            addCriterion("loginSessionId =", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidNotEqualTo(String value) {
            addCriterion("loginSessionId <>", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidGreaterThan(String value) {
            addCriterion("loginSessionId >", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidGreaterThanOrEqualTo(String value) {
            addCriterion("loginSessionId >=", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidLessThan(String value) {
            addCriterion("loginSessionId <", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidLessThanOrEqualTo(String value) {
            addCriterion("loginSessionId <=", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidLike(String value) {
            addCriterion("loginSessionId like", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidNotLike(String value) {
            addCriterion("loginSessionId not like", value, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidIn(List<String> values) {
            addCriterion("loginSessionId in", values, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidNotIn(List<String> values) {
            addCriterion("loginSessionId not in", values, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidBetween(String value1, String value2) {
            addCriterion("loginSessionId between", value1, value2, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andLoginsessionidNotBetween(String value1, String value2) {
            addCriterion("loginSessionId not between", value1, value2, "loginsessionid");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIsNull() {
            addCriterion("approvalTime is null");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIsNotNull() {
            addCriterion("approvalTime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeEqualTo(Integer value) {
            addCriterion("approvalTime =", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotEqualTo(Integer value) {
            addCriterion("approvalTime <>", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeGreaterThan(Integer value) {
            addCriterion("approvalTime >", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("approvalTime >=", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLessThan(Integer value) {
            addCriterion("approvalTime <", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("approvalTime <=", value, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeIn(List<Integer> values) {
            addCriterion("approvalTime in", values, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotIn(List<Integer> values) {
            addCriterion("approvalTime not in", values, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeBetween(Integer value1, Integer value2) {
            addCriterion("approvalTime between", value1, value2, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("approvalTime not between", value1, value2, "approvaltime");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIsNull() {
            addCriterion("approvalStatus is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIsNotNull() {
            addCriterion("approvalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusEqualTo(String value) {
            addCriterion("approvalStatus =", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotEqualTo(String value) {
            addCriterion("approvalStatus <>", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusGreaterThan(String value) {
            addCriterion("approvalStatus >", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("approvalStatus >=", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLessThan(String value) {
            addCriterion("approvalStatus <", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLessThanOrEqualTo(String value) {
            addCriterion("approvalStatus <=", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLike(String value) {
            addCriterion("approvalStatus like", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotLike(String value) {
            addCriterion("approvalStatus not like", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIn(List<String> values) {
            addCriterion("approvalStatus in", values, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotIn(List<String> values) {
            addCriterion("approvalStatus not in", values, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusBetween(String value1, String value2) {
            addCriterion("approvalStatus between", value1, value2, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotBetween(String value1, String value2) {
            addCriterion("approvalStatus not between", value1, value2, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumIsNull() {
            addCriterion("newMessageNum is null");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumIsNotNull() {
            addCriterion("newMessageNum is not null");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumEqualTo(Integer value) {
            addCriterion("newMessageNum =", value, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumNotEqualTo(Integer value) {
            addCriterion("newMessageNum <>", value, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumGreaterThan(Integer value) {
            addCriterion("newMessageNum >", value, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("newMessageNum >=", value, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumLessThan(Integer value) {
            addCriterion("newMessageNum <", value, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumLessThanOrEqualTo(Integer value) {
            addCriterion("newMessageNum <=", value, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumIn(List<Integer> values) {
            addCriterion("newMessageNum in", values, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumNotIn(List<Integer> values) {
            addCriterion("newMessageNum not in", values, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumBetween(Integer value1, Integer value2) {
            addCriterion("newMessageNum between", value1, value2, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewmessagenumNotBetween(Integer value1, Integer value2) {
            addCriterion("newMessageNum not between", value1, value2, "newmessagenum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumIsNull() {
            addCriterion("newNotificationNum is null");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumIsNotNull() {
            addCriterion("newNotificationNum is not null");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumEqualTo(Integer value) {
            addCriterion("newNotificationNum =", value, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumNotEqualTo(Integer value) {
            addCriterion("newNotificationNum <>", value, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumGreaterThan(Integer value) {
            addCriterion("newNotificationNum >", value, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("newNotificationNum >=", value, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumLessThan(Integer value) {
            addCriterion("newNotificationNum <", value, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumLessThanOrEqualTo(Integer value) {
            addCriterion("newNotificationNum <=", value, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumIn(List<Integer> values) {
            addCriterion("newNotificationNum in", values, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumNotIn(List<Integer> values) {
            addCriterion("newNotificationNum not in", values, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumBetween(Integer value1, Integer value2) {
            addCriterion("newNotificationNum between", value1, value2, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andNewnotificationnumNotBetween(Integer value1, Integer value2) {
            addCriterion("newNotificationNum not between", value1, value2, "newnotificationnum");
            return (Criteria) this;
        }

        public Criteria andCreatedipIsNull() {
            addCriterion("createdIp is null");
            return (Criteria) this;
        }

        public Criteria andCreatedipIsNotNull() {
            addCriterion("createdIp is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedipEqualTo(String value) {
            addCriterion("createdIp =", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipNotEqualTo(String value) {
            addCriterion("createdIp <>", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipGreaterThan(String value) {
            addCriterion("createdIp >", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipGreaterThanOrEqualTo(String value) {
            addCriterion("createdIp >=", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipLessThan(String value) {
            addCriterion("createdIp <", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipLessThanOrEqualTo(String value) {
            addCriterion("createdIp <=", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipLike(String value) {
            addCriterion("createdIp like", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipNotLike(String value) {
            addCriterion("createdIp not like", value, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipIn(List<String> values) {
            addCriterion("createdIp in", values, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipNotIn(List<String> values) {
            addCriterion("createdIp not in", values, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipBetween(String value1, String value2) {
            addCriterion("createdIp between", value1, value2, "createdip");
            return (Criteria) this;
        }

        public Criteria andCreatedipNotBetween(String value1, String value2) {
            addCriterion("createdIp not between", value1, value2, "createdip");
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

        public Criteria andInvitecodeIsNull() {
            addCriterion("inviteCode is null");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIsNotNull() {
            addCriterion("inviteCode is not null");
            return (Criteria) this;
        }

        public Criteria andInvitecodeEqualTo(String value) {
            addCriterion("inviteCode =", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotEqualTo(String value) {
            addCriterion("inviteCode <>", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThan(String value) {
            addCriterion("inviteCode >", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeGreaterThanOrEqualTo(String value) {
            addCriterion("inviteCode >=", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThan(String value) {
            addCriterion("inviteCode <", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLessThanOrEqualTo(String value) {
            addCriterion("inviteCode <=", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeLike(String value) {
            addCriterion("inviteCode like", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotLike(String value) {
            addCriterion("inviteCode not like", value, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeIn(List<String> values) {
            addCriterion("inviteCode in", values, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotIn(List<String> values) {
            addCriterion("inviteCode not in", values, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeBetween(String value1, String value2) {
            addCriterion("inviteCode between", value1, value2, "invitecode");
            return (Criteria) this;
        }

        public Criteria andInvitecodeNotBetween(String value1, String value2) {
            addCriterion("inviteCode not between", value1, value2, "invitecode");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgId is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgId is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("orgId =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("orgId <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("orgId >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgId >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("orgId <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("orgId <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("orgId in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("orgId not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("orgId between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("orgId not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("orgCode is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("orgCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("orgCode =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("orgCode <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("orgCode >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgCode >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("orgCode <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("orgCode <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("orgCode like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("orgCode not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("orgCode in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("orgCode not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("orgCode between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("orgCode not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayIsNull() {
            addCriterion("registeredWay is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayIsNotNull() {
            addCriterion("registeredWay is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayEqualTo(String value) {
            addCriterion("registeredWay =", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayNotEqualTo(String value) {
            addCriterion("registeredWay <>", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayGreaterThan(String value) {
            addCriterion("registeredWay >", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayGreaterThanOrEqualTo(String value) {
            addCriterion("registeredWay >=", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayLessThan(String value) {
            addCriterion("registeredWay <", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayLessThanOrEqualTo(String value) {
            addCriterion("registeredWay <=", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayLike(String value) {
            addCriterion("registeredWay like", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayNotLike(String value) {
            addCriterion("registeredWay not like", value, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayIn(List<String> values) {
            addCriterion("registeredWay in", values, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayNotIn(List<String> values) {
            addCriterion("registeredWay not in", values, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayBetween(String value1, String value2) {
            addCriterion("registeredWay between", value1, value2, "registeredway");
            return (Criteria) this;
        }

        public Criteria andRegisteredwayNotBetween(String value1, String value2) {
            addCriterion("registeredWay not between", value1, value2, "registeredway");
            return (Criteria) this;
        }

        public Criteria andDistributortokenIsNull() {
            addCriterion("distributorToken is null");
            return (Criteria) this;
        }

        public Criteria andDistributortokenIsNotNull() {
            addCriterion("distributorToken is not null");
            return (Criteria) this;
        }

        public Criteria andDistributortokenEqualTo(String value) {
            addCriterion("distributorToken =", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenNotEqualTo(String value) {
            addCriterion("distributorToken <>", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenGreaterThan(String value) {
            addCriterion("distributorToken >", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenGreaterThanOrEqualTo(String value) {
            addCriterion("distributorToken >=", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenLessThan(String value) {
            addCriterion("distributorToken <", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenLessThanOrEqualTo(String value) {
            addCriterion("distributorToken <=", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenLike(String value) {
            addCriterion("distributorToken like", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenNotLike(String value) {
            addCriterion("distributorToken not like", value, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenIn(List<String> values) {
            addCriterion("distributorToken in", values, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenNotIn(List<String> values) {
            addCriterion("distributorToken not in", values, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenBetween(String value1, String value2) {
            addCriterion("distributorToken between", value1, value2, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andDistributortokenNotBetween(String value1, String value2) {
            addCriterion("distributorToken not between", value1, value2, "distributortoken");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andPasswordinitIsNull() {
            addCriterion("passwordInit is null");
            return (Criteria) this;
        }

        public Criteria andPasswordinitIsNotNull() {
            addCriterion("passwordInit is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordinitEqualTo(Boolean value) {
            addCriterion("passwordInit =", value, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitNotEqualTo(Boolean value) {
            addCriterion("passwordInit <>", value, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitGreaterThan(Boolean value) {
            addCriterion("passwordInit >", value, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("passwordInit >=", value, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitLessThan(Boolean value) {
            addCriterion("passwordInit <", value, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitLessThanOrEqualTo(Boolean value) {
            addCriterion("passwordInit <=", value, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitIn(List<Boolean> values) {
            addCriterion("passwordInit in", values, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitNotIn(List<Boolean> values) {
            addCriterion("passwordInit not in", values, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitBetween(Boolean value1, Boolean value2) {
            addCriterion("passwordInit between", value1, value2, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andPasswordinitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("passwordInit not between", value1, value2, "passwordinit");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
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