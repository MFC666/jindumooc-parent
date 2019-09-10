package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserProfileExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTruenameIsNull() {
            addCriterion("truename is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("truename is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("truename =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("truename <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("truename >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("truename >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("truename <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("truename <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("truename like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("truename not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("truename in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("truename not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("truename between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("truename not between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andIamIsNull() {
            addCriterion("iam is null");
            return (Criteria) this;
        }

        public Criteria andIamIsNotNull() {
            addCriterion("iam is not null");
            return (Criteria) this;
        }

        public Criteria andIamEqualTo(String value) {
            addCriterion("iam =", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamNotEqualTo(String value) {
            addCriterion("iam <>", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamGreaterThan(String value) {
            addCriterion("iam >", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamGreaterThanOrEqualTo(String value) {
            addCriterion("iam >=", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamLessThan(String value) {
            addCriterion("iam <", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamLessThanOrEqualTo(String value) {
            addCriterion("iam <=", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamLike(String value) {
            addCriterion("iam like", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamNotLike(String value) {
            addCriterion("iam not like", value, "iam");
            return (Criteria) this;
        }

        public Criteria andIamIn(List<String> values) {
            addCriterion("iam in", values, "iam");
            return (Criteria) this;
        }

        public Criteria andIamNotIn(List<String> values) {
            addCriterion("iam not in", values, "iam");
            return (Criteria) this;
        }

        public Criteria andIamBetween(String value1, String value2) {
            addCriterion("iam between", value1, value2, "iam");
            return (Criteria) this;
        }

        public Criteria andIamNotBetween(String value1, String value2) {
            addCriterion("iam not between", value1, value2, "iam");
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

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
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

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andWeiboIsNull() {
            addCriterion("weibo is null");
            return (Criteria) this;
        }

        public Criteria andWeiboIsNotNull() {
            addCriterion("weibo is not null");
            return (Criteria) this;
        }

        public Criteria andWeiboEqualTo(String value) {
            addCriterion("weibo =", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotEqualTo(String value) {
            addCriterion("weibo <>", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboGreaterThan(String value) {
            addCriterion("weibo >", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("weibo >=", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLessThan(String value) {
            addCriterion("weibo <", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLessThanOrEqualTo(String value) {
            addCriterion("weibo <=", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboLike(String value) {
            addCriterion("weibo like", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotLike(String value) {
            addCriterion("weibo not like", value, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboIn(List<String> values) {
            addCriterion("weibo in", values, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotIn(List<String> values) {
            addCriterion("weibo not in", values, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboBetween(String value1, String value2) {
            addCriterion("weibo between", value1, value2, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeiboNotBetween(String value1, String value2) {
            addCriterion("weibo not between", value1, value2, "weibo");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicIsNull() {
            addCriterion("isQQPublic is null");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicIsNotNull() {
            addCriterion("isQQPublic is not null");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicEqualTo(Integer value) {
            addCriterion("isQQPublic =", value, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicNotEqualTo(Integer value) {
            addCriterion("isQQPublic <>", value, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicGreaterThan(Integer value) {
            addCriterion("isQQPublic >", value, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("isQQPublic >=", value, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicLessThan(Integer value) {
            addCriterion("isQQPublic <", value, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicLessThanOrEqualTo(Integer value) {
            addCriterion("isQQPublic <=", value, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicIn(List<Integer> values) {
            addCriterion("isQQPublic in", values, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicNotIn(List<Integer> values) {
            addCriterion("isQQPublic not in", values, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicBetween(Integer value1, Integer value2) {
            addCriterion("isQQPublic between", value1, value2, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsqqpublicNotBetween(Integer value1, Integer value2) {
            addCriterion("isQQPublic not between", value1, value2, "isqqpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicIsNull() {
            addCriterion("isWeixinPublic is null");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicIsNotNull() {
            addCriterion("isWeixinPublic is not null");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicEqualTo(Integer value) {
            addCriterion("isWeixinPublic =", value, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicNotEqualTo(Integer value) {
            addCriterion("isWeixinPublic <>", value, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicGreaterThan(Integer value) {
            addCriterion("isWeixinPublic >", value, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("isWeixinPublic >=", value, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicLessThan(Integer value) {
            addCriterion("isWeixinPublic <", value, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicLessThanOrEqualTo(Integer value) {
            addCriterion("isWeixinPublic <=", value, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicIn(List<Integer> values) {
            addCriterion("isWeixinPublic in", values, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicNotIn(List<Integer> values) {
            addCriterion("isWeixinPublic not in", values, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicBetween(Integer value1, Integer value2) {
            addCriterion("isWeixinPublic between", value1, value2, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweixinpublicNotBetween(Integer value1, Integer value2) {
            addCriterion("isWeixinPublic not between", value1, value2, "isweixinpublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicIsNull() {
            addCriterion("isWeiboPublic is null");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicIsNotNull() {
            addCriterion("isWeiboPublic is not null");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicEqualTo(Integer value) {
            addCriterion("isWeiboPublic =", value, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicNotEqualTo(Integer value) {
            addCriterion("isWeiboPublic <>", value, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicGreaterThan(Integer value) {
            addCriterion("isWeiboPublic >", value, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicGreaterThanOrEqualTo(Integer value) {
            addCriterion("isWeiboPublic >=", value, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicLessThan(Integer value) {
            addCriterion("isWeiboPublic <", value, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicLessThanOrEqualTo(Integer value) {
            addCriterion("isWeiboPublic <=", value, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicIn(List<Integer> values) {
            addCriterion("isWeiboPublic in", values, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicNotIn(List<Integer> values) {
            addCriterion("isWeiboPublic not in", values, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicBetween(Integer value1, Integer value2) {
            addCriterion("isWeiboPublic between", value1, value2, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andIsweibopublicNotBetween(Integer value1, Integer value2) {
            addCriterion("isWeiboPublic not between", value1, value2, "isweibopublic");
            return (Criteria) this;
        }

        public Criteria andSiteIsNull() {
            addCriterion("site is null");
            return (Criteria) this;
        }

        public Criteria andSiteIsNotNull() {
            addCriterion("site is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEqualTo(String value) {
            addCriterion("site =", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotEqualTo(String value) {
            addCriterion("site <>", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThan(String value) {
            addCriterion("site >", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteGreaterThanOrEqualTo(String value) {
            addCriterion("site >=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThan(String value) {
            addCriterion("site <", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLessThanOrEqualTo(String value) {
            addCriterion("site <=", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteLike(String value) {
            addCriterion("site like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotLike(String value) {
            addCriterion("site not like", value, "site");
            return (Criteria) this;
        }

        public Criteria andSiteIn(List<String> values) {
            addCriterion("site in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotIn(List<String> values) {
            addCriterion("site not in", values, "site");
            return (Criteria) this;
        }

        public Criteria andSiteBetween(String value1, String value2) {
            addCriterion("site between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andSiteNotBetween(String value1, String value2) {
            addCriterion("site not between", value1, value2, "site");
            return (Criteria) this;
        }

        public Criteria andIntfield1IsNull() {
            addCriterion("intField1 is null");
            return (Criteria) this;
        }

        public Criteria andIntfield1IsNotNull() {
            addCriterion("intField1 is not null");
            return (Criteria) this;
        }

        public Criteria andIntfield1EqualTo(Integer value) {
            addCriterion("intField1 =", value, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1NotEqualTo(Integer value) {
            addCriterion("intField1 <>", value, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1GreaterThan(Integer value) {
            addCriterion("intField1 >", value, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1GreaterThanOrEqualTo(Integer value) {
            addCriterion("intField1 >=", value, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1LessThan(Integer value) {
            addCriterion("intField1 <", value, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1LessThanOrEqualTo(Integer value) {
            addCriterion("intField1 <=", value, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1In(List<Integer> values) {
            addCriterion("intField1 in", values, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1NotIn(List<Integer> values) {
            addCriterion("intField1 not in", values, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1Between(Integer value1, Integer value2) {
            addCriterion("intField1 between", value1, value2, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield1NotBetween(Integer value1, Integer value2) {
            addCriterion("intField1 not between", value1, value2, "intfield1");
            return (Criteria) this;
        }

        public Criteria andIntfield2IsNull() {
            addCriterion("intField2 is null");
            return (Criteria) this;
        }

        public Criteria andIntfield2IsNotNull() {
            addCriterion("intField2 is not null");
            return (Criteria) this;
        }

        public Criteria andIntfield2EqualTo(Integer value) {
            addCriterion("intField2 =", value, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2NotEqualTo(Integer value) {
            addCriterion("intField2 <>", value, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2GreaterThan(Integer value) {
            addCriterion("intField2 >", value, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2GreaterThanOrEqualTo(Integer value) {
            addCriterion("intField2 >=", value, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2LessThan(Integer value) {
            addCriterion("intField2 <", value, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2LessThanOrEqualTo(Integer value) {
            addCriterion("intField2 <=", value, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2In(List<Integer> values) {
            addCriterion("intField2 in", values, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2NotIn(List<Integer> values) {
            addCriterion("intField2 not in", values, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2Between(Integer value1, Integer value2) {
            addCriterion("intField2 between", value1, value2, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield2NotBetween(Integer value1, Integer value2) {
            addCriterion("intField2 not between", value1, value2, "intfield2");
            return (Criteria) this;
        }

        public Criteria andIntfield3IsNull() {
            addCriterion("intField3 is null");
            return (Criteria) this;
        }

        public Criteria andIntfield3IsNotNull() {
            addCriterion("intField3 is not null");
            return (Criteria) this;
        }

        public Criteria andIntfield3EqualTo(Integer value) {
            addCriterion("intField3 =", value, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3NotEqualTo(Integer value) {
            addCriterion("intField3 <>", value, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3GreaterThan(Integer value) {
            addCriterion("intField3 >", value, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3GreaterThanOrEqualTo(Integer value) {
            addCriterion("intField3 >=", value, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3LessThan(Integer value) {
            addCriterion("intField3 <", value, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3LessThanOrEqualTo(Integer value) {
            addCriterion("intField3 <=", value, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3In(List<Integer> values) {
            addCriterion("intField3 in", values, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3NotIn(List<Integer> values) {
            addCriterion("intField3 not in", values, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3Between(Integer value1, Integer value2) {
            addCriterion("intField3 between", value1, value2, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield3NotBetween(Integer value1, Integer value2) {
            addCriterion("intField3 not between", value1, value2, "intfield3");
            return (Criteria) this;
        }

        public Criteria andIntfield4IsNull() {
            addCriterion("intField4 is null");
            return (Criteria) this;
        }

        public Criteria andIntfield4IsNotNull() {
            addCriterion("intField4 is not null");
            return (Criteria) this;
        }

        public Criteria andIntfield4EqualTo(Integer value) {
            addCriterion("intField4 =", value, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4NotEqualTo(Integer value) {
            addCriterion("intField4 <>", value, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4GreaterThan(Integer value) {
            addCriterion("intField4 >", value, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4GreaterThanOrEqualTo(Integer value) {
            addCriterion("intField4 >=", value, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4LessThan(Integer value) {
            addCriterion("intField4 <", value, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4LessThanOrEqualTo(Integer value) {
            addCriterion("intField4 <=", value, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4In(List<Integer> values) {
            addCriterion("intField4 in", values, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4NotIn(List<Integer> values) {
            addCriterion("intField4 not in", values, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4Between(Integer value1, Integer value2) {
            addCriterion("intField4 between", value1, value2, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield4NotBetween(Integer value1, Integer value2) {
            addCriterion("intField4 not between", value1, value2, "intfield4");
            return (Criteria) this;
        }

        public Criteria andIntfield5IsNull() {
            addCriterion("intField5 is null");
            return (Criteria) this;
        }

        public Criteria andIntfield5IsNotNull() {
            addCriterion("intField5 is not null");
            return (Criteria) this;
        }

        public Criteria andIntfield5EqualTo(Integer value) {
            addCriterion("intField5 =", value, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5NotEqualTo(Integer value) {
            addCriterion("intField5 <>", value, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5GreaterThan(Integer value) {
            addCriterion("intField5 >", value, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5GreaterThanOrEqualTo(Integer value) {
            addCriterion("intField5 >=", value, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5LessThan(Integer value) {
            addCriterion("intField5 <", value, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5LessThanOrEqualTo(Integer value) {
            addCriterion("intField5 <=", value, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5In(List<Integer> values) {
            addCriterion("intField5 in", values, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5NotIn(List<Integer> values) {
            addCriterion("intField5 not in", values, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5Between(Integer value1, Integer value2) {
            addCriterion("intField5 between", value1, value2, "intfield5");
            return (Criteria) this;
        }

        public Criteria andIntfield5NotBetween(Integer value1, Integer value2) {
            addCriterion("intField5 not between", value1, value2, "intfield5");
            return (Criteria) this;
        }

        public Criteria andDatefield1IsNull() {
            addCriterion("dateField1 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield1IsNotNull() {
            addCriterion("dateField1 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield1EqualTo(Date value) {
            addCriterionForJDBCDate("dateField1 =", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotEqualTo(Date value) {
            addCriterionForJDBCDate("dateField1 <>", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1GreaterThan(Date value) {
            addCriterionForJDBCDate("dateField1 >", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField1 >=", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1LessThan(Date value) {
            addCriterionForJDBCDate("dateField1 <", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField1 <=", value, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1In(List<Date> values) {
            addCriterionForJDBCDate("dateField1 in", values, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotIn(List<Date> values) {
            addCriterionForJDBCDate("dateField1 not in", values, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1Between(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField1 between", value1, value2, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield1NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField1 not between", value1, value2, "datefield1");
            return (Criteria) this;
        }

        public Criteria andDatefield2IsNull() {
            addCriterion("dateField2 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield2IsNotNull() {
            addCriterion("dateField2 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield2EqualTo(Date value) {
            addCriterionForJDBCDate("dateField2 =", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotEqualTo(Date value) {
            addCriterionForJDBCDate("dateField2 <>", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2GreaterThan(Date value) {
            addCriterionForJDBCDate("dateField2 >", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField2 >=", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2LessThan(Date value) {
            addCriterionForJDBCDate("dateField2 <", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField2 <=", value, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2In(List<Date> values) {
            addCriterionForJDBCDate("dateField2 in", values, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotIn(List<Date> values) {
            addCriterionForJDBCDate("dateField2 not in", values, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2Between(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField2 between", value1, value2, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield2NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField2 not between", value1, value2, "datefield2");
            return (Criteria) this;
        }

        public Criteria andDatefield3IsNull() {
            addCriterion("dateField3 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield3IsNotNull() {
            addCriterion("dateField3 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield3EqualTo(Date value) {
            addCriterionForJDBCDate("dateField3 =", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotEqualTo(Date value) {
            addCriterionForJDBCDate("dateField3 <>", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3GreaterThan(Date value) {
            addCriterionForJDBCDate("dateField3 >", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField3 >=", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3LessThan(Date value) {
            addCriterionForJDBCDate("dateField3 <", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField3 <=", value, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3In(List<Date> values) {
            addCriterionForJDBCDate("dateField3 in", values, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotIn(List<Date> values) {
            addCriterionForJDBCDate("dateField3 not in", values, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3Between(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField3 between", value1, value2, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield3NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField3 not between", value1, value2, "datefield3");
            return (Criteria) this;
        }

        public Criteria andDatefield4IsNull() {
            addCriterion("dateField4 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield4IsNotNull() {
            addCriterion("dateField4 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield4EqualTo(Date value) {
            addCriterionForJDBCDate("dateField4 =", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotEqualTo(Date value) {
            addCriterionForJDBCDate("dateField4 <>", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4GreaterThan(Date value) {
            addCriterionForJDBCDate("dateField4 >", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField4 >=", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4LessThan(Date value) {
            addCriterionForJDBCDate("dateField4 <", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField4 <=", value, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4In(List<Date> values) {
            addCriterionForJDBCDate("dateField4 in", values, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotIn(List<Date> values) {
            addCriterionForJDBCDate("dateField4 not in", values, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4Between(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField4 between", value1, value2, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield4NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField4 not between", value1, value2, "datefield4");
            return (Criteria) this;
        }

        public Criteria andDatefield5IsNull() {
            addCriterion("dateField5 is null");
            return (Criteria) this;
        }

        public Criteria andDatefield5IsNotNull() {
            addCriterion("dateField5 is not null");
            return (Criteria) this;
        }

        public Criteria andDatefield5EqualTo(Date value) {
            addCriterionForJDBCDate("dateField5 =", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotEqualTo(Date value) {
            addCriterionForJDBCDate("dateField5 <>", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5GreaterThan(Date value) {
            addCriterionForJDBCDate("dateField5 >", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField5 >=", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5LessThan(Date value) {
            addCriterionForJDBCDate("dateField5 <", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dateField5 <=", value, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5In(List<Date> values) {
            addCriterionForJDBCDate("dateField5 in", values, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotIn(List<Date> values) {
            addCriterionForJDBCDate("dateField5 not in", values, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5Between(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField5 between", value1, value2, "datefield5");
            return (Criteria) this;
        }

        public Criteria andDatefield5NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dateField5 not between", value1, value2, "datefield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield1IsNull() {
            addCriterion("floatField1 is null");
            return (Criteria) this;
        }

        public Criteria andFloatfield1IsNotNull() {
            addCriterion("floatField1 is not null");
            return (Criteria) this;
        }

        public Criteria andFloatfield1EqualTo(Float value) {
            addCriterion("floatField1 =", value, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1NotEqualTo(Float value) {
            addCriterion("floatField1 <>", value, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1GreaterThan(Float value) {
            addCriterion("floatField1 >", value, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1GreaterThanOrEqualTo(Float value) {
            addCriterion("floatField1 >=", value, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1LessThan(Float value) {
            addCriterion("floatField1 <", value, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1LessThanOrEqualTo(Float value) {
            addCriterion("floatField1 <=", value, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1In(List<Float> values) {
            addCriterion("floatField1 in", values, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1NotIn(List<Float> values) {
            addCriterion("floatField1 not in", values, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1Between(Float value1, Float value2) {
            addCriterion("floatField1 between", value1, value2, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield1NotBetween(Float value1, Float value2) {
            addCriterion("floatField1 not between", value1, value2, "floatfield1");
            return (Criteria) this;
        }

        public Criteria andFloatfield2IsNull() {
            addCriterion("floatField2 is null");
            return (Criteria) this;
        }

        public Criteria andFloatfield2IsNotNull() {
            addCriterion("floatField2 is not null");
            return (Criteria) this;
        }

        public Criteria andFloatfield2EqualTo(Float value) {
            addCriterion("floatField2 =", value, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2NotEqualTo(Float value) {
            addCriterion("floatField2 <>", value, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2GreaterThan(Float value) {
            addCriterion("floatField2 >", value, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2GreaterThanOrEqualTo(Float value) {
            addCriterion("floatField2 >=", value, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2LessThan(Float value) {
            addCriterion("floatField2 <", value, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2LessThanOrEqualTo(Float value) {
            addCriterion("floatField2 <=", value, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2In(List<Float> values) {
            addCriterion("floatField2 in", values, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2NotIn(List<Float> values) {
            addCriterion("floatField2 not in", values, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2Between(Float value1, Float value2) {
            addCriterion("floatField2 between", value1, value2, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield2NotBetween(Float value1, Float value2) {
            addCriterion("floatField2 not between", value1, value2, "floatfield2");
            return (Criteria) this;
        }

        public Criteria andFloatfield3IsNull() {
            addCriterion("floatField3 is null");
            return (Criteria) this;
        }

        public Criteria andFloatfield3IsNotNull() {
            addCriterion("floatField3 is not null");
            return (Criteria) this;
        }

        public Criteria andFloatfield3EqualTo(Float value) {
            addCriterion("floatField3 =", value, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3NotEqualTo(Float value) {
            addCriterion("floatField3 <>", value, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3GreaterThan(Float value) {
            addCriterion("floatField3 >", value, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3GreaterThanOrEqualTo(Float value) {
            addCriterion("floatField3 >=", value, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3LessThan(Float value) {
            addCriterion("floatField3 <", value, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3LessThanOrEqualTo(Float value) {
            addCriterion("floatField3 <=", value, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3In(List<Float> values) {
            addCriterion("floatField3 in", values, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3NotIn(List<Float> values) {
            addCriterion("floatField3 not in", values, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3Between(Float value1, Float value2) {
            addCriterion("floatField3 between", value1, value2, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield3NotBetween(Float value1, Float value2) {
            addCriterion("floatField3 not between", value1, value2, "floatfield3");
            return (Criteria) this;
        }

        public Criteria andFloatfield4IsNull() {
            addCriterion("floatField4 is null");
            return (Criteria) this;
        }

        public Criteria andFloatfield4IsNotNull() {
            addCriterion("floatField4 is not null");
            return (Criteria) this;
        }

        public Criteria andFloatfield4EqualTo(Float value) {
            addCriterion("floatField4 =", value, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4NotEqualTo(Float value) {
            addCriterion("floatField4 <>", value, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4GreaterThan(Float value) {
            addCriterion("floatField4 >", value, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4GreaterThanOrEqualTo(Float value) {
            addCriterion("floatField4 >=", value, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4LessThan(Float value) {
            addCriterion("floatField4 <", value, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4LessThanOrEqualTo(Float value) {
            addCriterion("floatField4 <=", value, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4In(List<Float> values) {
            addCriterion("floatField4 in", values, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4NotIn(List<Float> values) {
            addCriterion("floatField4 not in", values, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4Between(Float value1, Float value2) {
            addCriterion("floatField4 between", value1, value2, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield4NotBetween(Float value1, Float value2) {
            addCriterion("floatField4 not between", value1, value2, "floatfield4");
            return (Criteria) this;
        }

        public Criteria andFloatfield5IsNull() {
            addCriterion("floatField5 is null");
            return (Criteria) this;
        }

        public Criteria andFloatfield5IsNotNull() {
            addCriterion("floatField5 is not null");
            return (Criteria) this;
        }

        public Criteria andFloatfield5EqualTo(Float value) {
            addCriterion("floatField5 =", value, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5NotEqualTo(Float value) {
            addCriterion("floatField5 <>", value, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5GreaterThan(Float value) {
            addCriterion("floatField5 >", value, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5GreaterThanOrEqualTo(Float value) {
            addCriterion("floatField5 >=", value, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5LessThan(Float value) {
            addCriterion("floatField5 <", value, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5LessThanOrEqualTo(Float value) {
            addCriterion("floatField5 <=", value, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5In(List<Float> values) {
            addCriterion("floatField5 in", values, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5NotIn(List<Float> values) {
            addCriterion("floatField5 not in", values, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5Between(Float value1, Float value2) {
            addCriterion("floatField5 between", value1, value2, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andFloatfield5NotBetween(Float value1, Float value2) {
            addCriterion("floatField5 not between", value1, value2, "floatfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1IsNull() {
            addCriterion("varcharField1 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1IsNotNull() {
            addCriterion("varcharField1 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1EqualTo(String value) {
            addCriterion("varcharField1 =", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1NotEqualTo(String value) {
            addCriterion("varcharField1 <>", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1GreaterThan(String value) {
            addCriterion("varcharField1 >", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField1 >=", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1LessThan(String value) {
            addCriterion("varcharField1 <", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1LessThanOrEqualTo(String value) {
            addCriterion("varcharField1 <=", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1Like(String value) {
            addCriterion("varcharField1 like", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1NotLike(String value) {
            addCriterion("varcharField1 not like", value, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1In(List<String> values) {
            addCriterion("varcharField1 in", values, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1NotIn(List<String> values) {
            addCriterion("varcharField1 not in", values, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1Between(String value1, String value2) {
            addCriterion("varcharField1 between", value1, value2, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield1NotBetween(String value1, String value2) {
            addCriterion("varcharField1 not between", value1, value2, "varcharfield1");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2IsNull() {
            addCriterion("varcharField2 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2IsNotNull() {
            addCriterion("varcharField2 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2EqualTo(String value) {
            addCriterion("varcharField2 =", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2NotEqualTo(String value) {
            addCriterion("varcharField2 <>", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2GreaterThan(String value) {
            addCriterion("varcharField2 >", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField2 >=", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2LessThan(String value) {
            addCriterion("varcharField2 <", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2LessThanOrEqualTo(String value) {
            addCriterion("varcharField2 <=", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2Like(String value) {
            addCriterion("varcharField2 like", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2NotLike(String value) {
            addCriterion("varcharField2 not like", value, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2In(List<String> values) {
            addCriterion("varcharField2 in", values, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2NotIn(List<String> values) {
            addCriterion("varcharField2 not in", values, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2Between(String value1, String value2) {
            addCriterion("varcharField2 between", value1, value2, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield2NotBetween(String value1, String value2) {
            addCriterion("varcharField2 not between", value1, value2, "varcharfield2");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3IsNull() {
            addCriterion("varcharField3 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3IsNotNull() {
            addCriterion("varcharField3 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3EqualTo(String value) {
            addCriterion("varcharField3 =", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3NotEqualTo(String value) {
            addCriterion("varcharField3 <>", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3GreaterThan(String value) {
            addCriterion("varcharField3 >", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField3 >=", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3LessThan(String value) {
            addCriterion("varcharField3 <", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3LessThanOrEqualTo(String value) {
            addCriterion("varcharField3 <=", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3Like(String value) {
            addCriterion("varcharField3 like", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3NotLike(String value) {
            addCriterion("varcharField3 not like", value, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3In(List<String> values) {
            addCriterion("varcharField3 in", values, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3NotIn(List<String> values) {
            addCriterion("varcharField3 not in", values, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3Between(String value1, String value2) {
            addCriterion("varcharField3 between", value1, value2, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield3NotBetween(String value1, String value2) {
            addCriterion("varcharField3 not between", value1, value2, "varcharfield3");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4IsNull() {
            addCriterion("varcharField4 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4IsNotNull() {
            addCriterion("varcharField4 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4EqualTo(String value) {
            addCriterion("varcharField4 =", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4NotEqualTo(String value) {
            addCriterion("varcharField4 <>", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4GreaterThan(String value) {
            addCriterion("varcharField4 >", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField4 >=", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4LessThan(String value) {
            addCriterion("varcharField4 <", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4LessThanOrEqualTo(String value) {
            addCriterion("varcharField4 <=", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4Like(String value) {
            addCriterion("varcharField4 like", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4NotLike(String value) {
            addCriterion("varcharField4 not like", value, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4In(List<String> values) {
            addCriterion("varcharField4 in", values, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4NotIn(List<String> values) {
            addCriterion("varcharField4 not in", values, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4Between(String value1, String value2) {
            addCriterion("varcharField4 between", value1, value2, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield4NotBetween(String value1, String value2) {
            addCriterion("varcharField4 not between", value1, value2, "varcharfield4");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5IsNull() {
            addCriterion("varcharField5 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5IsNotNull() {
            addCriterion("varcharField5 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5EqualTo(String value) {
            addCriterion("varcharField5 =", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5NotEqualTo(String value) {
            addCriterion("varcharField5 <>", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5GreaterThan(String value) {
            addCriterion("varcharField5 >", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField5 >=", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5LessThan(String value) {
            addCriterion("varcharField5 <", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5LessThanOrEqualTo(String value) {
            addCriterion("varcharField5 <=", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5Like(String value) {
            addCriterion("varcharField5 like", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5NotLike(String value) {
            addCriterion("varcharField5 not like", value, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5In(List<String> values) {
            addCriterion("varcharField5 in", values, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5NotIn(List<String> values) {
            addCriterion("varcharField5 not in", values, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5Between(String value1, String value2) {
            addCriterion("varcharField5 between", value1, value2, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield5NotBetween(String value1, String value2) {
            addCriterion("varcharField5 not between", value1, value2, "varcharfield5");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6IsNull() {
            addCriterion("varcharField6 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6IsNotNull() {
            addCriterion("varcharField6 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6EqualTo(String value) {
            addCriterion("varcharField6 =", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6NotEqualTo(String value) {
            addCriterion("varcharField6 <>", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6GreaterThan(String value) {
            addCriterion("varcharField6 >", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField6 >=", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6LessThan(String value) {
            addCriterion("varcharField6 <", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6LessThanOrEqualTo(String value) {
            addCriterion("varcharField6 <=", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6Like(String value) {
            addCriterion("varcharField6 like", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6NotLike(String value) {
            addCriterion("varcharField6 not like", value, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6In(List<String> values) {
            addCriterion("varcharField6 in", values, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6NotIn(List<String> values) {
            addCriterion("varcharField6 not in", values, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6Between(String value1, String value2) {
            addCriterion("varcharField6 between", value1, value2, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield6NotBetween(String value1, String value2) {
            addCriterion("varcharField6 not between", value1, value2, "varcharfield6");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7IsNull() {
            addCriterion("varcharField7 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7IsNotNull() {
            addCriterion("varcharField7 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7EqualTo(String value) {
            addCriterion("varcharField7 =", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7NotEqualTo(String value) {
            addCriterion("varcharField7 <>", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7GreaterThan(String value) {
            addCriterion("varcharField7 >", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField7 >=", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7LessThan(String value) {
            addCriterion("varcharField7 <", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7LessThanOrEqualTo(String value) {
            addCriterion("varcharField7 <=", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7Like(String value) {
            addCriterion("varcharField7 like", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7NotLike(String value) {
            addCriterion("varcharField7 not like", value, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7In(List<String> values) {
            addCriterion("varcharField7 in", values, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7NotIn(List<String> values) {
            addCriterion("varcharField7 not in", values, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7Between(String value1, String value2) {
            addCriterion("varcharField7 between", value1, value2, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield7NotBetween(String value1, String value2) {
            addCriterion("varcharField7 not between", value1, value2, "varcharfield7");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8IsNull() {
            addCriterion("varcharField8 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8IsNotNull() {
            addCriterion("varcharField8 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8EqualTo(String value) {
            addCriterion("varcharField8 =", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8NotEqualTo(String value) {
            addCriterion("varcharField8 <>", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8GreaterThan(String value) {
            addCriterion("varcharField8 >", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField8 >=", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8LessThan(String value) {
            addCriterion("varcharField8 <", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8LessThanOrEqualTo(String value) {
            addCriterion("varcharField8 <=", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8Like(String value) {
            addCriterion("varcharField8 like", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8NotLike(String value) {
            addCriterion("varcharField8 not like", value, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8In(List<String> values) {
            addCriterion("varcharField8 in", values, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8NotIn(List<String> values) {
            addCriterion("varcharField8 not in", values, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8Between(String value1, String value2) {
            addCriterion("varcharField8 between", value1, value2, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield8NotBetween(String value1, String value2) {
            addCriterion("varcharField8 not between", value1, value2, "varcharfield8");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9IsNull() {
            addCriterion("varcharField9 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9IsNotNull() {
            addCriterion("varcharField9 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9EqualTo(String value) {
            addCriterion("varcharField9 =", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9NotEqualTo(String value) {
            addCriterion("varcharField9 <>", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9GreaterThan(String value) {
            addCriterion("varcharField9 >", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField9 >=", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9LessThan(String value) {
            addCriterion("varcharField9 <", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9LessThanOrEqualTo(String value) {
            addCriterion("varcharField9 <=", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9Like(String value) {
            addCriterion("varcharField9 like", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9NotLike(String value) {
            addCriterion("varcharField9 not like", value, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9In(List<String> values) {
            addCriterion("varcharField9 in", values, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9NotIn(List<String> values) {
            addCriterion("varcharField9 not in", values, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9Between(String value1, String value2) {
            addCriterion("varcharField9 between", value1, value2, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield9NotBetween(String value1, String value2) {
            addCriterion("varcharField9 not between", value1, value2, "varcharfield9");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10IsNull() {
            addCriterion("varcharField10 is null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10IsNotNull() {
            addCriterion("varcharField10 is not null");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10EqualTo(String value) {
            addCriterion("varcharField10 =", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10NotEqualTo(String value) {
            addCriterion("varcharField10 <>", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10GreaterThan(String value) {
            addCriterion("varcharField10 >", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10GreaterThanOrEqualTo(String value) {
            addCriterion("varcharField10 >=", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10LessThan(String value) {
            addCriterion("varcharField10 <", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10LessThanOrEqualTo(String value) {
            addCriterion("varcharField10 <=", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10Like(String value) {
            addCriterion("varcharField10 like", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10NotLike(String value) {
            addCriterion("varcharField10 not like", value, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10In(List<String> values) {
            addCriterion("varcharField10 in", values, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10NotIn(List<String> values) {
            addCriterion("varcharField10 not in", values, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10Between(String value1, String value2) {
            addCriterion("varcharField10 between", value1, value2, "varcharfield10");
            return (Criteria) this;
        }

        public Criteria andVarcharfield10NotBetween(String value1, String value2) {
            addCriterion("varcharField10 not between", value1, value2, "varcharfield10");
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