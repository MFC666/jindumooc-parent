package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassroomExample() {
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

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(Integer value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(Integer value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(Integer value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(Integer value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<Integer> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<Integer> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
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

        public Criteria andViplevelidIsNull() {
            addCriterion("vipLevelId is null");
            return (Criteria) this;
        }

        public Criteria andViplevelidIsNotNull() {
            addCriterion("vipLevelId is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelidEqualTo(Integer value) {
            addCriterion("vipLevelId =", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotEqualTo(Integer value) {
            addCriterion("vipLevelId <>", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidGreaterThan(Integer value) {
            addCriterion("vipLevelId >", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipLevelId >=", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidLessThan(Integer value) {
            addCriterion("vipLevelId <", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidLessThanOrEqualTo(Integer value) {
            addCriterion("vipLevelId <=", value, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidIn(List<Integer> values) {
            addCriterion("vipLevelId in", values, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotIn(List<Integer> values) {
            addCriterion("vipLevelId not in", values, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidBetween(Integer value1, Integer value2) {
            addCriterion("vipLevelId between", value1, value2, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andViplevelidNotBetween(Integer value1, Integer value2) {
            addCriterion("vipLevelId not between", value1, value2, "viplevelid");
            return (Criteria) this;
        }

        public Criteria andSmallpictureIsNull() {
            addCriterion("smallPicture is null");
            return (Criteria) this;
        }

        public Criteria andSmallpictureIsNotNull() {
            addCriterion("smallPicture is not null");
            return (Criteria) this;
        }

        public Criteria andSmallpictureEqualTo(String value) {
            addCriterion("smallPicture =", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotEqualTo(String value) {
            addCriterion("smallPicture <>", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureGreaterThan(String value) {
            addCriterion("smallPicture >", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureGreaterThanOrEqualTo(String value) {
            addCriterion("smallPicture >=", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureLessThan(String value) {
            addCriterion("smallPicture <", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureLessThanOrEqualTo(String value) {
            addCriterion("smallPicture <=", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureLike(String value) {
            addCriterion("smallPicture like", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotLike(String value) {
            addCriterion("smallPicture not like", value, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureIn(List<String> values) {
            addCriterion("smallPicture in", values, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotIn(List<String> values) {
            addCriterion("smallPicture not in", values, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureBetween(String value1, String value2) {
            addCriterion("smallPicture between", value1, value2, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andSmallpictureNotBetween(String value1, String value2) {
            addCriterion("smallPicture not between", value1, value2, "smallpicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureIsNull() {
            addCriterion("middlePicture is null");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureIsNotNull() {
            addCriterion("middlePicture is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureEqualTo(String value) {
            addCriterion("middlePicture =", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotEqualTo(String value) {
            addCriterion("middlePicture <>", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureGreaterThan(String value) {
            addCriterion("middlePicture >", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureGreaterThanOrEqualTo(String value) {
            addCriterion("middlePicture >=", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureLessThan(String value) {
            addCriterion("middlePicture <", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureLessThanOrEqualTo(String value) {
            addCriterion("middlePicture <=", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureLike(String value) {
            addCriterion("middlePicture like", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotLike(String value) {
            addCriterion("middlePicture not like", value, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureIn(List<String> values) {
            addCriterion("middlePicture in", values, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotIn(List<String> values) {
            addCriterion("middlePicture not in", values, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureBetween(String value1, String value2) {
            addCriterion("middlePicture between", value1, value2, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andMiddlepictureNotBetween(String value1, String value2) {
            addCriterion("middlePicture not between", value1, value2, "middlepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureIsNull() {
            addCriterion("largePicture is null");
            return (Criteria) this;
        }

        public Criteria andLargepictureIsNotNull() {
            addCriterion("largePicture is not null");
            return (Criteria) this;
        }

        public Criteria andLargepictureEqualTo(String value) {
            addCriterion("largePicture =", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotEqualTo(String value) {
            addCriterion("largePicture <>", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureGreaterThan(String value) {
            addCriterion("largePicture >", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureGreaterThanOrEqualTo(String value) {
            addCriterion("largePicture >=", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureLessThan(String value) {
            addCriterion("largePicture <", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureLessThanOrEqualTo(String value) {
            addCriterion("largePicture <=", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureLike(String value) {
            addCriterion("largePicture like", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotLike(String value) {
            addCriterion("largePicture not like", value, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureIn(List<String> values) {
            addCriterion("largePicture in", values, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotIn(List<String> values) {
            addCriterion("largePicture not in", values, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureBetween(String value1, String value2) {
            addCriterion("largePicture between", value1, value2, "largepicture");
            return (Criteria) this;
        }

        public Criteria andLargepictureNotBetween(String value1, String value2) {
            addCriterion("largePicture not between", value1, value2, "largepicture");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridIsNull() {
            addCriterion("headTeacherId is null");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridIsNotNull() {
            addCriterion("headTeacherId is not null");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridEqualTo(Integer value) {
            addCriterion("headTeacherId =", value, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridNotEqualTo(Integer value) {
            addCriterion("headTeacherId <>", value, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridGreaterThan(Integer value) {
            addCriterion("headTeacherId >", value, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("headTeacherId >=", value, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridLessThan(Integer value) {
            addCriterion("headTeacherId <", value, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridLessThanOrEqualTo(Integer value) {
            addCriterion("headTeacherId <=", value, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridIn(List<Integer> values) {
            addCriterion("headTeacherId in", values, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridNotIn(List<Integer> values) {
            addCriterion("headTeacherId not in", values, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridBetween(Integer value1, Integer value2) {
            addCriterion("headTeacherId between", value1, value2, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andHeadteacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("headTeacherId not between", value1, value2, "headteacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIsNull() {
            addCriterion("teacherIds is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIsNotNull() {
            addCriterion("teacherIds is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridsEqualTo(String value) {
            addCriterion("teacherIds =", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotEqualTo(String value) {
            addCriterion("teacherIds <>", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsGreaterThan(String value) {
            addCriterion("teacherIds >", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsGreaterThanOrEqualTo(String value) {
            addCriterion("teacherIds >=", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLessThan(String value) {
            addCriterion("teacherIds <", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLessThanOrEqualTo(String value) {
            addCriterion("teacherIds <=", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsLike(String value) {
            addCriterion("teacherIds like", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotLike(String value) {
            addCriterion("teacherIds not like", value, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsIn(List<String> values) {
            addCriterion("teacherIds in", values, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotIn(List<String> values) {
            addCriterion("teacherIds not in", values, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsBetween(String value1, String value2) {
            addCriterion("teacherIds between", value1, value2, "teacherids");
            return (Criteria) this;
        }

        public Criteria andTeacheridsNotBetween(String value1, String value2) {
            addCriterion("teacherIds not between", value1, value2, "teacherids");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNull() {
            addCriterion("hitNum is null");
            return (Criteria) this;
        }

        public Criteria andHitnumIsNotNull() {
            addCriterion("hitNum is not null");
            return (Criteria) this;
        }

        public Criteria andHitnumEqualTo(Integer value) {
            addCriterion("hitNum =", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotEqualTo(Integer value) {
            addCriterion("hitNum <>", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThan(Integer value) {
            addCriterion("hitNum >", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("hitNum >=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThan(Integer value) {
            addCriterion("hitNum <", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumLessThanOrEqualTo(Integer value) {
            addCriterion("hitNum <=", value, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumIn(List<Integer> values) {
            addCriterion("hitNum in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotIn(List<Integer> values) {
            addCriterion("hitNum not in", values, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumBetween(Integer value1, Integer value2) {
            addCriterion("hitNum between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andHitnumNotBetween(Integer value1, Integer value2) {
            addCriterion("hitNum not between", value1, value2, "hitnum");
            return (Criteria) this;
        }

        public Criteria andAuditornumIsNull() {
            addCriterion("auditorNum is null");
            return (Criteria) this;
        }

        public Criteria andAuditornumIsNotNull() {
            addCriterion("auditorNum is not null");
            return (Criteria) this;
        }

        public Criteria andAuditornumEqualTo(Integer value) {
            addCriterion("auditorNum =", value, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumNotEqualTo(Integer value) {
            addCriterion("auditorNum <>", value, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumGreaterThan(Integer value) {
            addCriterion("auditorNum >", value, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditorNum >=", value, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumLessThan(Integer value) {
            addCriterion("auditorNum <", value, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumLessThanOrEqualTo(Integer value) {
            addCriterion("auditorNum <=", value, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumIn(List<Integer> values) {
            addCriterion("auditorNum in", values, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumNotIn(List<Integer> values) {
            addCriterion("auditorNum not in", values, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumBetween(Integer value1, Integer value2) {
            addCriterion("auditorNum between", value1, value2, "auditornum");
            return (Criteria) this;
        }

        public Criteria andAuditornumNotBetween(Integer value1, Integer value2) {
            addCriterion("auditorNum not between", value1, value2, "auditornum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("studentNum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentNum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(Integer value) {
            addCriterion("studentNum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(Integer value) {
            addCriterion("studentNum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(Integer value) {
            addCriterion("studentNum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentNum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(Integer value) {
            addCriterion("studentNum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("studentNum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<Integer> values) {
            addCriterion("studentNum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<Integer> values) {
            addCriterion("studentNum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("studentNum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("studentNum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNull() {
            addCriterion("courseNum is null");
            return (Criteria) this;
        }

        public Criteria andCoursenumIsNotNull() {
            addCriterion("courseNum is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenumEqualTo(Integer value) {
            addCriterion("courseNum =", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotEqualTo(Integer value) {
            addCriterion("courseNum <>", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThan(Integer value) {
            addCriterion("courseNum >", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseNum >=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThan(Integer value) {
            addCriterion("courseNum <", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumLessThanOrEqualTo(Integer value) {
            addCriterion("courseNum <=", value, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumIn(List<Integer> values) {
            addCriterion("courseNum in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotIn(List<Integer> values) {
            addCriterion("courseNum not in", values, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumBetween(Integer value1, Integer value2) {
            addCriterion("courseNum between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andCoursenumNotBetween(Integer value1, Integer value2) {
            addCriterion("courseNum not between", value1, value2, "coursenum");
            return (Criteria) this;
        }

        public Criteria andLessonnumIsNull() {
            addCriterion("lessonNum is null");
            return (Criteria) this;
        }

        public Criteria andLessonnumIsNotNull() {
            addCriterion("lessonNum is not null");
            return (Criteria) this;
        }

        public Criteria andLessonnumEqualTo(Integer value) {
            addCriterion("lessonNum =", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumNotEqualTo(Integer value) {
            addCriterion("lessonNum <>", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumGreaterThan(Integer value) {
            addCriterion("lessonNum >", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("lessonNum >=", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumLessThan(Integer value) {
            addCriterion("lessonNum <", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumLessThanOrEqualTo(Integer value) {
            addCriterion("lessonNum <=", value, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumIn(List<Integer> values) {
            addCriterion("lessonNum in", values, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumNotIn(List<Integer> values) {
            addCriterion("lessonNum not in", values, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumBetween(Integer value1, Integer value2) {
            addCriterion("lessonNum between", value1, value2, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andLessonnumNotBetween(Integer value1, Integer value2) {
            addCriterion("lessonNum not between", value1, value2, "lessonnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumIsNull() {
            addCriterion("threadNum is null");
            return (Criteria) this;
        }

        public Criteria andThreadnumIsNotNull() {
            addCriterion("threadNum is not null");
            return (Criteria) this;
        }

        public Criteria andThreadnumEqualTo(Integer value) {
            addCriterion("threadNum =", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumNotEqualTo(Integer value) {
            addCriterion("threadNum <>", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumGreaterThan(Integer value) {
            addCriterion("threadNum >", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("threadNum >=", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumLessThan(Integer value) {
            addCriterion("threadNum <", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumLessThanOrEqualTo(Integer value) {
            addCriterion("threadNum <=", value, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumIn(List<Integer> values) {
            addCriterion("threadNum in", values, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumNotIn(List<Integer> values) {
            addCriterion("threadNum not in", values, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumBetween(Integer value1, Integer value2) {
            addCriterion("threadNum between", value1, value2, "threadnum");
            return (Criteria) this;
        }

        public Criteria andThreadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("threadNum not between", value1, value2, "threadnum");
            return (Criteria) this;
        }

        public Criteria andNotenumIsNull() {
            addCriterion("noteNum is null");
            return (Criteria) this;
        }

        public Criteria andNotenumIsNotNull() {
            addCriterion("noteNum is not null");
            return (Criteria) this;
        }

        public Criteria andNotenumEqualTo(Integer value) {
            addCriterion("noteNum =", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotEqualTo(Integer value) {
            addCriterion("noteNum <>", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumGreaterThan(Integer value) {
            addCriterion("noteNum >", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("noteNum >=", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumLessThan(Integer value) {
            addCriterion("noteNum <", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumLessThanOrEqualTo(Integer value) {
            addCriterion("noteNum <=", value, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumIn(List<Integer> values) {
            addCriterion("noteNum in", values, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotIn(List<Integer> values) {
            addCriterion("noteNum not in", values, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumBetween(Integer value1, Integer value2) {
            addCriterion("noteNum between", value1, value2, "notenum");
            return (Criteria) this;
        }

        public Criteria andNotenumNotBetween(Integer value1, Integer value2) {
            addCriterion("noteNum not between", value1, value2, "notenum");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNull() {
            addCriterion("postNum is null");
            return (Criteria) this;
        }

        public Criteria andPostnumIsNotNull() {
            addCriterion("postNum is not null");
            return (Criteria) this;
        }

        public Criteria andPostnumEqualTo(Integer value) {
            addCriterion("postNum =", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotEqualTo(Integer value) {
            addCriterion("postNum <>", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThan(Integer value) {
            addCriterion("postNum >", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("postNum >=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThan(Integer value) {
            addCriterion("postNum <", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumLessThanOrEqualTo(Integer value) {
            addCriterion("postNum <=", value, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumIn(List<Integer> values) {
            addCriterion("postNum in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotIn(List<Integer> values) {
            addCriterion("postNum not in", values, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumBetween(Integer value1, Integer value2) {
            addCriterion("postNum between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andPostnumNotBetween(Integer value1, Integer value2) {
            addCriterion("postNum not between", value1, value2, "postnum");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Float value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Float value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Float value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Float value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Float value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Float value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Float> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Float> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Float value1, Float value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Float value1, Float value2) {
            addCriterion("income not between", value1, value2, "income");
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

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(String value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(String value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(String value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(String value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(String value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(String value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLike(String value) {
            addCriterion("service like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotLike(String value) {
            addCriterion("service not like", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<String> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<String> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(String value1, String value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(String value1, String value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andHideIsNull() {
            addCriterion("hide is null");
            return (Criteria) this;
        }

        public Criteria andHideIsNotNull() {
            addCriterion("hide is not null");
            return (Criteria) this;
        }

        public Criteria andHideEqualTo(Byte value) {
            addCriterion("hide =", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotEqualTo(Byte value) {
            addCriterion("hide <>", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThan(Byte value) {
            addCriterion("hide >", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThanOrEqualTo(Byte value) {
            addCriterion("hide >=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThan(Byte value) {
            addCriterion("hide <", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThanOrEqualTo(Byte value) {
            addCriterion("hide <=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideIn(List<Byte> values) {
            addCriterion("hide in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotIn(List<Byte> values) {
            addCriterion("hide not in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideBetween(Byte value1, Byte value2) {
            addCriterion("hide between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotBetween(Byte value1, Byte value2) {
            addCriterion("hide not between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNull() {
            addCriterion("recommended is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedIsNotNull() {
            addCriterion("recommended is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedEqualTo(Boolean value) {
            addCriterion("recommended =", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotEqualTo(Boolean value) {
            addCriterion("recommended <>", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThan(Boolean value) {
            addCriterion("recommended >", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommended >=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThan(Boolean value) {
            addCriterion("recommended <", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedLessThanOrEqualTo(Boolean value) {
            addCriterion("recommended <=", value, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedIn(List<Boolean> values) {
            addCriterion("recommended in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotIn(List<Boolean> values) {
            addCriterion("recommended not in", values, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedBetween(Boolean value1, Boolean value2) {
            addCriterion("recommended between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommended not between", value1, value2, "recommended");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIsNull() {
            addCriterion("recommendedSeq is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIsNotNull() {
            addCriterion("recommendedSeq is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqEqualTo(Integer value) {
            addCriterion("recommendedSeq =", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotEqualTo(Integer value) {
            addCriterion("recommendedSeq <>", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqGreaterThan(Integer value) {
            addCriterion("recommendedSeq >", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendedSeq >=", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqLessThan(Integer value) {
            addCriterion("recommendedSeq <", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqLessThanOrEqualTo(Integer value) {
            addCriterion("recommendedSeq <=", value, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqIn(List<Integer> values) {
            addCriterion("recommendedSeq in", values, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotIn(List<Integer> values) {
            addCriterion("recommendedSeq not in", values, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqBetween(Integer value1, Integer value2) {
            addCriterion("recommendedSeq between", value1, value2, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedseqNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendedSeq not between", value1, value2, "recommendedseq");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIsNull() {
            addCriterion("recommendedTime is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIsNotNull() {
            addCriterion("recommendedTime is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeEqualTo(Integer value) {
            addCriterion("recommendedTime =", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotEqualTo(Integer value) {
            addCriterion("recommendedTime <>", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeGreaterThan(Integer value) {
            addCriterion("recommendedTime >", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendedTime >=", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeLessThan(Integer value) {
            addCriterion("recommendedTime <", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("recommendedTime <=", value, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeIn(List<Integer> values) {
            addCriterion("recommendedTime in", values, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotIn(List<Integer> values) {
            addCriterion("recommendedTime not in", values, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeBetween(Integer value1, Integer value2) {
            addCriterion("recommendedTime between", value1, value2, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRecommendedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendedTime not between", value1, value2, "recommendedtime");
            return (Criteria) this;
        }

        public Criteria andRatingIsNull() {
            addCriterion("rating is null");
            return (Criteria) this;
        }

        public Criteria andRatingIsNotNull() {
            addCriterion("rating is not null");
            return (Criteria) this;
        }

        public Criteria andRatingEqualTo(Float value) {
            addCriterion("rating =", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotEqualTo(Float value) {
            addCriterion("rating <>", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThan(Float value) {
            addCriterion("rating >", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingGreaterThanOrEqualTo(Float value) {
            addCriterion("rating >=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThan(Float value) {
            addCriterion("rating <", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingLessThanOrEqualTo(Float value) {
            addCriterion("rating <=", value, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingIn(List<Float> values) {
            addCriterion("rating in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotIn(List<Float> values) {
            addCriterion("rating not in", values, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingBetween(Float value1, Float value2) {
            addCriterion("rating between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingNotBetween(Float value1, Float value2) {
            addCriterion("rating not between", value1, value2, "rating");
            return (Criteria) this;
        }

        public Criteria andRatingnumIsNull() {
            addCriterion("ratingNum is null");
            return (Criteria) this;
        }

        public Criteria andRatingnumIsNotNull() {
            addCriterion("ratingNum is not null");
            return (Criteria) this;
        }

        public Criteria andRatingnumEqualTo(Integer value) {
            addCriterion("ratingNum =", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotEqualTo(Integer value) {
            addCriterion("ratingNum <>", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumGreaterThan(Integer value) {
            addCriterion("ratingNum >", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratingNum >=", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumLessThan(Integer value) {
            addCriterion("ratingNum <", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumLessThanOrEqualTo(Integer value) {
            addCriterion("ratingNum <=", value, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumIn(List<Integer> values) {
            addCriterion("ratingNum in", values, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotIn(List<Integer> values) {
            addCriterion("ratingNum not in", values, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumBetween(Integer value1, Integer value2) {
            addCriterion("ratingNum between", value1, value2, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andRatingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ratingNum not between", value1, value2, "ratingnum");
            return (Criteria) this;
        }

        public Criteria andHotseqIsNull() {
            addCriterion("hotSeq is null");
            return (Criteria) this;
        }

        public Criteria andHotseqIsNotNull() {
            addCriterion("hotSeq is not null");
            return (Criteria) this;
        }

        public Criteria andHotseqEqualTo(Integer value) {
            addCriterion("hotSeq =", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqNotEqualTo(Integer value) {
            addCriterion("hotSeq <>", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqGreaterThan(Integer value) {
            addCriterion("hotSeq >", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotSeq >=", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqLessThan(Integer value) {
            addCriterion("hotSeq <", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqLessThanOrEqualTo(Integer value) {
            addCriterion("hotSeq <=", value, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqIn(List<Integer> values) {
            addCriterion("hotSeq in", values, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqNotIn(List<Integer> values) {
            addCriterion("hotSeq not in", values, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqBetween(Integer value1, Integer value2) {
            addCriterion("hotSeq between", value1, value2, "hotseq");
            return (Criteria) this;
        }

        public Criteria andHotseqNotBetween(Integer value1, Integer value2) {
            addCriterion("hotSeq not between", value1, value2, "hotseq");
            return (Criteria) this;
        }

        public Criteria andMaxrateIsNull() {
            addCriterion("maxRate is null");
            return (Criteria) this;
        }

        public Criteria andMaxrateIsNotNull() {
            addCriterion("maxRate is not null");
            return (Criteria) this;
        }

        public Criteria andMaxrateEqualTo(Byte value) {
            addCriterion("maxRate =", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotEqualTo(Byte value) {
            addCriterion("maxRate <>", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateGreaterThan(Byte value) {
            addCriterion("maxRate >", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateGreaterThanOrEqualTo(Byte value) {
            addCriterion("maxRate >=", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateLessThan(Byte value) {
            addCriterion("maxRate <", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateLessThanOrEqualTo(Byte value) {
            addCriterion("maxRate <=", value, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateIn(List<Byte> values) {
            addCriterion("maxRate in", values, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotIn(List<Byte> values) {
            addCriterion("maxRate not in", values, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateBetween(Byte value1, Byte value2) {
            addCriterion("maxRate between", value1, value2, "maxrate");
            return (Criteria) this;
        }

        public Criteria andMaxrateNotBetween(Byte value1, Byte value2) {
            addCriterion("maxRate not between", value1, value2, "maxrate");
            return (Criteria) this;
        }

        public Criteria andShowableIsNull() {
            addCriterion("showable is null");
            return (Criteria) this;
        }

        public Criteria andShowableIsNotNull() {
            addCriterion("showable is not null");
            return (Criteria) this;
        }

        public Criteria andShowableEqualTo(Boolean value) {
            addCriterion("showable =", value, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableNotEqualTo(Boolean value) {
            addCriterion("showable <>", value, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableGreaterThan(Boolean value) {
            addCriterion("showable >", value, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("showable >=", value, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableLessThan(Boolean value) {
            addCriterion("showable <", value, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableLessThanOrEqualTo(Boolean value) {
            addCriterion("showable <=", value, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableIn(List<Boolean> values) {
            addCriterion("showable in", values, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableNotIn(List<Boolean> values) {
            addCriterion("showable not in", values, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableBetween(Boolean value1, Boolean value2) {
            addCriterion("showable between", value1, value2, "showable");
            return (Criteria) this;
        }

        public Criteria andShowableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("showable not between", value1, value2, "showable");
            return (Criteria) this;
        }

        public Criteria andBuyableIsNull() {
            addCriterion("buyable is null");
            return (Criteria) this;
        }

        public Criteria andBuyableIsNotNull() {
            addCriterion("buyable is not null");
            return (Criteria) this;
        }

        public Criteria andBuyableEqualTo(Boolean value) {
            addCriterion("buyable =", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotEqualTo(Boolean value) {
            addCriterion("buyable <>", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableGreaterThan(Boolean value) {
            addCriterion("buyable >", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("buyable >=", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableLessThan(Boolean value) {
            addCriterion("buyable <", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableLessThanOrEqualTo(Boolean value) {
            addCriterion("buyable <=", value, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableIn(List<Boolean> values) {
            addCriterion("buyable in", values, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotIn(List<Boolean> values) {
            addCriterion("buyable not in", values, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableBetween(Boolean value1, Boolean value2) {
            addCriterion("buyable between", value1, value2, "buyable");
            return (Criteria) this;
        }

        public Criteria andBuyableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("buyable not between", value1, value2, "buyable");
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

        public Criteria andExpirymodeIsNull() {
            addCriterion("expiryMode is null");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIsNotNull() {
            addCriterion("expiryMode is not null");
            return (Criteria) this;
        }

        public Criteria andExpirymodeEqualTo(String value) {
            addCriterion("expiryMode =", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotEqualTo(String value) {
            addCriterion("expiryMode <>", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeGreaterThan(String value) {
            addCriterion("expiryMode >", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeGreaterThanOrEqualTo(String value) {
            addCriterion("expiryMode >=", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLessThan(String value) {
            addCriterion("expiryMode <", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLessThanOrEqualTo(String value) {
            addCriterion("expiryMode <=", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeLike(String value) {
            addCriterion("expiryMode like", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotLike(String value) {
            addCriterion("expiryMode not like", value, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeIn(List<String> values) {
            addCriterion("expiryMode in", values, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotIn(List<String> values) {
            addCriterion("expiryMode not in", values, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeBetween(String value1, String value2) {
            addCriterion("expiryMode between", value1, value2, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpirymodeNotBetween(String value1, String value2) {
            addCriterion("expiryMode not between", value1, value2, "expirymode");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueIsNull() {
            addCriterion("expiryValue is null");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueIsNotNull() {
            addCriterion("expiryValue is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueEqualTo(Integer value) {
            addCriterion("expiryValue =", value, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueNotEqualTo(Integer value) {
            addCriterion("expiryValue <>", value, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueGreaterThan(Integer value) {
            addCriterion("expiryValue >", value, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("expiryValue >=", value, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueLessThan(Integer value) {
            addCriterion("expiryValue <", value, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueLessThanOrEqualTo(Integer value) {
            addCriterion("expiryValue <=", value, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueIn(List<Integer> values) {
            addCriterion("expiryValue in", values, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueNotIn(List<Integer> values) {
            addCriterion("expiryValue not in", values, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueBetween(Integer value1, Integer value2) {
            addCriterion("expiryValue between", value1, value2, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andExpiryvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("expiryValue not between", value1, value2, "expiryvalue");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
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