package com.jindumooc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UploadFileInitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadFileInitsExample() {
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

        public Criteria andGlobalidIsNull() {
            addCriterion("globalId is null");
            return (Criteria) this;
        }

        public Criteria andGlobalidIsNotNull() {
            addCriterion("globalId is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalidEqualTo(String value) {
            addCriterion("globalId =", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidNotEqualTo(String value) {
            addCriterion("globalId <>", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidGreaterThan(String value) {
            addCriterion("globalId >", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidGreaterThanOrEqualTo(String value) {
            addCriterion("globalId >=", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidLessThan(String value) {
            addCriterion("globalId <", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidLessThanOrEqualTo(String value) {
            addCriterion("globalId <=", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidLike(String value) {
            addCriterion("globalId like", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidNotLike(String value) {
            addCriterion("globalId not like", value, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidIn(List<String> values) {
            addCriterion("globalId in", values, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidNotIn(List<String> values) {
            addCriterion("globalId not in", values, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidBetween(String value1, String value2) {
            addCriterion("globalId between", value1, value2, "globalid");
            return (Criteria) this;
        }

        public Criteria andGlobalidNotBetween(String value1, String value2) {
            addCriterion("globalId not between", value1, value2, "globalid");
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

        public Criteria andHashidIsNull() {
            addCriterion("hashId is null");
            return (Criteria) this;
        }

        public Criteria andHashidIsNotNull() {
            addCriterion("hashId is not null");
            return (Criteria) this;
        }

        public Criteria andHashidEqualTo(String value) {
            addCriterion("hashId =", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidNotEqualTo(String value) {
            addCriterion("hashId <>", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidGreaterThan(String value) {
            addCriterion("hashId >", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidGreaterThanOrEqualTo(String value) {
            addCriterion("hashId >=", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidLessThan(String value) {
            addCriterion("hashId <", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidLessThanOrEqualTo(String value) {
            addCriterion("hashId <=", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidLike(String value) {
            addCriterion("hashId like", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidNotLike(String value) {
            addCriterion("hashId not like", value, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidIn(List<String> values) {
            addCriterion("hashId in", values, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidNotIn(List<String> values) {
            addCriterion("hashId not in", values, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidBetween(String value1, String value2) {
            addCriterion("hashId between", value1, value2, "hashid");
            return (Criteria) this;
        }

        public Criteria andHashidNotBetween(String value1, String value2) {
            addCriterion("hashId not between", value1, value2, "hashid");
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

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("fileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("fileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Long value) {
            addCriterion("fileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Long value) {
            addCriterion("fileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Long value) {
            addCriterion("fileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Long value) {
            addCriterion("fileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Long value) {
            addCriterion("fileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Long value) {
            addCriterion("fileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Long> values) {
            addCriterion("fileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Long> values) {
            addCriterion("fileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Long value1, Long value2) {
            addCriterion("fileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Long value1, Long value2) {
            addCriterion("fileSize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andEtagIsNull() {
            addCriterion("etag is null");
            return (Criteria) this;
        }

        public Criteria andEtagIsNotNull() {
            addCriterion("etag is not null");
            return (Criteria) this;
        }

        public Criteria andEtagEqualTo(String value) {
            addCriterion("etag =", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagNotEqualTo(String value) {
            addCriterion("etag <>", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagGreaterThan(String value) {
            addCriterion("etag >", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagGreaterThanOrEqualTo(String value) {
            addCriterion("etag >=", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagLessThan(String value) {
            addCriterion("etag <", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagLessThanOrEqualTo(String value) {
            addCriterion("etag <=", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagLike(String value) {
            addCriterion("etag like", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagNotLike(String value) {
            addCriterion("etag not like", value, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagIn(List<String> values) {
            addCriterion("etag in", values, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagNotIn(List<String> values) {
            addCriterion("etag not in", values, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagBetween(String value1, String value2) {
            addCriterion("etag between", value1, value2, "etag");
            return (Criteria) this;
        }

        public Criteria andEtagNotBetween(String value1, String value2) {
            addCriterion("etag not between", value1, value2, "etag");
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

        public Criteria andConverthashIsNull() {
            addCriterion("convertHash is null");
            return (Criteria) this;
        }

        public Criteria andConverthashIsNotNull() {
            addCriterion("convertHash is not null");
            return (Criteria) this;
        }

        public Criteria andConverthashEqualTo(String value) {
            addCriterion("convertHash =", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashNotEqualTo(String value) {
            addCriterion("convertHash <>", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashGreaterThan(String value) {
            addCriterion("convertHash >", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashGreaterThanOrEqualTo(String value) {
            addCriterion("convertHash >=", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashLessThan(String value) {
            addCriterion("convertHash <", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashLessThanOrEqualTo(String value) {
            addCriterion("convertHash <=", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashLike(String value) {
            addCriterion("convertHash like", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashNotLike(String value) {
            addCriterion("convertHash not like", value, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashIn(List<String> values) {
            addCriterion("convertHash in", values, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashNotIn(List<String> values) {
            addCriterion("convertHash not in", values, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashBetween(String value1, String value2) {
            addCriterion("convertHash between", value1, value2, "converthash");
            return (Criteria) this;
        }

        public Criteria andConverthashNotBetween(String value1, String value2) {
            addCriterion("convertHash not between", value1, value2, "converthash");
            return (Criteria) this;
        }

        public Criteria andConvertstatusIsNull() {
            addCriterion("convertStatus is null");
            return (Criteria) this;
        }

        public Criteria andConvertstatusIsNotNull() {
            addCriterion("convertStatus is not null");
            return (Criteria) this;
        }

        public Criteria andConvertstatusEqualTo(String value) {
            addCriterion("convertStatus =", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusNotEqualTo(String value) {
            addCriterion("convertStatus <>", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusGreaterThan(String value) {
            addCriterion("convertStatus >", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusGreaterThanOrEqualTo(String value) {
            addCriterion("convertStatus >=", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusLessThan(String value) {
            addCriterion("convertStatus <", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusLessThanOrEqualTo(String value) {
            addCriterion("convertStatus <=", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusLike(String value) {
            addCriterion("convertStatus like", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusNotLike(String value) {
            addCriterion("convertStatus not like", value, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusIn(List<String> values) {
            addCriterion("convertStatus in", values, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusNotIn(List<String> values) {
            addCriterion("convertStatus not in", values, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusBetween(String value1, String value2) {
            addCriterion("convertStatus between", value1, value2, "convertstatus");
            return (Criteria) this;
        }

        public Criteria andConvertstatusNotBetween(String value1, String value2) {
            addCriterion("convertStatus not between", value1, value2, "convertstatus");
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

        public Criteria andStorageIsNull() {
            addCriterion("storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIsNull() {
            addCriterion("updatedUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIsNotNull() {
            addCriterion("updatedUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridEqualTo(Integer value) {
            addCriterion("updatedUserId =", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotEqualTo(Integer value) {
            addCriterion("updatedUserId <>", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridGreaterThan(Integer value) {
            addCriterion("updatedUserId >", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatedUserId >=", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridLessThan(Integer value) {
            addCriterion("updatedUserId <", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridLessThanOrEqualTo(Integer value) {
            addCriterion("updatedUserId <=", value, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridIn(List<Integer> values) {
            addCriterion("updatedUserId in", values, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotIn(List<Integer> values) {
            addCriterion("updatedUserId not in", values, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridBetween(Integer value1, Integer value2) {
            addCriterion("updatedUserId between", value1, value2, "updateduserid");
            return (Criteria) this;
        }

        public Criteria andUpdateduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("updatedUserId not between", value1, value2, "updateduserid");
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

        public Criteria andCreateduseridIsNull() {
            addCriterion("createdUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateduseridIsNotNull() {
            addCriterion("createdUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateduseridEqualTo(Integer value) {
            addCriterion("createdUserId =", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridNotEqualTo(Integer value) {
            addCriterion("createdUserId <>", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridGreaterThan(Integer value) {
            addCriterion("createdUserId >", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("createdUserId >=", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridLessThan(Integer value) {
            addCriterion("createdUserId <", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridLessThanOrEqualTo(Integer value) {
            addCriterion("createdUserId <=", value, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridIn(List<Integer> values) {
            addCriterion("createdUserId in", values, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridNotIn(List<Integer> values) {
            addCriterion("createdUserId not in", values, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridBetween(Integer value1, Integer value2) {
            addCriterion("createdUserId between", value1, value2, "createduserid");
            return (Criteria) this;
        }

        public Criteria andCreateduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("createdUserId not between", value1, value2, "createduserid");
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