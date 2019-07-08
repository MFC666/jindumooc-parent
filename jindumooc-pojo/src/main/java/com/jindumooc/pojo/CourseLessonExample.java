package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseLessonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseLessonExample() {
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

        public Criteria andChapteridIsNull() {
            addCriterion("chapterId is null");
            return (Criteria) this;
        }

        public Criteria andChapteridIsNotNull() {
            addCriterion("chapterId is not null");
            return (Criteria) this;
        }

        public Criteria andChapteridEqualTo(Integer value) {
            addCriterion("chapterId =", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotEqualTo(Integer value) {
            addCriterion("chapterId <>", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThan(Integer value) {
            addCriterion("chapterId >", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterId >=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThan(Integer value) {
            addCriterion("chapterId <", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThanOrEqualTo(Integer value) {
            addCriterion("chapterId <=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridIn(List<Integer> values) {
            addCriterion("chapterId in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotIn(List<Integer> values) {
            addCriterion("chapterId not in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridBetween(Integer value1, Integer value2) {
            addCriterion("chapterId between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterId not between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(Byte value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(Byte value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(Byte value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(Byte value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(Byte value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(Byte value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<Byte> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<Byte> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(Byte value1, Byte value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(Byte value1, Byte value2) {
            addCriterion("free not between", value1, value2, "free");
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

        public Criteria andGivecreditIsNull() {
            addCriterion("giveCredit is null");
            return (Criteria) this;
        }

        public Criteria andGivecreditIsNotNull() {
            addCriterion("giveCredit is not null");
            return (Criteria) this;
        }

        public Criteria andGivecreditEqualTo(Integer value) {
            addCriterion("giveCredit =", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotEqualTo(Integer value) {
            addCriterion("giveCredit <>", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditGreaterThan(Integer value) {
            addCriterion("giveCredit >", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("giveCredit >=", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditLessThan(Integer value) {
            addCriterion("giveCredit <", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditLessThanOrEqualTo(Integer value) {
            addCriterion("giveCredit <=", value, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditIn(List<Integer> values) {
            addCriterion("giveCredit in", values, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotIn(List<Integer> values) {
            addCriterion("giveCredit not in", values, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditBetween(Integer value1, Integer value2) {
            addCriterion("giveCredit between", value1, value2, "givecredit");
            return (Criteria) this;
        }

        public Criteria andGivecreditNotBetween(Integer value1, Integer value2) {
            addCriterion("giveCredit not between", value1, value2, "givecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditIsNull() {
            addCriterion("requireCredit is null");
            return (Criteria) this;
        }

        public Criteria andRequirecreditIsNotNull() {
            addCriterion("requireCredit is not null");
            return (Criteria) this;
        }

        public Criteria andRequirecreditEqualTo(Integer value) {
            addCriterion("requireCredit =", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditNotEqualTo(Integer value) {
            addCriterion("requireCredit <>", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditGreaterThan(Integer value) {
            addCriterion("requireCredit >", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("requireCredit >=", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditLessThan(Integer value) {
            addCriterion("requireCredit <", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditLessThanOrEqualTo(Integer value) {
            addCriterion("requireCredit <=", value, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditIn(List<Integer> values) {
            addCriterion("requireCredit in", values, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditNotIn(List<Integer> values) {
            addCriterion("requireCredit not in", values, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditBetween(Integer value1, Integer value2) {
            addCriterion("requireCredit between", value1, value2, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andRequirecreditNotBetween(Integer value1, Integer value2) {
            addCriterion("requireCredit not between", value1, value2, "requirecredit");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNull() {
            addCriterion("mediaId is null");
            return (Criteria) this;
        }

        public Criteria andMediaidIsNotNull() {
            addCriterion("mediaId is not null");
            return (Criteria) this;
        }

        public Criteria andMediaidEqualTo(Integer value) {
            addCriterion("mediaId =", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotEqualTo(Integer value) {
            addCriterion("mediaId <>", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThan(Integer value) {
            addCriterion("mediaId >", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mediaId >=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThan(Integer value) {
            addCriterion("mediaId <", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidLessThanOrEqualTo(Integer value) {
            addCriterion("mediaId <=", value, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidIn(List<Integer> values) {
            addCriterion("mediaId in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotIn(List<Integer> values) {
            addCriterion("mediaId not in", values, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidBetween(Integer value1, Integer value2) {
            addCriterion("mediaId between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediaidNotBetween(Integer value1, Integer value2) {
            addCriterion("mediaId not between", value1, value2, "mediaid");
            return (Criteria) this;
        }

        public Criteria andMediasourceIsNull() {
            addCriterion("mediaSource is null");
            return (Criteria) this;
        }

        public Criteria andMediasourceIsNotNull() {
            addCriterion("mediaSource is not null");
            return (Criteria) this;
        }

        public Criteria andMediasourceEqualTo(String value) {
            addCriterion("mediaSource =", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotEqualTo(String value) {
            addCriterion("mediaSource <>", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceGreaterThan(String value) {
            addCriterion("mediaSource >", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceGreaterThanOrEqualTo(String value) {
            addCriterion("mediaSource >=", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceLessThan(String value) {
            addCriterion("mediaSource <", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceLessThanOrEqualTo(String value) {
            addCriterion("mediaSource <=", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceLike(String value) {
            addCriterion("mediaSource like", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotLike(String value) {
            addCriterion("mediaSource not like", value, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceIn(List<String> values) {
            addCriterion("mediaSource in", values, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotIn(List<String> values) {
            addCriterion("mediaSource not in", values, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceBetween(String value1, String value2) {
            addCriterion("mediaSource between", value1, value2, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMediasourceNotBetween(String value1, String value2) {
            addCriterion("mediaSource not between", value1, value2, "mediasource");
            return (Criteria) this;
        }

        public Criteria andMedianameIsNull() {
            addCriterion("mediaName is null");
            return (Criteria) this;
        }

        public Criteria andMedianameIsNotNull() {
            addCriterion("mediaName is not null");
            return (Criteria) this;
        }

        public Criteria andMedianameEqualTo(String value) {
            addCriterion("mediaName =", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotEqualTo(String value) {
            addCriterion("mediaName <>", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameGreaterThan(String value) {
            addCriterion("mediaName >", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameGreaterThanOrEqualTo(String value) {
            addCriterion("mediaName >=", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameLessThan(String value) {
            addCriterion("mediaName <", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameLessThanOrEqualTo(String value) {
            addCriterion("mediaName <=", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameLike(String value) {
            addCriterion("mediaName like", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotLike(String value) {
            addCriterion("mediaName not like", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameIn(List<String> values) {
            addCriterion("mediaName in", values, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotIn(List<String> values) {
            addCriterion("mediaName not in", values, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameBetween(String value1, String value2) {
            addCriterion("mediaName between", value1, value2, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotBetween(String value1, String value2) {
            addCriterion("mediaName not between", value1, value2, "medianame");
            return (Criteria) this;
        }

        public Criteria andHomeworkidIsNull() {
            addCriterion("homeworkId is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkidIsNotNull() {
            addCriterion("homeworkId is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkidEqualTo(Integer value) {
            addCriterion("homeworkId =", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidNotEqualTo(Integer value) {
            addCriterion("homeworkId <>", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidGreaterThan(Integer value) {
            addCriterion("homeworkId >", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeworkId >=", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidLessThan(Integer value) {
            addCriterion("homeworkId <", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidLessThanOrEqualTo(Integer value) {
            addCriterion("homeworkId <=", value, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidIn(List<Integer> values) {
            addCriterion("homeworkId in", values, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidNotIn(List<Integer> values) {
            addCriterion("homeworkId not in", values, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidBetween(Integer value1, Integer value2) {
            addCriterion("homeworkId between", value1, value2, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andHomeworkidNotBetween(Integer value1, Integer value2) {
            addCriterion("homeworkId not between", value1, value2, "homeworkid");
            return (Criteria) this;
        }

        public Criteria andExerciseidIsNull() {
            addCriterion("exerciseId is null");
            return (Criteria) this;
        }

        public Criteria andExerciseidIsNotNull() {
            addCriterion("exerciseId is not null");
            return (Criteria) this;
        }

        public Criteria andExerciseidEqualTo(Integer value) {
            addCriterion("exerciseId =", value, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidNotEqualTo(Integer value) {
            addCriterion("exerciseId <>", value, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidGreaterThan(Integer value) {
            addCriterion("exerciseId >", value, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("exerciseId >=", value, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidLessThan(Integer value) {
            addCriterion("exerciseId <", value, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidLessThanOrEqualTo(Integer value) {
            addCriterion("exerciseId <=", value, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidIn(List<Integer> values) {
            addCriterion("exerciseId in", values, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidNotIn(List<Integer> values) {
            addCriterion("exerciseId not in", values, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidBetween(Integer value1, Integer value2) {
            addCriterion("exerciseId between", value1, value2, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andExerciseidNotBetween(Integer value1, Integer value2) {
            addCriterion("exerciseId not between", value1, value2, "exerciseid");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNull() {
            addCriterion("materialNum is null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIsNotNull() {
            addCriterion("materialNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialnumEqualTo(Integer value) {
            addCriterion("materialNum =", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotEqualTo(Integer value) {
            addCriterion("materialNum <>", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThan(Integer value) {
            addCriterion("materialNum >", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("materialNum >=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThan(Integer value) {
            addCriterion("materialNum <", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumLessThanOrEqualTo(Integer value) {
            addCriterion("materialNum <=", value, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumIn(List<Integer> values) {
            addCriterion("materialNum in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotIn(List<Integer> values) {
            addCriterion("materialNum not in", values, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumBetween(Integer value1, Integer value2) {
            addCriterion("materialNum between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andMaterialnumNotBetween(Integer value1, Integer value2) {
            addCriterion("materialNum not between", value1, value2, "materialnum");
            return (Criteria) this;
        }

        public Criteria andQuiznumIsNull() {
            addCriterion("quizNum is null");
            return (Criteria) this;
        }

        public Criteria andQuiznumIsNotNull() {
            addCriterion("quizNum is not null");
            return (Criteria) this;
        }

        public Criteria andQuiznumEqualTo(Integer value) {
            addCriterion("quizNum =", value, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumNotEqualTo(Integer value) {
            addCriterion("quizNum <>", value, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumGreaterThan(Integer value) {
            addCriterion("quizNum >", value, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumGreaterThanOrEqualTo(Integer value) {
            addCriterion("quizNum >=", value, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumLessThan(Integer value) {
            addCriterion("quizNum <", value, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumLessThanOrEqualTo(Integer value) {
            addCriterion("quizNum <=", value, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumIn(List<Integer> values) {
            addCriterion("quizNum in", values, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumNotIn(List<Integer> values) {
            addCriterion("quizNum not in", values, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumBetween(Integer value1, Integer value2) {
            addCriterion("quizNum between", value1, value2, "quiznum");
            return (Criteria) this;
        }

        public Criteria andQuiznumNotBetween(Integer value1, Integer value2) {
            addCriterion("quizNum not between", value1, value2, "quiznum");
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

        public Criteria andViewednumIsNull() {
            addCriterion("viewedNum is null");
            return (Criteria) this;
        }

        public Criteria andViewednumIsNotNull() {
            addCriterion("viewedNum is not null");
            return (Criteria) this;
        }

        public Criteria andViewednumEqualTo(Integer value) {
            addCriterion("viewedNum =", value, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumNotEqualTo(Integer value) {
            addCriterion("viewedNum <>", value, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumGreaterThan(Integer value) {
            addCriterion("viewedNum >", value, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewedNum >=", value, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumLessThan(Integer value) {
            addCriterion("viewedNum <", value, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumLessThanOrEqualTo(Integer value) {
            addCriterion("viewedNum <=", value, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumIn(List<Integer> values) {
            addCriterion("viewedNum in", values, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumNotIn(List<Integer> values) {
            addCriterion("viewedNum not in", values, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumBetween(Integer value1, Integer value2) {
            addCriterion("viewedNum between", value1, value2, "viewednum");
            return (Criteria) this;
        }

        public Criteria andViewednumNotBetween(Integer value1, Integer value2) {
            addCriterion("viewedNum not between", value1, value2, "viewednum");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Integer value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Integer value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Integer value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Integer value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Integer> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Integer> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
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

        public Criteria andMembernumIsNull() {
            addCriterion("memberNum is null");
            return (Criteria) this;
        }

        public Criteria andMembernumIsNotNull() {
            addCriterion("memberNum is not null");
            return (Criteria) this;
        }

        public Criteria andMembernumEqualTo(Integer value) {
            addCriterion("memberNum =", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumNotEqualTo(Integer value) {
            addCriterion("memberNum <>", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumGreaterThan(Integer value) {
            addCriterion("memberNum >", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberNum >=", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumLessThan(Integer value) {
            addCriterion("memberNum <", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumLessThanOrEqualTo(Integer value) {
            addCriterion("memberNum <=", value, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumIn(List<Integer> values) {
            addCriterion("memberNum in", values, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumNotIn(List<Integer> values) {
            addCriterion("memberNum not in", values, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumBetween(Integer value1, Integer value2) {
            addCriterion("memberNum between", value1, value2, "membernum");
            return (Criteria) this;
        }

        public Criteria andMembernumNotBetween(Integer value1, Integer value2) {
            addCriterion("memberNum not between", value1, value2, "membernum");
            return (Criteria) this;
        }

        public Criteria andReplaystatusIsNull() {
            addCriterion("replayStatus is null");
            return (Criteria) this;
        }

        public Criteria andReplaystatusIsNotNull() {
            addCriterion("replayStatus is not null");
            return (Criteria) this;
        }

        public Criteria andReplaystatusEqualTo(String value) {
            addCriterion("replayStatus =", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusNotEqualTo(String value) {
            addCriterion("replayStatus <>", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusGreaterThan(String value) {
            addCriterion("replayStatus >", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("replayStatus >=", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusLessThan(String value) {
            addCriterion("replayStatus <", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusLessThanOrEqualTo(String value) {
            addCriterion("replayStatus <=", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusLike(String value) {
            addCriterion("replayStatus like", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusNotLike(String value) {
            addCriterion("replayStatus not like", value, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusIn(List<String> values) {
            addCriterion("replayStatus in", values, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusNotIn(List<String> values) {
            addCriterion("replayStatus not in", values, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusBetween(String value1, String value2) {
            addCriterion("replayStatus between", value1, value2, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andReplaystatusNotBetween(String value1, String value2) {
            addCriterion("replayStatus not between", value1, value2, "replaystatus");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumIsNull() {
            addCriterion("maxOnlineNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumIsNotNull() {
            addCriterion("maxOnlineNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumEqualTo(Integer value) {
            addCriterion("maxOnlineNum =", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumNotEqualTo(Integer value) {
            addCriterion("maxOnlineNum <>", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumGreaterThan(Integer value) {
            addCriterion("maxOnlineNum >", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxOnlineNum >=", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumLessThan(Integer value) {
            addCriterion("maxOnlineNum <", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumLessThanOrEqualTo(Integer value) {
            addCriterion("maxOnlineNum <=", value, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumIn(List<Integer> values) {
            addCriterion("maxOnlineNum in", values, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumNotIn(List<Integer> values) {
            addCriterion("maxOnlineNum not in", values, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumBetween(Integer value1, Integer value2) {
            addCriterion("maxOnlineNum between", value1, value2, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andMaxonlinenumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxOnlineNum not between", value1, value2, "maxonlinenum");
            return (Criteria) this;
        }

        public Criteria andLiveproviderIsNull() {
            addCriterion("liveProvider is null");
            return (Criteria) this;
        }

        public Criteria andLiveproviderIsNotNull() {
            addCriterion("liveProvider is not null");
            return (Criteria) this;
        }

        public Criteria andLiveproviderEqualTo(Integer value) {
            addCriterion("liveProvider =", value, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderNotEqualTo(Integer value) {
            addCriterion("liveProvider <>", value, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderGreaterThan(Integer value) {
            addCriterion("liveProvider >", value, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderGreaterThanOrEqualTo(Integer value) {
            addCriterion("liveProvider >=", value, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderLessThan(Integer value) {
            addCriterion("liveProvider <", value, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderLessThanOrEqualTo(Integer value) {
            addCriterion("liveProvider <=", value, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderIn(List<Integer> values) {
            addCriterion("liveProvider in", values, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderNotIn(List<Integer> values) {
            addCriterion("liveProvider not in", values, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderBetween(Integer value1, Integer value2) {
            addCriterion("liveProvider between", value1, value2, "liveprovider");
            return (Criteria) this;
        }

        public Criteria andLiveproviderNotBetween(Integer value1, Integer value2) {
            addCriterion("liveProvider not between", value1, value2, "liveprovider");
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

        public Criteria andCopyidIsNull() {
            addCriterion("copyId is null");
            return (Criteria) this;
        }

        public Criteria andCopyidIsNotNull() {
            addCriterion("copyId is not null");
            return (Criteria) this;
        }

        public Criteria andCopyidEqualTo(Integer value) {
            addCriterion("copyId =", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotEqualTo(Integer value) {
            addCriterion("copyId <>", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidGreaterThan(Integer value) {
            addCriterion("copyId >", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("copyId >=", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidLessThan(Integer value) {
            addCriterion("copyId <", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidLessThanOrEqualTo(Integer value) {
            addCriterion("copyId <=", value, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidIn(List<Integer> values) {
            addCriterion("copyId in", values, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotIn(List<Integer> values) {
            addCriterion("copyId not in", values, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidBetween(Integer value1, Integer value2) {
            addCriterion("copyId between", value1, value2, "copyid");
            return (Criteria) this;
        }

        public Criteria andCopyidNotBetween(Integer value1, Integer value2) {
            addCriterion("copyId not between", value1, value2, "copyid");
            return (Criteria) this;
        }

        public Criteria andTestmodeIsNull() {
            addCriterion("testMode is null");
            return (Criteria) this;
        }

        public Criteria andTestmodeIsNotNull() {
            addCriterion("testMode is not null");
            return (Criteria) this;
        }

        public Criteria andTestmodeEqualTo(String value) {
            addCriterion("testMode =", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotEqualTo(String value) {
            addCriterion("testMode <>", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeGreaterThan(String value) {
            addCriterion("testMode >", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeGreaterThanOrEqualTo(String value) {
            addCriterion("testMode >=", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeLessThan(String value) {
            addCriterion("testMode <", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeLessThanOrEqualTo(String value) {
            addCriterion("testMode <=", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeLike(String value) {
            addCriterion("testMode like", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotLike(String value) {
            addCriterion("testMode not like", value, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeIn(List<String> values) {
            addCriterion("testMode in", values, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotIn(List<String> values) {
            addCriterion("testMode not in", values, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeBetween(String value1, String value2) {
            addCriterion("testMode between", value1, value2, "testmode");
            return (Criteria) this;
        }

        public Criteria andTestmodeNotBetween(String value1, String value2) {
            addCriterion("testMode not between", value1, value2, "testmode");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeIsNull() {
            addCriterion("testStartTime is null");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeIsNotNull() {
            addCriterion("testStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeEqualTo(Integer value) {
            addCriterion("testStartTime =", value, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeNotEqualTo(Integer value) {
            addCriterion("testStartTime <>", value, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeGreaterThan(Integer value) {
            addCriterion("testStartTime >", value, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("testStartTime >=", value, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeLessThan(Integer value) {
            addCriterion("testStartTime <", value, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("testStartTime <=", value, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeIn(List<Integer> values) {
            addCriterion("testStartTime in", values, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeNotIn(List<Integer> values) {
            addCriterion("testStartTime not in", values, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeBetween(Integer value1, Integer value2) {
            addCriterion("testStartTime between", value1, value2, "teststarttime");
            return (Criteria) this;
        }

        public Criteria andTeststarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("testStartTime not between", value1, value2, "teststarttime");
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