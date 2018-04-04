package com.qianfeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmClassExample() {
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

        public Criteria andClassidIsNull() {
            addCriterion("classId is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classId is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(String value) {
            addCriterion("classId =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(String value) {
            addCriterion("classId <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(String value) {
            addCriterion("classId >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(String value) {
            addCriterion("classId >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(String value) {
            addCriterion("classId <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(String value) {
            addCriterion("classId <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLike(String value) {
            addCriterion("classId like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotLike(String value) {
            addCriterion("classId not like", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<String> values) {
            addCriterion("classId in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<String> values) {
            addCriterion("classId not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(String value1, String value2) {
            addCriterion("classId between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(String value1, String value2) {
            addCriterion("classId not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIsNull() {
            addCriterion("courseTypeId is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIsNotNull() {
            addCriterion("courseTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidEqualTo(String value) {
            addCriterion("courseTypeId =", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotEqualTo(String value) {
            addCriterion("courseTypeId <>", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidGreaterThan(String value) {
            addCriterion("courseTypeId >", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidGreaterThanOrEqualTo(String value) {
            addCriterion("courseTypeId >=", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLessThan(String value) {
            addCriterion("courseTypeId <", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLessThanOrEqualTo(String value) {
            addCriterion("courseTypeId <=", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidLike(String value) {
            addCriterion("courseTypeId like", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotLike(String value) {
            addCriterion("courseTypeId not like", value, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidIn(List<String> values) {
            addCriterion("courseTypeId in", values, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotIn(List<String> values) {
            addCriterion("courseTypeId not in", values, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidBetween(String value1, String value2) {
            addCriterion("courseTypeId between", value1, value2, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andCoursetypeidNotBetween(String value1, String value2) {
            addCriterion("courseTypeId not between", value1, value2, "coursetypeid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("beginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("beginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("beginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("beginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("beginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("beginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("beginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("beginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("beginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
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

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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

        public Criteria andTotalcountIsNull() {
            addCriterion("totalCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalcountIsNotNull() {
            addCriterion("totalCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcountEqualTo(Integer value) {
            addCriterion("totalCount =", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotEqualTo(Integer value) {
            addCriterion("totalCount <>", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThan(Integer value) {
            addCriterion("totalCount >", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalCount >=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThan(Integer value) {
            addCriterion("totalCount <", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThanOrEqualTo(Integer value) {
            addCriterion("totalCount <=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountIn(List<Integer> values) {
            addCriterion("totalCount in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotIn(List<Integer> values) {
            addCriterion("totalCount not in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountBetween(Integer value1, Integer value2) {
            addCriterion("totalCount between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotBetween(Integer value1, Integer value2) {
            addCriterion("totalCount not between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountIsNull() {
            addCriterion("upgradeCount is null");
            return (Criteria) this;
        }

        public Criteria andUpgradecountIsNotNull() {
            addCriterion("upgradeCount is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradecountEqualTo(Integer value) {
            addCriterion("upgradeCount =", value, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountNotEqualTo(Integer value) {
            addCriterion("upgradeCount <>", value, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountGreaterThan(Integer value) {
            addCriterion("upgradeCount >", value, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("upgradeCount >=", value, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountLessThan(Integer value) {
            addCriterion("upgradeCount <", value, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountLessThanOrEqualTo(Integer value) {
            addCriterion("upgradeCount <=", value, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountIn(List<Integer> values) {
            addCriterion("upgradeCount in", values, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountNotIn(List<Integer> values) {
            addCriterion("upgradeCount not in", values, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountBetween(Integer value1, Integer value2) {
            addCriterion("upgradeCount between", value1, value2, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andUpgradecountNotBetween(Integer value1, Integer value2) {
            addCriterion("upgradeCount not between", value1, value2, "upgradecount");
            return (Criteria) this;
        }

        public Criteria andChangecountIsNull() {
            addCriterion("changeCount is null");
            return (Criteria) this;
        }

        public Criteria andChangecountIsNotNull() {
            addCriterion("changeCount is not null");
            return (Criteria) this;
        }

        public Criteria andChangecountEqualTo(Integer value) {
            addCriterion("changeCount =", value, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountNotEqualTo(Integer value) {
            addCriterion("changeCount <>", value, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountGreaterThan(Integer value) {
            addCriterion("changeCount >", value, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeCount >=", value, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountLessThan(Integer value) {
            addCriterion("changeCount <", value, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountLessThanOrEqualTo(Integer value) {
            addCriterion("changeCount <=", value, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountIn(List<Integer> values) {
            addCriterion("changeCount in", values, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountNotIn(List<Integer> values) {
            addCriterion("changeCount not in", values, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountBetween(Integer value1, Integer value2) {
            addCriterion("changeCount between", value1, value2, "changecount");
            return (Criteria) this;
        }

        public Criteria andChangecountNotBetween(Integer value1, Integer value2) {
            addCriterion("changeCount not between", value1, value2, "changecount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountIsNull() {
            addCriterion("runoffCount is null");
            return (Criteria) this;
        }

        public Criteria andRunoffcountIsNotNull() {
            addCriterion("runoffCount is not null");
            return (Criteria) this;
        }

        public Criteria andRunoffcountEqualTo(Integer value) {
            addCriterion("runoffCount =", value, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountNotEqualTo(Integer value) {
            addCriterion("runoffCount <>", value, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountGreaterThan(Integer value) {
            addCriterion("runoffCount >", value, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("runoffCount >=", value, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountLessThan(Integer value) {
            addCriterion("runoffCount <", value, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountLessThanOrEqualTo(Integer value) {
            addCriterion("runoffCount <=", value, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountIn(List<Integer> values) {
            addCriterion("runoffCount in", values, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountNotIn(List<Integer> values) {
            addCriterion("runoffCount not in", values, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountBetween(Integer value1, Integer value2) {
            addCriterion("runoffCount between", value1, value2, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRunoffcountNotBetween(Integer value1, Integer value2) {
            addCriterion("runoffCount not between", value1, value2, "runoffcount");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNull() {
            addCriterion("uploadTime is null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIsNotNull() {
            addCriterion("uploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUploadtimeEqualTo(Date value) {
            addCriterion("uploadTime =", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotEqualTo(Date value) {
            addCriterion("uploadTime <>", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThan(Date value) {
            addCriterion("uploadTime >", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadTime >=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThan(Date value) {
            addCriterion("uploadTime <", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("uploadTime <=", value, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeIn(List<Date> values) {
            addCriterion("uploadTime in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotIn(List<Date> values) {
            addCriterion("uploadTime not in", values, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeBetween(Date value1, Date value2) {
            addCriterion("uploadTime between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("uploadTime not between", value1, value2, "uploadtime");
            return (Criteria) this;
        }

        public Criteria andUploadpathIsNull() {
            addCriterion("uploadPath is null");
            return (Criteria) this;
        }

        public Criteria andUploadpathIsNotNull() {
            addCriterion("uploadPath is not null");
            return (Criteria) this;
        }

        public Criteria andUploadpathEqualTo(String value) {
            addCriterion("uploadPath =", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotEqualTo(String value) {
            addCriterion("uploadPath <>", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathGreaterThan(String value) {
            addCriterion("uploadPath >", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathGreaterThanOrEqualTo(String value) {
            addCriterion("uploadPath >=", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLessThan(String value) {
            addCriterion("uploadPath <", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLessThanOrEqualTo(String value) {
            addCriterion("uploadPath <=", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathLike(String value) {
            addCriterion("uploadPath like", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotLike(String value) {
            addCriterion("uploadPath not like", value, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathIn(List<String> values) {
            addCriterion("uploadPath in", values, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotIn(List<String> values) {
            addCriterion("uploadPath not in", values, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathBetween(String value1, String value2) {
            addCriterion("uploadPath between", value1, value2, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadpathNotBetween(String value1, String value2) {
            addCriterion("uploadPath not between", value1, value2, "uploadpath");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameIsNull() {
            addCriterion("uploadFilename is null");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameIsNotNull() {
            addCriterion("uploadFilename is not null");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameEqualTo(String value) {
            addCriterion("uploadFilename =", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotEqualTo(String value) {
            addCriterion("uploadFilename <>", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameGreaterThan(String value) {
            addCriterion("uploadFilename >", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("uploadFilename >=", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameLessThan(String value) {
            addCriterion("uploadFilename <", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameLessThanOrEqualTo(String value) {
            addCriterion("uploadFilename <=", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameLike(String value) {
            addCriterion("uploadFilename like", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotLike(String value) {
            addCriterion("uploadFilename not like", value, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameIn(List<String> values) {
            addCriterion("uploadFilename in", values, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotIn(List<String> values) {
            addCriterion("uploadFilename not in", values, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameBetween(String value1, String value2) {
            addCriterion("uploadFilename between", value1, value2, "uploadfilename");
            return (Criteria) this;
        }

        public Criteria andUploadfilenameNotBetween(String value1, String value2) {
            addCriterion("uploadFilename not between", value1, value2, "uploadfilename");
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