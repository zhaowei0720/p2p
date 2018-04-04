package com.qianfeng.pojo;

import java.util.ArrayList;
import java.util.List;

public class CrmCourseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmCourseTypeExample() {
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

        public Criteria andCoursecostIsNull() {
            addCriterion("courseCost is null");
            return (Criteria) this;
        }

        public Criteria andCoursecostIsNotNull() {
            addCriterion("courseCost is not null");
            return (Criteria) this;
        }

        public Criteria andCoursecostEqualTo(Double value) {
            addCriterion("courseCost =", value, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostNotEqualTo(Double value) {
            addCriterion("courseCost <>", value, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostGreaterThan(Double value) {
            addCriterion("courseCost >", value, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostGreaterThanOrEqualTo(Double value) {
            addCriterion("courseCost >=", value, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostLessThan(Double value) {
            addCriterion("courseCost <", value, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostLessThanOrEqualTo(Double value) {
            addCriterion("courseCost <=", value, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostIn(List<Double> values) {
            addCriterion("courseCost in", values, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostNotIn(List<Double> values) {
            addCriterion("courseCost not in", values, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostBetween(Double value1, Double value2) {
            addCriterion("courseCost between", value1, value2, "coursecost");
            return (Criteria) this;
        }

        public Criteria andCoursecostNotBetween(Double value1, Double value2) {
            addCriterion("courseCost not between", value1, value2, "coursecost");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("courseName is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("courseName is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("courseName =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("courseName <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("courseName >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("courseName >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("courseName <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("courseName <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("courseName like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("courseName not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("courseName in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("courseName not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("courseName between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("courseName not between", value1, value2, "coursename");
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