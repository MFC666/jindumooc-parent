package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestpaperResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestpaperResultExample() {
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

        public Criteria andPapernameIsNull() {
            addCriterion("paperName is null");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNotNull() {
            addCriterion("paperName is not null");
            return (Criteria) this;
        }

        public Criteria andPapernameEqualTo(String value) {
            addCriterion("paperName =", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotEqualTo(String value) {
            addCriterion("paperName <>", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThan(String value) {
            addCriterion("paperName >", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThanOrEqualTo(String value) {
            addCriterion("paperName >=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThan(String value) {
            addCriterion("paperName <", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThanOrEqualTo(String value) {
            addCriterion("paperName <=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLike(String value) {
            addCriterion("paperName like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotLike(String value) {
            addCriterion("paperName not like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameIn(List<String> values) {
            addCriterion("paperName in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotIn(List<String> values) {
            addCriterion("paperName not in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameBetween(String value1, String value2) {
            addCriterion("paperName between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotBetween(String value1, String value2) {
            addCriterion("paperName not between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andTestidIsNull() {
            addCriterion("testId is null");
            return (Criteria) this;
        }

        public Criteria andTestidIsNotNull() {
            addCriterion("testId is not null");
            return (Criteria) this;
        }

        public Criteria andTestidEqualTo(Integer value) {
            addCriterion("testId =", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotEqualTo(Integer value) {
            addCriterion("testId <>", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThan(Integer value) {
            addCriterion("testId >", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testId >=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThan(Integer value) {
            addCriterion("testId <", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidLessThanOrEqualTo(Integer value) {
            addCriterion("testId <=", value, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidIn(List<Integer> values) {
            addCriterion("testId in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotIn(List<Integer> values) {
            addCriterion("testId not in", values, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidBetween(Integer value1, Integer value2) {
            addCriterion("testId between", value1, value2, "testid");
            return (Criteria) this;
        }

        public Criteria andTestidNotBetween(Integer value1, Integer value2) {
            addCriterion("testId not between", value1, value2, "testid");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Float value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Float value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Float value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Float value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Float value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Float> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Float> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Float value1, Float value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Float value1, Float value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreIsNull() {
            addCriterion("objectiveScore is null");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreIsNotNull() {
            addCriterion("objectiveScore is not null");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreEqualTo(Float value) {
            addCriterion("objectiveScore =", value, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreNotEqualTo(Float value) {
            addCriterion("objectiveScore <>", value, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreGreaterThan(Float value) {
            addCriterion("objectiveScore >", value, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreGreaterThanOrEqualTo(Float value) {
            addCriterion("objectiveScore >=", value, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreLessThan(Float value) {
            addCriterion("objectiveScore <", value, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreLessThanOrEqualTo(Float value) {
            addCriterion("objectiveScore <=", value, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreIn(List<Float> values) {
            addCriterion("objectiveScore in", values, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreNotIn(List<Float> values) {
            addCriterion("objectiveScore not in", values, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreBetween(Float value1, Float value2) {
            addCriterion("objectiveScore between", value1, value2, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andObjectivescoreNotBetween(Float value1, Float value2) {
            addCriterion("objectiveScore not between", value1, value2, "objectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreIsNull() {
            addCriterion("subjectiveScore is null");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreIsNotNull() {
            addCriterion("subjectiveScore is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreEqualTo(Float value) {
            addCriterion("subjectiveScore =", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreNotEqualTo(Float value) {
            addCriterion("subjectiveScore <>", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreGreaterThan(Float value) {
            addCriterion("subjectiveScore >", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreGreaterThanOrEqualTo(Float value) {
            addCriterion("subjectiveScore >=", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreLessThan(Float value) {
            addCriterion("subjectiveScore <", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreLessThanOrEqualTo(Float value) {
            addCriterion("subjectiveScore <=", value, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreIn(List<Float> values) {
            addCriterion("subjectiveScore in", values, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreNotIn(List<Float> values) {
            addCriterion("subjectiveScore not in", values, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreBetween(Float value1, Float value2) {
            addCriterion("subjectiveScore between", value1, value2, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andSubjectivescoreNotBetween(Float value1, Float value2) {
            addCriterion("subjectiveScore not between", value1, value2, "subjectivescore");
            return (Criteria) this;
        }

        public Criteria andRightitemcountIsNull() {
            addCriterion("rightItemCount is null");
            return (Criteria) this;
        }

        public Criteria andRightitemcountIsNotNull() {
            addCriterion("rightItemCount is not null");
            return (Criteria) this;
        }

        public Criteria andRightitemcountEqualTo(Integer value) {
            addCriterion("rightItemCount =", value, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountNotEqualTo(Integer value) {
            addCriterion("rightItemCount <>", value, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountGreaterThan(Integer value) {
            addCriterion("rightItemCount >", value, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rightItemCount >=", value, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountLessThan(Integer value) {
            addCriterion("rightItemCount <", value, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountLessThanOrEqualTo(Integer value) {
            addCriterion("rightItemCount <=", value, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountIn(List<Integer> values) {
            addCriterion("rightItemCount in", values, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountNotIn(List<Integer> values) {
            addCriterion("rightItemCount not in", values, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountBetween(Integer value1, Integer value2) {
            addCriterion("rightItemCount between", value1, value2, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andRightitemcountNotBetween(Integer value1, Integer value2) {
            addCriterion("rightItemCount not between", value1, value2, "rightitemcount");
            return (Criteria) this;
        }

        public Criteria andPassedstatusIsNull() {
            addCriterion("passedStatus is null");
            return (Criteria) this;
        }

        public Criteria andPassedstatusIsNotNull() {
            addCriterion("passedStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPassedstatusEqualTo(String value) {
            addCriterion("passedStatus =", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusNotEqualTo(String value) {
            addCriterion("passedStatus <>", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusGreaterThan(String value) {
            addCriterion("passedStatus >", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusGreaterThanOrEqualTo(String value) {
            addCriterion("passedStatus >=", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusLessThan(String value) {
            addCriterion("passedStatus <", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusLessThanOrEqualTo(String value) {
            addCriterion("passedStatus <=", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusLike(String value) {
            addCriterion("passedStatus like", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusNotLike(String value) {
            addCriterion("passedStatus not like", value, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusIn(List<String> values) {
            addCriterion("passedStatus in", values, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusNotIn(List<String> values) {
            addCriterion("passedStatus not in", values, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusBetween(String value1, String value2) {
            addCriterion("passedStatus between", value1, value2, "passedstatus");
            return (Criteria) this;
        }

        public Criteria andPassedstatusNotBetween(String value1, String value2) {
            addCriterion("passedStatus not between", value1, value2, "passedstatus");
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

        public Criteria andBegintimeIsNull() {
            addCriterion("beginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("beginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Integer value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Integer value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Integer value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Integer value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Integer value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Integer> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Integer> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Integer value1, Integer value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Integer value1, Integer value2) {
            addCriterion("beginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active not between", value1, value2, "active");
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

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridIsNull() {
            addCriterion("checkTeacherId is null");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridIsNotNull() {
            addCriterion("checkTeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridEqualTo(Integer value) {
            addCriterion("checkTeacherId =", value, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridNotEqualTo(Integer value) {
            addCriterion("checkTeacherId <>", value, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridGreaterThan(Integer value) {
            addCriterion("checkTeacherId >", value, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkTeacherId >=", value, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridLessThan(Integer value) {
            addCriterion("checkTeacherId <", value, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("checkTeacherId <=", value, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridIn(List<Integer> values) {
            addCriterion("checkTeacherId in", values, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridNotIn(List<Integer> values) {
            addCriterion("checkTeacherId not in", values, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridBetween(Integer value1, Integer value2) {
            addCriterion("checkTeacherId between", value1, value2, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("checkTeacherId not between", value1, value2, "checkteacherid");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeIsNull() {
            addCriterion("checkedTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeIsNotNull() {
            addCriterion("checkedTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeEqualTo(Integer value) {
            addCriterion("checkedTime =", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotEqualTo(Integer value) {
            addCriterion("checkedTime <>", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeGreaterThan(Integer value) {
            addCriterion("checkedTime >", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkedTime >=", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeLessThan(Integer value) {
            addCriterion("checkedTime <", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("checkedTime <=", value, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeIn(List<Integer> values) {
            addCriterion("checkedTime in", values, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotIn(List<Integer> values) {
            addCriterion("checkedTime not in", values, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeBetween(Integer value1, Integer value2) {
            addCriterion("checkedTime between", value1, value2, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andCheckedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("checkedTime not between", value1, value2, "checkedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNull() {
            addCriterion("usedTime is null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIsNotNull() {
            addCriterion("usedTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsedtimeEqualTo(Integer value) {
            addCriterion("usedTime =", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotEqualTo(Integer value) {
            addCriterion("usedTime <>", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThan(Integer value) {
            addCriterion("usedTime >", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usedTime >=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThan(Integer value) {
            addCriterion("usedTime <", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("usedTime <=", value, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeIn(List<Integer> values) {
            addCriterion("usedTime in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotIn(List<Integer> values) {
            addCriterion("usedTime not in", values, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeBetween(Integer value1, Integer value2) {
            addCriterion("usedTime between", value1, value2, "usedtime");
            return (Criteria) this;
        }

        public Criteria andUsedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("usedTime not between", value1, value2, "usedtime");
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