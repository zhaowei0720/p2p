package com.qianfeng.pojo;

import java.util.ArrayList;
import java.util.List;

public class CrmPostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmPostExample() {
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

        public Criteria andPostnameIsNull() {
            addCriterion("postName is null");
            return (Criteria) this;
        }

        public Criteria andPostnameIsNotNull() {
            addCriterion("postName is not null");
            return (Criteria) this;
        }

        public Criteria andPostnameEqualTo(String value) {
            addCriterion("postName =", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotEqualTo(String value) {
            addCriterion("postName <>", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThan(String value) {
            addCriterion("postName >", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameGreaterThanOrEqualTo(String value) {
            addCriterion("postName >=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThan(String value) {
            addCriterion("postName <", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLessThanOrEqualTo(String value) {
            addCriterion("postName <=", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameLike(String value) {
            addCriterion("postName like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotLike(String value) {
            addCriterion("postName not like", value, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameIn(List<String> values) {
            addCriterion("postName in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotIn(List<String> values) {
            addCriterion("postName not in", values, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameBetween(String value1, String value2) {
            addCriterion("postName between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andPostnameNotBetween(String value1, String value2) {
            addCriterion("postName not between", value1, value2, "postname");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("depId is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("depId is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(String value) {
            addCriterion("depId =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(String value) {
            addCriterion("depId <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(String value) {
            addCriterion("depId >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(String value) {
            addCriterion("depId >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(String value) {
            addCriterion("depId <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(String value) {
            addCriterion("depId <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLike(String value) {
            addCriterion("depId like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotLike(String value) {
            addCriterion("depId not like", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<String> values) {
            addCriterion("depId in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<String> values) {
            addCriterion("depId not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(String value1, String value2) {
            addCriterion("depId between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(String value1, String value2) {
            addCriterion("depId not between", value1, value2, "depid");
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