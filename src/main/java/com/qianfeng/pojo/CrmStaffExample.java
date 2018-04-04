package com.qianfeng.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmStaffExample() {
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

        public Criteria andStaffidIsNull() {
            addCriterion("staffId is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffId is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("staffId =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("staffId <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("staffId >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("staffId >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("staffId <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("staffId <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("staffId like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("staffId not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("staffId in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("staffId not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("staffId between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("staffId not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNull() {
            addCriterion("loginPwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIsNotNull() {
            addCriterion("loginPwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpwdEqualTo(String value) {
            addCriterion("loginPwd =", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotEqualTo(String value) {
            addCriterion("loginPwd <>", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThan(String value) {
            addCriterion("loginPwd >", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdGreaterThanOrEqualTo(String value) {
            addCriterion("loginPwd >=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThan(String value) {
            addCriterion("loginPwd <", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLessThanOrEqualTo(String value) {
            addCriterion("loginPwd <=", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdLike(String value) {
            addCriterion("loginPwd like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotLike(String value) {
            addCriterion("loginPwd not like", value, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdIn(List<String> values) {
            addCriterion("loginPwd in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotIn(List<String> values) {
            addCriterion("loginPwd not in", values, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdBetween(String value1, String value2) {
            addCriterion("loginPwd between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andLoginpwdNotBetween(String value1, String value2) {
            addCriterion("loginPwd not between", value1, value2, "loginpwd");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("staffName is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("staffName is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("staffName =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("staffName <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("staffName >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffName >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("staffName <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("staffName <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("staffName like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("staffName not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("staffName in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("staffName not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("staffName between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("staffName not between", value1, value2, "staffname");
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

        public Criteria andOndutydateIsNull() {
            addCriterion("onDutyDate is null");
            return (Criteria) this;
        }

        public Criteria andOndutydateIsNotNull() {
            addCriterion("onDutyDate is not null");
            return (Criteria) this;
        }

        public Criteria andOndutydateEqualTo(Date value) {
            addCriterion("onDutyDate =", value, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateNotEqualTo(Date value) {
            addCriterion("onDutyDate <>", value, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateGreaterThan(Date value) {
            addCriterion("onDutyDate >", value, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateGreaterThanOrEqualTo(Date value) {
            addCriterion("onDutyDate >=", value, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateLessThan(Date value) {
            addCriterion("onDutyDate <", value, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateLessThanOrEqualTo(Date value) {
            addCriterion("onDutyDate <=", value, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateIn(List<Date> values) {
            addCriterion("onDutyDate in", values, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateNotIn(List<Date> values) {
            addCriterion("onDutyDate not in", values, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateBetween(Date value1, Date value2) {
            addCriterion("onDutyDate between", value1, value2, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andOndutydateNotBetween(Date value1, Date value2) {
            addCriterion("onDutyDate not between", value1, value2, "ondutydate");
            return (Criteria) this;
        }

        public Criteria andPostidIsNull() {
            addCriterion("postId is null");
            return (Criteria) this;
        }

        public Criteria andPostidIsNotNull() {
            addCriterion("postId is not null");
            return (Criteria) this;
        }

        public Criteria andPostidEqualTo(String value) {
            addCriterion("postId =", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotEqualTo(String value) {
            addCriterion("postId <>", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThan(String value) {
            addCriterion("postId >", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidGreaterThanOrEqualTo(String value) {
            addCriterion("postId >=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThan(String value) {
            addCriterion("postId <", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLessThanOrEqualTo(String value) {
            addCriterion("postId <=", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidLike(String value) {
            addCriterion("postId like", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotLike(String value) {
            addCriterion("postId not like", value, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidIn(List<String> values) {
            addCriterion("postId in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotIn(List<String> values) {
            addCriterion("postId not in", values, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidBetween(String value1, String value2) {
            addCriterion("postId between", value1, value2, "postid");
            return (Criteria) this;
        }

        public Criteria andPostidNotBetween(String value1, String value2) {
            addCriterion("postId not between", value1, value2, "postid");
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